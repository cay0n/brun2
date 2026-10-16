package net.pixelbank.burnt.compat;

import java.lang.reflect.Field;
import net.fabricmc.loader.api.FabricLoader;
import net.pixelbank.burnt.BurntMod;

public class ImmersiveWindsBridge {
   private static final boolean MOD_PRESENT = FabricLoader.getInstance().isModLoaded("immersivewind");
   private static Field strengthField;
   private static Field directionField;
   private static boolean active = false;

   public static boolean isActive() {
      return active;
   }

   public static double getBurntSpeed() {
      try {
         int iwStrength = (Integer)strengthField.get((Object)null);
         return Math.min((double)100.0F, (double)iwStrength * 3.3333333333333335);
      } catch (Exception var1) {
         return (double)0.0F;
      }
   }

   public static double getBurntAngle() {
      try {
         int iwDirection = (Integer)directionField.get((Object)null);
         return (double)((iwDirection - 90 + 360) % 360);
      } catch (Exception var1) {
         return (double)0.0F;
      }
   }

   static {
      if (MOD_PRESENT) {
         try {
            Class<?> windManager = Class.forName("net.vibzz.immersivewind.wind.WindManager");
            strengthField = windManager.getField("currentWindStrength");
            directionField = windManager.getField("currentWindDirection");
            active = true;
            BurntMod.LOGGER.info("[Burnt] Immersive Winds detected - wind system bridged.");
         } catch (Exception e) {
            BurntMod.LOGGER.warn("[Burnt] Immersive Winds found but bridge failed: {}", e.getMessage());
         }
      }

   }
}
