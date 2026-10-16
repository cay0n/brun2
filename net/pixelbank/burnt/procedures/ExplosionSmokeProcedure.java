package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class ExplosionSmokeProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
         particleAmount = class_3532.method_15366(world.method_8409(), (double)10.0F, (double)20.0F);
         particleRadius = (double)0.0F;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(BurntModParticleTypes.FLAME_SMOKE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), 0.02, 0.1), (double)0.0F);
         }
      }

   }
}
