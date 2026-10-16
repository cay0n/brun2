package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class BurningGrassPlacementConditionProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      class_2680 below = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z));
      if (below.method_26204() != BurntModBlocks.BURNT_GRASS && below.method_26204() != BurntModBlocks.SMOLDERING_GRASS && below.method_26204() != BurntModBlocks.SMOLDERING_GRASS_START && below.method_26204() != BurntModBlocks.RECOVERING_GRASS && below.method_26204() != class_2246.field_10219 && below.method_26204() != class_2246.field_28681) {
         return below.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_GRASS) || below.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || below.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || below.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS) || below.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || below.method_26164(BurntTags.BLOCK_IW_GRASSY_BLOCKS) || below.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS);
      } else {
         return true;
      }
   }
}
