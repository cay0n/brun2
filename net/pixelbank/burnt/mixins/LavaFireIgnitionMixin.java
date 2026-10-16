package net.pixelbank.burnt.mixins;

import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3616;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.WillitburnProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_3616.class})
public class LavaFireIgnitionMixin {
   @Redirect(
      method = {"randomTick"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/level/Level;setBlockAndUpdate(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z"
)
   )
   private boolean burnt$onLavaFirePlaced(class_1937 level, class_2338 firePos, class_2680 newState) {
      if (!level.method_8608() && newState.method_27852(class_2246.field_10036) && !(Boolean)BurntBasicConfigConfiguration.LAVA_BURN.get()) {
         return false;
      } else {
         boolean placed = level.method_8501(firePos, newState);
         if (placed && !level.method_8608() && newState.method_27852(class_2246.field_10036) && (Boolean)BurntBasicConfigConfiguration.VANILLA_BURN.get()) {
            WillitburnProcedure.execute(level, (double)firePos.method_10263(), (double)firePos.method_10264(), (double)firePos.method_10260());
         }

         return placed;
      }
   }
}
