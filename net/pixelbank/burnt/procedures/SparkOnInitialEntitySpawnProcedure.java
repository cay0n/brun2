package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;

public class SparkOnInitialEntitySpawnProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         double bx = (double)0.0F;
         double by = (double)0.0F;
         double bz = (double)0.0F;
         boolean done = false;
         if (!world.method_8608()) {
            ArrowBurnProcedure.execute(world, x, y, z);
            ArrowBurnProcedure.execute(world, x + (double)1.0F, y, z);
            ArrowBurnProcedure.execute(world, x - (double)1.0F, y, z);
            ArrowBurnProcedure.execute(world, x, y, z + (double)1.0F);
            ArrowBurnProcedure.execute(world, x, y, z - (double)1.0F);
            ArrowBurnProcedure.execute(world, x, y + (double)1.0F, z);
            ArrowBurnProcedure.execute(world, x, y - (double)1.0F, z);
            if (!entity.method_37908().method_8608()) {
               entity.method_31472();
            }
         }

      }
   }
}
