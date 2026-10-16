package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntGrassStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
            return;
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 500) <= burnTime) {
            class_2338 var10001 = class_2338.method_49637(x, y, z);
            class_2769 var10 = BurntModBlocks.BURNT_GRASS.method_9595().method_11663("hot");
            class_2680 var10002;
            if (var10 instanceof class_2746) {
               class_2746 _withbp4 = (class_2746)var10;
               var10002 = (class_2680)BurntModBlocks.BURNT_GRASS.method_9564().method_11657(_withbp4, true);
            } else {
               var10002 = BurntModBlocks.BURNT_GRASS.method_9564();
            }

            world.method_8652(var10001, var10002, 3);
         }
      }

   }
}
