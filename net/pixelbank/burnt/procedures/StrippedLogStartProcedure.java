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

public class StrippedLogStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10519) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.SOOTY_STRIPPED_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var18 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var18;
               var10000 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_OAK_LOG.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_STRIPPED_OAK_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10436) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var62 = BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG.method_9595().method_11663("hot");
            class_2680 var70;
            if (var62 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var62;
               var70 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG.method_9564().method_11657(_withbp7, true);
            } else {
               var70 = BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG.method_9564();
            }

            class_2680 _bs = var70;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10366) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var63 = BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG.method_9595().method_11663("hot");
            class_2680 var71;
            if (var63 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var63;
               var71 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG.method_9564().method_11657(_withbp11, true);
            } else {
               var71 = BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG.method_9564();
            }

            class_2680 _bs = var71;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10254) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var64 = BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG.method_9595().method_11663("hot");
            class_2680 var72;
            if (var64 instanceof class_2746) {
               class_2746 _withbp15 = (class_2746)var64;
               var72 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG.method_9564().method_11657(_withbp15, true);
            } else {
               var72 = BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG.method_9564();
            }

            class_2680 _bs = var72;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10622) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var65 = BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG.method_9595().method_11663("hot");
            class_2680 var73;
            if (var65 instanceof class_2746) {
               class_2746 _withbp19 = (class_2746)var65;
               var73 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG.method_9564().method_11657(_withbp19, true);
            } else {
               var73 = BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG.method_9564();
            }

            class_2680 _bs = var73;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10244) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var66 = BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var74;
            if (var66 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var66;
               var74 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG.method_9564().method_11657(_withbp23, true);
            } else {
               var74 = BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG.method_9564();
            }

            class_2680 _bs = var74;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37548) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var67 = BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG.method_9595().method_11663("hot");
            class_2680 var75;
            if (var67 instanceof class_2746) {
               class_2746 _withbp27 = (class_2746)var67;
               var75 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG.method_9564().method_11657(_withbp27, true);
            } else {
               var75 = BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG.method_9564();
            }

            class_2680 _bs = var75;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42732) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var68 = BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG.method_9595().method_11663("hot");
            class_2680 var76;
            if (var68 instanceof class_2746) {
               class_2746 _withbp31 = (class_2746)var68;
               var76 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG.method_9564().method_11657(_withbp31, true);
            } else {
               var76 = BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG.method_9564();
            }

            class_2680 _bs = var76;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "stripped_pale_oak_log")) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var69 = BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var77;
            if (var69 instanceof class_2746) {
               class_2746 _withbppo31 = (class_2746)var69;
               var77 = (class_2680)BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG.method_9564().method_11657(_withbppo31, true);
            } else {
               var77 = BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG.method_9564();
            }

            class_2680 _bs = var77;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_STRIPPED_LOG)) && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() != class_2246.field_37546) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_STRIPPED_LOG.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }
            });
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
