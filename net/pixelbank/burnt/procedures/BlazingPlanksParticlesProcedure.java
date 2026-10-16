package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class BlazingPlanksParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR) && !world.method_22348(class_2338.method_49637(x, y + (double)1.0F, z))) {
            if ((Boolean)BurntBasicConfigConfiguration.GROUND_SMOKE.get()) {
               ThickFogParticlesProcedure.execute(world, x, y, z);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
               PlankSmokeParticlesProcedure.execute(world, x, y, z, blockstate);
            }
         } else {
            WoodParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
