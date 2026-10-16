package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntGrassStartTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
            return;
         }

         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
            } else {
               BurntGrassStage1Procedure.execute(world, x, y, z);
            }
         } else {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
         }
      }

   }
}
