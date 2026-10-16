package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class FireBarrelEntityCollidesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && entity.method_5809()) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564(), 3);
         }

      }
   }
}
