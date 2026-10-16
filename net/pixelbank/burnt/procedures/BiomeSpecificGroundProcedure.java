package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class BiomeSpecificGroundProcedure {
   public static double execute(class_1936 world, double x, double y, double z) {
      double newSpread;
      label65: {
         newSpread = (double)0.0F;
         newSpread = (Double)BurntBasicConfigConfiguration.GROUND_SPREAD.get();
         if (world instanceof class_1937 _lvl1) {
            if (_lvl1.method_8530()) {
               break label65;
            }
         }

         newSpread -= (double)10.0F;
      }

      if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10479 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10214) {
         newSpread += (double)10.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_INCREASED_FIRE_BURNOUT)) {
         newSpread -= (double)10.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_COLD)) {
         newSpread -= (double)10.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_DENSE)) {
         newSpread += (double)10.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_DRY)) {
         newSpread += (double)20.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_HOT)) {
         newSpread += (double)20.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_WET)) {
         newSpread -= (double)20.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_SWAMP)) {
         newSpread -= (double)20.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40226(class_2960.method_60654("dark_forest"))) {
         newSpread -= (double)20.0F;
      }

      if (newSpread <= (double)100.0F && newSpread >= (double)0.0F) {
         return newSpread;
      } else if (newSpread > (double)100.0F) {
         return (double)100.0F;
      } else {
         return newSpread < (double)0.0F ? (double)0.0F : (double)50.0F;
      }
   }
}
