package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2404;
import net.pixelbank.burnt.init.BurntModBlocks;

public class SprayWhileProjectileFlyingTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 immediatesourceentity) {
      if (immediatesourceentity != null) {
         if (!world.method_8608()) {
            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() instanceof class_2404) {
               if (!immediatesourceentity.method_37908().method_8608()) {
                  immediatesourceentity.method_31472();
               }

               if (Math.random() <= 0.3) {
                  world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SPLASH.method_9564()));
               }
            }

            if (world.method_8316(class_2338.method_49637(x, y, z)).method_15759().method_26204() == class_2246.field_10164 && world.method_8316(class_2338.method_49637(x, y, z)).method_15759().method_26227().method_15771()) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FRAGILE_MAGMA.method_9564(), 3);
            } else if (world.method_8316(class_2338.method_49637(x, y, z)).method_15759().method_26204() == class_2246.field_10164) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
            }
         }

      }
   }
}
