/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.ActionResult
 *  org.mtr.mapping.holder.BlockEntityType
 *  org.mtr.mapping.holder.BlockHitResult
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.Hand
 *  org.mtr.mapping.holder.IntegerProperty
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.holder.MutableText
 *  org.mtr.mapping.holder.PlayerEntity
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.TextFormatting
 *  org.mtr.mapping.holder.TooltipContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.holder.VoxelShapes
 *  org.mtr.mapping.holder.World
 *  org.mtr.mapping.mapper.BlockEntityExtension
 *  org.mtr.mapping.mapper.BlockExtension
 *  org.mtr.mapping.mapper.BlockWithEntity
 *  org.mtr.mapping.mapper.DirectionHelper
 *  org.mtr.mapping.mapper.TextHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mtr.mapping.holder.ActionResult;
import org.mtr.mapping.holder.BlockEntityType;
import org.mtr.mapping.holder.BlockHitResult;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Hand;
import org.mtr.mapping.holder.IntegerProperty;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.holder.PlayerEntity;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.TextFormatting;
import org.mtr.mapping.holder.TooltipContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.holder.VoxelShapes;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

public abstract class BlockRoundelBase
extends BlockExtension
implements DirectionHelper,
BlockWithEntity {
    public static final IntegerProperty COLOR = IntegerProperty.of((String)"color", (int)0, (int)2);

    protected BlockRoundelBase(BlockSettings settings) {
        super(settings);
    }

    @NotNull
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush((World)world, (PlayerEntity)player, () -> world.setBlockState(pos, state.cycle(new Property<>(COLOR.data))));
    }

    @NotNull
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public void addTooltips(ItemStack stack, @Nullable BlockView world, List<MutableText> tooltip, TooltipContext options) {
        tooltip.add(TextHelper.translatable((String)"tooltip.londonunderground.block_roundel", (Object[])new Object[0]).formatted(TextFormatting.GRAY));
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add((HolderBase<?>)COLOR);
        builder.add((HolderBase<?>)FACING);
    }

    public static abstract class TileEntityBlockRoundelBase
    extends BlockEntityExtension {
        public TileEntityBlockRoundelBase(BlockEntityType<?> type, BlockPos pos, BlockState state) {
            super(type, pos, state);
        }

        public abstract boolean shouldRender();
    }
}

