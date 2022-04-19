package net.Settordici.beautify.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LeafCarpet extends PlantBlock {
    public LeafCarpet(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0, 0, 0, 16, 1, 16);
    }
    @Override
    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }
    /*
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos);
    } */
}
