package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class EmberLogTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var11 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
            class_2680 var10000;
            if (var11 instanceof class_2746) {
               class_2746 _withbp13 = (class_2746)var11;
               var10000 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp13, true);
            } else {
               var10000 = BurntModBlocks.BURNT_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         boolean var22;
         label29: {
            class_2769 var15 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var15 instanceof class_2746) {
               class_2746 _getbp16 = (class_2746)var15;
               if ((Boolean)blockstate.method_11654(_getbp16)) {
                  var22 = true;
                  break label29;
               }
            }

            var22 = false;
         }

         if (var22) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var12 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
            class_2680 var23;
            if (var12 instanceof class_2746) {
               class_2746 _withbp17 = (class_2746)var12;
               var23 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp17, true);
            } else {
               var23 = BurntModBlocks.BURNT_LOG.method_9564();
            }

            class_2680 _bs = var23;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
