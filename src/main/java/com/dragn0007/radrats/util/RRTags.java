package com.dragn0007.radrats.util;

import com.dragn0007.radrats.RadicalRats;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class RRTags {

    public static class Items {

        public static final TagKey<Item> RAT_FOOD = forgeTag("rat_food");

        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(RadicalRats.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
