package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class BurntFarmlandTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (Math.random() <= (double)0.5F) {
            sx = (double)-3.0F;
            found = false;

            for(int index0 = 0; index0 < 6; ++index0) {
               sy = (double)0.0F;

               for(int index1 = 0; index1 < 6; ++index1) {
                  sz = (double)-3.0F;

                  for(int index2 = 0; index2 < 6; ++index2) {
                     label44: {
                        class_2680 _bsCheck = world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz));
                        if (_bsCheck.method_26204() != class_2246.field_10382) {
                           class_2769 var19 = _bsCheck.method_26204().method_9595().method_11663("waterlogged");
                           if (!(var19 instanceof class_2746)) {
                              break label44;
                           }

                           class_2746 _getbp6 = (class_2746)var19;
                           if (!(Boolean)_bsCheck.method_11654(_getbp6)) {
                              break label44;
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

            if (found) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_FARMLAND_MOIST.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.01 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_DIRT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
