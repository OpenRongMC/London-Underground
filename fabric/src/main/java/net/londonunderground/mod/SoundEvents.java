/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.registry.SoundEventRegistryObject
 */
package net.londonunderground.mod;

import net.londonunderground.mod.Init;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.SoundEventRegistryObject;

public final class SoundEvents {
    public static final SoundEventRegistryObject SOUND_EVENT_OUTSIDE_AMBIENT = Init.REGISTRY.registerSoundEvent(new Identifier("londonunderground", "cityambient"));
    public static final SoundEventRegistryObject SOUND_EVENT_SEE_IT_SAY_IT = Init.REGISTRY.registerSoundEvent(new Identifier("londonunderground", "seeitsayitsorted"));
    public static final SoundEventRegistryObject SOUNT_EVENT_TUBE_STATION_AMBIENCE1 = Init.REGISTRY.registerSoundEvent(new Identifier("londonunderground", "ambient1"));

    public static void init() {
        Init.LOGGER.info("Registering MTR London Underground Addon sound events");
    }
}

