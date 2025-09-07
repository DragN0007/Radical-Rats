package com.dragn0007.radrats.blocks;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.blocks.custom.StraightHammock;
import com.dragn0007.radrats.blocks.custom.WaterBottle;
import com.dragn0007.radrats.blocks.custom.WireDoor;
import com.dragn0007.radrats.blocks.custom.WireWall;
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