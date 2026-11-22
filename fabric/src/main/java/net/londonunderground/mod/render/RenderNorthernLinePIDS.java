/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.holder.MutableText
 *  org.mtr.mapping.holder.OrderedText
 *  org.mtr.mapping.holder.Style
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.mapper.GraphicsHolder
 *  org.mtr.mapping.mapper.TextHelper
 *  org.mtr.mod.config.Config
 *  org.mtr.mod.render.RenderPIDS
 */
package net.londonunderground.mod.render;

import net.londonunderground.mod.blocks.NorthernLinePIDS;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.holder.OrderedText;
import org.mtr.mapping.holder.Style;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.config.Config;
import org.mtr.mod.render.RenderPIDS;

public class RenderNorthernLinePIDS
extends RenderPIDS<NorthernLinePIDS.TileEntityNorthernLinePIDS> {
    public RenderNorthernLinePIDS(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher, 1.5f, 7.5f, 6.0f, 6.5f, 29, true, 1.0f);
    }

    public void renderText(GraphicsHolder graphicsHolder, String text, int x, int y, int color) {
        Style style = Config.getClient().getUseMTRFont() ? Style.getEmptyMapped().withFont(new Identifier("londonunderground", "london-underground-regular")) : Style.getEmptyMapped();
        OrderedText orderedText = TextHelper.mutableTextToOrderedText((MutableText)TextHelper.setStyle((MutableText)TextHelper.literal((String)text), (Style)style));
        graphicsHolder.drawText(orderedText, x, y, color, false, GraphicsHolder.getDefaultLight());
    }

    public String getArrivalString(long arrival, boolean isRealtime, boolean isCjk) {
        if (arrival < 60L && !isCjk) {
            return TextHelper.translatable((String)"gui.londonunderground.arrival_sec", (Object[])new Object[0]).getString();
        }
        return super.getArrivalString(arrival, isRealtime, isCjk);
    }
}

