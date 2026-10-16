package net.pixelbank.burnt.mixins;

import net.minecraft.class_1686;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.pixelbank.burnt.procedures.ExtinguishBlockProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1686.class})
public class SplashPotionMixin {
   @Inject(
      method = {"applyWater"},
      at = {@At("HEAD")}
   )
   private void burnt$extinguishOnWaterSplash(CallbackInfo ci) {
      class_1686 self = (class_1686)this;
      class_1937 level = self.method_37908();
      if (!level.method_8608()) {
         class_243 pos = self.method_19538();
         ExtinguishBlockProcedure.execute(level, pos.field_1352, pos.field_1351, pos.field_1350, false);
      }
   }
}
