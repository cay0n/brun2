package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class FogParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double particleAmount = (double)0.0F;
      double particleRadius = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double xSpeed = (double)0.0F;
      double multiplyer = (double)0.0F;
      double turb = (double)0.0F;
      double zSpeed = (double)0.0F;
      double zDir = (double)0.0F;
      if (world.method_8608() && Math.random() <= 0.1 && (Boolean)BurntBasicConfigConfiguration.GROUND_SMOKE.get() && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((double)8.0F), (e) -> true).isEmpty()) {
         boolean var10000;
         label19: {
            class_2769 var27 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var27 instanceof class_2746) {
               class_2746 _getbp4 = (class_2746)var27;
               if ((Boolean)blockstate.method_11654(_getbp4)) {
                  var10000 = true;
                  break label19;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            FogGrassParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
