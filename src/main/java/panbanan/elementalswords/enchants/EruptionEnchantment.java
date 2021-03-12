package panbanan.elementalswords.enchants;

import  panbanan.elementalswords.effect.EffectsRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;




public class EruptionEnchantment extends Enchantment {

    public EruptionEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {

            //target.damage(DamageSource.LAVA, 3F);
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
        areaEffectCloudEntity.setWaitTime(0);
        StatusEffectInstance effect = new StatusEffectInstance(EffectsRegistry.ERUPTION_EFFECT, 60, 2,false,false);
        areaEffectCloudEntity.addEffect(effect);
        areaEffectCloudEntity.setOnFireFor(3);
        target.setOnFireFor(3);
        target.world.spawnEntity(areaEffectCloudEntity);
    }
}
