package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class WoodParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double xSpeed = (double)0.0F;
      double turb = (double)0.0F;
      double zSpeed = (double)0.0F;
      double zDir = (double)0.0F;
      double multiplyer = (double)0.0F;
      if (world.method_8608() && Math.random() <= 0.3) {
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
            xSpeed = WindAngleXProcedure.execute(world) * multiplyer;
            zSpeed = WindAngleZProcedure.execute(world) * multiplyer;
            particleAmount = (double)2.0F;
            particleRadius = 0.7;

            for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
               world.method_8406(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, xSpeed / (double)10.0F, class_3532.method_15366(world.method_8409(), -0.001, 0.001), zSpeed / (double)10.0F);
            }
         } else {
            particleAmount = (double)2.0F;
            particleRadius = 0.7;

            for(int index1 = 0; index1 < (int)particleAmount; ++index1) {
               world.method_8406(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.001, 0.01), class_3532.method_15366(world.method_8409(), -0.001, 0.05), class_3532.method_15366(world.method_8409(), -0.001, 0.01));
            }
         }
      }

   }
}
