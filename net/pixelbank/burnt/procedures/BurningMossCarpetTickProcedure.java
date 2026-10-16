package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurningMossCarpetTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (BurntProtection.stopBurning(world, x, y, z)) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS_CARPET.method_9564(), 3);
      } else {
         class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip1 = (class_2758)var9;
            var10000 = (Integer)blockstate.method_11654(_getip1);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_28681) {
               world.method_8652(class_2338.method_49637(x, y - (double)1.0F, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
            }

            if (Math.random() <= 0.3) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_MOSS_CARPET.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

      }
   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
