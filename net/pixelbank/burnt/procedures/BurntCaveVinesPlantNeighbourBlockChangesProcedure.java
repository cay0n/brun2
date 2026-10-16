package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntCaveVinesPlantNeighbourBlockChangesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10124) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_CAVE_VINES.method_9564(), 3);
         }
      }

   }
}
