package net.pixelbank.burnt.mixins;

import net.minecraft.class_14;
import net.minecraft.class_2338;
import net.minecraft.class_7;
import net.minecraft.class_9316;
import net.pixelbank.burnt.util.BurntTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_14.class})
public class FirePathTypeMixin {
   @Inject(
      method = {"getPathTypeStatic(Lnet/minecraft/world/level/pathfinder/PathfindingContext;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void burnt$markFireBlocksDangerous(class_9316 context, class_2338.class_2339 pos, CallbackInfoReturnable<class_7> cir) {
      class_7 current = (class_7)cir.getReturnValue();
      if ((current == class_7.field_7 || current == class_7.field_12) && context.method_57623(pos).method_26164(BurntTags.BLOCK_ON_FIRE)) {
         cir.setReturnValue(class_7.field_3);
      }

   }
}
