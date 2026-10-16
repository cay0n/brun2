package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderLogsParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
            int var10000;
            if (var9 instanceof class_2758) {
               class_2758 _getip4 = (class_2758)var9;
               var10000 = (Integer)blockstate.method_11654(_getip4);
            } else {
               var10000 = -1;
            }

            if (var10000 >= 1) {
               if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
                  PlankSmokeParticlesProcedure.execute(world, x, y, z, blockstate);
               }
            } else {
               WoodParticlesProcedure.execute(world, x, y, z);
            }
         } else {
            WoodParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
