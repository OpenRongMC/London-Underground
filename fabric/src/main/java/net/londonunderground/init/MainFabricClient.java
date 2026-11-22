/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 */
package net.londonunderground.init;

import net.fabricmc.api.ClientModInitializer;
import net.londonunderground.mod.InitClient;

public class MainFabricClient
implements ClientModInitializer {
    public void onInitializeClient() {
        InitClient.init();
    }
}

