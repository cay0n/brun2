package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class EmberFencesTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_FENCE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var11 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var11 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var11;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         class_2769 _pos = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (_pos instanceof class_2758) {
            class_2758 _getip16 = (class_2758)_pos;
            var10000 = (Integer)blockstate.method_11654(_getip16);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_FENCE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var12 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var12 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var12;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }
      }

   }
}
