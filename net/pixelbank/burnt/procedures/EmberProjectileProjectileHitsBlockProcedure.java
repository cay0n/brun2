package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;

public class EmberProjectileProjectileHitsBlockProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && Math.random() <= 0.2) {
         WillitburnProcedure.execute(world, x, y, z);
      }

   }
}
