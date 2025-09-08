package com.dragn0007.radrats.datagen.biglooter;

import com.dragn0007.radrats.blocks.RRBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class RRBlockLootTables extends BlockLootSubProvider {

    public RRBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {

        dropSelf(RRBlocks.WIRE_WALL.get());
        dropSelf(RRBlocks.WIRE_DOOR.get());
        dropSelf(RRBlocks.WATER_BOTTLE.get());

        dropSelf(RRBlocks.BLACK_HAMMOCK.get());
        dropSelf(RRBlocks.BLUE_HAMMOCK.get());
        dropSelf(RRBlocks.BROWN_HAMMOCK.get());
        dropSelf(RRBlocks.CYAN_HAMMOCK.get());
        dropSelf(RRBlocks.GREEN_HAMMOCK.get());
        dropSelf(RRBlocks.GREY_HAMMOCK.get());
        dropSelf(RRBlocks.LIGHT_BLUE_HAMMOCK.get());
        dropSelf(RRBlocks.LIGHT_GREY_HAMMOCK.get());
        dropSelf(RRBlocks.LIME_HAMMOCK.get());
        dropSelf(RRBlocks.MAGENTA_HAMMOCK.get());
        dropSelf(RRBlocks.ORANGE_HAMMOCK.get());
        dropSelf(RRBlocks.PINK_HAMMOCK.get());
        dropSelf(RRBlocks.PURPLE_HAMMOCK.get());
        dropSelf(RRBlocks.RED_HAMMOCK.get());
        dropSelf(RRBlocks.WHITE_HAMMOCK.get());
        dropSelf(RRBlocks.YELLOW_HAMMOCK.get());

        dropSelf(RRBlocks.BLACK_TUNNEL.get());
        dropSelf(RRBlocks.BLUE_TUNNEL.get());
        dropSelf(RRBlocks.BROWN_TUNNEL.get());
        dropSelf(RRBlocks.CYAN_TUNNEL.get());
        dropSelf(RRBlocks.GREEN_TUNNEL.get());
        dropSelf(RRBlocks.GREY_TUNNEL.get());
        dropSelf(RRBlocks.LIGHT_BLUE_TUNNEL.get());
        dropSelf(RRBlocks.LIGHT_GREY_TUNNEL.get());
        dropSelf(RRBlocks.LIME_TUNNEL.get());
        dropSelf(RRBlocks.MAGENTA_TUNNEL.get());
        dropSelf(RRBlocks.ORANGE_TUNNEL.get());
        dropSelf(RRBlocks.PINK_TUNNEL.get());
        dropSelf(RRBlocks.PURPLE_TUNNEL.get());
        dropSelf(RRBlocks.RED_TUNNEL.get());
        dropSelf(RRBlocks.WHITE_TUNNEL.get());
        dropSelf(RRBlocks.YELLOW_TUNNEL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RRBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
