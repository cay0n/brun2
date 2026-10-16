package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntStairsStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_STAIRS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bsNew = world.method_8320(_pos);
            class_2769 var13 = _bsNew.method_26204().method_9595().method_11663("waterlogged");
            if (var13 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var13;
               world.method_8652(_pos, (class_2680)_bsNew.method_11657(_booleanProp, false), 3);
            }

            return;
         }

         WillitburnProcedure.execute(world, x, y, z);
         if (Math.random() <= 0.1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BLAZING_STAIRS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 _pos = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (_pos instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)_pos;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else {
            int _value = 3;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 _bsNew = _bs.method_26204().method_9595().method_11663("stage");
            if (_bsNew instanceof class_2758) {
               class_2758 _integerProp = (class_2758)_bsNew;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         }
      }

   }
}
