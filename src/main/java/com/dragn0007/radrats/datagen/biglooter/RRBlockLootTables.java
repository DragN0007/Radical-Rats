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



    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RRBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
