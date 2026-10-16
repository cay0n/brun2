package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;

public class BurntBambooStalkTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var9;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1 && Math.random() <= 0.01) {
            WillitburnProcedure.execute(world, x, y, z);
            int _value = 2;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var13 = _bs.method_26204().method_9595().method_11663("stage");
            if (var13 instanceof class_2758) {
               class_2758 _integerProp = (class_2758)var13;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         }
      }

   }
}
