package com.dragn0007.radrats.items;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.entities.util.EntityTypes;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RRItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RadicalRats.MODID);

    public static final RegistryObject<Item> RAT_SPAWN_EGG = ITEMS.register("rat_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.RAT_ENTITY, 0x35211d, 0x6b4d41, new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BLACK_SWEATER = ITEMS.register("black_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SWEATER = ITEMS.register("blue_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SWEATER = ITEMS.register("brown_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SWEATER = ITEMS.register("cyan_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SWEATER = ITEMS.register("green_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREY_SWEATER = ITEMS.register("grey_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SWEATER = ITEMS.register("light_blue_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GREY_SWEATER = ITEMS.register("light_grey_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIME_SWEATER = ITEMS.register("lime_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SWEATER = ITEMS.register("magenta_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SWEATER = ITEMS.register("orange_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PINK_SWEATER = ITEMS.register("pink_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SWEATER = ITEMS.register("purple_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_SWEATER = ITEMS.register("red_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SWEATER = ITEMS.register("white_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SWEATER = ITEMS.register("yellow_sweater",
            () -> new RatSweaterItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_CHECKERED_SWEATER = ITEMS.register("black_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CHECKERED_SWEATER = ITEMS.register("blue_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CHECKERED_SWEATER = ITEMS.register("brown_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CHECKERED_SWEATER = ITEMS.register("cyan_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CHECKERED_SWEATER = ITEMS.register("green_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREY_CHECKERED_SWEATER = ITEMS.register("grey_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CHECKERED_SWEATER = ITEMS.register("light_blue_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GREY_CHECKERED_SWEATER = ITEMS.register("light_grey_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIME_CHECKERED_SWEATER = ITEMS.register("lime_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CHECKERED_SWEATER = ITEMS.register("magenta_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CHECKERED_SWEATER = ITEMS.register("orange_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PINK_CHECKERED_SWEATER = ITEMS.register("pink_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CHECKERED_SWEATER = ITEMS.register("purple_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_CHECKERED_SWEATER = ITEMS.register("red_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CHECKERED_SWEATER = ITEMS.register("yellow_checkered_sweater",
            () -> new RatSweaterItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_FRILLY_SWEATER = ITEMS.register("black_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_FRILLY_SWEATER = ITEMS.register("blue_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_FRILLY_SWEATER = ITEMS.register("brown_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_FRILLY_SWEATER = ITEMS.register("cyan_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_FRILLY_SWEATER = ITEMS.register("green_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREY_FRILLY_SWEATER = ITEMS.register("grey_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_FRILLY_SWEATER = ITEMS.register("light_blue_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GREY_FRILLY_SWEATER = ITEMS.register("light_grey_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIME_FRILLY_SWEATER = ITEMS.register("lime_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_FRILLY_SWEATER = ITEMS.register("magenta_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_FRILLY_SWEATER = ITEMS.register("orange_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PINK_FRILLY_SWEATER = ITEMS.register("pink_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_FRILLY_SWEATER = ITEMS.register("purple_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_FRILLY_SWEATER = ITEMS.register("red_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_FRILLY_SWEATER = ITEMS.register("yellow_frilly_sweater",
            () -> new RatSweaterItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_POLKA_DOTTED_SWEATER = ITEMS.register("black_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_POLKA_DOTTED_SWEATER = ITEMS.register("blue_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_POLKA_DOTTED_SWEATER = ITEMS.register("brown_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_POLKA_DOTTED_SWEATER = ITEMS.register("cyan_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_POLKA_DOTTED_SWEATER = ITEMS.register("green_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREY_POLKA_DOTTED_SWEATER = ITEMS.register("grey_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_POLKA_DOTTED_SWEATER = ITEMS.register("light_blue_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GREY_POLKA_DOTTED_SWEATER = ITEMS.register("light_grey_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIME_POLKA_DOTTED_SWEATER = ITEMS.register("lime_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_POLKA_DOTTED_SWEATER = ITEMS.register("magenta_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_POLKA_DOTTED_SWEATER = ITEMS.register("orange_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PINK_POLKA_DOTTED_SWEATER = ITEMS.register("pink_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_POLKA_DOTTED_SWEATER = ITEMS.register("purple_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_POLKA_DOTTED_SWEATER = ITEMS.register("red_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_POLKA_DOTTED_SWEATER = ITEMS.register("yellow_polka_dotted_sweater",
            () -> new RatSweaterItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_STRIPED_SWEATER = ITEMS.register("black_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STRIPED_SWEATER = ITEMS.register("blue_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_STRIPED_SWEATER = ITEMS.register("brown_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_STRIPED_SWEATER = ITEMS.register("cyan_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_STRIPED_SWEATER = ITEMS.register("green_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> GREY_STRIPED_SWEATER = ITEMS.register("grey_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_STRIPED_SWEATER = ITEMS.register("light_blue_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GREY_STRIPED_SWEATER = ITEMS.register("light_grey_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> LIME_STRIPED_SWEATER = ITEMS.register("lime_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_STRIPED_SWEATER = ITEMS.register("magenta_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_STRIPED_SWEATER = ITEMS.register("orange_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PINK_STRIPED_SWEATER = ITEMS.register("pink_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_STRIPED_SWEATER = ITEMS.register("purple_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_STRIPED_SWEATER = ITEMS.register("red_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_STRIPED_SWEATER = ITEMS.register("yellow_striped_sweater",
            () -> new RatSweaterItem(new Item.Properties()));

    public static final RegistryObject<Item> RAD_RATS = ITEMS.register("rad_rats",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}