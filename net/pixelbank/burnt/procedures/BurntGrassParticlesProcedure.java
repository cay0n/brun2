package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class BurntGrassParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
         GrassFlameParticlesProcedure.execute(world, x, y + (double)0.5F, z);
      }

   }
}
