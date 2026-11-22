/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.DirectionProperty
 *  org.mtr.mapping.holder.ItemPlacementContext
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.BlockExtension
 *  org.mtr.mapping.mapper.BlockHelper
 *  org.mtr.mapping.mapper.DirectionHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.DirectionProperty;
import org.mtr.mapping.holder.ItemPlacementContext;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

public class StationA3StopMarker
extends BlockExtension
implements DirectionHelper {
    public StationA3StopMarker(BlockSettings settings) {
        super(settings);
    }

    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return this.getDefaultState2().with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING);
        return BlockHelper.shapeUnion((VoxelShape)IBlock.getVoxelShapeByDirection((double)0.0, (double)15.0, (double)0.0, (double)16.0, (double)16.0, (double)9.0, (Direction)facing), (VoxelShape[])new VoxelShape[]{IBlock.getVoxelShapeByDirection((double)0.0, (double)9.0, (double)0.0, (double)16.0, (double)15.0, (double)8.0, (Direction)facing), IBlock.getVoxelShapeByDirection((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)9.0, (double)7.0, (Direction)facing), IBlock.getVoxelShapeByDirection((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)0.25, (double)12.0, (Direction)facing), IBlock.getVoxelShapeByDirection((double)0.0, (double)4.75, (double)11.0, (double)16.0, (double)5.0, (double)12.0, (Direction)facing), IBlock.getVoxelShapeByDirection((double)0.0, (double)0.25, (double)11.0, (double)16.0, (double)4.75, (double)12.0, (Direction)facing), IBlock.getVoxelShapeByDirection((double)7.0, (double)1.75, (double)6.25, (double)9.0, (double)2.75, (double)11.25, (Direction)facing)});
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add((HolderBase<?>)FACING);
    }
}

