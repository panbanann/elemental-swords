package panbanan.elementalswords.items.armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import panbanan.elementalswords.ElementalSwords;
import panbanan.elementalswords.items.material.ElementToolMaterial;
import software.bernie.example.client.model.armor.PotatoArmorModel;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class PotatoRenderer extends GeoArmorRenderer<potatHelmet> {

    public PotatoRenderer(){
        super(new AnimatedGeoModel<potatHelmet>() {
            @Override
            public Identifier getModelLocation(potatHelmet potatHelmet) {
                return new Identifier(ElementalSwords.MOD_ID, "geo/potat.geo.json");
            }

            @Override
            public Identifier getTextureLocation(potatHelmet potatHelmet) {
                return new Identifier(ElementalSwords.MOD_ID, "textures/armor/potat_helmet.png");
            }

            @Override
            public Identifier getAnimationFileLocation(potatHelmet potatHelmet) {
                return null;
            }
        });

        this.headBone = "armorHead";

    }

    /*public static void onInitializeClient()
    {
        GeoArmorRenderer.registerArmorRenderer(potatHelmet.class, new PotatoRenderer());
    }*/


}
