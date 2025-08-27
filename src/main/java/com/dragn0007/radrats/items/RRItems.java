package com.dragn0007.radrats.items;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.entities.util.EntityTypes;
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

    public static final RegistryObject<Item> RAD_RATS = ITEMS.register("rad_rats",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}