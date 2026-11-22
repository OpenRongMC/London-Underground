/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.mtr.mapping.mapper.EntityExtension
 *  org.mtr.mapping.mapper.EntityModelExtension
 *  org.mtr.mapping.mapper.GraphicsHolder
 *  org.mtr.mapping.mapper.ModelPartExtension
 */
package net.londonunderground.mod.render;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.mapper.EntityExtension;
import org.mtr.mapping.mapper.EntityModelExtension;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.ModelPartExtension;

public class TunnelEntityModel
extends EntityModelExtension<EntityExtension> {
    private final ModelPartExtension main = this.createModelPart();

    public TunnelEntityModel() {
        super(16, 16);
        this.main.setPivot(0.0f, 0.0f, 0.0f);
        this.main.setTextureUVOffset(0, 0).addCuboid(0.0f, 0.0f, 0.0f, 16, 16, 16, 0.0f, false);
        this.buildModel();
    }

    public void render(@NotNull GraphicsHolder graphicsHolder, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.main.render(graphicsHolder, 0.0f, 0.0f, 0.0f, packedLight, packedOverlay);
    }

    public void setAngles2(@NotNull EntityExtension entity, float v, float v1, float v2, float v3, float v4) {
    }
}

