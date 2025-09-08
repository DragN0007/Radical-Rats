package com.dragn0007.radrats.blocks.custom;

import com.dragn0007.radrats.blocks.DecorRotator;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Tunnel extends DecorRotator implements SimpleWaterloggedBlock {

    public Tunnel() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public boolean isPathfindable(BlockState p_53306_, BlockGetter p_53307_, BlockPos p_53308_, PathComputationType p_53309_) {
        return false;
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(1, 0, 0, 3, 10, 16),
            Block.box(13, 0, 0, 15, 10, 16),
            Block.box(2, 10, 0, 14, 12, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 0, 1, 16, 10, 3),
            Block.box(0, 0, 13, 16, 10, 15),
            Block.box(0, 10, 2, 16, 12, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(1, 0, 0, 3, 10, 16),
            Block.box(13, 0, 0, 15, 10, 16),
            Block.box(2, 10, 0, 14, 12, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, 1, 16, 10, 3),
            Block.box(0, 0, 13, 16, 10, 15),
            Block.box(0, 10, 2, 16, 12, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    @Override
    public boolean isCollisionShapeFullBlock(BlockState p_181242_, BlockGetter p_181243_, BlockPos p_181244_) {
        return false;
    }
}
