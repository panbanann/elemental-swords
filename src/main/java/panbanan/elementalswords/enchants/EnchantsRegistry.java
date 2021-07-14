package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.elementalswords.ElementalSwords;

public class EnchantsRegistry {
    public static Enchantment ERUPTION;
    public static Enchantment FROST_HIT;
    public static Enchantment FLORAL_DIVINITY;
    public static Enchantment KNOCK_UP;
    public static Enchantment TORMENT;


    public static void init() {
        ERUPTION = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"eruption"), new EruptionEnchantment());
        FROST_HIT = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"frost_hit"), new FrostHitEnchantment());
        FLORAL_DIVINITY = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"floral_divinity"), new FloralDivinityEnchantment());
        KNOCK_UP = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"knock_up"), new KnockUpEnchantment());
        TORMENT = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"torment"), new VoidTormentEnchantment());
    }
}
