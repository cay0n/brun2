package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntSlabStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         WillitburnProcedure.execute(world, x, y, z);
         if (Math.random() <= 0.1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BLAZING_SLAB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else {
            int _value = 3;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var11 = _bs.method_26204().method_9595().method_11663("stage");
            if (var11 instanceof class_2758) {
               class_2758 _integerProp = (class_2758)var11;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         }
      }

   }
}
