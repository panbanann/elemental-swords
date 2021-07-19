package panbanan.panbanansmobs.entities.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.Identifier;
import panbanan.panbanansmobs.entities.FieryGolemEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class FieryGolemModel extends AnimatedGeoModel<FieryGolemEntity> {

    @Override
    public Identifier getModelLocation(FieryGolemEntity object)
    {
        return new Identifier(GeckoLib.ModID, "geo/fiery_golem.geo.json");
    }

    @Override
    public Identifier getTextureLocation(FieryGolemEntity object)
    {
        return new Identifier(GeckoLib.ModID, "textures/fiery_golem.png");
    }

    @Override
    public Identifier getAnimationFileLocation(FieryGolemEntity object)
    {
        return new Identifier(GeckoLib.ModID, "animations/fiery_golem_idle.animation.json");
    }

    /*@Override
    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 2.1F;
    }*/

    //private final ModelPart base;

    /*public FieryGolemModel(){
        base = new ModelPart(this, 0, 0);
        base.addCuboid(-6, -6, -6, 12, 12, 12);
    }

    @Override
    public void setAngles(FieryGolemEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }*/
}
