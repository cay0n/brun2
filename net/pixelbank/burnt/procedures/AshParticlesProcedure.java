package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2398;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class AshParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.ASH.get() && Math.random() <= 0.1) {
         particleAmount = (double)1.0F;
         particleRadius = (double)1.0F;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(class_2398.field_23956, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.01, 0.01), class_3532.method_15366(world.method_8409(), -0.05, 0.01), class_3532.method_15366(world.method_8409(), -0.01, 0.01));
         }
      }

   }
}
