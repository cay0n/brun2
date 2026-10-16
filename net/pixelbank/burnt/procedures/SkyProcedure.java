package net.pixelbank.burnt.procedures;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.class_1936;
import net.minecraft.class_2960;
import net.pixelbank.burnt.client.RenderUtils;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

@Environment(EnvType.CLIENT)
public class SkyProcedure {
   public static volatile float targetIntensity = 0.0F;
   private static float currentIntensity = 0.0F;
   private static final float LERP_FACTOR = 0.08F;
   private static final int SKY_COLOR = 13393971;

   public static void execute(class_1936 world, WorldRenderContext context) {
      if (context != null) {
         if (!(Boolean)BurntBasicConfigConfiguration.HEAT_HAZE.get()) {
            currentIntensity = 0.0F;
         } else {
            currentIntensity += (targetIntensity - currentIntensity) * 0.08F;
            if (currentIntensity > 0.0F) {
               int configLevel = (Integer)BurntBasicConfigConfiguration.HEAT_HAZE_INTENSITY.get();
               if (configLevel <= 0) {
                  return;
               }

               float scaledIntensity = currentIntensity * ((float)configLevel * 0.6F / 10.0F);
               RenderUtils.renderCustomSkybox(context, class_2960.method_60654("burnt:textures/screens/red_sky.png"), 13393971, scaledIntensity);
            }

         }
      }
   }
}
