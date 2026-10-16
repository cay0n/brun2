package net.pixelbank.burnt.procedures;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

@Environment(EnvType.CLIENT)
public class SmokeFogProcedure {
   public static volatile float targetIntensity = 0.0F;
   public static float currentIntensity = 0.0F;
   private static final float LERP_IN = 0.012F;
   private static final float LERP_OUT = 0.008F;

   public static void tick() {
      if (!(Boolean)BurntBasicConfigConfiguration.SMOKE_FOG.get()) {
         currentIntensity = 0.0F;
      } else {
         float factor = targetIntensity > currentIntensity ? 0.012F : 0.008F;
         currentIntensity += (targetIntensity - currentIntensity) * factor;
         if (targetIntensity < 0.01F && currentIntensity < 0.05F) {
            currentIntensity = 0.0F;
         }

      }
   }
}
