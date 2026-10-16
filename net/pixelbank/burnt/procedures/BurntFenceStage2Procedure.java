package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class BurntFenceStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_FENCES).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
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
            class_2680 _bs = blockStateWithInt(BurntModBlocks.BLAZING_FENCE.method_9564(), "stage", 3);
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
