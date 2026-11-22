/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.class_1937
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockPos
 *  org.mtr.mapping.holder.BlockSettings
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.holder.LivingEntity
 *  org.mtr.mapping.holder.PlayerEntity
 *  org.mtr.mapping.holder.Random
 *  org.mtr.mapping.holder.ServerWorld
 *  org.mtr.mapping.holder.SoundCategory
 *  org.mtr.mapping.holder.World
 *  org.mtr.mapping.mapper.BlockExtension
 */
package net.londonunderground.mod.blocks;

import org.jetbrains.annotations.Nullable;
import net.londonunderground.mod.SoundEvents;
import net.minecraft.world.level.Level;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.holder.LivingEntity;
import org.mtr.mapping.holder.Entity;
import org.mtr.mapping.holder.Random;
import org.mtr.mapping.holder.ServerWorld;
import org.mtr.mapping.holder.SoundCategory;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockExtension;

public class SoundOutsideAmbience
extends BlockExtension {
    public SoundOutsideAmbience(BlockSettings settings) {
        super(settings);
    }

    public void scheduledTick2(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.playSound((Entity)null, pos, SoundEvents.SOUND_EVENT_OUTSIDE_AMBIENT.get(), SoundCategory.getAmbientMapped(), 5.0f, 1.0f);
        SoundOutsideAmbience.scheduleBlockTick((World)new World((Level)world.data), (BlockPos)pos, (Block)state.getBlock(), (int)8040);
    }

    public void onPlaced2(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        SoundOutsideAmbience.scheduleBlockTick((World)world, (BlockPos)pos, (Block)state.getBlock(), (int)20);
    }
}

