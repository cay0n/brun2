package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class PlanksStartParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            if ((Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
               LargeFlameParticlesProcedure.execute(world, x, y, z);
            }
         } else {
            WoodParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
