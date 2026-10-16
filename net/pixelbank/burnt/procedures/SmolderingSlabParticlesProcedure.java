package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class SmolderingSlabParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (world.method_8608()) {
         if (world.method_22348(class_2338.method_49637(x, y, z))) {
            if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
               PlankSmokeParticlesProcedure.execute(world, x, y, z, blockstate);
            }
         } else {
            WoodParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
