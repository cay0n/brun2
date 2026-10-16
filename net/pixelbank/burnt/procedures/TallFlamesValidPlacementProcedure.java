package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_2350.class_2352;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class TallFlamesValidPlacementProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8401().method_156()) {
         if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10124 || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.TALL_FLAMES) && (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10597 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.BURNT_VINE)) {
            if (getDirectionFromBlockState(blockstate) == class_2350.field_11039 && (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS) || world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_MC_STAIRS))) {
               return true;
            }

            if (getDirectionFromBlockState(blockstate) == class_2350.field_11034 && (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_MC_LOGS) || world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_MC_STAIRS))) {
               return true;
            }

            if (getDirectionFromBlockState(blockstate) == class_2350.field_11043 && (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_MC_LOGS) || world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_MC_STAIRS))) {
               return true;
            }

            if (getDirectionFromBlockState(blockstate) == class_2350.field_11035 && (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_MC_LOGS) || world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_MC_STAIRS))) {
               return true;
            }
         }
      } else if (world.method_8401().method_156()) {
         return false;
      }

      return false;
   }

   private static class_2350 getDirectionFromBlockState(class_2680 blockState) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663("facing");
      if (prop instanceof class_2753 dp) {
         return (class_2350)blockState.method_11654(dp);
      } else {
         prop = blockState.method_26204().method_9595().method_11663("axis");
         class_2350 var10000;
         if (prop instanceof class_2754 ep) {
            if (ep.method_11898().toArray()[0] instanceof class_2350.class_2351) {
               var10000 = class_2350.method_10169((class_2350.class_2351)blockState.method_11654(ep), class_2352.field_11056);
               return var10000;
            }
         }

         var10000 = class_2350.field_11043;
         return var10000;
      }
   }
}
