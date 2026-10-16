package net.pixelbank.burnt.util;

import net.minecraft.class_5819;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public final class BurntSmokeBudget {
   private static final int SOFT_CAP = 700;
   private static final int HARD_CAP = 1500;
   private static int alive = 0;
   private static Object lastLevel = null;

   public static void acquire(Object levelRef) {
      if (levelRef != lastLevel) {
         lastLevel = levelRef;
         alive = 0;
      }

      ++alive;
   }

   public static void release() {
      if (alive > 0) {
         --alive;
      }

   }

   public static double densityFactor() {
      double pct = (Double)BurntBasicConfigConfiguration.SMOKE_DENSITY.get();
      if (pct <= (double)0.0F) {
         return (double)0.0F;
      } else {
         return pct >= (double)100.0F ? (double)1.0F : pct / (double)100.0F;
      }
   }

   public static boolean allowSpawn(class_5819 random) {
      int n = alive;
      if (n < 700) {
         return true;
      } else if (n >= 1500) {
         return false;
      } else {
         return random.method_43057() < (float)(1500 - n) / 800.0F;
      }
   }

   public static int liveCount() {
      return alive;
   }

   private BurntSmokeBudget() {
   }
}
