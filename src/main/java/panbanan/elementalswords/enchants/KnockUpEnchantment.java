package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import panbanan.elementalswords.effect.EffectsRegistry;


public class KnockUpEnchantment extends Enchantment {

    public KnockUpEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }
//Spawn entity minecraft:sweep_attack with piercing for 3 sec
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {

            //target.damage(DamageSource.LAVA, 3F);
            knockUp((PlayerEntity) user, (LivingEntity) target, 3F);
        }
    }
    public static void knockUp(PlayerEntity user, LivingEntity target, float radius) {
        AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(
                target.world,
                target.getX(),
                target.getY(),
                target.getZ());
        areaEffectCloudEntity.setOwner(user);
        areaEffectCloudEntity.setParticleType(ParticleTypes.SWEEP_ATTACK);
        areaEffectCloudEntity.setRadius(radius);
        areaEffectCloudEntity.setDuration(20);
        areaEffectCloudEntity.setWaitTime(0);
        target.addVelocity(0,0.5,0);
        //areaEffectCloudEntity.addVelocity(0,50,0);
        target.world.spawnEntity(areaEffectCloudEntity);
    }
}
