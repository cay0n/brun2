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

public class SlabsStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10119) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var18 = BurntModBlocks.SOOTY_OAK_SLAB.method_9595().method_11663("hot");
         class_2680 var10000;
         if (var18 instanceof class_2746) {
            class_2746 _withbp2 = (class_2746)var18;
            var10000 = (class_2680)BurntModBlocks.SOOTY_OAK_SLAB.method_9564().method_11657(_withbp2, true);
         } else {
            var10000 = BurntModBlocks.SOOTY_OAK_SLAB.method_9564();
         }

         class_2680 _bs = var10000;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var18 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var18 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var18;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10071) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var90 = BurntModBlocks.SOOTY_SPRUCE_SLAB.method_9595().method_11663("hot");
         class_2680 var106;
         if (var90 instanceof class_2746) {
            class_2746 _withbp7 = (class_2746)var90;
            var106 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_SLAB.method_9564().method_11657(_withbp7, true);
         } else {
            var106 = BurntModBlocks.SOOTY_SPRUCE_SLAB.method_9564();
         }

         class_2680 _bs = var106;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var90 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var90 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var90;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10257) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var92 = BurntModBlocks.SOOTY_BIRCH_SLAB.method_9595().method_11663("hot");
         class_2680 var107;
         if (var92 instanceof class_2746) {
            class_2746 _withbp12 = (class_2746)var92;
            var107 = (class_2680)BurntModBlocks.SOOTY_BIRCH_SLAB.method_9564().method_11657(_withbp12, true);
         } else {
            var107 = BurntModBlocks.SOOTY_BIRCH_SLAB.method_9564();
         }

         class_2680 _bs = var107;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var92 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var92 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var92;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10617) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var94 = BurntModBlocks.SOOTY_JUNGLE_SLAB.method_9595().method_11663("hot");
         class_2680 var108;
         if (var94 instanceof class_2746) {
            class_2746 _withbp17 = (class_2746)var94;
            var108 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_SLAB.method_9564().method_11657(_withbp17, true);
         } else {
            var108 = BurntModBlocks.SOOTY_JUNGLE_SLAB.method_9564();
         }

         class_2680 _bs = var108;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var94 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var94 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var94;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10031) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var96 = BurntModBlocks.SOOTY_ACACIA_SLAB.method_9595().method_11663("hot");
         class_2680 var109;
         if (var96 instanceof class_2746) {
            class_2746 _withbp22 = (class_2746)var96;
            var109 = (class_2680)BurntModBlocks.SOOTY_ACACIA_SLAB.method_9564().method_11657(_withbp22, true);
         } else {
            var109 = BurntModBlocks.SOOTY_ACACIA_SLAB.method_9564();
         }

         class_2680 _bs = var109;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var96 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var96 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var96;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10500) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var98 = BurntModBlocks.SOOTY_DARK_OAK_SLAB.method_9595().method_11663("hot");
         class_2680 var110;
         if (var98 instanceof class_2746) {
            class_2746 _withbp27 = (class_2746)var98;
            var110 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_SLAB.method_9564().method_11657(_withbp27, true);
         } else {
            var110 = BurntModBlocks.SOOTY_DARK_OAK_SLAB.method_9564();
         }

         class_2680 _bs = var110;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var98 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var98 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var98;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37564) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var100 = BurntModBlocks.SOOTY_MANGROVE_SLAB.method_9595().method_11663("hot");
         class_2680 var111;
         if (var100 instanceof class_2746) {
            class_2746 _withbp32 = (class_2746)var100;
            var111 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_SLAB.method_9564().method_11657(_withbp32, true);
         } else {
            var111 = BurntModBlocks.SOOTY_MANGROVE_SLAB.method_9564();
         }

         class_2680 _bs = var111;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var100 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var100 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var100;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42746) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var102 = BurntModBlocks.SOOTY_CHERRY_SLAB.method_9595().method_11663("hot");
         class_2680 var112;
         if (var102 instanceof class_2746) {
            class_2746 _withbp37 = (class_2746)var102;
            var112 = (class_2680)BurntModBlocks.SOOTY_CHERRY_SLAB.method_9564().method_11657(_withbp37, true);
         } else {
            var112 = BurntModBlocks.SOOTY_CHERRY_SLAB.method_9564();
         }

         class_2680 _bs = var112;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var102 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var102 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var102;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_slab")) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2769 var104 = BurntModBlocks.SOOTY_PALE_OAK_SLAB.method_9595().method_11663("hot");
         class_2680 var113;
         if (var104 instanceof class_2746) {
            class_2746 _withbppo37 = (class_2746)var104;
            var113 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_SLAB.method_9564().method_11657(_withbppo37, true);
         } else {
            var113 = BurntModBlocks.SOOTY_PALE_OAK_SLAB.method_9564();
         }

         class_2680 _bs = var113;
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         var104 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var104 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var104;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      } else if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_SLABS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_SLABS)) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
         class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
         BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_SLAB.method_9564(), "stage", 1);
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               _bp = class_2338.method_49637(x, y, z);
               _bs = world.method_8320(_bp);
               class_2769 patt0$temp = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (patt0$temp instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)patt0$temp;
                  world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }

            }
         });
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
