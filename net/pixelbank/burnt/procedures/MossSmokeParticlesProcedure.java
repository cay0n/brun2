package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.util.BurntTags;

public class MossSmokeParticlesProcedure {
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
            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR) && (Boolean)BurntBasicConfigConfiguration.GROUND_SMOKE.get() && Math.random() <= (double)0.5F) {
               ThickFogParticlesProcedure.execute(world, x, y, z);
            }
         } else if (Math.random() <= 0.3) {
            particleAmount = (double)3.0F;
            particleRadius = 0.7;

            for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
               world.method_8406(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), -0.1, 0.1));
            }
         }
      }

   }
}
