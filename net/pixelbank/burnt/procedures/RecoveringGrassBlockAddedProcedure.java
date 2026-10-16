package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class RecoveringGrassBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.TALL_GRASS_BURNT) {
         if (Math.random() <= 0.01) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_28680.method_9564(), 3);
         } else if (Math.random() <= 0.05) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10479.method_9564(), 3);
         }
      }

   }
}
