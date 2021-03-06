package panbanan.elementalswords.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.elementalswords.ElementalSwords;

public class EffectsRegistry {
    public static StatusEffect ERUPTION_EFFECT;
    public static StatusEffect VOID_TORMENT_EFFECT;


    public static void init() {
        ERUPTION_EFFECT = Registry.register(Registry.STATUS_EFFECT, new Identifier(ElementalSwords.MOD_ID,"eruption_effect"), new EruptionEffect());
        VOID_TORMENT_EFFECT = Registry.register(Registry.STATUS_EFFECT, new Identifier(ElementalSwords.MOD_ID,"void_torment_effect"), new VoidTormentEffect());
    }
}
