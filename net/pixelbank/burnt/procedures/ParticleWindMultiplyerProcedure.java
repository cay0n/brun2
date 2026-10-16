package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.util.BurntTags;

public class ParticleWindMultiplyerProcedure {
   public static double execute(class_1936 world, double x, double y, double z) {
      if (!world.method_22348(class_2338.method_49637(x, y, z))) {
         return (double)0.0F;
      } else {
         double biomeFactor = (double)0.0F;
         double h = (double)0.0F;
         double heightFactor = (double)0.0F;
         double multi = (double)0.0F;
         double yCoord = (double)0.0F;
         double yMultiplyer = (double)0.0F;
         biomeFactor = (double)1.0F;
         if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_WINDY)) {
            biomeFactor = (double)2.0F;
         } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_IS_CALM)) {
            biomeFactor = (double)0.5F;
         } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_CAVE)) {
            biomeFactor = (double)0.0F;
         }

         if (y >= (double)64.0F) {
            heightFactor = y / (double)100.0F;
         } else {
            heightFactor = (double)0.5F;
         }

         multi = biomeFactor * heightFactor;
         return (double)Math.round(Math.pow((double)10.0F, (double)2.0F) * multi) / Math.pow((double)10.0F, (double)2.0F);
      }
   }
}
