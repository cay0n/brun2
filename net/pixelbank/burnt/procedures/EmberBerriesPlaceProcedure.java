package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class EmberBerriesPlaceProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && (world.method_8320(class_2338.method_49637(x, y, z)).method_26225() || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_CAVE_VINES)) && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
         world.method_8652(class_2338.method_49637(x, y - (double)1.0F, z), BurntModBlocks.BURNT_CAVE_VINES.method_9564(), 3);
      }

   }
}
