/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.DirectionProperty
 *  org.mtr.mapping.holder.ItemPlacementContext
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.holder.MutableText
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.TextFormatting
 *  org.mtr.mapping.holder.TooltipContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.mapper.BlockEntityExtension
 *  org.mtr.mapping.mapper.TextHelper
 *  org.mtr.mod.block.BlockSignalBase$BlockEntityBase
 *  org.mtr.mod.block.BlockSignalBase$EnumBooleanInverted
 *  org.mtr.mod.block.BlockSignalLightBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.londonunderground.mod.BlockEntityTypes;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.DirectionProperty;
import org.mtr.mapping.holder.ItemPlacementContext;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.TextFormatting;
import org.mtr.mapping.holder.TooltipContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.block.BlockSignalBase;
import org.mtr.mod.block.BlockSignalLightBase;
import org.mtr.mod.block.IBlock;

public class BlockTunnelSignal
extends BlockSignalLightBase {
    public BlockTunnelSignal(BlockSettings settings) {
        super(settings, 2, 14);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0, (Direction)IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING));
    }

    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return this.getDefaultState2().with(new Property<>(FACING.data), ctx.getPlayerFacing().rotateYClockwise().data).with(new Property<>(IS_45.data), BlockSignalBase.EnumBooleanInverted.FALSE).with(new Property<>(IS_22_5.data), BlockSignalBase.EnumBooleanInverted.FALSE);
    }

    @NotNull
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityTunnelSignalLight1(pos, state);
    }

    public void addTooltips(ItemStack stack, @Nullable BlockView world, List<MutableText> tooltip, TooltipContext options) {
        tooltip.add(TextHelper.literal((String)"DEPRECATED!!!").formatted(TextFormatting.RED));
    }

    public static class TileEntityTunnelSignalLight1
    extends BlockSignalBase.BlockEntityBase {
        public TileEntityTunnelSignalLight1(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.TUNNEL_BLOCK_2_SIGNAL.get(), false, pos, state);
        }
    }
}

