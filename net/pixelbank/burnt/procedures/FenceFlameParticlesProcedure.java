package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2398;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class FenceFlameParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608()) {
         boolean var10000;
         label29: {
            class_2769 var13 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var13 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var13;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label29;
               }
            }

            var10000 = false;
         }

         if (var10000 && (Boolean)BurntBasicConfigConfiguration.FLAMES.get()) {
            particleAmount = class_3532.method_15366(world.method_8409(), (double)1.0F, (double)2.0F);
            particleRadius = (double)1.0F;

            for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
               world.method_8406(class_2398.field_11240, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, (double)0.0F, (double)0.0F);
            }

            if (Math.random() <= 0.1) {
               world.method_8406(BurntModParticleTypes.FLAMES, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), (double)0.0F, 0.1), (double)0.0F);
            }
         }
      }

   }
}
