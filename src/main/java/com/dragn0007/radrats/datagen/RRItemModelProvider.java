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
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RadicalRats.MODID,"item/" + item.getId().getPath()));
    }
}