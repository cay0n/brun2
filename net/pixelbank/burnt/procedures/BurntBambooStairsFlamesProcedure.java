package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;

public class BurntBambooStairsFlamesProcedure {
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

         if (var10000 >= 1) {
            StairsFlamesPlacementProcedure.execute(world, x, y, z);
         }
      }

   }
}
