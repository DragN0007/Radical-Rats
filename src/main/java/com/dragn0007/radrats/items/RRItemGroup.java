package com.dragn0007.radrats.items;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.blocks.RRBlocks;
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

                            output.accept(RRBlocks.WIRE_WALL.get());
                            output.accept(RRBlocks.WIRE_DOOR.get());
                            output.accept(RRBlocks.WATER_BOTTLE.get());

                            output.accept(RRItems.BLACK_SWEATER.get());
                            output.accept(RRItems.BLUE_SWEATER.get());
                            output.accept(RRItems.BROWN_SWEATER.get());
                            output.accept(RRItems.CYAN_SWEATER.get());
                            output.accept(RRItems.GREEN_SWEATER.get());
                            output.accept(RRItems.GREY_SWEATER.get());
                            output.accept(RRItems.LIGHT_BLUE_SWEATER.get());
                            output.accept(RRItems.LIGHT_GREY_SWEATER.get());
                            output.accept(RRItems.LIME_SWEATER.get());
                            output.accept(RRItems.MAGENTA_SWEATER.get());
                            output.accept(RRItems.ORANGE_SWEATER.get());
                            output.accept(RRItems.PINK_SWEATER.get());
                            output.accept(RRItems.PURPLE_SWEATER.get());
                            output.accept(RRItems.RED_SWEATER.get());
                            output.accept(RRItems.WHITE_SWEATER.get());
                            output.accept(RRItems.YELLOW_SWEATER.get());

                            output.accept(RRItems.BLACK_CHECKERED_SWEATER.get());
                            output.accept(RRItems.BLUE_CHECKERED_SWEATER.get());
                            output.accept(RRItems.BROWN_CHECKERED_SWEATER.get());
                            output.accept(RRItems.CYAN_CHECKERED_SWEATER.get());
                            output.accept(RRItems.GREEN_CHECKERED_SWEATER.get());
                            output.accept(RRItems.GREY_CHECKERED_SWEATER.get());
                            output.accept(RRItems.LIGHT_BLUE_CHECKERED_SWEATER.get());
                            output.accept(RRItems.LIGHT_GREY_CHECKERED_SWEATER.get());
                            output.accept(RRItems.LIME_CHECKERED_SWEATER.get());
                            output.accept(RRItems.MAGENTA_CHECKERED_SWEATER.get());
                            output.accept(RRItems.ORANGE_CHECKERED_SWEATER.get());
                            output.accept(RRItems.PINK_CHECKERED_SWEATER.get());
                            output.accept(RRItems.PURPLE_CHECKERED_SWEATER.get());
                            output.accept(RRItems.RED_CHECKERED_SWEATER.get());
                            output.accept(RRItems.YELLOW_CHECKERED_SWEATER.get());

                            output.accept(RRItems.BLACK_FRILLY_SWEATER.get());
                            output.accept(RRItems.BLUE_FRILLY_SWEATER.get());
                            output.accept(RRItems.BROWN_FRILLY_SWEATER.get());
                            output.accept(RRItems.CYAN_FRILLY_SWEATER.get());
                            output.accept(RRItems.GREEN_FRILLY_SWEATER.get());
                            output.accept(RRItems.GREY_FRILLY_SWEATER.get());
                            output.accept(RRItems.LIGHT_BLUE_FRILLY_SWEATER.get());
                            output.accept(RRItems.LIGHT_GREY_FRILLY_SWEATER.get());
                            output.accept(RRItems.LIME_FRILLY_SWEATER.get());
                            output.accept(RRItems.MAGENTA_FRILLY_SWEATER.get());
                            output.accept(RRItems.ORANGE_FRILLY_SWEATER.get());
                            output.accept(RRItems.PINK_FRILLY_SWEATER.get());
                            output.accept(RRItems.PURPLE_FRILLY_SWEATER.get());
                            output.accept(RRItems.RED_FRILLY_SWEATER.get());
                            output.accept(RRItems.YELLOW_FRILLY_SWEATER.get());

                            output.accept(RRItems.BLACK_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.BLUE_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.BROWN_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.CYAN_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.GREEN_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.GREY_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.LIGHT_BLUE_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.LIGHT_GREY_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.LIME_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.MAGENTA_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.ORANGE_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.PINK_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.PURPLE_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.RED_POLKA_DOTTED_SWEATER.get());
                            output.accept(RRItems.YELLOW_POLKA_DOTTED_SWEATER.get());

                            output.accept(RRItems.BLACK_STRIPED_SWEATER.get());
                            output.accept(RRItems.BLUE_STRIPED_SWEATER.get());
                            output.accept(RRItems.BROWN_STRIPED_SWEATER.get());
                            output.accept(RRItems.CYAN_STRIPED_SWEATER.get());
                            output.accept(RRItems.GREEN_STRIPED_SWEATER.get());
                            output.accept(RRItems.GREY_STRIPED_SWEATER.get());
                            output.accept(RRItems.LIGHT_BLUE_STRIPED_SWEATER.get());
                            output.accept(RRItems.LIGHT_GREY_STRIPED_SWEATER.get());
                            output.accept(RRItems.LIME_STRIPED_SWEATER.get());
                            output.accept(RRItems.MAGENTA_STRIPED_SWEATER.get());
                            output.accept(RRItems.ORANGE_STRIPED_SWEATER.get());
                            output.accept(RRItems.PINK_STRIPED_SWEATER.get());
                            output.accept(RRItems.PURPLE_STRIPED_SWEATER.get());
                            output.accept(RRItems.RED_STRIPED_SWEATER.get());
                            output.accept(RRItems.YELLOW_STRIPED_SWEATER.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        RRItemGroup.CREATIVE_MODE_TABS.register(eventBus);
    }
}
