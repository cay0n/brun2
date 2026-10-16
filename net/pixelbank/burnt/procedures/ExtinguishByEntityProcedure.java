package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class ExtinguishByEntityProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         sx = (double)-2.0F;

         for(int index0 = 0; index0 < 5; ++index0) {
            sy = (double)-2.0F;

            for(int index1 = 0; index1 < 5; ++index1) {
               sz = (double)-2.0F;

               for(int index2 = 0; index2 < 5; ++index2) {
                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_FIRE)) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), class_2246.field_10124.method_9564(), 3);
                     --BurntModVariables.WorldVariables.get(world).flameCount;
                     BurntModVariables.WorldVariables.get(world).markSyncDirty();
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_COAL) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), class_2246.field_10381.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.FIRE_BARREL_ACTIVE) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.FIRE_BARREL.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_HAY) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_HAY.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_IW_LEAF_PILES)) {
                     world.method_22352(class_2338.method_49637(x + sx, y + sy, z + sz), false);
                  }

                  if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204()).toString().equals("supplementaries:lumisene")) {
                     world.method_22352(class_2338.method_49637(x + sx, y + sy, z + sz), false);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_CROPS) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_CROPS.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_MOSS) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_MOSS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT || world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_CAVE_VINES) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_CAVE_VINES_PLANT.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_MOSS_CARPET) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_MOSS_CARPET.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_AZALEA) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_AZALEA.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_WOOL) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_WOOL.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_CARPET) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_CARPET.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_17350) {
                     class_2338 _pos = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var20 = _bs.method_26204().method_9595().method_11663("lit");
                     if (var20 instanceof class_2746) {
                        class_2746 _booleanProp = (class_2746)var20;
                        world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
                     }
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.EMBER_CAMPFIRE) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_CAMPFIRE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_SOOTY)) {
                     SootyExtinguishProcedure.execute(world, x + sx, y + sy, z + sz);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_GRASS)) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_LEAVES)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_BAMBOO)) {
                     BambooExtinguishProcedure.execute(world, x + sx, y + sy, z + sz);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_DOORS)) {
                     DoorExtinguishProcedure.execute(world, x + sx, y + sy, z + sz);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_TRAPDOORS)) {
                     TrapdoorExtinguishProcedure.execute(world, x + sx, y + sy, z + sz);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_LOGS)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_HOLLOW_LOG || world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.EMBER_HOLLOW_LOG || world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.BLAZING_HOLLOW_LOG) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.BROKEN_BLAZING_LOG) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BROKEN_BURNT_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_WOOD)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_STRIPPED_LOGS)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_STRIPPED_WOOD)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     if (!world.method_8608()) {
                        _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                        class_2586 _blockEntity = world.method_8321(_bp);
                        _bso = world.method_8320(_bp);
                        if (_blockEntity != null) {
                        }

                        if (world instanceof class_1937) {
                           class_1937 _level = (class_1937)world;
                           _level.method_8413(_bp, _bso, _bso, 3);
                        }
                     }
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == BurntModBlocks.SMOLDERING_MANGROVE_ROOTS) {
                     world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.BURNT_MANGROVE_ROOTS.method_9564(), 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_PLANKS)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_PLANKS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_STAIRS)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_SLABS)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_SLAB.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_FENCES)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_FENCE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BURNING_FENCE_GATES)) {
                     class_2338 _bp = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _bs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }
      }

   }
}
