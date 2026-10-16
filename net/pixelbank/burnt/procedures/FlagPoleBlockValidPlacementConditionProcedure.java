package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;

public class FlagPoleBlockValidPlacementConditionProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      return world.method_22347(class_2338.method_49637(x, y + (double)1.0F, z)) && !world.method_22347(class_2338.method_49637(x, y - (double)1.0F, z));
   }
}
