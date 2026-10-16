package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1959;
import net.minecraft.class_2338;
import net.minecraft.class_6880;
import net.minecraft.class_1959.class_1963;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.util.BurntTags;

public class IsRainingProcedure {
   public static boolean isGloballyRaining(class_1936 world) {
      return world.method_8401().method_156();
   }

   public static boolean execute(class_1936 world, double x, double y, double z) {
      if (BurntMod.forceRain) {
         return true;
      } else {
         class_2338 pos = class_2338.method_49637(x, y, z);
         class_6880<class_1959> biome = world.method_23753(pos);
         if (!world.method_8401().method_156()) {
            return false;
         } else if (!biome.method_40220(BurntTags.BIOME_MC_IS_OVERWORLD)) {
            return false;
         } else if (biome.method_40220(BurntTags.BIOME_MC_IS_CAVE)) {
            return false;
         } else {
            try {
               if (((class_1959)biome.comp_349()).method_48162(pos) != class_1963.field_9382) {
                  return false;
               }
            } catch (Exception var10) {
               return false;
            }

            if (world.method_8320(pos.method_10074()).method_26164(BurntTags.BLOCK_MC_LEAVES)) {
               return world.method_22348(pos.method_10084());
            } else {
               return world.method_8320(pos).method_26164(BurntTags.BLOCK_MC_LEAVES) ? world.method_22348(pos.method_10084().method_10084()) : world.method_22348(pos.method_10084());
            }
         }
      }
   }
}
