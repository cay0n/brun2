package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class SteamParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
         if (Math.random() <= 0.05) {
            world.method_8406(BurntModParticleTypes.MEDIUM_STEAM_PARTICLE, x + (double)0.5F, y + (double)1.5F, z + (double)0.5F, 0.8, 0.2, (double)0.5F);
         } else if (Math.random() <= 0.02) {
            world.method_8406(BurntModParticleTypes.LARGE_STEAM_PARTICLE, x + 0.3, y + (double)1.5F, z + 0.3, 0.8, 0.2, (double)0.5F);
         }
      }

   }
}
