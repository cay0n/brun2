package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class SmallLogsTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.SMALL_BURNT_LOG.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               class_2769 var13 = blockstate.method_26204().method_9595().method_11663("stage");
               int var10000;
               if (var13 instanceof class_2758) {
                  class_2758 _getip21 = (class_2758)var13;
                  var10000 = (Integer)blockstate.method_11654(_getip21);
               } else {
                  var10000 = -1;
               }

               if (var10000 == 1) {
                  SmallLogsStage1Procedure.execute(world, x, y, z);
               } else {
                  var13 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var13 instanceof class_2758) {
                     class_2758 _getip23 = (class_2758)var13;
                     var10000 = (Integer)blockstate.method_11654(_getip23);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 2) {
                     SmallLogsStage2Procedure.execute(world, x, y, z);
                  } else {
                     var13 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var13 instanceof class_2758) {
                        class_2758 _getip25 = (class_2758)var13;
                        var10000 = (Integer)blockstate.method_11654(_getip25);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 3) {
                        SmallLogsStage3Procedure.execute(world, x, y, z);
                     }
                  }
               }
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMALL_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
