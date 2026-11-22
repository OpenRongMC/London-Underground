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
 *  org.mtr.mapping.mapper.BlockEntityExtension
 *  org.mtr.mapping.mapper.BlockHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.BlockEntityTypes;
import net.londonunderground.mod.blocks.BlockRoundelBase;
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
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

public class MordenSign
extends BlockRoundelBase {
    public MordenSign(BlockSettings settings) {
        super(settings);
    }

    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return this.getDefaultState2().with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING);
        return BlockHelper.shapeUnion((VoxelShape)IBlock.getVoxelShapeByDirection((double)-1.5, (double)8.66667, (double)7.575, (double)17.5, (double)31.0, (double)8.425, (Direction)facing), (VoxelShape[])new VoxelShape[]{IBlock.getVoxelShapeByDirection((double)7.375, (double)0.0, (double)7.6, (double)8.625, (double)8.75, (double)8.4, (Direction)facing)});
    }

    @NotNull
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityMordenSign(pos, state);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add((HolderBase<?>)FACING);
    }

    public static class TileEntityMordenSign
    extends BlockRoundelBase.TileEntityBlockRoundelBase {
        public TileEntityMordenSign(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.MORDEN_SIGN_TILE_ENTITY.get(), pos, state);
        }

        @Override
        public boolean shouldRender() {
            return true;
        }
    }
}

