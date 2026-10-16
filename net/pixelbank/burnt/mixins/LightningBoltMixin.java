package net.pixelbank.burnt.mixins;

import net.minecraft.class_1538;
import net.minecraft.class_2338;
import net.minecraft.class_5554;
import net.pixelbank.burnt.BurntLightningRodGuard;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.LightningStrikeProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1538.class})
public class LightningBoltMixin {
   @Unique
   private boolean burnt$struck = false;

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void burnt$onFirstTick(CallbackInfo ci) {
      class_1538 self = (class_1538)this;
      if (!self.method_37908().method_8608() && !this.burnt$struck) {
         this.burnt$struck = true;
         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            class_2338 boltPos = self.method_24515();
            boolean atRod = self.method_37908().method_8320(boltPos).method_26204() instanceof class_5554;
            boolean belowRod = self.method_37908().method_8320(boltPos.method_10074()).method_26204() instanceof class_5554;
            if (!atRod && !belowRod) {
               if (!(Boolean)BurntBasicConfigConfiguration.LIGHTNING_IGNITES.get()) {
                  BurntLightningRodGuard.markStrikeNoBurn(boltPos, self.method_37908().method_8510());
               } else {
                  LightningStrikeProcedure.execute(self.method_37908(), self.method_23317(), self.method_23318(), self.method_23321(), self);
               }
            } else {
               class_2338 rodPos = atRod ? boltPos : boltPos.method_10074();
               BurntLightningRodGuard.markRodStruck(rodPos, self.method_37908().method_8510());
            }
         }
      }
   }
}
