package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BlastLeavesTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (Math.random() <= 0.1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            if (_bs.method_28498(class_2741.field_12508)) {
               _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
            }

            world.method_8652(_bp, _bs, 3);
            WillitburnProcedure.execute(world, x, y, z);
         } else if (Math.random() <= 0.3) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            if (_bs.method_28498(class_2741.field_12508)) {
               _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
            }

            world.method_8652(_bp, _bs, 3);
         } else {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }
      }

   }
}
