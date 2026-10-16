package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class BlastSmokeProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world instanceof class_3218 _level) {
         _level.method_14199(BurntModParticleTypes.FLAME_SMOKE, x, y, z, 5, (double)2.0F, (double)1.0F, (double)2.0F, (double)0.0F);
      }

   }
}
