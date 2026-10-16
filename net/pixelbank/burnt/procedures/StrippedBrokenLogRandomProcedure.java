package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;

public class StrippedBrokenLogRandomProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         int _value = class_3532.method_15395(world.method_8409(), 0, 1);
         class_2338 _pos = class_2338.method_49637(x, y, z);
         class_2680 _bs = world.method_8320(_pos);
         class_2769 var11 = _bs.method_26204().method_9595().method_11663("blockstate");
         if (var11 instanceof class_2758) {
            class_2758 _integerProp = (class_2758)var11;
            if (_integerProp.method_11898().contains(_value)) {
               world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
            }
         }
      }

   }
}
