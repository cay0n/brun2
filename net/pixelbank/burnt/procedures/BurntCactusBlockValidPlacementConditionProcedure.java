package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class BurntCactusBlockValidPlacementConditionProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      return (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_SAND) || world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10029 || world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.SMOLDERING_CACTUS || world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.BURNT_CACTUS) && !world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26225() && !world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26225() && !world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26225() && !world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26225();
   }
}
