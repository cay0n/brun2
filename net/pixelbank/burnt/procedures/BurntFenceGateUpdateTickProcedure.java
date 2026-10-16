package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntFenceGateUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && Math.random() <= 0.1) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
         _bp = class_2338.method_49637(x, y, z);
         _bs = world.method_8320(_bp);
         class_2769 var10 = _bs.method_26204().method_9595().method_11663("waterlogged");
         if (var10 instanceof class_2746) {
            class_2746 _booleanProp = (class_2746)var10;
            world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
         }
      }

   }
}
