package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class ExtinguishProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE)) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
            --BurntModVariables.WorldVariables.get(world).flameCount;
            BurntModVariables.WorldVariables.get(world).markSyncDirty();
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_HAY) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_HAY.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_MOSS) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_MOSS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_MOSS_CARPET) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_AZALEA) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_AZALEA.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_WOOL) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_WOOL.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_CARPET) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_CARPET.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SOOTY)) {
            SootyExtinguishProcedure.execute(world, x, y, z);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_GRASS)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_LEAVES)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_BAMBOO)) {
            BambooExtinguishProcedure.execute(world, x, y, z);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_HOLLOW_LOG || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.EMBER_HOLLOW_LOG || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BLAZING_HOLLOW_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BROKEN_BLAZING_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BROKEN_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_WOOD)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_STRIPPED_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_STRIPPED_WOOD)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_MANGROVE_ROOTS) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_MANGROVE_ROOTS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_PLANKS)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_PLANKS.method_9564(), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_STAIRS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_SLABS)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_SLAB.method_9564(), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_FENCES)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FENCE.method_9564(), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNING_FENCE_GATES)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FENCEGATE.method_9564(), 3);
         }
      }

   }
}
