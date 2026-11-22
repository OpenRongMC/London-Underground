/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.class_2382
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.ClientPlayerEntity
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.holder.Item
 *  org.mtr.mapping.holder.MinecraftClient
 *  org.mtr.mapping.holder.PlayerEntity
 *  org.mtr.mapping.holder.Vector3d
 *  org.mtr.mapping.holder.Vector3i
 *  org.mtr.mapping.mapper.BlockEntityRenderer
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.mapper.GraphicsHolder
 *  org.mtr.mapping.mapper.PlayerHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.render.MainRenderer
 *  org.mtr.mod.render.QueuedRenderLayer
 *  org.mtr.mod.render.StoredMatrixTransformations
 */
package net.londonunderground.mod.render;

import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.blocks.TunnelDarknessBlock;
import net.londonunderground.mod.render.TunnelEntityModel;
import net.minecraft.core.Vec3i;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.ClientPlayerEntity;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.holder.MinecraftClient;
import org.mtr.mapping.holder.PlayerEntity;
import org.mtr.mapping.holder.Vector3d;
import org.mtr.mapping.holder.Vector3i;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.PlayerHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;

public class RenderDarkTile<T extends TunnelDarknessBlock.TileEntityTunnelDarkness>
extends BlockEntityRenderer<T> {
    private static final TunnelEntityModel TUNNEL_ENTITY_MODEL = new TunnelEntityModel();
    private static final int VIEW_DISTANCE = 64;

    public RenderDarkTile(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

    public void render(@NotNull T entity, float tickDelta, @NotNull GraphicsHolder graphicsHolder, int light, int overlay) {
        ClientPlayerEntity player = MinecraftClient.getInstance().getPlayerMapped();
        if (player == null) {
            return;
        }
        BlockPos pos = entity.getPos2();
        if (!PlayerHelper.isHolding((PlayerEntity)PlayerEntity.cast((HolderBase)player), item -> Block.getBlockFromItem((Item)item).data instanceof TunnelDarknessBlock)) {
            Vector3i vector3i = new Vector3i((Vec3i)player.getBlockPos().data);
            if (pos.distSqr(vector3i) < 4096.0) {
                return;
            }
        }
        StoredMatrixTransformations storedMatrixTransformations = new StoredMatrixTransformations((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        MainRenderer.scheduleRender((Identifier)new Identifier("londonunderground", "textures/block/tunnel_darkness.png"), (boolean)false, (QueuedRenderLayer)QueuedRenderLayer.EXTERIOR, (graphicsHolderNew, offset) -> {
            storedMatrixTransformations.transform(graphicsHolderNew, offset);
            TUNNEL_ENTITY_MODEL.render((GraphicsHolder)graphicsHolderNew, light, overlay, 1.0f, 1.0f, 1.0f, 50.0f);
            graphicsHolderNew.pop();
        });
    }

    public boolean rendersOutsideBoundingBox2(@NotNull T blockEntity) {
        return true;
    }

    public int getRenderDistance2() {
        return 512;
    }

    public boolean isInRenderDistance(@NotNull T blockEntity, @NotNull Vector3d position) {
        return true;
    }
}

