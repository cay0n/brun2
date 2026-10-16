package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;

public class BurntBambooStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && Math.random() <= 0.1) {
         BambooExtinguishProcedure.execute(world, x, y, z);
      }

   }
}
