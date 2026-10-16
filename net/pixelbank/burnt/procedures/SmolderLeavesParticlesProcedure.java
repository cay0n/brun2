package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderLeavesParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608()) {
         class_2769 var13 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var13 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var13;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
               if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
                  SmokeParticlesProcedure.execute(world, x, y + (double)1.0F, z);
               }
            } else {
               WoodParticlesProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
