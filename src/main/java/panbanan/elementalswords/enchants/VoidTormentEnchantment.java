package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;

import panbanan.elementalswords.effect.EffectsRegistry;


public class VoidTormentEnchantment extends Enchantment {

    public VoidTormentEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }
//Add effect that work like poison if enemy die spread in radius.
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(EffectsRegistry.VOID_TORMENT_EFFECT));

            //target.damage(DamageSource.LAVA, 3F);
            //knockUp((PlayerEntity) user, (LivingEntity) target, 3F);
        }
    }

}
