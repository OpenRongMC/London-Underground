/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.ItemPlacementContext
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.mapper.BlockExtension
 *  org.mtr.mapping.mapper.DirectionHelper
 *  org.mtr.mapping.tool.HolderBase
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.ItemPlacementContext;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;

public class MordenBlock
extends BlockExtension
implements DirectionHelper {
    public MordenBlock(BlockSettings settings) {
        super(settings);
    }

    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return this.getDefaultState2().with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add((HolderBase<?>)FACING);
    }
}

