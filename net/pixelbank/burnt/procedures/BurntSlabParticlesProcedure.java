package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntSlabParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8608() && Math.random() <= (double)0.5F) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.EMBER_SLAB) {
            WoodParticlesProcedure.execute(world, x, y, z);
         } else if ((Boolean)BurntBasicConfigConfiguration.ASH.get()) {
            AshParticlesProcedure.execute(world, x, y, z);
         }
      }

   }
}
