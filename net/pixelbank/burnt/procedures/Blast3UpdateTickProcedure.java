package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class Blast3UpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         SootyProcedure.execute(world, x, y, z);
         if (Math.random() <= 0.7) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_10124.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_10036.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
