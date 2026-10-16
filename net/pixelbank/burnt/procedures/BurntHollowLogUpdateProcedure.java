package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class BurntHollowLogUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
            double speed = (Double)BurntBasicConfigConfiguration.FOREST_RECOVER_SPEED.get();
            if (!(speed <= (double)0.0F)) {
               class_2769 var11 = blockstate.method_26204().method_9595().method_11663("fragile");
               if (var11 instanceof class_2746) {
                  class_2746 _fp = (class_2746)var11;
                  if ((Boolean)blockstate.method_11654(_fp)) {
                     class_2338 pos = class_2338.method_49637(x, y, z);
                     if (!world.method_22347(pos.method_10084()) && !world.method_22347(pos.method_10074())) {
                        return;
                     }

                     double p = Math.pow(Math.min(speed / (double)100.0F, (double)1.0F), (double)1.5F);
                     if (Math.random() < p) {
                        world.method_8652(pos, class_2246.field_10124.method_9564(), 3);
                     }

                     return;
                  }
               }

            }
         }
      }
   }
}
