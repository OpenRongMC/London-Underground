/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.mapper.GraphicsHolder
 *  org.mtr.mod.block.BlockSignalBase$BlockEntityBase
 *  org.mtr.mod.client.IDrawing
 *  org.mtr.mod.data.IGui
 *  org.mtr.mod.render.MainRenderer
 *  org.mtr.mod.render.QueuedRenderLayer
 *  org.mtr.mod.render.RenderSignalBase
 *  org.mtr.mod.render.StoredMatrixTransformations
 */
package net.londonunderground.mod.render;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.block.BlockSignalBase;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.data.IGui;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.RenderSignalBase;
import org.mtr.mod.render.StoredMatrixTransformations;

public class RenderTunnelSignalLight<T extends BlockSignalBase.BlockEntityBase>
extends RenderSignalBase<T>
implements IGui {
    private final boolean redOnTop;
    private final int proceedColor;

    public RenderTunnelSignalLight(BlockEntityRenderer.Argument dispatcher, boolean redOnTop, int proceedColor) {
        super(dispatcher, 16, 2);
        this.redOnTop = redOnTop;
        this.proceedColor = proceedColor;
    }

    protected void render(@NotNull StoredMatrixTransformations storedMatrixTransformations, @NotNull T entity, float tickDelta, int occupiedAspect, boolean isBackSide) {
        float y = occupiedAspect > 0 == this.redOnTop ? 0.25f : 0.4375f;
        MainRenderer.scheduleRender((Identifier)new Identifier("mtr", "textures/block/white.png"), (boolean)false, (QueuedRenderLayer)QueuedRenderLayer.LIGHT, (graphicsHolder, offset) -> {
            storedMatrixTransformations.transform(graphicsHolder, offset);
            IDrawing.drawTexture((GraphicsHolder)graphicsHolder, (float)-0.25f, (float)y, (float)0.3125f, (float)-0.0625f, (float)(y + 0.1875f), (float)0.3125f, (Direction)Direction.UP, (int)(occupiedAspect > 0 ? -65536 : this.proceedColor), (int)GraphicsHolder.getDefaultLight());
            graphicsHolder.pop();
        });
    }
}

