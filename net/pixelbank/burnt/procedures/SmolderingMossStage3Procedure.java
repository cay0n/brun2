package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingMossStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
            return;
         }

         if (Math.random() <= 0.1) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
         }
      }

   }
}
