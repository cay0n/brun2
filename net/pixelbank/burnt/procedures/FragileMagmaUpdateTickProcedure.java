package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class FragileMagmaUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && Math.random() <= 0.03) {
         world.method_20290(2001, class_2338.method_49637(x, y + (double)1.0F, z), class_2248.method_9507(class_2246.field_10124.method_9564()));
         if (Math.random() <= 0.4) {
            if (world.method_8316(class_2338.method_49637(x + (double)1.0F, y, z)).method_15759().method_26204() != class_2246.field_10164 && world.method_8316(class_2338.method_49637(x - (double)1.0F, y, z)).method_15759().method_26204() != class_2246.field_10164 && world.method_8316(class_2338.method_49637(x, y, z + (double)1.0F)).method_15759().method_26204() != class_2246.field_10164 && world.method_8316(class_2338.method_49637(x, y, z - (double)1.0F)).method_15759().method_26204() != class_2246.field_10164 && world.method_8316(class_2338.method_49637(x, y - (double)1.0F, z)).method_15759().method_26204() != class_2246.field_10164) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = class_2246.field_10092.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = class_2246.field_10124.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }
      }

   }
}
