package panbanan.panbanansmobs.entities.renderers;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import panbanan.panbanansmobs.entities.FieryGolemEntity;
import panbanan.panbanansmobs.entities.models.FieryGolemModel;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;


public class FieryGolemEntityRenderer extends GeoEntityRenderer<FieryGolemEntity> {


    public FieryGolemEntityRenderer(EntityRenderDispatcher renderManager)
    {
        super(renderManager, new FieryGolemModel());
        this.shadowRadius = 0.35F; //change 0.7 to the desired shadow size.
    }
//    public FieryGolemEntityRenderer(EntityRenderDispatcher dispatcher) {
//        super(dispatcher, new FieryGolemModel(), 0.5f);
//    }
//
//    @Override
//    public Identifier getTexture(FieryGolemEntity entity) {
//        return new Identifier("entitytesting", "textures/entity/iron_golem/golem_copper.png");
//    }
}
