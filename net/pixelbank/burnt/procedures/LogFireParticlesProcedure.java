package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class LogFireParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get() && Math.random() <= 0.3) {
         particleAmount = (double)1.0F;
         particleRadius = 0.6;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(BurntModParticleTypes.FLAMES, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -1.2, 1.2) * particleRadius, y + 0.6 + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -1.2, 1.2) * particleRadius, class_3532.method_15366(world.method_8409(), (double)0.0F, (double)0.0F), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), class_3532.method_15366(world.method_8409(), (double)0.0F, (double)0.0F));
         }
      }

   }
}
