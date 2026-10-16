package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class TestSootValidPlacementProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      return (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10124 || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOT_BLOCK) && (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26225() || world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26225() || world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26225() || world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26225());
   }
}
