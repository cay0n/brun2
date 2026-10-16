package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1959;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_6880;
import net.pixelbank.burnt.util.BurntTags;

public class BiomeChanceProcedure {
   public static double execute(class_1936 world, double x, double y, double z) {
      double chance = (double)100.0F;
      class_6880<class_1959> biome = world.method_23753(class_2338.method_49637(x, y, z));
      if (biome.method_40220(BurntTags.BIOME_INCREASED_FIRE_BURNOUT)) {
         chance -= (double)10.0F;
      }

      if (biome.method_40220(BurntTags.BIOME_IS_COLD)) {
         chance -= (double)10.0F;
      }

      if (biome.method_40220(BurntTags.BIOME_IS_WET)) {
         chance -= (double)20.0F;
      }

      if (biome.method_40220(BurntTags.BIOME_IS_SWAMP)) {
         chance -= (double)25.0F;
      }

      if (biome.method_40226(class_2960.method_60654("dark_forest"))) {
         chance -= (double)25.0F;
      }

      return Math.max((double)0.0F, Math.min((double)100.0F, chance));
   }
}
