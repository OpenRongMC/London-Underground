/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockRenderType
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.ShapeContext
 *  org.mtr.mapping.holder.VoxelShape
 *  org.mtr.mapping.holder.VoxelShapes
 *  org.mtr.mapping.mapper.BlockEntityExtension
 *  org.mtr.mapping.mapper.BlockExtension
 *  org.mtr.mapping.mapper.BlockWithEntity
 */
package net.londonunderground.mod.blocks;

import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.BlockEntityTypes;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockRenderType;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.holder.VoxelShapes;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockWithEntity;

public class TunnelDarknessBlock
extends BlockExtension
implements BlockWithEntity {
    public TunnelDarknessBlock(BlockSettings settings) {
        super(settings);
    }

    @NotNull
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @NotNull
    public BlockRenderType getRenderType2(BlockState state) {
        return BlockRenderType.getEntityblockAnimatedMapped();
    }

    @NotNull
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityTunnelDarkness(pos, state);
    }

    public static class TileEntityTunnelDarkness
    extends BlockEntityExtension {
        public TileEntityTunnelDarkness(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.DARK_TILE.get(), pos, state);
        }

        public double getRenderDistance2() {
            return 512.0;
        }
    }
}

