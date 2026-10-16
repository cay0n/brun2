package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class FallingSlabBrokenProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.FALLING_BURNT_SLAB) {
         world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
      }

   }
}
