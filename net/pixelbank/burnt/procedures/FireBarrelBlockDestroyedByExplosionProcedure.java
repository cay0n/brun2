package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class FireBarrelBlockDestroyedByExplosionProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564(), 3);
      }

   }
}
