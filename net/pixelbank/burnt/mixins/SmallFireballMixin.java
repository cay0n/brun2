package net.pixelbank.burnt.mixins;

import net.minecraft.class_1677;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_4770;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1677.class})
public class SmallFireballMixin {
   @Inject(
      method = {"onHitBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void burnt$interceptSmallFireball(class_3965 hitResult, CallbackInfo ci) {
      class_1677 self = (class_1677)this;
      class_1937 level = self.method_37908();
      if (!level.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.VANILLA_BURN.get()) {
            class_2338 placePos = hitResult.method_17777().method_10093(hitResult.method_17780());
            if (level.method_8320(placePos).method_26215()) {
               class_2680 wouldBe = class_4770.method_24416(level, placePos);
               if (wouldBe.method_27852(class_2246.field_10036)) {
                  if (!level.method_8320(placePos.method_10074()).method_27852(class_2246.field_10515)) {
                     for(class_2350 d : class_2350.values()) {
                        if (level.method_8320(placePos.method_10093(d)).method_27852(class_2246.field_10540)) {
                           return;
                        }
                     }

                     ci.cancel();
                     level.method_8652(placePos, BurntModBlocks.FIRESTARTER.method_9564(), 11);
                     self.method_31472();
                  }
               }
            }
         }
      }
   }
}
