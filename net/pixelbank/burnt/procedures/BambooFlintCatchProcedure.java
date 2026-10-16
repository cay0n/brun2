package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BambooFlintCatchProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if ((Boolean)BurntBasicConfigConfiguration.CRAFTED_BURN.get()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40294) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_PLANKS.method_9564(), "stage", 1);
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40285) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_BAMBOO_TRAPDOOR.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40295) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_MOSAIC_PLANKS.method_9564(), "stage", 1);
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_41072) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_BLOCK.method_9564(), "stage", 1);
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_41073) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_BLOCK.method_9564(), "stage", 1);
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else {
            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40287) {
               boolean var10000;
               label85: {
                  class_2769 _bp = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
                  if (_bp instanceof class_2746) {
                     class_2746 _getbp23 = (class_2746)_bp;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp23)) {
                        var10000 = true;
                        break label85;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_STAIRS.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  return;
               }
            }

            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40288) {
               boolean var66;
               label76: {
                  class_2769 _bp = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
                  if (_bp instanceof class_2746) {
                     class_2746 _getbp29 = (class_2746)_bp;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp29)) {
                        var66 = true;
                        break label76;
                     }
                  }

                  var66 = false;
               }

               if (!var66) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_MOSAIC_STAIRS.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  return;
               }
            }

            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40290) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_FENCE.method_9564(), "stage", 1);
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40289) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_FENCEGATE.method_9564(), "stage", 1);
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40292) {
                  boolean var67;
                  label65: {
                     class_2769 _bp = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
                     if (_bp instanceof class_2746) {
                        class_2746 _getbp43 = (class_2746)_bp;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp43)) {
                           var67 = true;
                           break label65;
                        }
                     }

                     var67 = false;
                  }

                  if (!var67) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_SLAB.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     return;
                  }
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40293) {
                  boolean var68;
                  label56: {
                     class_2769 _bp = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
                     if (_bp instanceof class_2746) {
                        class_2746 _getbp49 = (class_2746)_bp;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp49)) {
                           var68 = true;
                           break label56;
                        }
                     }

                     var68 = false;
                  }

                  if (!var68) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_MOSAIC_SLAB.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     return;
                  }
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10211) {
                  world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_BAMBOO_STALK.method_9564(), 3);
               }
            }
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
