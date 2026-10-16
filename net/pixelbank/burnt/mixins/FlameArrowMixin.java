package net.pixelbank.burnt.mixins;

import net.minecraft.class_1665;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.ArrowBurnProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1665.class})
public class FlameArrowMixin {
   @Inject(
      method = {"onHitBlock"},
      at = {@At("HEAD")}
   )
   private void burnt$onFireArrowHitBlock(class_3965 result, CallbackInfo ci) {
      class_1665 self = (class_1665)this;
      if (!self.method_37908().method_8608() && self.method_5809() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get() && (Boolean)BurntBasicConfigConfiguration.FLAME_BOW.get()) {
         class_2338 pos = result.method_17777();
         double x = (double)pos.method_10263();
         double y = (double)pos.method_10264();
         double z = (double)pos.method_10260();
         class_1936 level = self.method_37908();
         int delay = 20 + self.method_37908().method_8409().method_43048(41);
         BurntMod.queueServerWork(delay, () -> {
            ArrowBurnProcedure.execute(level, x, y, z);
            ArrowBurnProcedure.execute(level, x + (double)1.0F, y, z);
            ArrowBurnProcedure.execute(level, x - (double)1.0F, y, z);
            ArrowBurnProcedure.execute(level, x, y, z + (double)1.0F);
            ArrowBurnProcedure.execute(level, x, y, z - (double)1.0F);
            ArrowBurnProcedure.execute(level, x, y + (double)1.0F, z);
            ArrowBurnProcedure.execute(level, x, y - (double)1.0F, z);
         });
      }

   }
}
