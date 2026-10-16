package net.pixelbank.burnt.mixins;

import net.minecraft.class_1511;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2358;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.pixelbank.burnt.BurntLavaFireBlocker;
import net.pixelbank.burnt.BurntLightningRodGuard;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntDimensions;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2358.class})
public class FireBlockOnPlaceMixin {
   @Inject(
      method = {"onPlace"},
      at = {@At("TAIL")}
   )
   private void burnt$onFirePlaced(class_2680 newState, class_1937 level, class_2338 pos, class_2680 oldState, boolean movedByPiston, CallbackInfo ci) {
      if (!level.method_8608()) {
         if (!BurntDimensions.isDisabled(level)) {
            if (!oldState.method_27852(newState.method_26204())) {
               if (level.method_8320(pos).method_27852(class_2246.field_10036)) {
                  if (!(Boolean)BurntBasicConfigConfiguration.LAVA_BURN.get() && BurntLavaFireBlocker.isNearLava(level, pos) && !BurntLavaFireBlocker.isEntityPlaced(level, pos)) {
                     level.method_8650(pos, false);
                     if ((level.method_8510() & 63L) == 0L) {
                        BurntLavaFireBlocker.cleanupStale(level.method_8510());
                     }

                  } else if (!level.method_8320(pos.method_10074()).method_27852(class_2246.field_10515)) {
                     if (!level.method_8320(pos.method_10074()).method_26164(BurntTags.BLOCK_VANILLA_FIRE_BURNS_ON)) {
                        if (level.method_18467(class_1511.class, (new class_238(pos)).method_1014((double)0.5F)).isEmpty()) {
                           for(class_2350 dir : class_2350.values()) {
                              class_2248 n = level.method_8320(pos.method_10093(dir)).method_26204();
                              if (n == class_2246.field_10540 || n == class_2246.field_22423) {
                                 return;
                              }
                           }

                           if (!BurntLightningRodGuard.isNearNoBurnStrike(level.method_8510(), pos)) {
                              if (BurntLightningRodGuard.isNearStruckRod(level.method_8510(), pos)) {
                                 level.method_8650(pos, false);
                              } else if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
                                 if ((Boolean)BurntBasicConfigConfiguration.VANILLA_BURN.get()) {
                                    if (!BurntProtection.isProtected(level, pos)) {
                                       level.method_8652(pos, BurntModBlocks.FIRESTARTER.method_9564(), 11);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
