package com.dragn0007.radrats.blocks;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.blocks.custom.*;
import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacer;
import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacerItem;
import com.dragn0007.radrats.items.RRItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RRBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, RadicalRats.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RadicalRats.MODID);

    public static final RegistryObject<WaterBottle> WATER_BOTTLE = registerPixelPlacer("water_bottle", WaterBottle::new);
    public static final RegistryObject<WireWall> WIRE_WALL = registerBlock("wire_wall", WireWall::new);
    public static final RegistryObject<WireDoor> WIRE_DOOR = registerBlock("wire_door",
            () -> new WireDoor(SoundEvents.CHAIN_PLACE, SoundEvents.CHAIN_BREAK));
    public static final RegistryObject<StraightHammock> BLACK_HAMMOCK = registerBlock("black_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> BLUE_HAMMOCK = registerBlock("blue_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> BROWN_HAMMOCK = registerBlock("brown_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> CYAN_HAMMOCK = registerBlock("cyan_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> GREEN_HAMMOCK = registerBlock("green_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> GREY_HAMMOCK = registerBlock("grey_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> LIGHT_BLUE_HAMMOCK = registerBlock("light_blue_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> LIGHT_GREY_HAMMOCK = registerBlock("light_grey_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> LIME_HAMMOCK = registerBlock("lime_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> MAGENTA_HAMMOCK = registerBlock("magenta_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> ORANGE_HAMMOCK = registerBlock("orange_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> PINK_HAMMOCK = registerBlock("pink_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> PURPLE_HAMMOCK = registerBlock("purple_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> RED_HAMMOCK = registerBlock("red_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> WHITE_HAMMOCK = registerBlock("white_hammock", StraightHammock::new);
    public static final RegistryObject<StraightHammock> YELLOW_HAMMOCK = registerBlock("yellow_hammock", StraightHammock::new);

    public static final RegistryObject<Tunnel> BLACK_TUNNEL = registerBlock("black_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> BLUE_TUNNEL = registerBlock("blue_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> BROWN_TUNNEL = registerBlock("brown_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> CYAN_TUNNEL = registerBlock("cyan_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> GREEN_TUNNEL = registerBlock("green_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> GREY_TUNNEL = registerBlock("grey_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> LIGHT_BLUE_TUNNEL = registerBlock("light_blue_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> LIGHT_GREY_TUNNEL = registerBlock("light_grey_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> LIME_TUNNEL = registerBlock("lime_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> MAGENTA_TUNNEL = registerBlock("magenta_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> ORANGE_TUNNEL = registerBlock("orange_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> PINK_TUNNEL = registerBlock("pink_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> PURPLE_TUNNEL = registerBlock("purple_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> RED_TUNNEL = registerBlock("red_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> WHITE_TUNNEL = registerBlock("white_tunnel", Tunnel::new);
    public static final RegistryObject<Tunnel> YELLOW_TUNNEL = registerBlock("yellow_tunnel", Tunnel::new);

    public static final RegistryObject<PixelPlacerContainer> PIXEL_PLACER_CONTAINER = BLOCKS.register("pixel_placer_container", PixelPlacerContainer::new);
    public static final RegistryObject<BlockEntityType<PixelPlacerEntity>> PIXEL_PLACER_ENTITY = BLOCK_ENTITIES.register("pixel_placer_container",
            () -> BlockEntityType.Builder.of(PixelPlacerEntity::new, PIXEL_PLACER_CONTAINER.get()).build(null));

    protected static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    protected static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacer(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        RRItems.ITEMS.register(name, () -> new PixelPlacerItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    protected static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        RRItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }
}