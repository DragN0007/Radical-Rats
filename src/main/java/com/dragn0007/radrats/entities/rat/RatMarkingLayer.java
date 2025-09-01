package com.dragn0007.radrats.entities.rat;

import com.dragn0007.radrats.RadicalRats;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class RatMarkingLayer extends GeoRenderLayer<Rat> {
    public RatMarkingLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack poseStack, Rat animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {

        if (animatable.getVariant() == 12) {
            return;
        }

        RenderType renderMarkingType = RenderType.entityCutout(animatable.getOverlayLocation());
        poseStack.pushPose();
        poseStack.scale(1.0f, 1.0f, 1.0f);
        poseStack.translate(0.0d, 0.0d, 0.0d);
        poseStack.popPose();
        getRenderer().reRender(getDefaultBakedModel(animatable),
                poseStack,
                bufferSource,
                animatable,
                renderMarkingType,
                bufferSource.getBuffer(renderMarkingType), partialTick, packedLight, OverlayTexture.NO_OVERLAY,
                1, 1, 1, 1);
    }

    public enum Overlay {
        NONE(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/none.png")),
        BANDED(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/banded.png")),
        BERKSHIRE(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/berkshire.png")),
        BLAZE(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/blaze.png")),
        BROKEN_HOOD(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/broken_hood.png")),
        CAPPED(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/capped.png")),
        DALMATIAN(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/dalmatian.png")),
        HOODED(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/hooded.png")),
        PURE_WHITE(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/pure_white.png")),
        ROAN(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/roan.png")),
        VARIEGATED(new ResourceLocation(RadicalRats.MODID, "textures/rat/pattern/variegated.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay patternFromOrdinal(int pattern) { return Overlay.values()[pattern % Overlay.values().length];
        }
    }

}
