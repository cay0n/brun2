package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class WallsStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bso = world.method_8320(_bp);
         class_2680 _bs = BurntModBlocks.SMOLDERING_WALL.method_9564();
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         class_2769 var11 = _bs.method_26204().method_9595().method_11663("stage");
         if (var11 instanceof class_2758) {
            class_2758 _stage = (class_2758)var11;
            if (_stage.method_11898().contains(1)) {
               _bs = (class_2680)_bs.method_11657(_stage, 1);
            }
         }

         world.method_8652(_bp, _bs, 3);
      }
   }
}
