package net.pixelbank.burnt.mixins;

import net.minecraft.class_1439;
import net.pixelbank.burnt.ai.GolemExtinguishGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1439.class})
public class IronGolemMixin {
   @Inject(
      method = {"registerGoals"},
      at = {@At("TAIL")}
   )
   private void burnt$addGolemGoals(CallbackInfo ci) {
      class_1439 self = (class_1439)this;
      self.field_6201.method_6277(1, new GolemExtinguishGoal(self));
   }
}
