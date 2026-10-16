package net.pixelbank.burnt.procedures;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3730;
import net.minecraft.class_7923;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.compat.BurnMappingRegistry;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class ArrowBurnProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double faceChance = (double)0.0F;
      double downChance = (double)0.0F;
      double diagonalChance = (double)0.0F;
      double rnd = (double)0.0F;
      boolean isCave = false;
      boolean isRaining = false;
      boolean rainOK = false;
      boolean isOverworld = false;
      boolean dimOK = false;
      boolean waterNear = false;
      boolean allowBurn = false;
      boolean isWaterlogged = false;
      boolean isFireResist = false;
      boolean craftedOn = false;
      boolean done = false;
      boolean isLeaves = false;
      boolean isGlass = false;
      boolean isPlantsWillBurn = false;
      boolean isLogsThatBurn = false;
      boolean isSooty = false;
      boolean isMushroom = false;
      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
         isFireResist = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_PLANTS_WILL_BURN)) {
         isPlantsWillBurn = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SOOTY)) {
         isSooty = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_GLASS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_GLASS_PANES)) {
         isGlass = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LEAVES)) {
         isLeaves = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN)) {
         isLogsThatBurn = true;
      }

      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_MUSHROOM_BLOCKS)) {
         isMushroom = true;
      }

      boolean var10000;
      label589: {
         class_2769 var33 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
         if (var33 instanceof class_2746 _getbp18) {
            if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp18)) {
               var10000 = true;
               break label589;
            }
         }

         var10000 = false;
      }

      if (var10000) {
         isWaterlogged = true;
      }

      craftedOn = (Boolean)BurntBasicConfigConfiguration.CRAFTED_BURN.get();
      rnd = Math.random();
      done = false;
      if (!done) {
         if (FabricLoader.getInstance().isModLoaded("the_flesh_that_hates")) {
            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_coublestone") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_block") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_sand") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_tree") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_plank") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_bricks") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_pile") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:tumor") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:purulent") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:purulent")) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FLESH_BLOCK.method_9564(), 3);
               done = true;
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_terns") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_spike_grass") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_grass") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_small_grass")) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               done = true;
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_foliage")) {
               LeavesStartProcedure.execute(world, x, y, z);
               done = true;
            }
         }

         if (FabricLoader.getInstance().isModLoaded("biomesoplenty") && (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("biomesoplenty:high_grass") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("biomesoplenty:high_grass_plant")) && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (FabricLoader.getInstance().isModLoaded("immersive_weathering")) {
            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("immersive_weathering:grassy_earthen_clay")) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASSY_EARTHEN_CLAY.method_9564(), 3);
               done = true;
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("immersive_weathering:grassy_sandy_dirt")) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASSY_SANDY_D_IRT.method_9564(), 3);
               done = true;
            }
         }

         if (FabricLoader.getInstance().isModLoaded("supplementaries") && class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("supplementaries:gunpowder")) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRESTARTER.method_9564(), 3);
            done = true;
         }

         if (FabricLoader.getInstance().isModLoaded("regions_unexplored") && (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("regions_unexplored:small_oak_log") || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("regions_unexplored:stripped_small_oak_log"))) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var35 = BurntModBlocks.SOOTY_SMALL_LOG.method_9595().method_11663("hot");
            class_2680 var185;
            if (var35 instanceof class_2746) {
               class_2746 _withbp81 = (class_2746)var35;
               var185 = (class_2680)BurntModBlocks.SOOTY_SMALL_LOG.method_9564().method_11657(_withbp81, true);
            } else {
               var185 = BurntModBlocks.SOOTY_SMALL_LOG.method_9564();
            }

            class_2680 _bs = var185;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (FabricLoader.getInstance().isModLoaded("regions_unexplored") && class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("regions_unexplored:bamboo_log")) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10214) {
         class_2769 _bs = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("half");
         String var186;
         if (_bs instanceof class_2754) {
            class_2754 _getep93 = (class_2754)_bs;
            var186 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep93).toString();
         } else {
            var186 = "";
         }

         if (var186.equals("lower")) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }
      }

      if (!done) {
         class_2248 _plantBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
         if (_plantBlock != class_2246.field_10112 && _plantBlock != class_2246.field_10313) {
            if (_plantBlock == class_2246.field_10479 || _plantBlock == class_2246.field_10428) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.TALL_GRASS_FIRE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_FERN.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }
      }

      if (!done && (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS))) {
         GrassStartProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && isLeaves && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_ON_FIRE) && !isWaterlogged) {
         LeavesStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && isSooty) {
         class_2338 _pos = class_2338.method_49637(x, y, z);
         class_2680 _bs = world.method_8320(_pos);
         class_2769 _be = _bs.method_26204().method_9595().method_11663("hot");
         if (_be instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)_be;
            world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
         }

         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && craftedOn && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_STRIPPED_WOOD)) {
         StrippedWoodStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && craftedOn && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_STRIPPED_LOGS)) {
         StrippedLogStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_WOOD)) {
         WoodStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && isLogsThatBurn) {
         LogStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10566) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_DIRT.method_9564(), 3);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && craftedOn && !isFireResist) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_PLANKS)) {
            PlanksStartProcedure.execute(world, x, y, z);
            ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_STAIRS)) {
            StairsStartProcedure.execute(world, x, y, z);
            StairsFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_SLABS)) {
            SlabsStartProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_FENCES) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNT)) {
            FenceStartProcedure.execute(world, x, y, z);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_FENCE_GATES)) {
            FenceGateStartProcedure.execute(world, x, y, z);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_DOORS)) {
            class_2769 _bs = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("half");
            String var187;
            if (_bs instanceof class_2754) {
               class_2754 _getep156 = (class_2754)_bs;
               var187 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep156).toString();
            } else {
               var187 = "";
            }

            if (var187.equals("lower")) {
               DoorStartProcedure.execute(world, x, y, z);
               done = true;
            }
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_TRAPDOORS)) {
            TrapdoorStartProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9983) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LADDER.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10504) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 _be = BurntModBlocks.SOOTY_BOOKSHELF.method_9595().method_11663("hot");
            class_2680 var188;
            if (_be instanceof class_2746) {
               class_2746 _withbp167 = (class_2746)_be;
               var188 = (class_2680)BurntModBlocks.SOOTY_BOOKSHELF.method_9564().method_11657(_withbp167, true);
            } else {
               var188 = BurntModBlocks.SOOTY_BOOKSHELF.method_9564();
            }

            class_2680 _bs = var188;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_17350) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 _be = _bs.method_26204().method_9595().method_11663("lit");
            if (_be instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)_be;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }

            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_16492) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = blockStateWithInt(BurntModBlocks.BURNT_SCAFFOLDING.method_9564(), "stage", 1);
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var41) {
                  }
               }
            }

            ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }

         if (!isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_SIGNS)) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_WOODEN_BUTTONS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_BUTTON.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var40) {
                  }
               }
            }

            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_WOODEN_PRESSURE_PLATES)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_PRESSURE_PLATE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var39) {
                  }
               }
            }

            done = true;
         }

         if ((Boolean)BurntBasicConfigConfiguration.WOOL_BURN.get() && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOOL)) {
            class_2338 var10001 = class_2338.method_49637(x, y, z);
            class_2769 _bs = BurntModBlocks.SMOLDERING_WOOL.method_9595().method_11663("hot");
            class_2680 var10002;
            if (_bs instanceof class_2746) {
               class_2746 _withbp194 = (class_2746)_bs;
               var10002 = (class_2680)BurntModBlocks.SMOLDERING_WOOL.method_9564().method_11657(_withbp194, true);
            } else {
               var10002 = BurntModBlocks.SMOLDERING_WOOL.method_9564();
            }

            world.method_8652(var10001, var10002, 3);
            if (Math.random() < (double)0.25F) {
               ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            }

            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOOL_CARPETS)) {
            class_2338 var195 = class_2338.method_49637(x, y, z);
            class_2769 entityToSpawn = BurntModBlocks.SMOLDERING_CARPET.method_9595().method_11663("hot");
            class_2680 var196;
            if (entityToSpawn instanceof class_2746) {
               class_2746 _withbp199 = (class_2746)entityToSpawn;
               var196 = (class_2680)BurntModBlocks.SMOLDERING_CARPET.method_9564().method_11657(_withbp199, true);
            } else {
               var196 = BurntModBlocks.SMOLDERING_CARPET.method_9564();
            }

            world.method_8652(var195, var196, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10359) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var174 = BurntModBlocks.SMOLDERING_HAY.method_9595().method_11663("hot");
            class_2680 var189;
            if (var174 instanceof class_2746) {
               class_2746 _withbp204 = (class_2746)var174;
               var189 = (class_2680)BurntModBlocks.SMOLDERING_HAY.method_9564().method_11657(_withbp204, true);
            } else {
               var189 = BurntModBlocks.SMOLDERING_HAY.method_9564();
            }

            class_2680 _bs = var189;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }

         if ((Boolean)BurntBasicConfigConfiguration.BURN_BARRELS.get() && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_16328) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var175 = BurntModBlocks.BURNT_BARREL.method_9595().method_11663("hot");
            class_2680 var190;
            if (var175 instanceof class_2746) {
               class_2746 _withbp210 = (class_2746)var175;
               var190 = (class_2680)BurntModBlocks.BURNT_BARREL.method_9564().method_11657(_withbp210, true);
            } else {
               var190 = BurntModBlocks.BURNT_BARREL.method_9564();
            }

            class_2680 _bs = var190;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var38) {
                  }
               }
            }

            ArrowFlamesPlacementProcedure.execute(world, x, y, z);
            done = true;
         }
      }

      if (!done && isMushroom) {
         MushroomStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && craftedOn && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BAMBOO_BLOCKS)) {
         BambooStartProcedure.execute(world, x, y, z);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28681) {
         world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && !isWaterlogged && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37546) {
         world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MANGROVE_ROOTS.method_9564(), "stage", 1), 3);
         ArrowFlamesPlacementProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10211) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_STALK.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         done = true;
      }

      if (!done) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28676) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28675) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }
      }

      if (!done && (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28678 || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28679)) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28680) {
         world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1), 3);
         done = true;
      }

      if (!done) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_46282) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var178 = BurntModBlocks.BURNT_PUMPKIN.method_9595().method_11663("hot");
            class_2680 var191;
            if (var178 instanceof class_2746) {
               class_2746 _withbp251 = (class_2746)var178;
               var191 = (class_2680)BurntModBlocks.BURNT_PUMPKIN.method_9564().method_11657(_withbp251, true);
            } else {
               var191 = BurntModBlocks.BURNT_PUMPKIN.method_9564();
            }

            class_2680 _bs = var191;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10147) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var179 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9595().method_11663("hot");
            class_2680 var192;
            if (var179 instanceof class_2746) {
               class_2746 _withbp255 = (class_2746)var179;
               var192 = (class_2680)BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564().method_11657(_withbp255, true);
            } else {
               var192 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564();
            }

            class_2680 _bs = var192;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10009) {
            class_2338 _bp = class_2338.method_49637(x + rnd, y + rnd, z + rnd);
            class_2769 var180 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9595().method_11663("hot");
            class_2680 var193;
            if (var180 instanceof class_2746) {
               class_2746 _withbp259 = (class_2746)var180;
               var193 = (class_2680)BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564().method_11657(_withbp259, true);
            } else {
               var193 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564();
            }

            class_2680 _bs = var193;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_46283) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var181 = BurntModBlocks.BURNT_MELON.method_9595().method_11663("hot");
            class_2680 var194;
            if (var181 instanceof class_2746) {
               class_2746 _withbp263 = (class_2746)var181;
               var194 = (class_2680)BurntModBlocks.BURNT_MELON.method_9564().method_11657(_withbp263, true);
            } else {
               var194 = BurntModBlocks.BURNT_MELON.method_9564();
            }

            class_2680 _bs = var194;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         }
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10343) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.SMOLDERING_COBWEB.method_9564(), 3);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_CROPS)) {
         CropsStartProcedure.execute(world, x, y, z);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10424) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.BURNT_SUGAR_CANE.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10029) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.SMOLDERING_CACTUS.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.FIRE_BARREL) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564(), 3);
         done = true;
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10375) {
         world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         if (world instanceof class_3218) {
            class_3218 _level = (class_3218)world;
            class_1297 entityToSpawn = class_1299.field_6063.method_47821(_level, class_2338.method_49637(x, y, z), class_3730.field_16471);
            if (entityToSpawn != null) {
               entityToSpawn.method_36456(world.method_8409().method_43057() * 360.0F);
            }
         }

         done = true;
      }

      if (!done) {
         class_2680 _compatBs = world.method_8320(class_2338.method_49637(x, y, z));
         if (!_compatBs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !_compatBs.method_26164(BurntTags.BLOCK_WILL_NOT_BURN) && (BurntTags.isCompatBurnable(_compatBs) || BurnMappingRegistry.get(_compatBs.method_26204()) != null)) {
            BurnBabyProcedure.execute(world, x, y, z);
            done = true;
         }
      }

      if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10381) {
         BurntMod.queueServerWork(100, () -> {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COAL.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         });
         done = true;
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
