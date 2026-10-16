package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class WoodStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10126) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.SOOTY_OAK_WOOD.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var18 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var18;
               var10000 = (class_2680)BurntModBlocks.SOOTY_OAK_WOOD.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_OAK_WOOD.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10155) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var63 = BurntModBlocks.SOOTY_SPRUCE_WOOD.method_9595().method_11663("hot");
            class_2680 var71;
            if (var63 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var63;
               var71 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_WOOD.method_9564().method_11657(_withbp7, true);
            } else {
               var71 = BurntModBlocks.SOOTY_SPRUCE_WOOD.method_9564();
            }

            class_2680 _bs = var71;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10307) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var64 = BurntModBlocks.SOOTY_BIRCH_WOOD.method_9595().method_11663("hot");
            class_2680 var72;
            if (var64 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var64;
               var72 = (class_2680)BurntModBlocks.SOOTY_BIRCH_WOOD.method_9564().method_11657(_withbp11, true);
            } else {
               var72 = BurntModBlocks.SOOTY_BIRCH_WOOD.method_9564();
            }

            class_2680 _bs = var72;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10303) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var65 = BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9595().method_11663("hot");
            class_2680 var73;
            if (var65 instanceof class_2746) {
               class_2746 _withbp15 = (class_2746)var65;
               var73 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9564().method_11657(_withbp15, true);
            } else {
               var73 = BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9564();
            }

            class_2680 _bs = var73;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9999) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var66 = BurntModBlocks.SOOTY_ACACIA_WOOD.method_9595().method_11663("hot");
            class_2680 var74;
            if (var66 instanceof class_2746) {
               class_2746 _withbp19 = (class_2746)var66;
               var74 = (class_2680)BurntModBlocks.SOOTY_ACACIA_WOOD.method_9564().method_11657(_withbp19, true);
            } else {
               var74 = BurntModBlocks.SOOTY_ACACIA_WOOD.method_9564();
            }

            class_2680 _bs = var74;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10178) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var67 = BurntModBlocks.SOOTY_DARK_OAK_WOOD.method_9595().method_11663("hot");
            class_2680 var75;
            if (var67 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var67;
               var75 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_WOOD.method_9564().method_11657(_withbp23, true);
            } else {
               var75 = BurntModBlocks.SOOTY_DARK_OAK_WOOD.method_9564();
            }

            class_2680 _bs = var75;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37549) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var68 = BurntModBlocks.SOOTY_MANGROVE_WOOD.method_9595().method_11663("hot");
            class_2680 var76;
            if (var68 instanceof class_2746) {
               class_2746 _withbp27 = (class_2746)var68;
               var76 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_WOOD.method_9564().method_11657(_withbp27, true);
            } else {
               var76 = BurntModBlocks.SOOTY_MANGROVE_WOOD.method_9564();
            }

            class_2680 _bs = var76;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42733) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var69 = BurntModBlocks.SOOTY_CHERRY_WOOD.method_9595().method_11663("hot");
            class_2680 var77;
            if (var69 instanceof class_2746) {
               class_2746 _withbp31 = (class_2746)var69;
               var77 = (class_2680)BurntModBlocks.SOOTY_CHERRY_WOOD.method_9564().method_11657(_withbp31, true);
            } else {
               var77 = BurntModBlocks.SOOTY_CHERRY_WOOD.method_9564();
            }

            class_2680 _bs = var77;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_wood")) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var70 = BurntModBlocks.SOOTY_PALE_OAK_WOOD.method_9595().method_11663("hot");
            class_2680 var78;
            if (var70 instanceof class_2746) {
               class_2746 _withbppo31 = (class_2746)var70;
               var78 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_WOOD.method_9564().method_11657(_withbppo31, true);
            } else {
               var78 = BurntModBlocks.SOOTY_PALE_OAK_WOOD.method_9564();
            }

            class_2680 _bs = var78;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_WOOD)) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_WOOD.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  if (Math.random() <= 0.3) {
                     world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_WOOD.method_9564()));
                  }

               }
            });
            done = true;
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
