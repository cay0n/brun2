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
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class LogStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean done = false;
      double rnd = (double)0.0F;
      if (!world.method_8608()) {
         done = false;
         rnd = Math.random();
         if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_OAK_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var75 = BurntModBlocks.SOOTY_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var83;
            if (var75 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var75;
               var83 = (class_2680)BurntModBlocks.SOOTY_OAK_LOG.method_9564().method_11657(_withbp3, true);
            } else {
               var83 = BurntModBlocks.SOOTY_OAK_LOG.method_9564();
            }

            class_2680 _bs = var83;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_SPRUCE_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var74 = BurntModBlocks.SOOTY_SPRUCE_LOG.method_9595().method_11663("hot");
            class_2680 var82;
            if (var74 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var74;
               var82 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_LOG.method_9564().method_11657(_withbp7, true);
            } else {
               var82 = BurntModBlocks.SOOTY_SPRUCE_LOG.method_9564();
            }

            class_2680 _bs = var82;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_BIRCH_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var73 = BurntModBlocks.SOOTY_BIRCH_LOG.method_9595().method_11663("hot");
            class_2680 var81;
            if (var73 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var73;
               var81 = (class_2680)BurntModBlocks.SOOTY_BIRCH_LOG.method_9564().method_11657(_withbp11, true);
            } else {
               var81 = BurntModBlocks.SOOTY_BIRCH_LOG.method_9564();
            }

            class_2680 _bs = var81;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_JUNGLE_LOGS)) {
            if (Math.random() <= (double)0.5F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var72 = BurntModBlocks.SOOTY_JUNGLE_LOG.method_9595().method_11663("hot");
               class_2680 var80;
               if (var72 instanceof class_2746) {
                  class_2746 _withbp15 = (class_2746)var72;
                  var80 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_LOG.method_9564().method_11657(_withbp15, true);
               } else {
                  var80 = BurntModBlocks.SOOTY_JUNGLE_LOG.method_9564();
               }

               class_2680 _bs = var80;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }

            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_ACACIA_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var71 = BurntModBlocks.SOOTY_ACACIA_LOG.method_9595().method_11663("hot");
            class_2680 var79;
            if (var71 instanceof class_2746) {
               class_2746 _withbp19 = (class_2746)var71;
               var79 = (class_2680)BurntModBlocks.SOOTY_ACACIA_LOG.method_9564().method_11657(_withbp19, true);
            } else {
               var79 = BurntModBlocks.SOOTY_ACACIA_LOG.method_9564();
            }

            class_2680 _bs = var79;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_DARK_OAK_LOGS)) {
            if (Math.random() <= (double)0.5F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var70 = BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9595().method_11663("hot");
               class_2680 var78;
               if (var70 instanceof class_2746) {
                  class_2746 _withbp23 = (class_2746)var70;
                  var78 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9564().method_11657(_withbp23, true);
               } else {
                  var78 = BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9564();
               }

               class_2680 _bs = var78;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }

            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_MANGROVE_LOGS)) {
            if (Math.random() <= (double)0.5F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var69 = BurntModBlocks.SOOTY_MANGROVE_LOG.method_9595().method_11663("hot");
               class_2680 var77;
               if (var69 instanceof class_2746) {
                  class_2746 _withbp27 = (class_2746)var69;
                  var77 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_LOG.method_9564().method_11657(_withbp27, true);
               } else {
                  var77 = BurntModBlocks.SOOTY_MANGROVE_LOG.method_9564();
               }

               class_2680 _bs = var77;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }

            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_CHERRY_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var68 = BurntModBlocks.SOOTY_CHERRY_LOG.method_9595().method_11663("hot");
            class_2680 var76;
            if (var68 instanceof class_2746) {
               class_2746 _withbp31 = (class_2746)var68;
               var76 = (class_2680)BurntModBlocks.SOOTY_CHERRY_LOG.method_9564().method_11657(_withbp31, true);
            } else {
               var76 = BurntModBlocks.SOOTY_CHERRY_LOG.method_9564();
            }

            class_2680 _bs = var76;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_PALE_OAK_LOGS)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var13 = BurntModBlocks.SOOTY_PALE_OAK_LOG.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var13 instanceof class_2746) {
               class_2746 _withbppo31 = (class_2746)var13;
               var10000 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_LOG.method_9564().method_11657(_withbppo31, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_PALE_OAK_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            done = true;
         } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN) && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() != class_2246.field_37546 && !BurntTags.isCompatBurnable(world.method_8320(class_2338.method_49637(x, y, z)))) {
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bso = world.method_8320(_bp);
               if (_bso.method_26164(BurntTags.BLOCK_MC_LOGS_THAT_BURN)) {
                  class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_SMOLDERING_LOGS).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  _bs = blockStateWithInt(_bs, "stage", 1);
                  world.method_8652(_bp, _bs, 3);
                  if (Math.random() <= 0.3) {
                     world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_LOG.method_9564()));
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
