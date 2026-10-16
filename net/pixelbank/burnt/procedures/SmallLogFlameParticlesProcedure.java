package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class SmallLogFlameParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
         particleAmount = (double)2.0F;
         particleRadius = 0.65;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + 0.1 + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, (double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }
}
