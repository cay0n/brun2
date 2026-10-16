package net.pixelbank.burnt.procedures;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3730;
import net.minecraft.class_7923;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.block.SmallSmolderingLogBlock;
import net.pixelbank.burnt.compat.BurnMappingRegistry;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.WoodSpecies;

public class BurnBabyProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!BurntProtection.isProtected(world, x, y, z)) {
         if (!world.method_8608()) {
            class_2338 abovePos = class_2338.method_49637(x, y + (double)1.0F, z);
            if (world.method_8320(abovePos).method_26204() == class_2246.field_42750) {
               world.method_8652(abovePos, BurntModBlocks.TALL_GRASS_BURNT.method_9564(), 3);
            }
         }

         class_2680 bs = class_2246.field_10124.method_9564();
         class_2680 blk = class_2246.field_10124.method_9564();
         double rnd = (double)0.0F;
         boolean isFireResist = false;
         boolean isPlantsWillBurn = false;
         boolean isSooty = false;
         boolean isGlass = false;
         boolean isLeaves = false;
         boolean isLogsThatBurn = false;
         boolean isMushroom = false;
         boolean craftedOn = false;
         boolean done = false;
         boolean isWaterlogged = false;
         bs = world.method_8320(class_2338.method_49637(x, y, z));
         if (bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT) || bs.method_26164(BurntTags.BLOCK_TF_TOWERWOOD)) {
            isFireResist = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_PLANTS_WILL_BURN)) {
            isPlantsWillBurn = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_SOOTY)) {
            isSooty = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_FORGE_GLASS) || bs.method_26164(BurntTags.BLOCK_FORGE_GLASS_PANES)) {
            isGlass = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_MC_LEAVES)) {
            isLeaves = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN)) {
            isLogsThatBurn = true;
         }

         if (bs.method_26164(BurntTags.BLOCK_FORGE_MUSHROOM_BLOCKS)) {
            isMushroom = true;
         }

         boolean var10000;
         label945: {
            class_2769 var22 = bs.method_26204().method_9595().method_11663("waterlogged");
            if (var22 instanceof class_2746) {
               class_2746 _getbp21 = (class_2746)var22;
               if ((Boolean)bs.method_11654(_getbp21)) {
                  var10000 = true;
                  break label945;
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
               if (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_coublestone") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_block") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_sand") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_tree") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_plank") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_bricks") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_pile") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:tumor") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:purulent") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:purulent")) {
                  world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FLESH_BLOCK.method_9564(), 3);
                  done = true;
               }

               if (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_terns") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_spike_grass") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_grass") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_small_grass")) {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  done = true;
               }

               if (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("the_flesh_that_hates:flesh_foliage")) {
                  LeavesStartProcedure.execute(world, x, y, z);
                  done = true;
               }
            }

            if (FabricLoader.getInstance().isModLoaded("biomesoplenty") && (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("biomesoplenty:high_grass") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("biomesoplenty:high_grass_plant")) && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225()) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564(), 3);
               done = true;
            }

            if (FabricLoader.getInstance().isModLoaded("immersive_weathering")) {
               if (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("immersive_weathering:grassy_earthen_clay")) {
                  world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASSY_EARTHEN_CLAY.method_9564(), 3);
                  done = true;
               }

               if (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("immersive_weathering:grassy_sandy_dirt")) {
                  world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASSY_SANDY_D_IRT.method_9564(), 3);
                  done = true;
               }
            }

            if (FabricLoader.getInstance().isModLoaded("supplementaries") && class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("supplementaries:gunpowder")) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRESTARTER.method_9564(), 3);
               done = true;
            }

            if (FabricLoader.getInstance().isModLoaded("regions_unexplored") && bs.method_26164(BurntTags.BLOCK_RU_BRANCHES)) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               done = true;
            }

            if (FabricLoader.getInstance().isModLoaded("regions_unexplored") && (class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("regions_unexplored:small_oak_log") || class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("regions_unexplored:stripped_small_oak_log"))) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var24 = BurntModBlocks.SOOTY_SMALL_LOG.method_9595().method_11663("hot");
               class_2680 var254;
               if (var24 instanceof class_2746) {
                  class_2746 _withbp90 = (class_2746)var24;
                  var254 = (class_2680)BurntModBlocks.SOOTY_SMALL_LOG.method_9564().method_11657(_withbp90, true);
               } else {
                  var254 = BurntModBlocks.SOOTY_SMALL_LOG.method_9564();
               }

               class_2680 _bs = var254;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }

            if (FabricLoader.getInstance().isModLoaded("regions_unexplored") && class_7923.field_41175.method_10221(bs.method_26204()).toString().equals("regions_unexplored:bamboo_log")) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_LOG.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }
         }

         if (!isFireResist) {
            if (!done && bs.method_26164(BurntTags.BLOCK_DESTROY_IN_BURN)) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               done = true;
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.BURN_CREATE_BLOCKS.get() && bs.method_26164(BurntTags.BLOCK_DESTROY_IN_BURN_CREATE)) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               done = true;
            }

            if (!done) {
               class_2248 _mapped = BurnMappingRegistry.get(bs.method_26204());
               if (_mapped != null) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bso = world.method_8320(_bp);
                  class_2680 _bsm = _mapped.method_9564();
                  _bsm = BurntBlockUtil.copyProperties(_bso, _bsm);
                  _bsm = blockStateWithInt(_bsm, "stage", 1);
                  _bsm = WoodSpecies.applyTo(_bsm, WoodSpecies.fromBlock(_bso.method_26204()));
                  world.method_8652(_bp, _bsm, 3);
                  done = true;
               }
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_LOG_SLOW)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bso = world.method_8320(_bp);
               class_2680 _bsm = BurntModBlocks.SMOLDERING_DARK_OAK_LOG.method_9564();
               _bsm = BurntBlockUtil.copyProperties(_bso, _bsm);
               _bsm = blockStateWithInt(_bsm, "stage", 1);
               _bsm = WoodSpecies.applyTo(_bsm, WoodSpecies.fromBlock(_bso.method_26204()));
               world.method_8652(_bp, _bsm, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMALL_LOG)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bso = world.method_8320(_bp);
               class_2680 _bsm = BurntModBlocks.SMALL_SMOLDERING_LOG.method_9564();
               _bsm = BurntBlockUtil.copyProperties(_bso, _bsm);
               _bsm = blockStateWithInt(_bsm, "stage", 1);
               _bsm = WoodSpecies.applyTo(_bsm, WoodSpecies.fromBlock(_bso.method_26204()));
               _bsm = SmallSmolderingLogBlock.withConnections(world, _bp, _bsm);
               world.method_8652(_bp, _bsm, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_LOG)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bso = world.method_8320(_bp);
               class_2680 _bsm = BurntModBlocks.SMOLDERING_LOG.method_9564();
               _bsm = BurntBlockUtil.copyProperties(_bso, _bsm);
               _bsm = blockStateWithInt(_bsm, "stage", 1);
               _bsm = WoodSpecies.applyTo(_bsm, WoodSpecies.fromBlock(_bso.method_26204()));
               world.method_8652(_bp, _bsm, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_HOLLOW_LOG)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bso = world.method_8320(_bp);
               class_2680 _bsm = BurntModBlocks.SMOLDERING_HOLLOW_LOG.method_9564();
               _bsm = BurntBlockUtil.copyProperties(_bso, _bsm);
               _bsm = blockStateWithInt(_bsm, "stage", 1);
               _bsm = WoodSpecies.applyTo(_bsm, WoodSpecies.fromBlock(_bso.method_26204()));
               world.method_8652(_bp, _bsm, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_GRASS)) {
               GrassStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_BURNT_DIRT)) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_DIRT.method_9564(), 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_PLANKS)) {
               PlanksStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_SLABS)) {
               SlabsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_VERTICAL_SLAB)) {
               VerticalSlabsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_WALL)) {
               WallsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_STAIRS)) {
               StairsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_FENCES)) {
               FenceStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_FENCE_GATES)) {
               FenceGateStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_BURNT_FARMLAND)) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FARMLAND.method_9564(), 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_CROPS)) {
               CropsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_FERN)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.SMOLDERING_FERN.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_TALL_GRASS)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.TALL_GRASS_FIRE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               world.method_8652(_bp, _bs2, 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_WOOD)) {
               WoodStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_STRIPPED_LOG)) {
               StrippedLogStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_STRIPPED_WOOD)) {
               StrippedWoodStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_LARGE_LEAVES)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               _bs2 = blockStateWithInt(_bs2, "stage", 1);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_MEDIUM_LEAVES)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               _bs2 = blockStateWithInt(_bs2, "stage", 1);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_FINE_LEAVES)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.SMOLDERING_BIRCH_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               _bs2 = blockStateWithInt(_bs2, "stage", 1);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_MOSS)) {
               world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_MOSS_CARPET)) {
               world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1), 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_WOOL)) {
               class_2338 var10001 = class_2338.method_49637(x, y, z);
               class_2769 _bs = BurntModBlocks.SMOLDERING_WOOL.method_9595().method_11663("hot");
               class_2680 var10002;
               if (_bs instanceof class_2746) {
                  class_2746 _bpw = (class_2746)_bs;
                  var10002 = (class_2680)BurntModBlocks.SMOLDERING_WOOL.method_9564().method_11657(_bpw, true);
               } else {
                  var10002 = BurntModBlocks.SMOLDERING_WOOL.method_9564();
               }

               world.method_8652(var10001, var10002, 3);
               if (Math.random() < (double)0.25F) {
                  AnyFlamesPlacementProcedure.execute(world, x, y, z);
               }

               done = true;
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.BURN_CREATE_BLOCKS.get() && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_ENVELOPE)) {
               class_2338 var264 = class_2338.method_49637(x, y, z);
               class_2769 _bs = BurntModBlocks.SMOLDERING_ENVELOPE.method_9595().method_11663("hot");
               class_2680 var268;
               if (_bs instanceof class_2746) {
                  class_2746 _bpe = (class_2746)_bs;
                  var268 = (class_2680)BurntModBlocks.SMOLDERING_ENVELOPE.method_9564().method_11657(_bpe, true);
               } else {
                  var268 = BurntModBlocks.SMOLDERING_ENVELOPE.method_9564();
               }

               world.method_8652(var264, var268, 3);
               if (Math.random() < (double)0.25F) {
                  AnyFlamesPlacementProcedure.execute(world, x, y, z);
               }

               done = true;
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.BURN_CREATE_BLOCKS.get() && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_SAIL)) {
               class_2680 _newSailState = BurntModBlocks.SMOLDERING_SAIL.method_9564();
               class_2769 _be = bs.method_26204().method_9595().method_11663("facing");
               if (_be instanceof class_2753) {
                  class_2753 _sfp = (class_2753)_be;
                  _be = _newSailState.method_26204().method_9595().method_11663("facing");
                  if (_be instanceof class_2753) {
                     class_2753 _nsfp = (class_2753)_be;
                     _newSailState = (class_2680)_newSailState.method_11657(_nsfp, (class_2350)bs.method_11654(_sfp));
                  }
               }

               class_2769 _withbp218 = BurntModBlocks.SMOLDERING_SAIL.method_9595().method_11663("hot");
               if (_withbp218 instanceof class_2746) {
                  class_2746 _bpSail = (class_2746)_withbp218;
                  _newSailState = (class_2680)_newSailState.method_11657(_bpSail, true);
               }

               world.method_8652(class_2338.method_49637(x, y, z), _newSailState, 3);
               done = true;
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.BURN_CREATE_BLOCKS.get() && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_SAIL_FRAME)) {
               class_2680 _newSFState = BurntModBlocks.SMOLDERING_SAIL_FRAME.method_9564();
               class_2769 var231 = bs.method_26204().method_9595().method_11663("facing");
               if (var231 instanceof class_2753) {
                  class_2753 _sffp = (class_2753)var231;
                  var231 = _newSFState.method_26204().method_9595().method_11663("facing");
                  if (var231 instanceof class_2753) {
                     class_2753 _nsffp = (class_2753)var231;
                     _newSFState = (class_2680)_newSFState.method_11657(_nsffp, (class_2350)bs.method_11654(_sffp));
                  }
               }

               class_2769 _withbp235 = BurntModBlocks.SMOLDERING_SAIL_FRAME.method_9595().method_11663("hot");
               if (_withbp235 instanceof class_2746) {
                  class_2746 _bpSF = (class_2746)_withbp235;
                  _newSFState = (class_2680)_newSFState.method_11657(_bpSF, true);
               }

               world.method_8652(class_2338.method_49637(x, y, z), _newSFState, 3);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_CARPET)) {
               class_2338 var265 = class_2338.method_49637(x, y, z);
               class_2769 _bs = BurntModBlocks.SMOLDERING_CARPET.method_9595().method_11663("hot");
               class_2680 var269;
               if (_bs instanceof class_2746) {
                  class_2746 _bpc = (class_2746)_bs;
                  var269 = (class_2680)BurntModBlocks.SMOLDERING_CARPET.method_9564().method_11657(_bpc, true);
               } else {
                  var269 = BurntModBlocks.SMOLDERING_CARPET.method_9564();
               }

               world.method_8652(var265, var269, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_BUTTON)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.BURNT_BUTTON.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_PRESSURE_PLATE)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs2 = BurntModBlocks.BURNT_PRESSURE_PLATE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs2 = BurntBlockUtil.copyProperties(_bso, _bs2);
               world.method_8652(_bp, _bs2, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_DOOR)) {
               DoorStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_TRAPDOOR)) {
               TrapdoorStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_BURNS_TO_DOUBLE_TALL_GRASS)) {
               class_2769 _bso = bs.method_26204().method_9595().method_11663("half");
               String var255;
               if (_bso instanceof class_2754) {
                  class_2754 _getep102 = (class_2754)_bso;
                  var255 = bs.method_11654(_getep102).toString();
               } else {
                  var255 = "lower";
               }

               String _halfStr = var255;
               double _lowerY = _halfStr.equalsIgnoreCase("upper") ? y - (double)1.0F : y;
               class_2338 _lowerPos = class_2338.method_49637(x, _lowerY, z);
               class_2680 _lowerState = world.method_8320(_lowerPos);
               if (_lowerState.method_26164(BurntTags.BLOCK_BURNS_TO_DOUBLE_TALL_GRASS)) {
                  world.method_8652(class_2338.method_49637(x, _lowerY + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
                  class_2680 _bs = BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564();
                  _bs = BurntBlockUtil.copyProperties(_lowerState, _bs);
                  world.method_8652(_lowerPos, _bs, 3);
                  done = true;
               } else {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  done = true;
               }
            }

            if (!done && bs.method_26204() == class_2246.field_42750) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.TALL_GRASS_BURNT.method_9564(), 3);
               done = true;
            }

            if (!done) {
               class_2248 _plantBlock = bs.method_26204();
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

            if (!done && bs.method_26204() == class_2246.field_10566) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_DIRT.method_9564(), 3);
               done = true;
            }

            if (!done && isLeaves && !isWaterlogged) {
               if (bs.method_26164(BurntTags.BLOCK_BURNING_LEAVES)) {
                  done = true;
               } else {
                  LeavesStartProcedure.execute(world, x, y, z);
                  done = true;
               }
            }

            if (!done && (bs.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || bs.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS))) {
               GrassStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && isSooty) {
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var236 = _bs.method_26204().method_9595().method_11663("hot");
               if (var236 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var236;
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
               }

               done = true;
            }

            if (!done && craftedOn && bs.method_26164(BurntTags.BLOCK_FORGE_STRIPPED_WOOD)) {
               StrippedWoodStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && craftedOn && bs.method_26164(BurntTags.BLOCK_FORGE_STRIPPED_LOGS)) {
               StrippedLogStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_FORGE_WOOD)) {
               WoodStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && isLogsThatBurn) {
               LogStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10402) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.CHARRED_MYCELIUM.method_9564(), 3);
               done = true;
            }

            if (!done && craftedOn && !isFireResist) {
               if (bs.method_26164(BurntTags.BLOCK_MC_PLANKS) && !bs.method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                  PlanksStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_STAIRS)) {
                  StairsStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_SLABS)) {
                  SlabsStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_FENCES) && !bs.method_26164(BurntTags.BLOCK_BURNT)) {
                  FenceStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_MC_FENCE_GATES)) {
                  FenceGateStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_MC_WOODEN_DOORS) && !bs.method_26164(BurntTags.BLOCK_BURNT_DOORS) && !bs.method_26164(BurntTags.BLOCK_BURNING_DOORS)) {
                  DoorStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26164(BurntTags.BLOCK_MC_WOODEN_TRAPDOORS)) {
                  TrapdoorStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26204() == class_2246.field_9983) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_LADDER.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_10504) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var237 = BurntModBlocks.SOOTY_BOOKSHELF.method_9595().method_11663("hot");
                  class_2680 var256;
                  if (var237 instanceof class_2746) {
                     class_2746 _withbp184 = (class_2746)var237;
                     var256 = (class_2680)BurntModBlocks.SOOTY_BOOKSHELF.method_9564().method_11657(_withbp184, true);
                  } else {
                     var256 = BurntModBlocks.SOOTY_BOOKSHELF.method_9564();
                  }

                  class_2680 _bs = var256;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26204() == class_2246.field_17350) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CAMPFIRE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (!isWaterlogged && bs.method_26164(BurntTags.BLOCK_MC_SIGNS)) {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_40286) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_BAMBOO_BUTTON.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (!done && bs.method_26164(BurntTags.BLOCK_WOODEN_BUTTONS)) {
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
                        } catch (Exception var29) {
                        }
                     }
                  }

                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_WOODEN_PRESSURE_PLATES)) {
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
                        } catch (Exception var28) {
                        }
                     }
                  }

                  done = true;
               }

               if ((Boolean)BurntBasicConfigConfiguration.WOOL_BURN.get() && bs.method_26164(BurntTags.BLOCK_MC_WOOL)) {
                  class_2338 var266 = class_2338.method_49637(x, y, z);
                  class_2769 var132 = BurntModBlocks.SMOLDERING_WOOL.method_9595().method_11663("hot");
                  class_2680 var270;
                  if (var132 instanceof class_2746) {
                     class_2746 _withbp208 = (class_2746)var132;
                     var270 = (class_2680)BurntModBlocks.SMOLDERING_WOOL.method_9564().method_11657(_withbp208, true);
                  } else {
                     var270 = BurntModBlocks.SMOLDERING_WOOL.method_9564();
                  }

                  world.method_8652(var266, var270, 3);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_MC_WOOL_CARPETS)) {
                  class_2338 var267 = class_2338.method_49637(x, y, z);
                  class_2769 var133 = BurntModBlocks.SMOLDERING_CARPET.method_9595().method_11663("hot");
                  class_2680 var271;
                  if (var133 instanceof class_2746) {
                     class_2746 _withbp213 = (class_2746)var133;
                     var271 = (class_2680)BurntModBlocks.SMOLDERING_CARPET.method_9564().method_11657(_withbp213, true);
                  } else {
                     var271 = BurntModBlocks.SMOLDERING_CARPET.method_9564();
                  }

                  world.method_8652(var267, var271, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_10359) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var242 = BurntModBlocks.SMOLDERING_HAY.method_9595().method_11663("hot");
                  class_2680 var257;
                  if (var242 instanceof class_2746) {
                     class_2746 _withbp218 = (class_2746)var242;
                     var257 = (class_2680)BurntModBlocks.SMOLDERING_HAY.method_9564().method_11657(_withbp218, true);
                  } else {
                     var257 = BurntModBlocks.SMOLDERING_HAY.method_9564();
                  }

                  class_2680 _bs = var257;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_MC_BANNERS)) {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
                  done = true;
               }

               if (!done && bs.method_26164(BurntTags.BLOCK_BAMBOO_BLOCKS)) {
                  BambooStartProcedure.execute(world, x, y, z);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_MC_BEDS)) {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
                  done = true;
               }

               if (bs.method_26164(BurntTags.BLOCK_FIRE_DESTROYS)) {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
                  done = true;
               }
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.BURN_BARRELS.get() && bs.method_26204() == class_2246.field_16328) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var243 = BurntModBlocks.BURNT_BARREL.method_9595().method_11663("hot");
               class_2680 var258;
               if (var243 instanceof class_2746) {
                  class_2746 _withbp235 = (class_2746)var243;
                  var258 = (class_2680)BurntModBlocks.BURNT_BARREL.method_9564().method_11657(_withbp235, true);
               } else {
                  var258 = BurntModBlocks.BURNT_BARREL.method_9564();
               }

               class_2680 _bs = var258;
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
                     } catch (Exception var27) {
                     }
                  }
               }

               done = true;
            }

            if (!done && (Boolean)BurntBasicConfigConfiguration.CRAFTED_BURN.get() && bs.method_26204() == class_2246.field_16492) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = blockStateWithInt(BurntModBlocks.BURNT_SCAFFOLDING.method_9564(), "stage", 1);
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               AnyFlamesPlacementProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && isGlass && !isFireResist && rnd <= (double)0.5F) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               done = true;
            }

            if (!done && isMushroom) {
               MushroomStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_28681) {
               world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               done = true;
            }

            if (!done && !isWaterlogged && bs.method_26204() == class_2246.field_37546) {
               world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MANGROVE_ROOTS.method_9564(), "stage", 1), 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10211) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_BAMBOO_STALK.method_9564(), 3);
               done = true;
            }

            if (!done) {
               if (bs.method_26204() == class_2246.field_28676) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_28675) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }
            }

            if (!done && (bs.method_26204() == class_2246.field_28678 || bs.method_26204() == class_2246.field_28679)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_28680) {
               world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1), 3);
               done = true;
            }

            if (!done) {
               if (bs.method_26204() == class_2246.field_46282) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var246 = BurntModBlocks.BURNT_PUMPKIN.method_9595().method_11663("hot");
                  class_2680 var259;
                  if (var246 instanceof class_2746) {
                     class_2746 _withbp277 = (class_2746)var246;
                     var259 = (class_2680)BurntModBlocks.BURNT_PUMPKIN.method_9564().method_11657(_withbp277, true);
                  } else {
                     var259 = BurntModBlocks.BURNT_PUMPKIN.method_9564();
                  }

                  class_2680 _bs = var259;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_10147) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var247 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9595().method_11663("hot");
                  class_2680 var260;
                  if (var247 instanceof class_2746) {
                     class_2746 _withbp281 = (class_2746)var247;
                     var260 = (class_2680)BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564().method_11657(_withbp281, true);
                  } else {
                     var260 = BurntModBlocks.BURNT_CARVED_PUMPKIN.method_9564();
                  }

                  class_2680 _bs = var260;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_10009) {
                  class_2338 _bp = class_2338.method_49637(x + rnd, y + rnd, z + rnd);
                  class_2769 var248 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9595().method_11663("hot");
                  class_2680 var261;
                  if (var248 instanceof class_2746) {
                     class_2746 _withbp285 = (class_2746)var248;
                     var261 = (class_2680)BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564().method_11657(_withbp285, true);
                  } else {
                     var261 = BurntModBlocks.BURNT_JACK_O_LANTERN.method_9564();
                  }

                  class_2680 _bs = var261;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }

               if (bs.method_26204() == class_2246.field_46283) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var249 = BurntModBlocks.BURNT_MELON.method_9595().method_11663("hot");
                  class_2680 var262;
                  if (var249 instanceof class_2746) {
                     class_2746 _withbp289 = (class_2746)var249;
                     var262 = (class_2680)BurntModBlocks.BURNT_MELON.method_9564().method_11657(_withbp289, true);
                  } else {
                     var262 = BurntModBlocks.BURNT_MELON.method_9564();
                  }

                  class_2680 _bs = var262;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }
            }

            if (!done && bs.method_26164(BurntTags.BLOCK_MC_CROPS)) {
               CropsStartProcedure.execute(world, x, y, z);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10424) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_SUGAR_CANE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10295) {
               label775: {
                  if (world instanceof class_1937) {
                     class_1937 _iceLvl = (class_1937)world;
                     if (_iceLvl.method_8597().comp_644()) {
                        var10000 = true;
                        break label775;
                     }
                  }

                  var10000 = false;
               }

               boolean _iceUltrawarm = var10000;
               world.method_8652(class_2338.method_49637(x, y, z), _iceUltrawarm ? class_2246.field_10124.method_9564() : class_2246.field_10382.method_9564(), 3);
               done = true;
            }

            if (!done && (bs.method_26204() == class_2246.field_10477 || bs.method_26204() == class_2246.field_10491 || bs.method_26204() == class_2246.field_27879)) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10029) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CACTUS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10343) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               done = true;
            }

            if (!done && bs.method_26204() == BurntModBlocks.FIRE_BARREL) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564(), 3);
               done = true;
            }

            if (!done && bs.method_26204() == class_2246.field_10375) {
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

            if (!done && bs.method_26204() == class_2246.field_10381) {
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
