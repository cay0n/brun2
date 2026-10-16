package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class FenceStartParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
         FenceFlameParticlesProcedure.execute(world, x, y, z, blockstate);
      }

   }
}
