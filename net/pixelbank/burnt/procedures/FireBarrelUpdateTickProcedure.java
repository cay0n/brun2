package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class FireBarrelUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      double Radius = (double)0.0F;
      if (!world.method_8608() && !world.method_8608()) {
         sx = (double)-1.0F;
         found = false;

         for(int index0 = 0; index0 < 6; ++index0) {
            sy = (double)-1.0F;

            for(int index1 = 0; index1 < 6; ++index1) {
               sz = (double)-1.0F;

               for(int index2 = 0; index2 < 6; ++index2) {
                  if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_BLAST)) {
                     found = true;
                     world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564(), 3);
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }
      }

   }
}
