package panbanan.elementalswords;

import net.fabricmc.api.ModInitializer;
import panbanan.elementalswords.effect.EffectsRegistry;
import panbanan.elementalswords.enchants.EnchantsRegistry;
import panbanan.elementalswords.items.ItemsRegistry;
import panbanan.elementalswords.items.armors.PotatoRenderer;
import panbanan.elementalswords.loottables.LootTableModify;
import panbanan.panbanansmobs.EntityTesting;
import panbanan.panbanansmobs.EntityTestingClient;

public class ElementalSwords implements ModInitializer {

    public  static final String MOD_ID = "elementalswords";
    @Override
    public void onInitialize() {
        ItemsRegistry.registerItems();
        EnchantsRegistry.init();
        LootTableModify.modifyLootTable();
        EffectsRegistry.init();
        EntityTestingClient.onInitializeClient();
        EntityTesting.onInitialize();
        PotatoRenderer.onInitializeClient();
    }



}
