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
 *  org.mtr.mod.block.IBlock
 */
package net.londonunderground.mod.blocks;

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
import org.mtr.mod.block.IBlock;

public class BlockRoundelBigEven
extends BlockRoundelBase {
    public BlockRoundelBigEven(BlockSettings settings) {
        super(settings);
    }

    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        Direction side = ctx.getSide();
        if (side != Direction.UP && side != Direction.DOWN) {
            return this.getDefaultState2().with(new Property<>(FACING.data), side.getOpposite().data);
        }
        return null;
    }

    @NotNull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)1.0, (Direction)IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)FACING));
    }

    @NotNull
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityBlockRoundelBigEven(pos, state);
    }

    public static class TileEntityBlockRoundelBigEven
    extends BlockRoundelBase.TileEntityBlockRoundelBase {
        public TileEntityBlockRoundelBigEven(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.BLOCK_ROUNDEL_BIG_EVEN_TILE_ENTITY.get(), pos, state);
        }

        @Override
        public boolean shouldRender() {
            return true;
        }
    }
}

