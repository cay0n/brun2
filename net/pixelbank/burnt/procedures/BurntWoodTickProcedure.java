package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntWoodTickProcedure {
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
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  class_2769 var14 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var14 instanceof class_2758) {
                     class_2758 _getip24 = (class_2758)var14;
                     var10000 = (Integer)blockstate.method_11654(_getip24);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     BurntWoodStage1Procedure.execute(world, x, y, z);
                  } else {
                     var14 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var14 instanceof class_2758) {
                        class_2758 _getip26 = (class_2758)var14;
                        var10000 = (Integer)blockstate.method_11654(_getip26);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntWoodStage2Procedure.execute(world, x, y, z);
                     } else {
                        var14 = blockstate.method_26204().method_9595().method_11663("stage");
                        if (var14 instanceof class_2758) {
                           class_2758 _getip28 = (class_2758)var14;
                           var10000 = (Integer)blockstate.method_11654(_getip28);
                        } else {
                           var10000 = -1;
                        }

                        if (var10000 == 3) {
                           BurntWoodStage3Procedure.execute(world, x, y, z);
                        }
                     }
                  }
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.1) {
            SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
         }
      }

   }
}
