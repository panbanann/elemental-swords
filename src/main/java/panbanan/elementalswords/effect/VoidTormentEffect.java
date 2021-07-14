package panbanan.elementalswords.effect;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;

public class VoidTormentEffect extends StatusEffect {
    public VoidTormentEffect(){
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
            entity.isInvulnerableTo(DamageSource.MAGIC); // Player immune to Lava type of dmg
        }else {
            entity.damage(DamageSource.MAGIC, 2F);
            if(entity.getRecentDamageSource() == DamageSource.MAGIC){
                spread(entity, 3F);
            }
        }
    }
    public static void spread(LivingEntity target, float radius) {
        AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(target.world,
                target.getX(),
                target.getY(),
                target.getZ());
        areaEffectCloudEntity.setParticleType(ParticleTypes.REVERSE_PORTAL);
        areaEffectCloudEntity.setRadius(radius);
        areaEffectCloudEntity.setDuration(60);
        areaEffectCloudEntity.setWaitTime(0);
        areaEffectCloudEntity.addEffect(new StatusEffectInstance(EffectsRegistry.VOID_TORMENT_EFFECT, 60, 1,false,true));
    }
}
