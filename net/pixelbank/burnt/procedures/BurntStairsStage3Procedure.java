package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntStairsStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bsNew = world.method_8320(_pos);
            class_2769 var15 = _bsNew.method_26204().method_9595().method_11663("waterlogged");
            if (var15 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var15;
               world.method_8652(_pos, (class_2680)_bsNew.method_11657(_booleanProp, false), 3);
            }

            return;
         }

         if (Math.random() <= 0.05) {
            RandomCollapseProcedure.execute(world, x, y, z);
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 500) <= burnTime) {
            if (Math.random() <= 0.01) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            } else if (Math.random() <= (double)0.5F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 _pos = BurntModBlocks.EMBER_STAIRS.method_9595().method_11663("hot");
               class_2680 var10000;
               if (_pos instanceof class_2746) {
                  class_2746 _withbp5 = (class_2746)_pos;
                  var10000 = (class_2680)BurntModBlocks.EMBER_STAIRS.method_9564().method_11657(_withbp5, true);
               } else {
                  var10000 = BurntModBlocks.EMBER_STAIRS.method_9564();
               }

               class_2680 _bs = var10000;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var17) {
                     }
                  }
               }

               _bp = class_2338.method_49637(x, y, z);
               _bs = world.method_8320(_bp);
               class_2769 var37 = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (var37 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var37;
                  world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var16) {
                     }
                  }
               }

               _bp = class_2338.method_49637(x, y, z);
               _bs = world.method_8320(_bp);
               class_2769 var40 = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (var40 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var40;
                  world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            }
         }
      }

   }
}
