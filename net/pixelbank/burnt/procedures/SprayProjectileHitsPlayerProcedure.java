package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class SprayProjectileHitsPlayerProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity, class_1297 sourceentity) {
      if (entity != null && sourceentity != null) {
         if (!world.method_8608() && entity != sourceentity && Math.random() <= 0.3) {
            world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SPLASH.method_9564()));
         }

      }
   }
}
