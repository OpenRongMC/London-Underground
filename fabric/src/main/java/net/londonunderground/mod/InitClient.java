/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.mtr.mapping.holder.RenderLayer
 *  org.mtr.mapping.mapper.BlockEntityRenderer$Argument
 *  org.mtr.mapping.registry.RegistryClient
 */
package net.londonunderground.mod;

import net.londonunderground.mod.BlockEntityTypes;
import net.londonunderground.mod.Blocks;
import net.londonunderground.mod.Init;
import net.londonunderground.mod.render.RenderDarkTile;
import net.londonunderground.mod.render.RenderNameProjector;
import net.londonunderground.mod.render.RenderNorthernLinePIDS;
import net.londonunderground.mod.render.RenderRoundel;
import net.londonunderground.mod.render.RenderTunnelSignalLight;
import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.registry.RegistryClient;

public final class InitClient {
    public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);

    public static void init() {
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.DARK_TILE, RenderDarkTile::new);
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.TUNNEL_BLOCK_2_SIGNAL, dispatcher -> new RenderTunnelSignalLight((BlockEntityRenderer.Argument)dispatcher, false, -16711936));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.TUNNEL_A2_SIGNAL, dispatcher -> new RenderTunnelSignalLight((BlockEntityRenderer.Argument)dispatcher, false, -16711936));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.PIDS_NORTHERN_TILE_ENTITY, RenderNorthernLinePIDS::new);
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_NLE_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.495f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BRITISH_RAIL_UNDERGROUND_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.09f, -0.48f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_BIG_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, 0.0f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_BIG_EVEN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, -0.5f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL2_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL2_BIG_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, 0.0f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL2_BIG_EVEN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, -0.5f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL3_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL3_BIG_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, 0.0f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL3_BIG_EVEN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, -0.5f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL4_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL4_BIG_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, 0.0f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL4_BIG_EVEN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, -0.5f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL5_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.875f, 0.0125f, 0.0f, 0.0f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL5_BIG_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, 0.0f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL5_BIG_EVEN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.75f, 0.025f, -0.5f, 0.5f, -0.5f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_STATION_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.6923077f, 0.016923077f, 0.0f, 0.21f, 1.046f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_STATION_TOP_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.6923077f, 0.016923077f, 0.4f, 0.25f, 1.577f, 30.0f, -16773827, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_STATION_TYPE_B_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 1.6923077f, 0.016923077f, 0.01f, -0.039f, 1.296f, 0.0f, -5000269, false, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.BLOCK_ROUNDEL_STATION_TYPE_C_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 6.4f, 0.101538464f, 0.01f, 1.739f, 0.596f, 30.0f, -16777216, false, "beeching"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.NAME_PROJECTOR, RenderNameProjector::new);
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.MORDEN_SIGN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.625f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.METROPOLITAN_SIGN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.625f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.ELIZABETH_SIGN_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.625f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_RIVER_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_OVERGROUND_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_DLR_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_TRAMS_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_POPPY_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_METRO_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_LIZZY_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_UNDERGROUND_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.SIGN_PRIDE_TILE_ENTITY, dispatcher -> new RenderRoundel((BlockEntityRenderer.Argument)dispatcher, 0.9375f, 0.0125f, 0.0f, 0.6375f, 0.0265625f, 0.0f, -5000269, true, "johnston"));
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.TUNNEL_BLOCK_2_SIGNAL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.TUNNEL_A2_SIGNAL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BRITISH_RAIL_UNDERGROUND);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_1);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_NLE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_1_BIG);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_1_BIG_EVEN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_2);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_2_BIG);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_2_BIG_EVEN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_3);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_3_BIG);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_3_BIG_EVEN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_4);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_4_BIG);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_4_BIG_EVEN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_5);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_5_BIG);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_5_BIG_EVEN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.ROUNDEL_POLE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.ROUNDEL_POLE_DLR);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.ROUNDEL_POLE_LIZ);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.ROUNDEL_POLE_OVERGROUND);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.MORDEN_SIGN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.METROPOLITAN_SIGN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.ELIZABETH_SIGN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_RIVER);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_OVERGROUND);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_DLR);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_TRAMS);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_POPPY);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_METRO);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_LIZZY);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_UNDERGROUND);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGN_PRIDE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_STATION);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_STATION_TOP);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_STATION_TYPE_B);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.BLOCK_ROUNDEL_STATION_TYPE_C);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.EXIT_SIGN);
        REGISTRY_CLIENT.init();
    }
}

