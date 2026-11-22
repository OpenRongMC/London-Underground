/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.BlockView
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.holder.MutableText
 *  org.mtr.mapping.holder.TextFormatting
 *  org.mtr.mapping.holder.TooltipContext
 *  org.mtr.mapping.mapper.StairsBlockExtension
 *  org.mtr.mapping.mapper.TextHelper
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.holder.TextFormatting;
import org.mtr.mapping.holder.TooltipContext;
import org.mtr.mapping.mapper.StairsBlockExtension;
import org.mtr.mapping.mapper.TextHelper;

public class StairBlockExtends
extends StairsBlockExtension {
    public StairBlockExtends(BlockState baseBlockState, BlockSettings settings) {
        super(baseBlockState, settings);
    }

    public void addTooltips(ItemStack stack, @Nullable BlockView world, List<MutableText> tooltip, TooltipContext options) {
        tooltip.add(TextHelper.literal((String)"DEPRECATED!!!").formatted(TextFormatting.RED));
    }
}

