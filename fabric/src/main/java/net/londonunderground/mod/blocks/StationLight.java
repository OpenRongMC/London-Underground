/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.Axis
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.BooleanProperty
 *  org.mtr.mapping.holder.ItemPlacementContext
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.BlockHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.BlockWaterloggable
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.Axis;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.BooleanProperty;
import org.mtr.mapping.holder.ItemPlacementContext;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockWaterloggable;
import org.mtr.mod.block.IBlock;

public class StationLight
extends BlockWaterloggable {
    public static final BooleanProperty FACING = BooleanProperty.of((String)"facing");

    public StationLight(BlockSettings settings) {
        super(settings);
    }

    @NotNull
    public BlockState getPlacementState2(ItemPlacementContext itemPlacementContext) {
        boolean facing = itemPlacementContext.getPlayerFacing().getAxis() == Axis.X;
        return super.getPlacementState2(itemPlacementContext).with(new Property<>(FACING.data), Boolean.valueOf(facing));
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (IBlock.getStatePropertySafe((BlockState)state, (BooleanProperty)FACING)) {
            return BlockHelper.shapeUnion((VoxelShape)Block.createCuboidShape((double)0.0, (double)14.5, (double)6.0, (double)16.0, (double)16.0, (double)6.5), (VoxelShape[])new VoxelShape[]{Block.createCuboidShape((double)0.0, (double)14.5, (double)9.5, (double)16.0, (double)16.0, (double)10.0), Block.createCuboidShape((double)0.0, (double)15.0, (double)6.5, (double)16.0, (double)16.0, (double)9.5)});
        }
        return BlockHelper.shapeUnion((VoxelShape)Block.createCuboidShape((double)6.0, (double)14.5, (double)0.0, (double)6.5, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{Block.createCuboidShape((double)9.5, (double)14.5, (double)0.0, (double)10.0, (double)16.0, (double)16.0), Block.createCuboidShape((double)6.5, (double)15.0, (double)0.0, (double)9.5, (double)16.0, (double)16.0)});
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        super.addBlockProperties(builder);
        builder.add((HolderBase<?>)FACING);
    }
}

