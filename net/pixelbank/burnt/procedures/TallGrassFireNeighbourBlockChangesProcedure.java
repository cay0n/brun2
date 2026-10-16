package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class TallGrassFireNeighbourBlockChangesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2248 belowBlock = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204();
         boolean validSupport = belowBlock == BurntModBlocks.BURNT_GRASS || belowBlock == BurntModBlocks.SMOLDERING_GRASS || belowBlock == BurntModBlocks.SMOLDERING_GRASS_START || belowBlock == BurntModBlocks.RECOVERING_GRASS;
         if (!validSupport) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         }
      }

   }
}
