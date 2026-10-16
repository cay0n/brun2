package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class BiomeSpecificProcedure {
   public static double execute(class_1936 world, double x, double y, double z) {
      double newSpread = (double)0.0F;
      newSpread = (Double)BurntBasicConfigConfiguration.BURN_SPREAD.get();
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

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_SPARSE)) {
         newSpread -= (double)10.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_WET)) {
         newSpread -= (double)20.0F;
      }

      if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_SWAMP)) {
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
