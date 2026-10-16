package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class MushroomStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10556) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var17 = BurntModBlocks.COOKED_MUSHROOM_STEM.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var17 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var17;
               var10000 = (class_2680)BurntModBlocks.COOKED_MUSHROOM_STEM.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.COOKED_MUSHROOM_STEM.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10240) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var35 = BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK.method_9595().method_11663("hot");
            class_2680 var38;
            if (var35 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var35;
               var38 = (class_2680)BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK.method_9564().method_11657(_withbp7, true);
            } else {
               var38 = BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK.method_9564();
            }

            class_2680 _bs = var38;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10580) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var36 = BurntModBlocks.COOKED_BROWN_MUSHROOM_BLOCK.method_9595().method_11663("hot");
            class_2680 var39;
            if (var36 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var36;
               var39 = (class_2680)BurntModBlocks.COOKED_BROWN_MUSHROOM_BLOCK.method_9564().method_11657(_withbp11, true);
            } else {
               var39 = BurntModBlocks.COOKED_BROWN_MUSHROOM_BLOCK.method_9564();
            }

            class_2680 _bs = var39;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10303) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var37 = BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9595().method_11663("hot");
            class_2680 var40;
            if (var37 instanceof class_2746) {
               class_2746 _withbp15 = (class_2746)var37;
               var40 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9564().method_11657(_withbp15, true);
            } else {
               var40 = BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9564();
            }

            class_2680 _bs = var40;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
