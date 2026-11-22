/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.class_2561
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.DirectionProperty
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.Text
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.TextHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.BlockPIDSHorizontalBase
 *  org.mtr.mod.block.BlockPoleCheckBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import net.minecraft.network.chat.Component;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.DirectionProperty;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.Text;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockPIDSHorizontalBase;
import org.mtr.mod.block.BlockPoleCheckBase;
import org.mtr.mod.block.IBlock;

public class BlockPIDSPole
extends BlockPoleCheckBase {
    public BlockPIDSPole(BlockSettings settings) {
        super(settings);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection((double)7.5, (double)0.0, (double)12.5, (double)8.5, (double)16.0, (double)13.5, (Direction)IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING));
    }

    protected boolean isBlock(Block block) {
        return block.data instanceof BlockPIDSHorizontalBase || block.data instanceof BlockPIDSPole;
    }

    protected Text getTooltipBlockText() {
        return new Text((Component)TextHelper.translatable((String)"block.mtr.pids_1", (Object[])new Object[0]).data);
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add((HolderBase<?>)FACING);
    }
}

