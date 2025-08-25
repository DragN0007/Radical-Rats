package com.dragn0007.radrats.event;

import com.dragn0007.radrats.RadicalRats;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = RadicalRats.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class RatsEvent {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
    }
}