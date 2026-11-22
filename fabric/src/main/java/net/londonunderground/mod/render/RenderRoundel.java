/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.core.data.Station
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.Direction
 *  org.mtr.mapping.holder.DirectionProperty
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.holder.MutableText
 *  org.mtr.mapping.holder.Style
 *  org.mtr.mapping.holder.World
 *  org.mtr.mapping.mapper.BlockEntityRenderer
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.mapper.GraphicsHolder
 *  org.mtr.mapping.mapper.TextHelper
 *  org.mtr.mod.InitClient
 *  org.mtr.mod.block.IBlock
 *  org.mtr.mod.client.IDrawing
 *  org.mtr.mod.config.Config
 *  org.mtr.mod.data.IGui
 *  org.mtr.mod.render.MainRenderer
 *  org.mtr.mod.render.QueuedRenderLayer
 *  org.mtr.mod.render.StoredMatrixTransformations
 */
package net.londonunderground.mod.render;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import net.londonunderground.mod.blocks.BlockRoundelBase;
import org.mtr.core.data.Station;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.DirectionProperty;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.holder.Style;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.InitClient;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.config.Config;
import org.mtr.mod.data.IGui;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;

public class RenderRoundel<T extends BlockRoundelBase.TileEntityBlockRoundelBase>
extends BlockEntityRenderer<T>
implements IGui,
IDrawing {
    private final float maxWidth;
    private final float maxScale;
    private final float xOffset;
    private final float yOffset;
    private final float zOffset;
    private final float xTilt;
    private final int textColor;
    private final boolean isDoubleSided;
    private final String font;

    public RenderRoundel(BlockEntityRenderer.Argument dispatcher, float maxWidth, float maxScale, float xOffset, float yOffset, float zOffset, float xTilt, int textColor, boolean isDoubleSided, String font) {
        super(dispatcher);
        this.maxWidth = maxWidth;
        this.maxScale = maxScale;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.zOffset = zOffset;
        this.xTilt = xTilt;
        this.textColor = textColor;
        this.isDoubleSided = isDoubleSided;
        this.font = font;
    }

    public void render(@NotNull T entity, float tickDelta, @NotNull GraphicsHolder graphicsHolder, int light, int overlay) {
        Style style;
        Style style2 = style = Config.getClient().getUseMTRFont() ? Style.getEmptyMapped().withFont(new Identifier("londonunderground", "johnston")) : Style.getEmptyMapped();
        if (!((BlockRoundelBase.TileEntityBlockRoundelBase)((Object)entity)).shouldRender()) {
            return;
        }
        World world = entity.getWorld2();
        if (world == null) {
            return;
        }
        BlockPos pos = entity.getPos2();
        BlockState state = world.getBlockState(pos);
        Direction facing = IBlock.getStatePropertySafe((BlockState)state, (DirectionProperty)BlockRoundelBase.FACING);
        Station station = InitClient.findStation((BlockPos)pos);
        MutableText roundelText = TextHelper.setStyle((MutableText)TextHelper.literal((String)IGui.textOrUntitled((String)IGui.formatStationName((String)(station == null ? "" : station.getName()))).toUpperCase(Locale.ROOT)), (Style)style);
        int textWidth = GraphicsHolder.getTextWidth((MutableText)roundelText);
        StoredMatrixTransformations storedMatrixTransformations = new StoredMatrixTransformations((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5);
        storedMatrixTransformations.add(graphicsHolderNew -> {
            graphicsHolderNew.rotateYDegrees(-facing.asRotation());
            graphicsHolderNew.rotateZDegrees(180.0f);
        });
        MainRenderer.scheduleRender((QueuedRenderLayer)QueuedRenderLayer.TEXT, (graphicsHolderNew, offset) -> {
            storedMatrixTransformations.transform(graphicsHolderNew, offset);
            this.render((GraphicsHolder)graphicsHolderNew, roundelText, textWidth, light);
            if (this.isDoubleSided) {
                graphicsHolderNew.rotateYDegrees(180.0f);
                this.render((GraphicsHolder)graphicsHolderNew, roundelText, textWidth, light);
            }
            graphicsHolderNew.pop();
        });
    }

    private void render(GraphicsHolder graphicsHolder, MutableText roundelText, int textWidth, int light) {
        graphicsHolder.push();
        graphicsHolder.rotateXDegrees(this.xTilt);
        graphicsHolder.translate((double)(-this.xOffset), (double)(-this.yOffset), (double)(-this.zOffset - 0.00625f));
        float scale = Math.min(this.maxWidth / (float)textWidth, this.maxScale);
        graphicsHolder.scale(scale, scale, scale);
        graphicsHolder.translate(0.0, -3.5, 0.0);
        graphicsHolder.drawText(roundelText, -textWidth / 2, 0, this.textColor, false, light);
        graphicsHolder.pop();
    }
}

