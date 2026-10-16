package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2398;
import net.minecraft.class_3218;
import net.pixelbank.burnt.BurntMod;

public class FlintSparkWhileProjectileFlyingTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 immediatesourceentity) {
      if (immediatesourceentity != null) {
         if (!world.method_8608()) {
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               _level.method_14199(class_2398.field_29644, x, y, z, 1, 0.2, 0.2, 0.2, 0.2);
            }

            BurntMod.queueServerWork(3, () -> {
               if (!immediatesourceentity.method_37908().method_8608()) {
                  immediatesourceentity.method_31472();
               }

            });
         }

      }
   }
}
