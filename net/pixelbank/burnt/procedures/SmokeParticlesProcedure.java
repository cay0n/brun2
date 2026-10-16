package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntSmokeBudget;

public class SmokeParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double xSpeed = (double)0.0F;
      double turb = (double)0.0F;
      double zSpeed = (double)0.0F;
      double zDir = (double)0.0F;
      double yCoord = (double)0.0F;
      double yMultiplyer = (double)0.0F;
      double multiplyer = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.SMOKE.get() && world.method_22348(class_2338.method_49637(x, y, z))) {
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
            xSpeed = WindAngleXProcedure.execute(world) * multiplyer;
            zSpeed = WindAngleZProcedure.execute(world) * multiplyer;
            particleAmount = class_3532.method_15366(world.method_8409(), (double)0.0F, (double)3.0F) + BurntModVariables.MapVariables.get(world).windSpeed / (double)50.0F * multiplyer;
            particleAmount *= BurntSmokeBudget.densityFactor();
            particleRadius = 0.8;

            for(int index0 = 0; index0 < (int)particleAmount && BurntSmokeBudget.allowSpawn(world.method_8409()); ++index0) {
               world.method_8406(BurntModParticleTypes.FLAME_SMOKE, x + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, xSpeed / (double)25.0F, class_3532.method_15366(world.method_8409(), -0.001, 0.001), zSpeed / (double)25.0F);
               world.method_8406(BurntModParticleTypes.LARGE_FLAME_SMOKE, x + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.0F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, xSpeed / (double)30.0F, class_3532.method_15366(world.method_8409(), -0.001, 0.001), zSpeed / (double)30.0F);
            }
         } else {
            particleAmount = class_3532.method_15366(world.method_8409(), (double)1.0F, (double)3.0F);
            particleAmount *= BurntSmokeBudget.densityFactor();
            particleRadius = 0.8;

            for(int index1 = 0; index1 < (int)particleAmount && BurntSmokeBudget.allowSpawn(world.method_8409()); ++index1) {
               world.method_8406(BurntModParticleTypes.FLAME_SMOKE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), 0.02, 0.1), (double)0.0F);
               world.method_8406(BurntModParticleTypes.LARGE_FLAME_SMOKE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), 0.02, 0.1), (double)0.0F);
            }
         }
      }

   }
}
