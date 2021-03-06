package icbm.classic.content.items;

import com.builtbroken.mc.core.Engine;
import com.builtbroken.mc.core.network.IPacketReceiver;
import com.builtbroken.mc.core.network.packet.PacketPlayerItem;
import com.builtbroken.mc.core.network.packet.PacketType;
import com.builtbroken.mc.core.registry.implement.IRecipeContainer;
import com.builtbroken.mc.imp.transform.vector.Pos;
import com.builtbroken.mc.lib.world.radio.RadioRegistry;
import com.builtbroken.mc.prefab.hz.FakeRadioSender;
import icbm.classic.ICBMClassic;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import resonant.api.explosion.ILauncherController;

import java.util.List;

/**
 * Extended version of {@link ItemRemoteDetonator} that can target blocks in a line of sight.
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 3/26/2016.
 */
public class ItemLaserDetonator extends ItemRemoteDetonator implements IRecipeContainer, IPacketReceiver
{
    public ItemLaserDetonator()
    {
        this.setHasSubtypes(true);
        this.setMaxStackSize(1);
        this.setNoRepair();
        this.setUnlocalizedName(ICBMClassic.PREFIX + "laserDetonator");
        this.setTextureName(ICBMClassic.PREFIX + "laserDesignator");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (world.isRemote)
        {
            MovingObjectPosition objectMouseOver = player.rayTrace(200, 1);
            TileEntity tileEntity = world.getTileEntity(objectMouseOver.blockX, objectMouseOver.blockY, objectMouseOver.blockZ);
            if (!(tileEntity instanceof ILauncherController))
            {
                Engine.instance.packetHandler.sendToServer(new PacketPlayerItem(player, objectMouseOver.blockX, objectMouseOver.blockY, objectMouseOver.blockZ));
            }
        }
        return stack;
    }

    @Override
    public void genRecipes(List<IRecipe> recipes)
    {
    }

    @Override
    public void read(ByteBuf buf, EntityPlayer player, PacketType packet)
    {
        ItemStack stack = player.inventory.getCurrentItem();
        if (stack != null && stack.getItem() == this)
        {
            if (!player.worldObj.isRemote)
            {
                RadioRegistry.popMessage(player.worldObj, new FakeRadioSender(player, stack, 2000), getBroadCastHz(stack), "activateLauncherWithTarget", new Pos(buf.readInt(), buf.readInt(), buf.readInt()));
            }
            else
            {
                player.addChatComponentMessage(new ChatComponentText("Not encoded with launch data! Right click on launcher screen to encode."));
            }
        }
    }
}
