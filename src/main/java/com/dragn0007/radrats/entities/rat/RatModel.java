package com.dragn0007.radrats.entities.rat;

import com.dragn0007.radrats.RadicalRats;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class RatModel extends DefaultedEntityGeoModel<Rat> {

    public RatModel() {
        super(new ResourceLocation(RadicalRats.MODID, "rat"), true);
    }

    @Override
    public void setCustomAnimations(Rat animatable, long instanceId, AnimationState<Rat> animationState) {

        CoreGeoBone head = getAnimationProcessor().getBone("head");
        CoreGeoBone left_ear = getAnimationProcessor().getBone("left_ear");
        CoreGeoBone right_ear = getAnimationProcessor().getBone("right_ear");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(head.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            head.setRotY(head.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }

        if (left_ear != null && right_ear != null) {
            if (animatable.getBreed() == 1) {
                left_ear.setRotZ(45);
                right_ear.setRotZ(-45);
            } else {
                left_ear.setRotZ(0);
                right_ear.setRotZ(0);
            }
        }
    }

    public enum Variant {
        BLACK(new ResourceLocation(RadicalRats.MODID, "textures/rat/black.png")),
        BLUE(new ResourceLocation(RadicalRats.MODID, "textures/rat/blue.png")),
        BROWN(new ResourceLocation(RadicalRats.MODID, "textures/rat/brown.png")),
        CHOCOLATE(new ResourceLocation(RadicalRats.MODID, "textures/rat/chocolate.png")),
        CREAM(new ResourceLocation(RadicalRats.MODID, "textures/rat/cream.png")),
        GOLD(new ResourceLocation(RadicalRats.MODID, "textures/rat/gold.png")),
        LILAC(new ResourceLocation(RadicalRats.MODID, "textures/rat/lilac.png")),
        MAHOGANY(new ResourceLocation(RadicalRats.MODID, "textures/rat/mahogany.png")),
        RED(new ResourceLocation(RadicalRats.MODID, "textures/rat/red.png")),
        SILVER(new ResourceLocation(RadicalRats.MODID, "textures/rat/silver.png")),
        TAN(new ResourceLocation(RadicalRats.MODID, "textures/rat/tan.png")),
        WHITE(new ResourceLocation(RadicalRats.MODID, "textures/rat/white.png")),
        HAIRLESS(new ResourceLocation(RadicalRats.MODID, "textures/rat/hairless.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }
    public static final ResourceLocation ANIMATION = new ResourceLocation(RadicalRats.MODID, "animations/rat.animation.json");
    public static final ResourceLocation MODEL = new ResourceLocation(RadicalRats.MODID, "geo/rat.geo.json");

    @Override
    public ResourceLocation getModelResource(Rat object) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(Rat object) {
        return object.getTextureResource();
    }

    @Override
    public ResourceLocation getAnimationResource(Rat animatable) {
        return ANIMATION;
    }
}

