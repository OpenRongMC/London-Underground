/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1935
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.holder.ItemConvertible
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.registry.CreativeModeTabHolder
 */
package net.londonunderground.mod;

import net.londonunderground.mod.Blocks;
import net.londonunderground.mod.Init;
import net.minecraft.world.level.ItemLike;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class CreativeModeTabs {
    public static final CreativeModeTabHolder TFL_BLOCKS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier("londonunderground", "tfl_blocks"), () -> new ItemStack(new ItemConvertible(Blocks.ROUNDEL_POLE.get().data)));
    public static final CreativeModeTabHolder TFL_STATION = Init.REGISTRY.createCreativeModeTabHolder(new Identifier("londonunderground", "tfl_station"), () -> new ItemStack(new ItemConvertible(Blocks.STATION_A1.get().data)));
    public static final CreativeModeTabHolder TFL_SIGNS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier("londonunderground", "tfl_signs"), () -> new ItemStack(new ItemConvertible(Blocks.BLOCK_ROUNDEL_1.get().data)));

    public static void init() {
        Init.LOGGER.info("Registering MTR London Underground Addon creative mode tabs");
    }
}

