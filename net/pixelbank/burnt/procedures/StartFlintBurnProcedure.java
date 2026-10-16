package net.pixelbank.burnt.procedures;

import net.minecraft.class_1928;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.pixelbank.burnt.compat.BurnMappingRegistry;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class StartFlintBurnProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!BurntProtection.isProtected(world, x, y, z)) {
         if (world.method_8401().method_146().method_8355(class_1928.field_19387) && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            class_2338 pos = class_2338.method_49637(x, y, z);
            class_2680 bs = world.method_8320(pos);
            class_2960 blockKey = class_7923.field_41175.method_10221(bs.method_26204());
            boolean rainExtinguish = (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get();
            boolean crafted = (Boolean)BurntBasicConfigConfiguration.CRAFTED_BURN.get();
            boolean woolBurn = (Boolean)BurntBasicConfigConfiguration.WOOL_BURN.get();
            boolean burnBarrels = (Boolean)BurntBasicConfigConfiguration.BURN_BARRELS.get();
            boolean rainingHere = world.method_8401().method_156() && IsRainingProcedure.execute(world, x, y, z);
            if (!rainExtinguish || !rainingHere || world.method_23753(pos).method_40220(BurntTags.BIOME_MC_IS_CAVE)) {
               class_2680 bsW1 = world.method_8320(class_2338.method_49637(x + (double)1.0F, y - (double)1.0F, z));
               class_2680 bsW2 = world.method_8320(class_2338.method_49637(x - (double)1.0F, y - (double)1.0F, z));
               class_2680 bsW3 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z + (double)1.0F));
               class_2680 bsW4 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z - (double)1.0F));
               class_2680 bsW5 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z));
               if (bsW1.method_26227().method_15759().method_26204() != class_2246.field_10382 && bsW2.method_26227().method_15759().method_26204() != class_2246.field_10382 && bsW3.method_26227().method_15759().method_26204() != class_2246.field_10382 && bsW4.method_26227().method_15759().method_26204() != class_2246.field_10382 && bsW5.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                  if ((blockKey.equals(class_2960.method_60654("biomesoplenty:high_grass")) || blockKey.equals(class_2960.method_60654("biomesoplenty:high_grass_plant"))) && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225()) {
                     world.method_8652(pos, BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564(), 3);
                  }

                  if (blockKey.equals(class_2960.method_60654("immersive_weathering:grassy_earthen_clay"))) {
                     world.method_8652(pos, BurntModBlocks.BURNT_GRASSY_EARTHEN_CLAY.method_9564(), 3);
                  }

                  if (blockKey.equals(class_2960.method_60654("immersive_weathering:grassy_sandy_dirt"))) {
                     world.method_8652(pos, BurntModBlocks.BURNT_GRASSY_SANDY_D_IRT.method_9564(), 3);
                  }

                  if (blockKey.equals(class_2960.method_60654("supplementaries:gunpowder"))) {
                     world.method_8652(pos, class_2246.field_10036.method_9564(), 3);
                  }

                  if (blockKey.equals(class_2960.method_60654("regions_unexplored:small_oak_log")) || blockKey.equals(class_2960.method_60654("regions_unexplored:stripped_small_oak_log"))) {
                     class_2769 var22 = BurntModBlocks.SOOTY_SMALL_LOG.method_9595().method_11663("hot");
                     class_2680 var10000;
                     if (var22 instanceof class_2746) {
                        class_2746 _withbp38 = (class_2746)var22;
                        var10000 = (class_2680)BurntModBlocks.SOOTY_SMALL_LOG.method_9564().method_11657(_withbp38, true);
                     } else {
                        var10000 = BurntModBlocks.SOOTY_SMALL_LOG.method_9564();
                     }

                     class_2680 _bs = var10000;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (blockKey.equals(class_2960.method_60654("regions_unexplored:bamboo_log"))) {
                     class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_LOG.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_SOOTY)) {
                     class_2769 _bs = bs.method_26204().method_9595().method_11663("hot");
                     if (_bs instanceof class_2746) {
                        class_2746 _booleanProp = (class_2746)_bs;
                        world.method_8652(pos, (class_2680)bs.method_11657(_booleanProp, true), 3);
                     }
                  }

                  if (Math.random() <= (double)0.5F && (bs.method_26164(BurntTags.BLOCK_FORGE_GLASS) || bs.method_26164(BurntTags.BLOCK_FORGE_GLASS_PANES)) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     world.method_22352(pos, false);
                  }

                  if (bs.method_26204() == class_2246.field_10112 || bs.method_26204() == class_2246.field_10313) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_FERN.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10479 || bs.method_26204() == class_2246.field_10428) {
                     class_2680 _bs = BurntModBlocks.TALL_GRASS_FIRE.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_BURNS_TO_DOUBLE_TALL_GRASS)) {
                     class_2769 _be = bs.method_26204().method_9595().method_11663("half");
                     String var123;
                     if (_be instanceof class_2754) {
                        class_2754 _getep70 = (class_2754)_be;
                        var123 = bs.method_11654(_getep70).toString();
                     } else {
                        var123 = "";
                     }

                     if (var123.equals("lower")) {
                        world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
                        class_2680 _bs = BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564();
                        _bs = BurntBlockUtil.copyProperties(bs, _bs);
                        world.method_8652(pos, _bs, 3);
                     }
                  }

                  if (bs.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     GrassStartProcedure.execute(world, x, y, z);
                  }

                  if (bs.method_26204() == class_2246.field_10566) {
                     world.method_8652(pos, BurntModBlocks.BURNT_DIRT.method_9564(), 3);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_FORGE_MUSHROOM_BLOCKS)) {
                     MushroomStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_BAMBOO_BLOCKS)) {
                     BambooStartProcedure.execute(world, x, y, z);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_MC_LEAVES) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     boolean var124;
                     label483: {
                        class_2769 _be = bs.method_26204().method_9595().method_11663("waterlogged");
                        if (_be instanceof class_2746) {
                           class_2746 _getbp101 = (class_2746)_be;
                           if ((Boolean)bs.method_11654(_getbp101)) {
                              var124 = true;
                              break label483;
                           }
                        }

                        var124 = false;
                     }

                     if (!var124) {
                        LeavesStartProcedure.execute(world, x, y, z);
                     }
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_FORGE_STRIPPED_WOOD)) {
                     StrippedWoodStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_FORGE_STRIPPED_LOGS)) {
                     StrippedLogStartProcedure.execute(world, x, y, z);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_FORGE_WOOD)) {
                     WoodStartProcedure.execute(world, x, y, z);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN)) {
                     LogStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_PLANKS) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     PlanksStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_STAIRS) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     boolean var125;
                     label467: {
                        class_2769 _withbp238 = bs.method_26204().method_9595().method_11663("waterlogged");
                        if (_withbp238 instanceof class_2746) {
                           class_2746 _getbp129 = (class_2746)_withbp238;
                           if ((Boolean)bs.method_11654(_getbp129)) {
                              var125 = true;
                              break label467;
                           }
                        }

                        var125 = false;
                     }

                     if (!var125) {
                        StairsStartProcedure.execute(world, x, y, z);
                     }
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_SLABS) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     boolean var126;
                     label458: {
                        class_2769 _withbp243 = bs.method_26204().method_9595().method_11663("waterlogged");
                        if (_withbp243 instanceof class_2746) {
                           class_2746 _getbp137 = (class_2746)_withbp243;
                           if ((Boolean)bs.method_11654(_getbp137)) {
                              var126 = true;
                              break label458;
                           }
                        }

                        var126 = false;
                     }

                     if (!var126) {
                        SlabsStartProcedure.execute(world, x, y, z);
                     }
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_FENCES) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !bs.method_26164(BurntTags.BLOCK_BURNT)) {
                     FenceStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_FENCE_GATES) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     FenceGateStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_DOORS) && !bs.method_26164(BurntTags.BLOCK_NO_BURN)) {
                     class_2769 _withbp247 = bs.method_26204().method_9595().method_11663("half");
                     String var127;
                     if (_withbp247 instanceof class_2754) {
                        class_2754 _getep159 = (class_2754)_withbp247;
                        var127 = bs.method_11654(_getep159).toString();
                     } else {
                        var127 = "";
                     }

                     if (var127.equals("lower")) {
                        DoorStartProcedure.execute(world, x, y, z);
                     }
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_TRAPDOORS) && !bs.method_26164(BurntTags.BLOCK_NO_BURN)) {
                     TrapdoorStartProcedure.execute(world, x, y, z);
                  }

                  if (crafted && bs.method_26204() == class_2246.field_9983) {
                     class_2680 _bs = BurntModBlocks.BURNT_LADDER.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     class_2586 _be = world.method_8321(pos);
                     class_2487 _bnbt = null;
                     if (_be != null) {
                        _bnbt = _be.method_38242(world.method_30349());
                        _be.method_11012();
                     }

                     world.method_8652(pos, _bs, 3);
                     if (_bnbt != null) {
                        _be = world.method_8321(pos);
                        if (_be != null) {
                           try {
                              _be.method_58690(_bnbt, world.method_30349());
                           } catch (Exception var28) {
                           }
                        }
                     }
                  }

                  if (bs.method_26204() == class_2246.field_28681) {
                     world.method_8652(pos, blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
                  }

                  if (crafted && bs.method_26204() == class_2246.field_10504) {
                     class_2769 _bnbt = BurntModBlocks.SOOTY_BOOKSHELF.method_9595().method_11663("hot");
                     class_2680 var128;
                     if (_bnbt instanceof class_2746) {
                        class_2746 _withbp180 = (class_2746)_bnbt;
                        var128 = (class_2680)BurntModBlocks.SOOTY_BOOKSHELF.method_9564().method_11657(_withbp180, true);
                     } else {
                        var128 = BurntModBlocks.SOOTY_BOOKSHELF.method_9564();
                     }

                     class_2680 _bs = var128;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_37546) {
                     world.method_8652(pos, blockStateWithInt(BurntModBlocks.SMOLDERING_MANGROVE_ROOTS.method_9564(), "stage", 1), 3);
                  }

                  if (bs.method_26204() == class_2246.field_10211) {
                     class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_STALK.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_WOODEN_BUTTONS)) {
                     class_2680 _bs = BurntModBlocks.BURNT_BUTTON.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     class_2586 _be = world.method_8321(pos);
                     class_2487 _bnbt = null;
                     if (_be != null) {
                        _bnbt = _be.method_38242(world.method_30349());
                        _be.method_11012();
                     }

                     world.method_8652(pos, _bs, 3);
                     if (_bnbt != null) {
                        _be = world.method_8321(pos);
                        if (_be != null) {
                           try {
                              _be.method_58690(_bnbt, world.method_30349());
                           } catch (Exception var27) {
                           }
                        }
                     }
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_WOODEN_PRESSURE_PLATES)) {
                     class_2680 _bs = BurntModBlocks.BURNT_PRESSURE_PLATE.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     class_2586 _be = world.method_8321(pos);
                     class_2487 _bnbt = null;
                     if (_be != null) {
                        _bnbt = _be.method_38242(world.method_30349());
                        _be.method_11012();
                     }

                     world.method_8652(pos, _bs, 3);
                     if (_bnbt != null) {
                        _be = world.method_8321(pos);
                        if (_be != null) {
                           try {
                              _be.method_58690(_bnbt, world.method_30349());
                           } catch (Exception var26) {
                           }
                        }
                     }
                  }

                  if (bs.method_26204() == class_2246.field_28676) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_28675) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_28678 || bs.method_26204() == class_2246.field_28679) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_28680) {
                     world.method_8652(pos, blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1), 3);
                  }

                  if (crafted && woolBurn && bs.method_26164(BurntTags.BLOCK_MC_WOOL) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     class_2769 var97 = BurntModBlocks.SMOLDERING_WOOL.method_9595().method_11663("hot");
                     class_2680 var10002;
                     if (var97 instanceof class_2746) {
                        class_2746 _withbp227 = (class_2746)var97;
                        var10002 = (class_2680)BurntModBlocks.SMOLDERING_WOOL.method_9564().method_11657(_withbp227, true);
                     } else {
                        var10002 = BurntModBlocks.SMOLDERING_WOOL.method_9564();
                     }

                     world.method_8652(pos, var10002, 3);
                  }

                  if (crafted && bs.method_26164(BurntTags.BLOCK_MC_WOOL_CARPETS)) {
                     class_2769 var98 = BurntModBlocks.SMOLDERING_CARPET.method_9595().method_11663("hot");
                     class_2680 var136;
                     if (var98 instanceof class_2746) {
                        class_2746 _withbp233 = (class_2746)var98;
                        var136 = (class_2680)BurntModBlocks.SMOLDERING_CARPET.method_9564().method_11657(_withbp233, true);
                     } else {
                        var136 = BurntModBlocks.SMOLDERING_CARPET.method_9564();
                     }

                     world.method_8652(pos, var136, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10359) {
                     class_2769 var115 = BurntModBlocks.SMOLDERING_HAY.method_9595().method_11663("hot");
                     class_2680 var129;
                     if (var115 instanceof class_2746) {
                        class_2746 _withbp238 = (class_2746)var115;
                        var129 = (class_2680)BurntModBlocks.SMOLDERING_HAY.method_9564().method_11657(_withbp238, true);
                     } else {
                        var129 = BurntModBlocks.SMOLDERING_HAY.method_9564();
                     }

                     class_2680 _bs = var129;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_46282) {
                     class_2769 var116 = BurntModBlocks.BURNT_PUMPKIN.method_9595().method_11663("hot");
                     class_2680 var130;
                     if (var116 instanceof class_2746) {
                        class_2746 _withbp243 = (class_2746)var116;
                        var130 = (class_2680)BurntModBlocks.BURNT_PUMPKIN.method_9564().method_11657(_withbp243, true);
                     } else {
                        var130 = BurntModBlocks.BURNT_PUMPKIN.method_9564();
                     }

                     class_2680 _bs = var130;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10147) {
                     class_2769 var117 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9595().method_11663("hot");
                     class_2680 var131;
                     if (var117 instanceof class_2746) {
                        class_2746 _withbp247 = (class_2746)var117;
                        var131 = (class_2680)BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564().method_11657(_withbp247, true);
                     } else {
                        var131 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564();
                     }

                     class_2680 _bs = var131;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10009) {
                     class_2769 var118 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9595().method_11663("hot");
                     class_2680 var132;
                     if (var118 instanceof class_2746) {
                        class_2746 _withbp251 = (class_2746)var118;
                        var132 = (class_2680)BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564().method_11657(_withbp251, true);
                     } else {
                        var132 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564();
                     }

                     class_2680 _bs = var132;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_46283) {
                     class_2769 var119 = BurntModBlocks.BURNT_MELON.method_9595().method_11663("hot");
                     class_2680 var133;
                     if (var119 instanceof class_2746) {
                        class_2746 _withbp255 = (class_2746)var119;
                        var133 = (class_2680)BurntModBlocks.BURNT_MELON.method_9564().method_11657(_withbp255, true);
                     } else {
                        var133 = BurntModBlocks.BURNT_MELON.method_9564();
                     }

                     class_2680 _bs = var133;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26164(BurntTags.BLOCK_MC_CROPS)) {
                     CropsStartProcedure.execute(world, x, y, z);
                  }

                  if (bs.method_26204() == class_2246.field_10424) {
                     class_2680 _bs = BurntModBlocks.BURNT_SUGAR_CANE.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10295) {
                     boolean var134;
                     label412: {
                        if (world instanceof class_1937) {
                           class_1937 _iceLvl = (class_1937)world;
                           if (_iceLvl.method_8597().comp_644()) {
                              var134 = true;
                              break label412;
                           }
                        }

                        var134 = false;
                     }

                     boolean _iceUltrawarm = var134;
                     world.method_8652(pos, _iceUltrawarm ? class_2246.field_10124.method_9564() : class_2246.field_10382.method_9564(), 3);
                  }

                  if (bs.method_26204() == class_2246.field_10477 || bs.method_26204() == class_2246.field_10491 || bs.method_26204() == class_2246.field_27879) {
                     world.method_8652(pos, class_2246.field_10124.method_9564(), 3);
                  }

                  if (crafted && bs.method_26204() == class_2246.field_16492) {
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.BURNT_SCAFFOLDING.method_9564(), "stage", 1);
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     class_2586 _be = world.method_8321(pos);
                     class_2487 _bnbt = null;
                     if (_be != null) {
                        _bnbt = _be.method_38242(world.method_30349());
                        _be.method_11012();
                     }

                     world.method_8652(pos, _bs, 3);
                     if (_bnbt != null) {
                        _be = world.method_8321(pos);
                        if (_be != null) {
                           try {
                              _be.method_58690(_bnbt, world.method_30349());
                           } catch (Exception var25) {
                           }
                        }
                     }
                  }

                  if (bs.method_26204() == class_2246.field_10029) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CACTUS.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == class_2246.field_10343) {
                     class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     world.method_8652(pos, _bs, 3);
                  }

                  if (bs.method_26204() == BurntModBlocks.FIRE_BARREL) {
                     world.method_8652(pos, BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564(), 3);
                  }

                  if (bs.method_26204() == class_2246.field_10375) {
                     class_2769 var107 = bs.method_26204().method_9595().method_11663("unstable");
                     if (var107 instanceof class_2746) {
                        class_2746 _booleanProp = (class_2746)var107;
                        world.method_8652(pos, (class_2680)bs.method_11657(_booleanProp, true), 3);
                     }
                  }

                  if (burnBarrels && bs.method_26204() == class_2246.field_16328) {
                     class_2769 var121 = BurntModBlocks.BURNT_BARREL.method_9595().method_11663("hot");
                     class_2680 var135;
                     if (var121 instanceof class_2746) {
                        class_2746 _withbp294 = (class_2746)var121;
                        var135 = (class_2680)BurntModBlocks.BURNT_BARREL.method_9564().method_11657(_withbp294, true);
                     } else {
                        var135 = BurntModBlocks.BURNT_BARREL.method_9564();
                     }

                     class_2680 _bs = var135;
                     _bs = BurntBlockUtil.copyProperties(bs, _bs);
                     class_2586 _be = world.method_8321(pos);
                     class_2487 _bnbt = null;
                     if (_be != null) {
                        _bnbt = _be.method_38242(world.method_30349());
                        _be.method_11012();
                     }

                     world.method_8652(pos, _bs, 3);
                     if (_bnbt != null) {
                        _be = world.method_8321(pos);
                        if (_be != null) {
                           try {
                              _be.method_58690(_bnbt, world.method_30349());
                           } catch (Exception var24) {
                           }
                        }
                     }
                  }
               }
            }

            applyCompatBurn(world, bs, pos);
         }

      }
   }

   private static void applyCompatBurn(class_1936 world, class_2680 bs, class_2338 pos) {
      if (!bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !bs.method_26164(BurntTags.BLOCK_WILL_NOT_BURN)) {
         if (BurntTags.isCompatBurnable(bs) || BurnMappingRegistry.get(bs.method_26204()) != null) {
            BurnBabyProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
         }

      }
   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
