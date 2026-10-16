package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingCactusTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_CACTUS.method_9564(), 3);
            return;
         }

         if (Math.random() <= (double)0.5F) {
            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10029) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), BurntModBlocks.SMOLDERING_CACTUS.method_9564(), 3);
            } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10029 && Math.random() <= (double)0.5F) {
               world.method_8652(class_2338.method_49637(x, y - (double)1.0F, z), BurntModBlocks.SMOLDERING_CACTUS.method_9564(), 3);
            }
         }

         if (Math.random() <= 0.1) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_CACTUS.method_9564(), 3);
         }
      }

   }
}
