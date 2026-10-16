package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.util.BurntTags;

public class CheckBurnOffsetProcedure {
   public static void execute(class_1936 world, double baseX, double baseY, double baseZ, double dx, double dy, double dz) {
      double nx = (double)0.0F;
      double ny = (double)0.0F;
      double nz = (double)0.0F;
      if (world.method_22340(class_2338.method_49637(nx, ny, nz))) {
         nx = baseX + dx;
         ny = baseY + dy;
         nz = baseZ + dz;
         if (world.method_8320(class_2338.method_49637(nx, ny, nz)).method_26164(BurntTags.BLOCK_WILL_BURN)) {
            WillitburnProcedure.execute(world, nx, ny, nz);
         }
      }

   }
}
