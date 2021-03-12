package panbanan.elementalswords.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.elementalswords.ElementalSwords;

public class EnchantsRegistry {
    public static Enchantment ERUPTION;
    public static Enchantment FROST_HIT;


    public static void init() {
        ERUPTION = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"eruption"), new EruptionEnchantment());
        FROST_HIT = Registry.register(Registry.ENCHANTMENT, new Identifier(ElementalSwords.MOD_ID,"frost_hit"), new FrostHitEnchantment());
    }
}
