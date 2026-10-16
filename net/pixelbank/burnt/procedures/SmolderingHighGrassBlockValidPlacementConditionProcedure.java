package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_7923;

public class SmolderingHighGrassBlockValidPlacementConditionProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      return world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225() || class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204()).toString().equals("biomesoplenty:high_grass");
   }
}
