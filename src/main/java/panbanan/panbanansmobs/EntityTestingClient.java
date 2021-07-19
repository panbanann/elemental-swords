package panbanan.panbanansmobs;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import panbanan.elementalswords.items.armors.PotatoRenderer;
import panbanan.elementalswords.items.armors.potatHelmet;
import panbanan.panbanansmobs.entities.renderers.FieryGolemEntityRenderer;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;


@Environment(EnvType.CLIENT)
public class EntityTestingClient {

    public static void onInitializeClient(){
        EntityRendererRegistry.INSTANCE.register(EntityTesting.FIERY_GOLEM, (dispatcher, context) ->{
            return new FieryGolemEntityRenderer(dispatcher);
        });
        GeoArmorRenderer.registerArmorRenderer(potatHelmet.class, new PotatoRenderer());
    }
}
