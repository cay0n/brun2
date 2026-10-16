package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindAdjustedChanceProcedure {
   public static double execute(class_1936 world, double x, double y, double z, double baseChance, double dx, double dz) {
      double len = (double)0.0F;
      double speed01 = (double)0.0F;
      double influence01 = (double)0.0F;
      double rad = (double)0.0F;
      double wx = (double)0.0F;
      double wz = (double)0.0F;
      double nx = (double)0.0F;
      double nz = (double)0.0F;
      double dot = (double)0.0F;
      double windMulti = (double)0.0F;
      double effect = (double)0.0F;
      double out = (double)0.0F;
      double mult = (double)0.0F;
      double fromX = (double)0.0F;
      double fromZ = (double)0.0F;
      double dotFrom = (double)0.0F;
      double dotTo = (double)0.0F;
      double upwind = (double)0.0F;
      double downwind = (double)0.0F;
      double expo = (double)0.0F;
      double penalty = (double)0.0F;
      double boost = (double)0.0F;
      double t = (double)0.0F;
      double t2 = (double)0.0F;
      double t4 = (double)0.0F;
      double t8 = (double)0.0F;
      if (baseChance <= (double)0.0F) {
         return (double)0.0F;
      } else if ((Double)BurntBasicConfigConfiguration.WIND_INFLUENCE.get() <= (double)0.0F) {
         return baseChance;
      } else {
         len = Math.sqrt(dx * dx + dz * dz);
         if (len <= 1.0E-6) {
            return baseChance;
         } else {
            nx = dx / len;
            nz = dz / len;
            rad = BurntModVariables.MapVariables.get(world).windAngle * 0.0174532925;
            fromX = Math.sin(rad);
            fromZ = (double)0.0F - Math.cos(rad);
            dotFrom = nx * fromX + nz * fromZ;
            dotTo = (double)0.0F - dotFrom;
            speed01 = BurntModVariables.MapVariables.get(world).windSpeed / (double)100.0F;
            speed01 = Math.max((double)0.0F, Math.min((double)1.0F, speed01));
            influence01 = (Double)BurntBasicConfigConfiguration.WIND_INFLUENCE.get() / (double)10.0F;
            influence01 = Math.max((double)0.0F, Math.min((double)1.0F, influence01));
            windMulti = WindMultiplyerProcedure.execute(world, x, y, z);
            windMulti = Math.max((double)0.0F, Math.min((double)2.0F, windMulti));
            effect = speed01 * influence01 * windMulti;
            effect = Math.max((double)0.0F, Math.min((double)1.0F, effect));
            t = (dotTo + (double)1.0F) / (double)2.0F;
            t = Math.max((double)0.0F, Math.min((double)1.0F, t));
            t2 = t * t;
            t4 = t2 * t2;
            t8 = t4 * t4;
            penalty = t2 * ((double)1.0F - effect) + t8 * effect;
            downwind = Math.max((double)0.0F, dotTo);
            boost = (double)1.0F + 0.35 * effect * downwind;
            out = baseChance * penalty * boost;
            out = Math.max((double)0.0F, Math.min((double)1.0F, out));
            return out;
         }
      }
   }
}
