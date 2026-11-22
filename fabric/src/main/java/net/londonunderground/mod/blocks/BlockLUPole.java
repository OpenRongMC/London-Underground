/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.BlockHelper
 *  org.mtr.mod.block.BlockWaterloggable
 */
package net.londonunderground.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.BlockWaterloggable;

public class BlockLUPole
extends BlockWaterloggable {
    public BlockLUPole(BlockSettings settings) {
        super(settings);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BlockHelper.shapeUnion((VoxelShape)Block.createCuboidShape((double)6.0, (double)0.0, (double)6.0, (double)10.0, (double)16.0, (double)10.0), (VoxelShape[])new VoxelShape[]{Block.createCuboidShape((double)5.0, (double)0.0, (double)7.0, (double)11.0, (double)16.0, (double)9.0), Block.createCuboidShape((double)7.0, (double)0.0, (double)5.0, (double)9.0, (double)16.0, (double)11.0)});
    }
}

