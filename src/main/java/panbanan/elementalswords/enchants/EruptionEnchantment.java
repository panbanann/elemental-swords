package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;



public class EruptionEnchantment extends Enchantment {

    public EruptionEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {

            target.setOnFireFor(3);
            target.damage(DamageSource.LAVA, 3F);
                    //addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 2 * level, level + 1));
            spawnFlameCloud((PlayerEntity) user, (LivingEntity) target, 3F);
        }
    }
    public static void spawnFlameCloud(PlayerEntity user, LivingEntity target, float radius) {
        AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(
                target.world,
                target.getX(),
                target.getY(),
                target.getZ());
        areaEffectCloudEntity.setOwner(user);
        areaEffectCloudEntity.setParticleType(ParticleTypes.LAVA);
        areaEffectCloudEntity.setRadius(radius);
        areaEffectCloudEntity.setDuration(60);

        StatusEffectInstance effect = new StatusEffectInstance(
                StatusEffects.WITHER,
                60,
                2,true,false);
        areaEffectCloudEntity.addEffect(effect);
        areaEffectCloudEntity.setOnFireFor(3);
        target.world.spawnEntity(areaEffectCloudEntity);
    }
}
