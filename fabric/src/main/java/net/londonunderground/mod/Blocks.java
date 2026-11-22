/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2248
 *  org.mtr.mapping.holder.Block
 *  org.mtr.mapping.holder.BlockState
 *  org.mtr.mapping.holder.Blocks
 *  org.mtr.mapping.holder.Identifier
 *  org.mtr.mapping.mapper.BlockExtension
 *  org.mtr.mapping.mapper.SlabBlockExtension
 *  org.mtr.mapping.mapper.StairsBlockExtension
 *  org.mtr.mapping.registry.BlockRegistryObject
 *  org.mtr.mapping.registry.CreativeModeTabHolder
 *  org.mtr.mod.Blocks
 */
package net.londonunderground.mod;

import net.londonunderground.mod.CreativeModeTabs;
import net.londonunderground.mod.Init;
import net.londonunderground.mod.blocks.BlockLUCrossbar;
import net.londonunderground.mod.blocks.BlockLUPole;
import net.londonunderground.mod.blocks.BlockPIDSPole;
import net.londonunderground.mod.blocks.BlockPIDSPoleStation;
import net.londonunderground.mod.blocks.BlockRoundel;
import net.londonunderground.mod.blocks.BlockRoundel2;
import net.londonunderground.mod.blocks.BlockRoundel2Big;
import net.londonunderground.mod.blocks.BlockRoundel2BigEven;
import net.londonunderground.mod.blocks.BlockRoundel3;
import net.londonunderground.mod.blocks.BlockRoundel3Big;
import net.londonunderground.mod.blocks.BlockRoundel3BigEven;
import net.londonunderground.mod.blocks.BlockRoundel4;
import net.londonunderground.mod.blocks.BlockRoundel4Big;
import net.londonunderground.mod.blocks.BlockRoundel4BigEven;
import net.londonunderground.mod.blocks.BlockRoundel5;
import net.londonunderground.mod.blocks.BlockRoundel5Big;
import net.londonunderground.mod.blocks.BlockRoundel5BigEven;
import net.londonunderground.mod.blocks.BlockRoundelBig;
import net.londonunderground.mod.blocks.BlockRoundelBigEven;
import net.londonunderground.mod.blocks.BlockRoundelNLE;
import net.londonunderground.mod.blocks.BlockRoundelStation;
import net.londonunderground.mod.blocks.BlockRoundelStationTop;
import net.londonunderground.mod.blocks.BlockRoundelStationTypeB;
import net.londonunderground.mod.blocks.BlockRoundelStationTypeC;
import net.londonunderground.mod.blocks.BlockTunnelSignal;
import net.londonunderground.mod.blocks.BritishRailUnderground;
import net.londonunderground.mod.blocks.ElizabethSign;
import net.londonunderground.mod.blocks.ExitSign;
import net.londonunderground.mod.blocks.LUDirectionalBlock;
import net.londonunderground.mod.blocks.LUPlatform1;
import net.londonunderground.mod.blocks.LUPoleRoundel;
import net.londonunderground.mod.blocks.MetropolitanSign;
import net.londonunderground.mod.blocks.MordenBlock;
import net.londonunderground.mod.blocks.MordenSign;
import net.londonunderground.mod.blocks.MordenSteps;
import net.londonunderground.mod.blocks.NameProjector;
import net.londonunderground.mod.blocks.NorthernLinePIDS;
import net.londonunderground.mod.blocks.SignDlr;
import net.londonunderground.mod.blocks.SignLizzy;
import net.londonunderground.mod.blocks.SignMetro;
import net.londonunderground.mod.blocks.SignOverground;
import net.londonunderground.mod.blocks.SignPoppy;
import net.londonunderground.mod.blocks.SignPride;
import net.londonunderground.mod.blocks.SignRiver;
import net.londonunderground.mod.blocks.SignTrams;
import net.londonunderground.mod.blocks.SignUnderground;
import net.londonunderground.mod.blocks.SoundOutsideAmbience;
import net.londonunderground.mod.blocks.SoundSeeItSayItSorted;
import net.londonunderground.mod.blocks.SoundTubeStationAmbience1;
import net.londonunderground.mod.blocks.StairBlockExtends;
import net.londonunderground.mod.blocks.StationA1;
import net.londonunderground.mod.blocks.StationA2;
import net.londonunderground.mod.blocks.StationA3;
import net.londonunderground.mod.blocks.StationA3StopMarker;
import net.londonunderground.mod.blocks.StationA4;
import net.londonunderground.mod.blocks.StationA5;
import net.londonunderground.mod.blocks.StationA6;
import net.londonunderground.mod.blocks.StationA7;
import net.londonunderground.mod.blocks.StationA8;
import net.londonunderground.mod.blocks.StationA9;
import net.londonunderground.mod.blocks.StationLight;
import net.londonunderground.mod.blocks.TunnelA0;
import net.londonunderground.mod.blocks.TunnelA1;
import net.londonunderground.mod.blocks.TunnelA1Duel;
import net.londonunderground.mod.blocks.TunnelA2;
import net.londonunderground.mod.blocks.TunnelA2Duel;
import net.londonunderground.mod.blocks.TunnelA2Light;
import net.londonunderground.mod.blocks.TunnelA2NoWires;
import net.londonunderground.mod.blocks.TunnelA2Signal;
import net.londonunderground.mod.blocks.TunnelA3;
import net.londonunderground.mod.blocks.TunnelA3Duel;
import net.londonunderground.mod.blocks.TunnelA3NoWires;
import net.londonunderground.mod.blocks.TunnelA4;
import net.londonunderground.mod.blocks.TunnelA5;
import net.londonunderground.mod.blocks.TunnelDarknessBlock;
import net.londonunderground.mod.blocks.TunnelWires;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mapping.mapper.StairsBlockExtension;
import org.mtr.mapping.registry.BlockRegistryObject;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class Blocks {
    public static final BlockRegistryObject PLATFORM_TFL_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "platform_tfl_1"), () -> new Block(new LUPlatform1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true), true)), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject PLATFORM_TFL_ISLAND = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "platform_tfl_island"), () -> new Block(new LUPlatform1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true), true)), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject PLATFORM_TFL_GAP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "platform_tfl_gap"), () -> new Block(new LUPlatform1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true), true)), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject PLATFORM_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "platform_block"), () -> new Block(new BlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject PLATFORM_VARIANT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "platform_variant"), () -> new Block(new BlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject TUNNEL_DARKNESS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_darkness"), () -> new Block(new TunnelDarknessBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject TFL_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tfl_block"), () -> new Block(new BlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject SOUND_OUTSIDE_AMBIENCE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sounds/outside_ambience"), () -> new Block(new SoundOutsideAmbience(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject TUBE_STATION_AMBIENCE1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sounds/tube_station_ambience1"), () -> new Block(new SoundTubeStationAmbience1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject SOUND_SEE_IT_SAY_IT_SORTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sounds/see_it_say_it_sorted"), () -> new Block(new SoundSeeItSayItSorted(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject STATION_LIGHT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_light"), () -> new Block(new StationLight(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject EXIT_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "exit_sign"), () -> new Block(new ExitSign(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject TUNNEL_ENTRANCE_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_entrance_1"), () -> new Block(new BlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A0 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a0"), () -> new Block(new TunnelA0(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).noCollision())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A0_MORDEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a0_morden"), () -> new Block(new TunnelA0(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).noCollision())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a1"), () -> new Block(new TunnelA1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A1_MORDEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a1_morden"), () -> new Block(new TunnelA1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A1_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a1_duel"), () -> new Block(new TunnelA1Duel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2"), () -> new Block(new TunnelA2(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_NOWIRES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_nowires"), () -> new Block(new TunnelA2NoWires(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_LIGHT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_light"), () -> new Block(new TunnelA2Light(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_LIGHT_WHITE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_light_white"), () -> new Block(new TunnelA2Light(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_NOWIRES_MORDEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_nowires_morden"), () -> new Block(new TunnelA2NoWires(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_SIGNAL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_signal"), () -> new Block(new TunnelA2Signal(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A2_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a2_duel"), () -> new Block(new TunnelA2Duel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A3 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a3"), () -> new Block(new TunnelA3(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A3_NOWIRES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a3_nowires"), () -> new Block(new TunnelA3NoWires(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A3_NOWIRES_MORDEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a3_nowires_morden"), () -> new Block(new TunnelA3NoWires(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_WIRES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_wires"), () -> new Block(new TunnelWires(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A3_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a3_duel"), () -> new Block(new TunnelA3Duel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A4 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a4"), () -> new Block(new TunnelA4(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUNNEL_A5 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_a5"), () -> new Block(new TunnelA5(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a1"), () -> new Block(new StationA1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a2"), () -> new Block(new StationA2(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A3_GREEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a3_green"), () -> new Block(new StationA3StopMarker(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A3 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a3"), () -> new Block(new StationA3(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A4 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a4"), () -> new Block(new StationA4(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A5 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a5"), () -> new Block(new StationA5(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A6 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a6"), () -> new Block(new StationA6(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A7 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a7"), () -> new Block(new StationA7(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A8 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a8"), () -> new Block(new StationA8(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A9 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a9"), () -> new Block(new StationA9(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 2))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A9_PIDPOLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a9_pidpole"), () -> new Block(new BlockPIDSPoleStation(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 2))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A1b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a1b"), () -> new Block(new StationA1(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A2b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a2b"), () -> new Block(new StationA2(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A3b_GREEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a3b_green"), () -> new Block(new StationA3StopMarker(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A3b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a3b"), () -> new Block(new StationA3(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A4b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a4b"), () -> new Block(new StationA4(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A5b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a5b"), () -> new Block(new StationA5(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A6b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a6b"), () -> new Block(new StationA6(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A7b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a7b"), () -> new Block(new StationA7(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A8b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a8b"), () -> new Block(new StationA8(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A9b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a9b"), () -> new Block(new StationA9(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject STATION_A9b_PIDPOLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "station_a9b_pidpole"), () -> new Block(new BlockPIDSPoleStation(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 2))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUBE_0 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_0"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUBE_0_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_0_slab"), () -> new Block(new SlabBlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUBE_0b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_0b"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject TUBE_0b_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_0b_slab"), () -> new Block(new SlabBlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject PIDS_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "pids_pole"), () -> new Block(new BlockPIDSPole(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject ROUNDEL_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "roundel_pole"), () -> new Block(new LUPoleRoundel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject ROUNDEL_POLE_DLR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "roundel_pole_dlr"), () -> new Block(new LUPoleRoundel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject ROUNDEL_POLE_LIZ = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "roundel_pole_liz"), () -> new Block(new LUPoleRoundel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject ROUNDEL_POLE_OVERGROUND = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "roundel_pole_overground"), () -> new Block(new LUPoleRoundel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true, state -> 15).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject NORTHERN_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "pids_northern"), () -> new Block(new NorthernLinePIDS()), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_STAIRS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_stairs"), () -> new Block(new StairsBlockExtension(Blocks.getGenericState(), org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_STONE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_stone"), () -> new Block(new MordenBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_slab"), () -> new Block(new SlabBlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_COBBLE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_cobble_slab"), () -> new Block(new SlabBlockExtension(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_COBBLESTONE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_cobblestone"), () -> new Block(new MordenBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject MORDEN_ARCH_NEW = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_arch_new"), () -> new Block(new TunnelA4(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject MORDEN_ARCH_ROOF = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_arch_roof"), () -> new Block(new TunnelA5(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_STATION});
    public static final BlockRegistryObject MORDEN_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_sign"), () -> new Block(new MordenSign(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject METROPOLITAN_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "metropolitan_sign"), () -> new Block(new MetropolitanSign(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject ELIZABETH_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "elizabeth_sign"), () -> new Block(new ElizabethSign(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_RIVER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_river"), () -> new Block(new SignRiver(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_OVERGROUND = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_overground"), () -> new Block(new SignOverground(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_DLR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_dlr"), () -> new Block(new SignDlr(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_TRAMS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_trams"), () -> new Block(new SignTrams(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_POPPY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_poppy"), () -> new Block(new SignPoppy(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_METRO = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_metro"), () -> new Block(new SignMetro(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_LIZZY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_lizzy"), () -> new Block(new SignLizzy(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_UNDERGROUND = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_underground"), () -> new Block(new SignUnderground(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject SIGN_PRIDE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "sign_pride"), () -> new Block(new SignPride(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
    public static final BlockRegistryObject LU_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "lu_pole"), () -> new Block(new BlockLUPole(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
    public static final BlockRegistryObject BLOCK_ROUNDEL_1;
    public static final BlockRegistryObject BLOCK_ROUNDEL_NLE;
    public static final BlockRegistryObject BRITISH_RAIL_UNDERGROUND;
    public static final BlockRegistryObject BLOCK_ROUNDEL_1_BIG;
    public static final BlockRegistryObject BLOCK_ROUNDEL_1_BIG_EVEN;
    public static final BlockRegistryObject BLOCK_ROUNDEL_2;
    public static final BlockRegistryObject BLOCK_ROUNDEL_2_BIG;
    public static final BlockRegistryObject BLOCK_ROUNDEL_2_BIG_EVEN;
    public static final BlockRegistryObject BLOCK_ROUNDEL_3;
    public static final BlockRegistryObject BLOCK_ROUNDEL_3_BIG;
    public static final BlockRegistryObject BLOCK_ROUNDEL_3_BIG_EVEN;
    public static final BlockRegistryObject BLOCK_ROUNDEL_4;
    public static final BlockRegistryObject BLOCK_ROUNDEL_4_BIG;
    public static final BlockRegistryObject BLOCK_ROUNDEL_4_BIG_EVEN;
    public static final BlockRegistryObject BLOCK_ROUNDEL_5;
    public static final BlockRegistryObject BLOCK_ROUNDEL_5_BIG;
    public static final BlockRegistryObject BLOCK_ROUNDEL_5_BIG_EVEN;
    public static final BlockRegistryObject LU_CROSSBAR;
    public static final BlockRegistryObject MORDEN_STEPS_LEFT;
    public static final BlockRegistryObject MORDEN_STEPS_MIDDLE;
    public static final BlockRegistryObject MORDEN_STEPS_RIGHT;
    public static final BlockRegistryObject NAME_PROJECTOR;
    public static final BlockRegistryObject TRACK_1;
    public static final BlockRegistryObject TRACK_2;
    public static final BlockRegistryObject TUBE_1;
    public static final BlockRegistryObject TUBE_1_STOP;
    public static final BlockRegistryObject TUBE_1_DUEL;
    public static final BlockRegistryObject TUBE_2;
    public static final BlockRegistryObject TUBE_2_DUEL;
    public static final BlockRegistryObject TUBE_3;
    public static final BlockRegistryObject TUBE_1b;
    public static final BlockRegistryObject TUBE_1b_STOP;
    public static final BlockRegistryObject TUBE_1b_DUEL;
    public static final BlockRegistryObject TUBE_2b;
    public static final BlockRegistryObject TUBE_2b_DUEL;
    public static final BlockRegistryObject TUBE_3b;
    public static final BlockRegistryObject MORDEN_STEPS;
    public static final BlockRegistryObject MORDEN_ARCH;
    public static final BlockRegistryObject TUNNEL_BLOCK_0;
    public static final BlockRegistryObject TUNNEL_BLOCK_1;
    public static final BlockRegistryObject TUNNEL_BLOCK_1_DUEL;
    public static final BlockRegistryObject TUNNEL_BLOCK_2;
    public static final BlockRegistryObject TUNNEL_BLOCK_2_SIGNAL;
    public static final BlockRegistryObject TUNNEL_BLOCK_2_DUEL;
    public static final BlockRegistryObject TUNNEL_BLOCK_3;
    public static final BlockRegistryObject TUNNEL_BLOCK_3_DUEL;
    public static final BlockRegistryObject TUNNEL_BLOCK_4;
    public static final BlockRegistryObject TUNNEL_BLOCK_5;
    public static final BlockRegistryObject BLOCK_ROUNDEL_STATION;
    public static final BlockRegistryObject BLOCK_ROUNDEL_STATION_TYPE_B;
    public static final BlockRegistryObject BLOCK_ROUNDEL_STATION_TYPE_C;
    public static final BlockRegistryObject BLOCK_ROUNDEL_STATION_TOP;

    public static void init() {
        Init.LOGGER.info("Registering MTR London Underground Addon blocks");
    }

    private static BlockState getGenericState() {
        return org.mtr.mapping.holder.Blocks.getDirtMapped().getDefaultState();
    }

    static {
        LU_CROSSBAR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "lu_crossbar"), () -> new Block(new BlockLUCrossbar(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
        BLOCK_ROUNDEL_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_1"), () -> new Block(new BlockRoundel(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_NLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_nle"), () -> new Block(new BlockRoundelNLE(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BRITISH_RAIL_UNDERGROUND = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "british_rail_underground"), () -> new Block(new BritishRailUnderground(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_1_BIG = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_1_big"), () -> new Block(new BlockRoundelBig(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_1_BIG_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_1_big_even"), () -> new Block(new BlockRoundelBigEven(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_2"), () -> new Block(new BlockRoundel2(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_2_BIG = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_2_big"), () -> new Block(new BlockRoundel2Big(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_2_BIG_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_2_big_even"), () -> new Block(new BlockRoundel2BigEven(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_3 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_3"), () -> new Block(new BlockRoundel3(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_3_BIG = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_3_big"), () -> new Block(new BlockRoundel3Big(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_3_BIG_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_3_big_even"), () -> new Block(new BlockRoundel3BigEven(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_4 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_4"), () -> new Block(new BlockRoundel4(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_4_BIG = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_4_big"), () -> new Block(new BlockRoundel4Big(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_4_BIG_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_4_big_even"), () -> new Block(new BlockRoundel4BigEven(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_5 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_5"), () -> new Block(new BlockRoundel5(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_5_BIG = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_5_big"), () -> new Block(new BlockRoundel5Big(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        BLOCK_ROUNDEL_5_BIG_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_5_big_even"), () -> new Block(new BlockRoundel5BigEven(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_SIGNS});
        MORDEN_STEPS_LEFT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_steps_left"), () -> new Block(new MordenSteps(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
        MORDEN_STEPS_MIDDLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_steps_middle"), () -> new Block(new MordenSteps(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
        MORDEN_STEPS_RIGHT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_steps_right"), () -> new Block(new MordenSteps(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true))), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
        NAME_PROJECTOR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "name_projector"), () -> new Block(new NameProjector(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[]{CreativeModeTabs.TFL_BLOCKS});
        TRACK_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "track_1"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TRACK_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "track_2"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1_STOP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1_stop"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_2"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_2_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_2_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_3 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_3"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1b"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1b_STOP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1b_stop"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_1b_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_1b_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_2b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_2b"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_2b_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_2b_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUBE_3b = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tube_3b"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        MORDEN_STEPS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_arch"), () -> new Block(new StairBlockExtends(Blocks.getGenericState(), org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        MORDEN_ARCH = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "morden_steps"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_0 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_0"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).noCollision().nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_1"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_1_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_1_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_2"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_2_SIGNAL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_2_duel"), () -> new Block(new BlockTunnelSignal(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_2_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_2_signal"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_3 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_3"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_3_DUEL = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_3_duel"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_4 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_4"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        TUNNEL_BLOCK_5 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "tunnel_block_5"), () -> new Block(new LUDirectionalBlock(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        BLOCK_ROUNDEL_STATION = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_station"), () -> new Block(new BlockRoundelStation(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        BLOCK_ROUNDEL_STATION_TYPE_B = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_station_type_b"), () -> new Block(new BlockRoundelStationTypeB(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        BLOCK_ROUNDEL_STATION_TYPE_C = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_station_type_c"), () -> new Block(new BlockRoundelStationTypeC(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
        BLOCK_ROUNDEL_STATION_TOP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier("londonunderground", "block_roundel_station_top"), () -> new Block(new BlockRoundelStationTop(org.mtr.mod.Blocks.createDefaultBlockSettings((boolean)true).nonOpaque())), new CreativeModeTabHolder[0]);
    }
}

