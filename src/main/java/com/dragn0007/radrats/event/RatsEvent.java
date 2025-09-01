package com.dragn0007.radrats.event;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.blocks.RRBlocks;
import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacerEntityRenderer;
import com.dragn0007.radrats.entities.rat.Rat;
import com.dragn0007.radrats.entities.rat.RatRender;
import com.dragn0007.radrats.entities.util.EntityTypes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = RadicalRats.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class RatsEvent {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypes.RAT_ENTITY.get(), Rat.createAttributes().build());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityTypes.RAT_ENTITY.get(), RatRender::new);
    }

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(RRBlocks.PIXEL_PLACER_ENTITY.get(), PixelPlacerEntityRenderer::new);
    }
}