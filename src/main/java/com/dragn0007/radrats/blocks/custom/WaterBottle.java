package com.dragn0007.radrats.blocks.custom;

import com.dragn0007.radrats.blocks.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WaterBottle extends PixelPlacer {
    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(-2.5, 0, -2.5, 2.5, 1, 2.5)
    );

    public WaterBottle() {
        super(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion());
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
