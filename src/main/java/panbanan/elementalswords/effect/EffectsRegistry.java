package panbanan.elementalswords.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.elementalswords.ElementalSwords;

public class EffectsRegistry {
    public static StatusEffect ERUPTION_EFFECT;
    public static StatusEffect FROST_HIT_EFFECT;

    public static void init() {
        ERUPTION_EFFECT = Registry.register(Registry.STATUS_EFFECT, new Identifier(ElementalSwords.MOD_ID,"eruption_effect"), new EruptionEffect());
        FROST_HIT_EFFECT = Registry.register(Registry.STATUS_EFFECT, new Identifier(ElementalSwords.MOD_ID,"frost_hit_effect"), new FrostHitEffect());
    }
}
