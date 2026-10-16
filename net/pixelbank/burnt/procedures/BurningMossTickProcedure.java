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

public class BurningMossTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
            return;
         }

         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
            } else {
               class_2769 var11 = blockstate.method_26204().method_9595().method_11663("stage");
               int var10000;
               if (var11 instanceof class_2758) {
                  class_2758 _getip22 = (class_2758)var11;
                  var10000 = (Integer)blockstate.method_11654(_getip22);
               } else {
                  var10000 = -1;
               }

               if (var10000 == 1) {
                  SmolderingMossStage1Procedure.execute(world, x, y, z);
               } else {
                  var11 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var11 instanceof class_2758) {
                     class_2758 _getip24 = (class_2758)var11;
                     var10000 = (Integer)blockstate.method_11654(_getip24);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 2) {
                     SmolderingMossStage2Procedure.execute(world, x, y, z);
                  } else {
                     var11 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var11 instanceof class_2758) {
                        class_2758 _getip26 = (class_2758)var11;
                        var10000 = (Integer)blockstate.method_11654(_getip26);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 3) {
                        SmolderingMossStage3Procedure.execute(world, x, y, z);
                     }
                  }
               }
            }
         } else {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
         }
      }

   }
}
