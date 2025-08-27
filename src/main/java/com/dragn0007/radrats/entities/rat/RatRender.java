package com.dragn0007.radrats.entities.rat;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RatRender extends GeoEntityRenderer<Rat> {

    public RatRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RatModel());
        this.addRenderLayer(new RatMarkingLayer(this));
    }

    @Override
    public void preRender(PoseStack poseStack, Rat entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        if(entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1F, 1F, 1F);
        }

        if (entity.getBreed() == 1) {
            model.getBone("left_ear").ifPresent(b -> b.setScaleX(1.4F));
            model.getBone("left_ear").ifPresent(b -> b.setScaleY(1.4F));
            model.getBone("left_ear").ifPresent(b -> b.setScaleZ(1.4F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleX(1.4F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleY(1.4F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleZ(1.4F));
        } else {
            model.getBone("left_ear").ifPresent(b -> b.setScaleX(1.0F));
            model.getBone("left_ear").ifPresent(b -> b.setScaleY(1.0F));
            model.getBone("left_ear").ifPresent(b -> b.setScaleZ(1.0F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleX(1.0F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleY(1.0F));
            model.getBone("right_ear").ifPresent(b -> b.setScaleZ(1.0F));
        }

        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

}


