package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class SmolderingBambooTickProcedure {
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

         if (var10000 >= 1) {
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  BambooExtinguishProcedure.execute(world, x, y, z);
               } else {
                  class_2769 var11 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var11 instanceof class_2758) {
                     class_2758 _getip21 = (class_2758)var11;
                     var10000 = (Integer)blockstate.method_11654(_getip21);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     BurntBambooStage1Procedure.execute(world, x, y, z);
                  } else {
                     var11 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var11 instanceof class_2758) {
                        class_2758 _getip23 = (class_2758)var11;
                        var10000 = (Integer)blockstate.method_11654(_getip23);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntBambooStage2Procedure.execute(world, x, y, z);
                     }
                  }
               }
            } else {
               BambooExtinguishProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
