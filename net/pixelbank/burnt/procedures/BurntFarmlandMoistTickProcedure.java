package net.pixelbank.burnt.procedures;

import net.minecraft.class_1752;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntFarmlandMoistTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (Math.random() <= (double)0.25F && world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            if ((class_1752.method_7720(new class_1799(class_1802.field_8324), _level, _bp) || class_1752.method_7719(new class_1799(class_1802.field_8324), _level, _bp, (class_2350)null)) && !_level.method_8608()) {
               _level.method_20290(2005, _bp, 0);
            }
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.BURNT_CROPS) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), blockStateWithInt(class_2246.field_10293.method_9564(), "age", 0), 3);
         }

         sx = (double)-3.0F;
         found = false;

         for(int index0 = 0; index0 < 6; ++index0) {
            sy = (double)0.0F;

            for(int index1 = 0; index1 < 6; ++index1) {
               sz = (double)-3.0F;

               for(int index2 = 0; index2 < 6; ++index2) {
                  label60: {
                     class_2680 _bsCheck = world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz));
                     if (_bsCheck.method_26204() != class_2246.field_10382) {
                        class_2769 var19 = _bsCheck.method_26204().method_9595().method_11663("waterlogged");
                        if (!(var19 instanceof class_2746)) {
                           break label60;
                        }

                        class_2746 _getbp11 = (class_2746)var19;
                        if (!(Boolean)_bsCheck.method_11654(_getbp11)) {
                           break label60;
                        }
                     }

                     found = true;
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }

         if (!found && Math.random() <= (double)0.5F) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_FARMLAND.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         class_2769 var30 = world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204().method_9595().method_11663("age");
         int var10000;
         if (var30 instanceof class_2758) {
            class_2758 _getip14 = (class_2758)var30;
            var10000 = (Integer)world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_11654(_getip14);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 6) {
            world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(class_2246.field_10362.method_9564(), "moisture", 7), 3);
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
