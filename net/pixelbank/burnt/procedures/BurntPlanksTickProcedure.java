package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntPlanksTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var11 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var11 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var11;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (BurntProtection.stopBurning(world, x, y, z)) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_PLANKS.method_9564(), 3);
               return;
            }

            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  class_2769 var14 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var14 instanceof class_2758) {
                     class_2758 _getip25 = (class_2758)var14;
                     var10000 = (Integer)blockstate.method_11654(_getip25);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     BurntPlanksStage1Procedure.execute(world, x, y, z);
                  } else {
                     var14 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var14 instanceof class_2758) {
                        class_2758 _getip27 = (class_2758)var14;
                        var10000 = (Integer)blockstate.method_11654(_getip27);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntPlanksStage2Procedure.execute(world, x, y, z);
                     } else {
                        var14 = blockstate.method_26204().method_9595().method_11663("stage");
                        if (var14 instanceof class_2758) {
                           class_2758 _getip29 = (class_2758)var14;
                           var10000 = (Integer)blockstate.method_11654(_getip29);
                        } else {
                           var10000 = -1;
                        }

                        if (var10000 == 3) {
                           BurntPlanksStage3Procedure.execute(world, x, y, z);
                        }
                     }
                  }
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_PLANKS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }

            if (Math.random() <= (double)0.5F) {
               SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
