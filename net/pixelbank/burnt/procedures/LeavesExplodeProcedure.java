package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class LeavesExplodeProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      particleAmount = class_3532.method_15366(world.method_8409(), (double)2.0F, (double)4.0F);
      particleRadius = (double)1.0F;

      for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
         world.method_8406(BurntModParticleTypes.BURNT_LEAVES_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), class_3532.method_15366(world.method_8409(), -0.1, -0.1));
      }

      for(int index1 = 0; index1 < (int)particleAmount; ++index1) {
         world.method_8406(BurntModParticleTypes.BURNT_LEAVES_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), class_3532.method_15366(world.method_8409(), -0.1, -0.1));
      }

      for(int index2 = 0; index2 < (int)particleAmount; ++index2) {
         world.method_8406(BurntModParticleTypes.SMOLDER_LEAVES_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), class_3532.method_15366(world.method_8409(), -0.1, -0.1));
      }

      for(int index3 = 0; index3 < (int)particleAmount; ++index3) {
         world.method_8406(BurntModParticleTypes.SMOLDER_LEAVES_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), class_3532.method_15366(world.method_8409(), -0.1, -0.1));
      }

   }
}
