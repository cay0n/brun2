package net.pixelbank.burnt.mixins;

import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_3937;
import net.minecraft.class_702;
import net.minecraft.class_703;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.mixins.accessor.ParticleAccessor;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.procedures.WindMultiplyerProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_702.class})
public class ParticleEngineAddMixin {
   @Inject(
      method = {"add(Lnet/minecraft/client/particle/Particle;)V"},
      at = {@At("HEAD")}
   )
   private void burnt$windifyParticles(class_703 p, CallbackInfo ci) {
      class_310 mc = class_310.method_1551();
      class_1937 level = mc.field_1687;
      if (level != null) {
         if (p instanceof class_3937) {
            if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
               BurntModVariables.MapVariables vars = BurntModVariables.MapVariables.get(level);
               double windSpeed = vars.windSpeed;
               double windAngleDeg = vars.windAngle;
               double speed01 = Math.max((double)0.0F, Math.min((double)1.0F, windSpeed / (double)10.0F));
               if (!(speed01 <= (double)0.0F)) {
                  double rad = windAngleDeg * (Math.PI / 180D);
                  double toX = -Math.sin(rad);
                  double toZ = Math.cos(rad);
                  double windMulti = WindMultiplyerProcedure.execute(level, (double)0.0F, (double)0.0F, (double)0.0F);
                  windMulti = Math.max((double)0.0F, windMulti);
                  double k = 0.08 * windMulti;
                  double pushX = toX * speed01 * k;
                  double pushZ = toZ * speed01 * k;
                  ParticleAccessor a = (ParticleAccessor)p;
                  a.burnt$setXd(a.burnt$getXd() + pushX);
                  a.burnt$setZd(a.burnt$getZd() + pushZ);
               }
            }
         }
      }
   }
}
