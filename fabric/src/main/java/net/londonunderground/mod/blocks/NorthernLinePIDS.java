/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.DirectionProperty
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.BlockEntityExtension
 *  org.mtr.mapping.mapper.BlockHelper
 *  org.mtr.mod.block.BlockPIDSHorizontalBase
 *  org.mtr.mod.block.BlockPIDSHorizontalBase$BlockEntityHorizontalBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.BlockEntityTypes;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.DirectionProperty;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.BlockPIDSHorizontalBase;
import org.mtr.mod.block.IBlock;

public class NorthernLinePIDS
extends BlockPIDSHorizontalBase {
    private static final int MAX_ARRIVALS = 3;

    public NorthernLinePIDS() {
        super(3);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BlockHelper.shapeUnion((VoxelShape)IBlock.getVoxelShapeByDirection((double)6.0, (double)0.0, (double)0.0, (double)10.0, (double)9.0, (double)16.0, (Direction)IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING)), (VoxelShape[])new VoxelShape[]{IBlock.getVoxelShapeByDirection((double)7.5, (double)9.0, (double)12.5, (double)8.5, (double)16.0, (double)13.5, (Direction)IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING))});
    }

    @NotNull
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityNorthernLinePIDS(pos, state);
    }

    public static class TileEntityNorthernLinePIDS
    extends BlockPIDSHorizontalBase.BlockEntityHorizontalBase {
        public TileEntityNorthernLinePIDS(BlockPos pos, BlockState state) {
            super(3, BlockEntityTypes.PIDS_NORTHERN_TILE_ENTITY.get(), pos, state);
        }

        public boolean showArrivalNumber() {
            return true;
        }
    }
}

