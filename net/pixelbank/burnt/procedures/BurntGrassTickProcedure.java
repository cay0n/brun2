package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntGrassTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var9;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 2) {
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 var10001 = class_2338.method_49637(x, y, z);
                  class_2769 var10 = BurntModBlocks.BURNT_GRASS.method_9595().method_11663("hot");
                  class_2680 var10002;
                  if (var10 instanceof class_2746) {
                     class_2746 _withbp22 = (class_2746)var10;
                     var10002 = (class_2680)BurntModBlocks.BURNT_GRASS.method_9564().method_11657(_withbp22, true);
                  } else {
                     var10002 = BurntModBlocks.BURNT_GRASS.method_9564();
                  }

                  world.method_8652(var10001, var10002, 3);
               } else {
                  class_2769 _pos = blockstate.method_26204().method_9595().method_11663("stage");
                  if (_pos instanceof class_2758) {
                     class_2758 _getip25 = (class_2758)_pos;
                     var10000 = (Integer)blockstate.method_11654(_getip25);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 2) {
                     if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26225()) {
                        class_2338 _pos = class_2338.method_49637(x, y, z);
                        class_2680 _bs = world.method_8320(_pos);
                        class_2769 var14 = _bs.method_26204().method_9595().method_11663("stage");
                        if (var14 instanceof class_2758) {
                           class_2758 _skipProp = (class_2758)var14;
                           if (_skipProp.method_11898().contains(3)) {
                              world.method_8652(_pos, (class_2680)_bs.method_11657(_skipProp, 3), 3);
                           }
                        }
                     } else {
                        BurntGrassStage2Procedure.execute(world, x, y, z);
                     }
                  } else {
                     _pos = blockstate.method_26204().method_9595().method_11663("stage");
                     if (_pos instanceof class_2758) {
                        class_2758 _getip27 = (class_2758)_pos;
                        var10000 = (Integer)blockstate.method_11654(_getip27);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 3) {
                        BurntGrassStage3Procedure.execute(world, x, y, z);
                     }
                  }
               }
            } else {
               class_2338 var24 = class_2338.method_49637(x, y, z);
               class_2769 var19 = BurntModBlocks.BURNT_GRASS.method_9595().method_11663("hot");
               class_2680 var25;
               if (var19 instanceof class_2746) {
                  class_2746 _withbp28 = (class_2746)var19;
                  var25 = (class_2680)BurntModBlocks.BURNT_GRASS.method_9564().method_11657(_withbp28, true);
               } else {
                  var25 = BurntModBlocks.BURNT_GRASS.method_9564();
               }

               world.method_8652(var24, var25, 3);
            }
         }
      }

   }
}
