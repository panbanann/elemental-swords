package panbanan.elementalswords.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class EruptionEffect extends StatusEffect {
    public EruptionEffect(){
        super(StatusEffectType.HARMFUL, 0xFF8C00);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            entity.isInvulnerableTo(DamageSource.LAVA); // Player immune to Lava type of dmg
        }else {
            entity.damage(DamageSource.LAVA, 2F);
            entity.setOnFireFor(3);
        }
    }
}
