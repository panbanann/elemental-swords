package panbanan.elementalswords.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;


public class FrostHitEffect extends StatusEffect {

    public FrostHitEffect(){
        super(StatusEffectType.HARMFUL, 0xFF8C00);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        //double speed = entity.getAttributeValue(GENERIC_MOVEMENT_SPEED);
        //EntityAttributeModifier.Operation.MULTIPLY_TOTAL.
        entity.setMovementSpeed(0F);
    }
}

