package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class FloralDivinityEnchantment extends Enchantment {

    public FloralDivinityEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 3));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 1));
        }
    }

}
