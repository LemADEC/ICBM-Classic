package icbm.sentry.turret.weapon;

import net.minecraft.item.ItemStack;
import icbm.api.sentry.IAmmunition;
import icbm.api.sentry.ProjectileType;
import icbm.sentry.turret.Turret;

/** @author DarkGuardsman */
public class WeaponConventional extends WeaponProjectile
{

    public WeaponConventional(Turret sentry, int ammoAmount, float damage)
    {
        super(sentry, ammoAmount, damage);
    }

    @Override
    public boolean isAmmo(ItemStack stack)
    {
        return super.isAmmo(stack) && ((IAmmunition) stack.getItem()).getType(stack) == ProjectileType.CONVENTIONAL;
    }
}