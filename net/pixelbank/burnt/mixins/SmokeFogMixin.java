package net.pixelbank.burnt.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_758;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.SmokeFogProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_758.class})
public class SmokeFogMixin {
   @Inject(
      method = {"setupFog"},
      at = {@At("TAIL")}
   )
   private static void burnt$smokeFog(class_4184 camera, class_758.class_4596 fogMode, float renderDistance, boolean useFog, float partialTick, CallbackInfo ci) {
      float intensity = SmokeFogProcedure.currentIntensity;
      if (!(intensity < 0.05F)) {
         int configLevel = (Integer)BurntBasicConfigConfiguration.SMOKE_FOG_INTENSITY.get();
         if (configLevel > 0) {
            float minFogBlocks = 200.0F / (float)Math.pow((double)((float)configLevel * 0.6F), 1.523);
            float vanillaNear = RenderSystem.getShaderFogStart();
            float fogNear = class_3532.method_16439(intensity, vanillaNear, 0.0F);
            float fogEnd = class_3532.method_16439(intensity, renderDistance, minFogBlocks);
            RenderSystem.setShaderFogStart(fogNear);
            RenderSystem.setShaderFogEnd(fogEnd);
         }
      }
   }
}
