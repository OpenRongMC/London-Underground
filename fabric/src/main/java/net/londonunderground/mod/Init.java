/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.mtr.mapping.registry.Registry
 *  org.mtr.mapping.tool.DummyClass
 */
package net.londonunderground.mod;

import net.londonunderground.mod.BlockEntityTypes;
import net.londonunderground.mod.Blocks;
import net.londonunderground.mod.CreativeModeTabs;
import net.londonunderground.mod.PanelCommand;
import net.londonunderground.mod.SoundEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.registry.Registry;
import org.mtr.mapping.tool.DummyClass;

public final class Init {
    public static final String MOD_ID = "londonunderground";
    public static final Logger LOGGER = LogManager.getLogger((String)"MTRLondonUndergroundAddon");
    public static final Registry REGISTRY = new Registry();

    public static void init() {
        Blocks.init();
        BlockEntityTypes.init();
        CreativeModeTabs.init();
        SoundEvents.init();
        DummyClass.enableLogging();
        REGISTRY.registerCommand(MOD_ID, PanelCommand::build, new String[]{"mtrlu", "lumtr"});
        REGISTRY.init();
    }
}

