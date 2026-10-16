package net.pixelbank.burnt.procedures;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_7924;
import net.minecraft.class_8111;

public class BlastCollidesProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            entity.method_5639(10.0F);
            entity.method_5643(new class_1282(world.method_30349().method_46762(class_7924.field_42534).method_46747(class_8111.field_42337)), 0.5F);
         }

      }
   }
}
