package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingFenceParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (world.method_8608()) {
         class_2769 var10 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var10 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var10;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 < 1) {
            label35: {
               var10 = blockstate.method_26204().method_9595().method_11663("hot");
               if (var10 instanceof class_2746) {
                  class_2746 _getbp4 = (class_2746)var10;
                  if ((Boolean)blockstate.method_11654(_getbp4)) {
                     var10000 = 1;
                     break label35;
                  }
               }

               var10000 = 0;
            }

            if (!var10000) {
               WoodParticlesProcedure.execute(world, x, y, z);
               return;
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR) && !world.method_22348(class_2338.method_49637(x, y + (double)1.0F, z))) {
            if ((Boolean)BurntBasicConfigConfiguration.GROUND_SMOKE.get()) {
               ThickFogParticlesProcedure.execute(world, x, y, z);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            PlankSmokeParticlesProcedure.execute(world, x, y, z, blockstate);
         } else {
            WoodParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
