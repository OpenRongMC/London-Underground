/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.mapper.BlockEntityRenderer
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.mapper.GraphicsHolder
 */
package net.londonunderground.mod.render;

import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.blocks.BlockRoundelBase;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;

public class RenderNameProjector<T extends BlockRoundelBase.TileEntityBlockRoundelBase>
extends BlockEntityRenderer<T> {
    public RenderNameProjector(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

    public void render(@NotNull T entity, float tickDelta, @NotNull GraphicsHolder graphicsHolder, int textWidth, int light) {
    }
}

