package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2398;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class GrassFlameParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
         particleAmount = class_3532.method_15366(world.method_8409(), (double)1.0F, (double)6.0F);
         particleRadius = (double)1.0F;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(class_2398.field_11240, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y + (double)0.5F, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, (double)0.0F, (double)0.0F);
         }

         if (Math.random() <= (double)0.25F) {
            world.method_8406(BurntModParticleTypes.FLAMES, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y + (double)0.75F, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), (double)0.0F);
         }
      }

   }
}
