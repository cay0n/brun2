package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class ExtinguishBlockProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      execute(world, x, y, z, true);
   }

   public static void execute(class_1936 world, double x, double y, double z, boolean showSpray) {
      boolean found = false;
      double dx = (double)0.0F;
      double dy = (double)0.0F;
      double dz = (double)0.0F;
      double px = (double)0.0F;
      double py = (double)0.0F;
      double pz = (double)0.0F;
      class_2680 blockLocal = class_2246.field_10124.method_9564();
      if (!world.method_8608()) {
         if (showSpray) {
            world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SPLASH.method_9564()));
         }

         dx = (double)-3.0F;

         for(int index0 = 0; index0 < 6; ++index0) {
            dy = (double)-3.0F;

            for(int index1 = 0; index1 < 6; ++index1) {
               dz = (double)-3.0F;

               for(int index2 = 0; index2 < 6; ++index2) {
                  px = x + dx;
                  py = y + dy;
                  pz = z + dz;
                  blockLocal = world.method_8320(class_2338.method_49637(px, py, pz));
                  if (blockLocal.method_26164(BurntTags.BLOCK_FIRE)) {
                     world.method_8652(class_2338.method_49637(px, py, pz), class_2246.field_10124.method_9564(), 3);
                     --BurntModVariables.WorldVariables.get(world).flameCount;
                     BurntModVariables.WorldVariables.get(world).markSyncDirty();
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_COAL) {
                     world.method_8652(class_2338.method_49637(px, py, pz), class_2246.field_10381.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.FIRE_BARREL_ACTIVE) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.FIRE_BARREL.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_HAY) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_HAY.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_IW_LEAF_PILES)) {
                     world.method_22352(class_2338.method_49637(px, py, pz), false);
                  }

                  if (class_7923.field_41175.method_10221(blockLocal.method_26204()).toString().equals("supplementaries:lumisene")) {
                     world.method_22352(class_2338.method_49637(px, py, pz), false);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_CROPS) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_CROPS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_MOSS) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_MOSS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT || blockLocal.method_26204() == BurntModBlocks.SMOLDERING_CAVE_VINES) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_CAVE_VINES_PLANT.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_MOSS_CARPET) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_MOSS_CARPET.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_AZALEA) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_AZALEA.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_WOOL) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_WOOL.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_CARPET) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_CARPET.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_ENVELOPE) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_ENVELOPE.method_9564(), 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_SAIL || blockLocal.method_26204() == BurntModBlocks.SMOLDERING_SAIL_FRAME) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_SAIL.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == class_2246.field_17350) {
                     class_2338 _pos = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var28 = _bs.method_26204().method_9595().method_11663("lit");
                     if (var28 instanceof class_2746) {
                        class_2746 _booleanProp = (class_2746)var28;
                        world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
                     }
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.EMBER_CAMPFIRE) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_CAMPFIRE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_SOOTY)) {
                     SootyExtinguishProcedure.execute(world, px, py, pz);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_GRASS)) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_LEAVES)) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_LEAVES.method_9564(), 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_BAMBOO)) {
                     BambooExtinguishProcedure.execute(world, px, py, pz);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_DOORS)) {
                     DoorExtinguishProcedure.execute(world, px, py, pz);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_TRAPDOORS)) {
                     TrapdoorExtinguishProcedure.execute(world, px, py, pz);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_LOGS)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2769 var111 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
                     class_2680 var10000;
                     if (var111 instanceof class_2746) {
                        class_2746 _withbp63 = (class_2746)var111;
                        var10000 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp63, true);
                     } else {
                        var10000 = BurntModBlocks.BURNT_LOG.method_9564();
                     }

                     class_2680 _bs = var10000;
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_HOLLOW_LOG || blockLocal.method_26204() == BurntModBlocks.EMBER_HOLLOW_LOG || blockLocal.method_26204() == BurntModBlocks.BLAZING_HOLLOW_LOG) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2769 var112 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9595().method_11663("fragile");
                     class_2680 var114;
                     if (var112 instanceof class_2746) {
                        class_2746 _withbp63 = (class_2746)var112;
                        var114 = (class_2680)BurntModBlocks.BURNT_HOLLOW_LOG.method_9564().method_11657(_withbp63, true);
                     } else {
                        var114 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
                     }

                     class_2680 _bs = var114;
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.BROKEN_BLAZING_LOG) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2769 var113 = BurntModBlocks.BROKEN_BURNT_LOG.method_9595().method_11663("fragile");
                     class_2680 var115;
                     if (var113 instanceof class_2746) {
                        class_2746 _withbp67 = (class_2746)var113;
                        var115 = (class_2680)BurntModBlocks.BROKEN_BURNT_LOG.method_9564().method_11657(_withbp67, true);
                     } else {
                        var115 = BurntModBlocks.BROKEN_BURNT_LOG.method_9564();
                     }

                     class_2680 _bs = var115;
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_WOOD)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_STRIPPED_LOGS)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_STRIPPED_WOOD)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26204() == BurntModBlocks.SMOLDERING_MANGROVE_ROOTS) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_MANGROVE_ROOTS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_PLANKS)) {
                     world.method_8652(class_2338.method_49637(px, py, pz), BurntModBlocks.BURNT_PLANKS.method_9564(), 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_STAIRS)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_SLABS)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_SLAB.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_FENCES)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_FENCE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (blockLocal.method_26164(BurntTags.BLOCK_BURNING_FENCE_GATES)) {
                     class_2338 _bp = class_2338.method_49637(px, py, pz);
                     class_2680 _bs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  ++dz;
               }

               ++dy;
            }

            ++dx;
         }
      }

   }
}
