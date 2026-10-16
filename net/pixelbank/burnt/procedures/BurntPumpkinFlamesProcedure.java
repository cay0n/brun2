package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;

public class BurntPumpkinFlamesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         boolean var10000;
         label16: {
            class_2769 var9 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var9 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var9;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label16;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            FlamesPlacementProcedure.execute(world, x, y, z);
            SmolderingBlockAddedProcedure.execute(world, x, y, z, blockstate);
         }
      }

   }
}
