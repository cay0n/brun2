package net.pixelbank.burnt.mixins;

import net.minecraft.class_1922;
import net.minecraft.class_2302;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_2302.class})
public class CropBlockMixin {
   @Inject(
      method = {"mayPlaceOn"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void burnt$mayPlaceOnBurntFarmland(class_2680 state, class_1922 world, class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
      if (state.method_26204() == BurntModBlocks.BURNT_FARMLAND || state.method_26204() == BurntModBlocks.BURNT_FARMLAND_MOIST) {
         cir.setReturnValue(true);
      }

   }
}
