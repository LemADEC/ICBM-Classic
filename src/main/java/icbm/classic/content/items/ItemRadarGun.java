package icbm.classic.content.items;

import com.builtbroken.mc.api.items.tools.IWorldPosItem;
import com.builtbroken.mc.api.tile.multiblock.IMultiTile;
import com.builtbroken.mc.api.tile.multiblock.IMultiTileHost;
import com.builtbroken.mc.core.Engine;
import com.builtbroken.mc.core.network.IPacketReceiver;
import com.builtbroken.mc.core.network.packet.PacketPlayerItem;
import com.builtbroken.mc.core.network.packet.PacketType;
import com.builtbroken.mc.core.registry.implement.IPostInit;
import com.builtbroken.mc.lib.helper.LanguageUtility;
import com.builtbroken.mc.imp.transform.vector.Location;
import com.builtbroken.mc.prefab.items.ItemWorldPos;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import icbm.classic.ICBMClassic;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import resonant.api.explosion.ILauncherController;

import java.util.List;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 6/13/2016.
 */
public class ItemRadarGun extends ItemWorldPos implements IWorldPosItem, IPostInit, IPacketReceiver
{
    IIcon linked_icon;

    public ItemRadarGun()
    {
        this.setMaxStackSize(1);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(ICBMClassic.PREFIX + "radarGun");
        this.setTextureName(ICBMClassic.PREFIX + "radarGun");
    }

    @Override
    public void onPostInit()
    {

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
    {
        String localization = LanguageUtility.getLocal(getUnlocalizedName() + ".info");
        if (localization != null && !localization.isEmpty())
        {
            String[] split = localization.split(",");
            for (String line : split)
            {
                lines.add(line.trim());
            }
        }
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
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hit_x, float hit_y, float hit_z)
    {
        if (world.isRemote)
        {
            return true;
        }

        Location location = new Location(world, x, y, z);
        TileEntity tile = location.getTileEntity();
        if (tile instanceof IMultiTile)
        {
            IMultiTileHost host = ((IMultiTile) tile).getHost();
            if (host instanceof TileEntity)
            {
                tile = (TileEntity) host;
            }
        }

        if (player.isSneaking())
        {
            stack.setTagCompound(null);
            stack.setItemDamage(0);
            LanguageUtility.addChatToPlayer(player, "gps.cleared");
            player.inventoryContainer.detectAndSendChanges();
            return true;
        }
        else
        {
            Location storedLocation = getLocation(stack);
            if (storedLocation == null || !storedLocation.isAboveBedrock())
            {
                LanguageUtility.addChatToPlayer(player, "gps.error.pos.invalid");
                return true;
            }
            else if (tile instanceof ILauncherController)
            {
                ((ILauncherController) tile).setTarget(storedLocation.toPos());
                LanguageUtility.addChatToPlayer(player, "gps.data.transferred");
                return true;
            }
        }
        return false;
    }

    @Override
    public void read(ByteBuf buf, EntityPlayer player, PacketType packet)
    {
        ItemStack stack = player.inventory.getCurrentItem();
        if (stack != null && stack.getItem() == this)
        {
            setLocation(stack, new Location(player.worldObj, buf.readInt(), buf.readInt(), buf.readInt()));
            player.addChatComponentMessage(new ChatComponentText("GPS data set"));
        }
    }
}
