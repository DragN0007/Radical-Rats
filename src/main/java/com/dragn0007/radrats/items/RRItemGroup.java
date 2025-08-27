package com.dragn0007.radrats.items;

import com.dragn0007.radrats.RadicalRats;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RRItemGroup {

        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RadicalRats.MODID);

        public static final RegistryObject<CreativeModeTab> RATS = CREATIVE_MODE_TABS.register("rats",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(RRItems.RAD_RATS.get())).title(Component.translatable("itemGroup.radrats"))
                        .displayItems((displayParameters, output) -> {

                    output.accept(RRItems.RAT_SPAWN_EGG.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        RRItemGroup.CREATIVE_MODE_TABS.register(eventBus);
    }
}
