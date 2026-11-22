/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  net.minecraft.class_1935
 *  org.mtr.mapping.holder.ItemConvertible
 *  org.mtr.mapping.holder.ItemStack
 *  org.mtr.mapping.holder.Items
 *  org.mtr.mapping.holder.ServerPlayerEntity
 *  org.mtr.mapping.registry.CommandBuilder
 *  org.mtr.mapping.registry.CommandBuilder$ContextHandler
 */
package net.londonunderground.mod;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.world.level.ItemLike;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.holder.Items;
import org.mtr.mapping.holder.ServerPlayerEntity;
import org.mtr.mapping.registry.CommandBuilder;

public final class PanelCommand {
    public static void build(CommandBuilder<?> commandBuilder) {
        commandBuilder.then("panel", commandBuilderPanel -> commandBuilderPanel.then("custom", (ArgumentType)IntegerArgumentType.integer(), innerCommandBuilder -> innerCommandBuilder.executes(PanelCommand::run)));
    }

    private static int run(CommandBuilder.ContextHandler contextHandler) {
        ServerPlayerEntity serverPlayerEntity = contextHandler.getServerPlayer();
        if (serverPlayerEntity != null) {
            ItemStack item = new ItemStack(new ItemConvertible(Items.getIronIngotMapped().data), 1);
            item.getOrCreateTag().putInt("CustomModelData", contextHandler.getInteger("custom"));
            serverPlayerEntity.addItem(item);
        }
        return 1;
    }
}

