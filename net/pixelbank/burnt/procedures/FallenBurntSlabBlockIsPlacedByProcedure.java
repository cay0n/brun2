package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;

public class FallenBurntSlabBlockIsPlacedByProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      class_2338 _pos = class_2338.method_49637(x, y, z);
      class_2680 _bs = world.method_8320(_pos);
      class_2769 var10 = _bs.method_26204().method_9595().method_11663("placed");
      if (var10 instanceof class_2746 _booleanProp) {
         world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
      }

   }
}
