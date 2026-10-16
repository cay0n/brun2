package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_1937.class_7867;

public class Blast0UpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8437((class_1297)null, x, y, z, 0.5F, class_7867.field_40891);
            }
         }

         world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
      }

   }
}
