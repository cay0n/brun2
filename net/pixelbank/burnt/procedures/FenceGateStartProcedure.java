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

public class FenceGateStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10188) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.SOOTY_OAK_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var18 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var18;
               var10000 = (class_2680)BurntModBlocks.SOOTY_OAK_FENCE_GATE.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_OAK_FENCE_GATE.method_9564();
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
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10291) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var91 = BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var107;
            if (var91 instanceof class_2746) {
               class_2746 _withbp8 = (class_2746)var91;
               var107 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE.method_9564().method_11657(_withbp8, true);
            } else {
               var107 = BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var107;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var91 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var91 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var91;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10513) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var93 = BurntModBlocks.SOOTY_BIRCH_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var108;
            if (var93 instanceof class_2746) {
               class_2746 _withbp13 = (class_2746)var93;
               var108 = (class_2680)BurntModBlocks.SOOTY_BIRCH_FENCE_GATE.method_9564().method_11657(_withbp13, true);
            } else {
               var108 = BurntModBlocks.SOOTY_BIRCH_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var108;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var93 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var93 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var93;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10041) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var95 = BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var109;
            if (var95 instanceof class_2746) {
               class_2746 _withbp18 = (class_2746)var95;
               var109 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE.method_9564().method_11657(_withbp18, true);
            } else {
               var109 = BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var109;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var95 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var95 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var95;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10457) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var97 = BurntModBlocks.SOOTY_ACACIA_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var110;
            if (var97 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var97;
               var110 = (class_2680)BurntModBlocks.SOOTY_ACACIA_FENCE_GATE.method_9564().method_11657(_withbp23, true);
            } else {
               var110 = BurntModBlocks.SOOTY_ACACIA_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var110;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var97 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var97 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var97;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10196) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var99 = BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var111;
            if (var99 instanceof class_2746) {
               class_2746 _withbp28 = (class_2746)var99;
               var111 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE.method_9564().method_11657(_withbp28, true);
            } else {
               var111 = BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var111;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var99 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var99 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var99;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37563) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var101 = class_2246.field_37563.method_9595().method_11663("hot");
            class_2680 var112;
            if (var101 instanceof class_2746) {
               class_2746 _withbp33 = (class_2746)var101;
               var112 = (class_2680)class_2246.field_37563.method_9564().method_11657(_withbp33, true);
            } else {
               var112 = class_2246.field_37563.method_9564();
            }

            class_2680 _bs = var112;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var101 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var101 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var101;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42745) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var103 = BurntModBlocks.SOOTY_CHERRY_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var113;
            if (var103 instanceof class_2746) {
               class_2746 _withbp38 = (class_2746)var103;
               var113 = (class_2680)BurntModBlocks.SOOTY_CHERRY_FENCE_GATE.method_9564().method_11657(_withbp38, true);
            } else {
               var113 = BurntModBlocks.SOOTY_CHERRY_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var113;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var103 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var103 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var103;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_FENCE_GATES_WOODEN)) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_FENCEGATE.method_9564(), "stage", 1);
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
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_fence_gate")) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var105 = BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE.method_9595().method_11663("hot");
            class_2680 var114;
            if (var105 instanceof class_2746) {
               class_2746 _withbppo38 = (class_2746)var105;
               var114 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE.method_9564().method_11657(_withbppo38, true);
            } else {
               var114 = BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE.method_9564();
            }

            class_2680 _bs = var114;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            var105 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var105 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var105;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FORGE_FENCE_GATES_WOODEN)) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_FENCEGATE.method_9564(), "stage", 1);
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
