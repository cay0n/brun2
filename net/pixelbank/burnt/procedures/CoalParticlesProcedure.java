package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class CoalParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608()) {
         WoodParticlesProcedure.execute(world, x, y, z);
         if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
            LightSmokeParticlesProcedure.execute(world, x, y + (double)1.0F, z);
         }
      }

   }
}
