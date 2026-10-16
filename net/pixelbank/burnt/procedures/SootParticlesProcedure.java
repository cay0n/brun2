package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class SootParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608()) {
         particleAmount = (double)10.0F;
         particleRadius = (double)1.0F;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(BurntModParticleTypes.SOOT_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.01, 0.01), class_3532.method_15366(world.method_8409(), -0.05, 0.01), class_3532.method_15366(world.method_8409(), -0.01, 0.01));
         }
      }

   }
}
