package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class SootyBookshelfStartTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         boolean var10000;
         label26: {
            class_2769 var9 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var9 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var9;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label26;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            if (world.method_8401().method_156() && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var12 = _bs.method_26204().method_9595().method_11663("hot");
               if (var12 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var12;
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            }

            if (Math.random() <= Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * 0.6666666666666666) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_BOOKSHELF.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               WillitburnProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
