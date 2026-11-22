/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2769
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.ItemPlacementContext
 *  org.mtr.mapping.holder.Property
 *  org.mtr.mapping.mapper.DirectionHelper
 *  org.mtr.mapping.tool.HolderBase
 *  org.mtr.mod.block.BlockWaterloggable
 */
package net.londonunderground.mod.blocks;

import java.util.List;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.ItemPlacementContext;
import org.mtr.mapping.holder.Property;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockWaterloggable;

public class LUPoleRoundel
extends BlockWaterloggable
implements DirectionHelper {
    public LUPoleRoundel(BlockSettings settings) {
        super(settings);
    }

    public BlockState getPlacementState2(ItemPlacementContext itemPlacementContext) {
        return super.getPlacementState2(itemPlacementContext).with(new Property<>(FACING.data), itemPlacementContext.getPlayerFacing().data);
    }

    public void addBlockProperties(List<HolderBase<?>> builder) {
        super.addBlockProperties(builder);
        builder.add((HolderBase<?>)FACING);
    }
}

