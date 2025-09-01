package com.dragn0007.radrats.datagen;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.items.RRItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class RRItemModelProvider extends ItemModelProvider {
    public RRItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RadicalRats.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(RRItems.RAD_RATS);

        simpleItem(RRItems.BLACK_SWEATER);
        simpleItem(RRItems.BLUE_SWEATER);
        simpleItem(RRItems.BROWN_SWEATER);
        simpleItem(RRItems.CYAN_SWEATER);
        simpleItem(RRItems.GREEN_SWEATER);
        simpleItem(RRItems.GREY_SWEATER);
        simpleItem(RRItems.LIGHT_BLUE_SWEATER);
        simpleItem(RRItems.LIGHT_GREY_SWEATER);
        simpleItem(RRItems.LIME_SWEATER);
        simpleItem(RRItems.MAGENTA_SWEATER);
        simpleItem(RRItems.ORANGE_SWEATER);
        simpleItem(RRItems.PINK_SWEATER);
        simpleItem(RRItems.PURPLE_SWEATER);
        simpleItem(RRItems.RED_SWEATER);
        simpleItem(RRItems.WHITE_SWEATER);
        simpleItem(RRItems.YELLOW_SWEATER);

        simpleItem(RRItems.BLACK_CHECKERED_SWEATER);
        simpleItem(RRItems.BLUE_CHECKERED_SWEATER);
        simpleItem(RRItems.BROWN_CHECKERED_SWEATER);
        simpleItem(RRItems.CYAN_CHECKERED_SWEATER);
        simpleItem(RRItems.GREEN_CHECKERED_SWEATER);
        simpleItem(RRItems.GREY_CHECKERED_SWEATER);
        simpleItem(RRItems.LIGHT_BLUE_CHECKERED_SWEATER);
        simpleItem(RRItems.LIGHT_GREY_CHECKERED_SWEATER);
        simpleItem(RRItems.LIME_CHECKERED_SWEATER);
        simpleItem(RRItems.MAGENTA_CHECKERED_SWEATER);
        simpleItem(RRItems.ORANGE_CHECKERED_SWEATER);
        simpleItem(RRItems.PINK_CHECKERED_SWEATER);
        simpleItem(RRItems.PURPLE_CHECKERED_SWEATER);
        simpleItem(RRItems.RED_CHECKERED_SWEATER);
        simpleItem(RRItems.YELLOW_CHECKERED_SWEATER);

        simpleItem(RRItems.BLACK_FRILLY_SWEATER);
        simpleItem(RRItems.BLUE_FRILLY_SWEATER);
        simpleItem(RRItems.BROWN_FRILLY_SWEATER);
        simpleItem(RRItems.CYAN_FRILLY_SWEATER);
        simpleItem(RRItems.GREEN_FRILLY_SWEATER);
        simpleItem(RRItems.GREY_FRILLY_SWEATER);
        simpleItem(RRItems.LIGHT_BLUE_FRILLY_SWEATER);
        simpleItem(RRItems.LIGHT_GREY_FRILLY_SWEATER);
        simpleItem(RRItems.LIME_FRILLY_SWEATER);
        simpleItem(RRItems.MAGENTA_FRILLY_SWEATER);
        simpleItem(RRItems.ORANGE_FRILLY_SWEATER);
        simpleItem(RRItems.PINK_FRILLY_SWEATER);
        simpleItem(RRItems.PURPLE_FRILLY_SWEATER);
        simpleItem(RRItems.RED_FRILLY_SWEATER);
        simpleItem(RRItems.YELLOW_FRILLY_SWEATER);

        simpleItem(RRItems.BLACK_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.BLUE_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.BROWN_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.CYAN_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.GREEN_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.GREY_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.LIGHT_BLUE_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.LIGHT_GREY_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.LIME_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.MAGENTA_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.ORANGE_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.PINK_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.PURPLE_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.RED_POLKA_DOTTED_SWEATER);
        simpleItem(RRItems.YELLOW_POLKA_DOTTED_SWEATER);

        simpleItem(RRItems.BLACK_STRIPED_SWEATER);
        simpleItem(RRItems.BLUE_STRIPED_SWEATER);
        simpleItem(RRItems.BROWN_STRIPED_SWEATER);
        simpleItem(RRItems.CYAN_STRIPED_SWEATER);
        simpleItem(RRItems.GREEN_STRIPED_SWEATER);
        simpleItem(RRItems.GREY_STRIPED_SWEATER);
        simpleItem(RRItems.LIGHT_BLUE_STRIPED_SWEATER);
        simpleItem(RRItems.LIGHT_GREY_STRIPED_SWEATER);
        simpleItem(RRItems.LIME_STRIPED_SWEATER);
        simpleItem(RRItems.MAGENTA_STRIPED_SWEATER);
        simpleItem(RRItems.ORANGE_STRIPED_SWEATER);
        simpleItem(RRItems.PINK_STRIPED_SWEATER);
        simpleItem(RRItems.PURPLE_STRIPED_SWEATER);
        simpleItem(RRItems.RED_STRIPED_SWEATER);
        simpleItem(RRItems.YELLOW_STRIPED_SWEATER);
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RadicalRats.MODID,"item/" + item.getId().getPath()));
    }
}