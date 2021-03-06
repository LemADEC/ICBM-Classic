package icbm.classic.content.explosive.ex;

import com.builtbroken.mc.api.edit.IWorldChangeAction;
import com.builtbroken.mc.api.event.TriggerCause;
import com.builtbroken.mc.lib.helper.recipe.RecipeUtility;
import icbm.classic.ICBMClassic;
import icbm.classic.content.explosive.Explosives;
import icbm.classic.content.explosive.blast.BlastRedmatter;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ExRedMatter extends Explosion
{
    public ExRedMatter()
    {
        super("redMatter", 4);
        this.missileModelPath = "missiles/tier4/missile_head_redmatter.obj";
    }

    @Override
    public void init()
    {
        if(OreDictionary.doesOreNameExist("strangeMatter"))
        {
            RecipeUtility.addRecipe(new ShapedOreRecipe(Explosives.REDMATTER.getItemStack(),
                    "AAA", "AEA", "AAA",
                    'E', Explosives.ANTIMATTER.getItemStack(),
                    'A', "strangeMatter"), this.getUnlocalizedName(), ICBMClassic.INSTANCE.getConfig(), true);
        }
        else
        {
            RecipeUtility.addRecipe(new ShapedOreRecipe(Explosives.REDMATTER.getItemStack(),
                    "AAA", "AEA", "AAA",
                    'E', Explosives.ANTIMATTER.getItemStack(),
                    'A', Items.nether_star), this.getUnlocalizedName(), ICBMClassic.INSTANCE.getConfig(), true);
        }
    }

    @Override
    public void doCreateExplosion(World world, double x, double y, double z, Entity entity)
    {
        new BlastRedmatter(world, entity, x, y, z, BlastRedmatter.NORMAL_RADIUS).explode();
    }

    @Override
    public IWorldChangeAction createBlastForTrigger(World world, double x, double y, double z, TriggerCause triggerCause, double size, NBTTagCompound tag)
    {
        return null;
    }
}
