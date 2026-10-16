package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class BrokenBurntLogsParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.ASH.get()) {
         AshParticlesProcedure.execute(world, x, y, z);
      }

   }
}
