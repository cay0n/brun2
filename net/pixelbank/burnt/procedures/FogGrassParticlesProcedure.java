package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntTags;

public class FogGrassParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleAmount = (double)0.0F;
      double particleRadius = (double)0.0F;
      double xSpeed = (double)0.0F;
      double multiplyer = (double)0.0F;
      double zSpeed = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.SMOKE.get() && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            xSpeed = WindAngleXProcedure.execute(world);
            zSpeed = WindAngleZProcedure.execute(world);
            multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
            particleAmount = Math.min(class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.0F) + BurntModVariables.MapVariables.get(world).windSpeed / (double)10.0F, (double)2.0F);
            particleRadius = 0.6;

            for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
               world.method_8406(BurntModParticleTypes.FOG, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, xSpeed / (double)10.0F * multiplyer, (double)0.0F, zSpeed / (double)10.0F * multiplyer);
            }
         } else {
            particleAmount = class_3532.method_15366(world.method_8409(), (double)0.0F, (double)2.0F);
            particleRadius = 0.6;

            for(int index1 = 0; index1 < (int)particleAmount; ++index1) {
               world.method_8406(BurntModParticleTypes.FOG, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, class_3532.method_15366(world.method_8409(), -0.2, 0.2), (double)0.0F, class_3532.method_15366(world.method_8409(), -0.2, 0.2));
            }
         }
      }

   }
}
