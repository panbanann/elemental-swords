package panbanan.elementalswords.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.elementalswords.ElementalSwords;
import panbanan.elementalswords.items.armors.potatHelmet;
import panbanan.elementalswords.items.material.ElementToolMaterial;
import panbanan.elementalswords.items.material.ElementalArmorMaterial;
import panbanan.elementalswords.items.weapons.Swords;
import software.bernie.example.item.PotatoArmorItem;
import software.bernie.example.registry.RegistryUtils;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;


public class ItemsRegistry {

    public static final Item FIRE_SOUL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WATER_SOUL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NATURE_SOUL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_SOUL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item VOID_SOUL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FIRE_CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WATER_CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NATURE_CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item VOID_CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item INCANDESCENT_FIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FROZEN_ICICLE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SHARP_GRASS = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_BLADE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item EDGE_OF_DARKNESS = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FIRE_POMMEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WATER_POMMEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NATURE_POMMEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_POMMEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item VOID_POMMEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FIRE_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WATER_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NATURE_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item VOID_HILT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FIRE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WATER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NATURE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WIND_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item VOID_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    private static final Item FIRE_SWORD = new Swords(ElementToolMaterial.INSTANCE, 2, -1.7F, new Item.Settings().group(ItemGroup.COMBAT));
    private static final Item WATER_SWORD = new Swords(ElementToolMaterial.INSTANCE, 2, -1.9F, new Item.Settings().group(ItemGroup.COMBAT));
    private static final Item NATURE_SWORD = new Swords(ElementToolMaterial.INSTANCE, 3, -1.8F, new Item.Settings().group(ItemGroup.COMBAT));
    private static final Item WIND_SWORD = new Swords(ElementToolMaterial.INSTANCE, 1, -1.5F, new Item.Settings().group(ItemGroup.COMBAT));
    private static final Item VOID_SWORD = new Swords(ElementToolMaterial.INSTANCE, 4, -1.8F, new Item.Settings().group(ItemGroup.COMBAT));
    private static final Item ELEMENTAL_SWORD = new Swords(ElementToolMaterial.INSTANCE, 6, -1.5F, new Item.Settings().group(ItemGroup.COMBAT));
    //private static final Item POTAT_HELMET = new ArmorItem(ElementalArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    //public static final Item POTAT_HELMET = new potatHelmet(ElementalArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));

    public static final potatHelmet POTAT_HELMET = RegistryUtils.registerItem("potat_helmet", new potatHelmet(
            ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_soul"), FIRE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_soul"), WATER_SOUL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_soul"), NATURE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_soul"), WIND_SOUL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_soul"), VOID_SOUL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_crystal"), FIRE_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_crystal"), WATER_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_crystal"), NATURE_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_crystal"), WIND_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_crystal"), VOID_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "incandescent_fire"), INCANDESCENT_FIRE);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "frozen_icicle"), FROZEN_ICICLE);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "sharp_grass"), SHARP_GRASS);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_blade"), WIND_BLADE);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "edge_of_darkness"), EDGE_OF_DARKNESS);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_pommel"), FIRE_POMMEL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_pommel"), WATER_POMMEL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_pommel"), NATURE_POMMEL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_pommel"), WIND_POMMEL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_pommel"), VOID_POMMEL);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_hilt"), FIRE_HILT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_hilt"), WATER_HILT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_hilt"), NATURE_HILT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_hilt"), WIND_HILT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_hilt"), VOID_HILT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_ingot"), FIRE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_ingot"), WATER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_ingot"), NATURE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_ingot"), WIND_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_ingot"), VOID_INGOT);

        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "fire_sword"), FIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "water_sword"), WATER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "nature_sword"), NATURE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "wind_sword"), WIND_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "void_sword"), VOID_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "elemental_sword"), ELEMENTAL_SWORD);

        //Registry.register(Registry.ITEM, new Identifier(ElementalSwords.MOD_ID, "potat_helmet"), POTAT_HELMET);
    }
}
