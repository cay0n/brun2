package net.pixelbank.burnt.mixins;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import net.minecraft.class_9236;
import net.pixelbank.burnt.procedures.ExtinguishBlockProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_9236.class})
public class WindChargeMixin {
   @Inject(
      method = {"onHitBlock"},
      at = {@At("HEAD")}
   )
   private void burnt$extinguishOnWindChargeHit(class_3965 hitResult, CallbackInfo ci) {
      class_9236 self = (class_9236)this;
      class_1937 level = self.method_37908();
      if (!level.method_8608()) {
         class_2338 pos = hitResult.method_17777();
         ExtinguishBlockProcedure.execute(level, (double)pos.method_10263() + (double)0.5F, (double)pos.method_10264() + (double)0.5F, (double)pos.method_10260() + (double)0.5F, false);
      }
   }
}
