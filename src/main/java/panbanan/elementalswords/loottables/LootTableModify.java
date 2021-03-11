package panbanan.elementalswords.loottables;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;
import panbanan.elementalswords.items.ItemsRegistry;

public class LootTableModify {

    private static final Identifier BLAZE_LOOT_TABLE_ID = new Identifier("minecraft", "entities/blaze");
    private static final Identifier GUARDIAN_LOOT_TABLE_ID = new Identifier("minecraft", "entities/guardian");
    private static final Identifier CAVE_SPIDER_LOOT_TABLE_ID = new Identifier("minecraft", "entities/cave_spider");
    private static final Identifier EVOKER_LOOT_TABLE_ID = new Identifier("minecraft", "entities/evoker");
    private static final Identifier ENDERMAN_LOOT_TABLE_ID = new Identifier("minecraft", "entities/enderman");

    public static void modifyLootTable(){
        // Add all my items individually into a loot tables.
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (BLAZE_LOOT_TABLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1,0.01F))
                        .with(ItemEntry.builder(ItemsRegistry.FIRE_SOUL))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F)).build());
                supplier.withPool(poolBuilder.build());
            }
            if (GUARDIAN_LOOT_TABLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1,0.01F))
                        .with(ItemEntry.builder(ItemsRegistry.WATER_SOUL))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F)).build());
                supplier.withPool(poolBuilder.build());
            }
            if (CAVE_SPIDER_LOOT_TABLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1,0.005F))
                        .with(ItemEntry.builder(ItemsRegistry.NATURE_SOUL))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F)).build());
                supplier.withPool(poolBuilder.build());
            }
            if (EVOKER_LOOT_TABLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1,0.1F))
                        .with(ItemEntry.builder(ItemsRegistry.WIND_SOUL))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F)).build());
                supplier.withPool(poolBuilder.build());
            }
            if (ENDERMAN_LOOT_TABLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootTableRange.create(1,0.003F))
                        .with(ItemEntry.builder(ItemsRegistry.VOID_SOUL))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F)).build());
                supplier.withPool(poolBuilder.build());
            }
        });
    }

}
