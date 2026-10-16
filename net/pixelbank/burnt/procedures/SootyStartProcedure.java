package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class SootyStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var17 = BurntModBlocks.SOOTY_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var17 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var17;
               var10000 = (class_2680)BurntModBlocks.SOOTY_OAK_LOG.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_OAK_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var55 = BurntModBlocks.SOOTY_SPRUCE_LOG.method_9595().method_11663("hot");
            class_2680 var62;
            if (var55 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var55;
               var62 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_LOG.method_9564().method_11657(_withbp7, true);
            } else {
               var62 = BurntModBlocks.SOOTY_SPRUCE_LOG.method_9564();
            }

            class_2680 _bs = var62;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var56 = BurntModBlocks.SOOTY_BIRCH_LOG.method_9595().method_11663("hot");
            class_2680 var63;
            if (var56 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var56;
               var63 = (class_2680)BurntModBlocks.SOOTY_BIRCH_LOG.method_9564().method_11657(_withbp11, true);
            } else {
               var63 = BurntModBlocks.SOOTY_BIRCH_LOG.method_9564();
            }

            class_2680 _bs = var63;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var57 = BurntModBlocks.SOOTY_JUNGLE_LOG.method_9595().method_11663("hot");
            class_2680 var64;
            if (var57 instanceof class_2746) {
               class_2746 _withbp15 = (class_2746)var57;
               var64 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_LOG.method_9564().method_11657(_withbp15, true);
            } else {
               var64 = BurntModBlocks.SOOTY_JUNGLE_LOG.method_9564();
            }

            class_2680 _bs = var64;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var58 = BurntModBlocks.SOOTY_ACACIA_LOG.method_9595().method_11663("hot");
            class_2680 var65;
            if (var58 instanceof class_2746) {
               class_2746 _withbp19 = (class_2746)var58;
               var65 = (class_2680)BurntModBlocks.SOOTY_ACACIA_LOG.method_9564().method_11657(_withbp19, true);
            } else {
               var65 = BurntModBlocks.SOOTY_ACACIA_LOG.method_9564();
            }

            class_2680 _bs = var65;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var59 = BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var66;
            if (var59 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var59;
               var66 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9564().method_11657(_withbp23, true);
            } else {
               var66 = BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9564();
            }

            class_2680 _bs = var66;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var60 = BurntModBlocks.SOOTY_MANGROVE_LOG.method_9595().method_11663("hot");
            class_2680 var67;
            if (var60 instanceof class_2746) {
               class_2746 _withbp27 = (class_2746)var60;
               var67 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_LOG.method_9564().method_11657(_withbp27, true);
            } else {
               var67 = BurntModBlocks.SOOTY_MANGROVE_LOG.method_9564();
            }

            class_2680 _bs = var67;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_LOG) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var61 = BurntModBlocks.SOOTY_CHERRY_LOG.method_9595().method_11663("hot");
            class_2680 var68;
            if (var61 instanceof class_2746) {
               class_2746 _withbp31 = (class_2746)var61;
               var68 = (class_2680)BurntModBlocks.SOOTY_CHERRY_LOG.method_9564().method_11657(_withbp31, true);
            } else {
               var68 = BurntModBlocks.SOOTY_CHERRY_LOG.method_9564();
            }

            class_2680 _bs = var68;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
