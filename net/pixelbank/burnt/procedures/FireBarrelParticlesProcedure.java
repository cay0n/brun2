package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;

public class FireBarrelParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608()) {
         LightSmokeParticlesProcedure.execute(world, x, y, z);
      }

   }
}
