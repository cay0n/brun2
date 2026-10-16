package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_7923;
import net.pixelbank.burnt.util.BurntTags;

public class IsGrassBlockProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10219) {
         return true;
      } else if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("biomeswevegone:lush_grass_block")) {
         return true;
      } else {
         return world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_IW_GRASSY_BLOCKS);
      }
   }
}
