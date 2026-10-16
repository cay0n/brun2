package net.pixelbank.burnt.util;

import net.minecraft.class_2338;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.procedures.ParticleWindMultiplyerProcedure;
import net.pixelbank.burnt.procedures.WindAngleXProcedure;
import net.pixelbank.burnt.procedures.WindAngleZProcedure;

public final class BurntDistantSmoke {
   private static final double NEAR_CUTOFF = (double)28.0F;
   private static final int MAX_EMITS_PER_TICK = 4;
   private static final int PARTICLES_PER_EMIT = 2;
   private static final int EMBERS_PER_EMIT = 1;
   private static final int FLAMES_PER_EMIT = 1;
   private static final double FLAME_EMIT_CHANCE = (double)0.5F;
   private static final int LIFT_SEARCH = 8;
   private static long lastTick = -1L;
   private static int emittedThisTick = 0;

   public static boolean emit(class_3218 level, double x, double y, double z) {
      double range = (Double)BurntBasicConfigConfiguration.SMOKE_PARTICLE_RANGE.get();
      if (range <= (double)0.0F) {
         return false;
      } else if (!(Boolean)BurntBasicConfigConfiguration.SMOKE.get()) {
         return false;
      } else if (BurntDimensions.isDisabled(level)) {
         return false;
      } else {
         double _density = BurntSmokeBudget.densityFactor();
         if (_density <= (double)0.0F) {
            return false;
         } else if (_density < (double)1.0F && level.method_8409().method_43058() >= _density) {
            return false;
         } else if (!BurntSmokeBudget.allowSpawn(level.method_8409())) {
            return false;
         } else {
            int lift = -1;

            for(int i = 0; i < 8; ++i) {
               if (level.method_8320(class_2338.method_49637(x, y + (double)i, z)).method_26164(BurntTags.BLOCK_AIR)) {
                  lift = i;
                  break;
               }
            }

            if (lift < 0) {
               return false;
            } else {
               double baseY = y;
               y += (double)lift;
               long now = level.method_8510();
               if (now != lastTick) {
                  lastTick = now;
                  emittedThisTick = 0;
               }

               if (emittedThisTick >= 4) {
                  return false;
               } else {
                  double vx = (double)0.0F;
                  double vz = (double)0.0F;
                  if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
                     double mult = ParticleWindMultiplyerProcedure.execute(level, x, y, z);
                     vx = WindAngleXProcedure.execute(level) / (double)25.0F * mult;
                     vz = WindAngleZProcedure.execute(level) / (double)25.0F * mult;
                  }

                  double maxSq = range * range;
                  double nearSq = (double)784.0F;
                  boolean sent = false;

                  for(class_3222 player : level.method_18456()) {
                     double d = player.method_5649(x, y, z);
                     if (!(d <= nearSq) && !(d > maxSq)) {
                        for(int i = 0; i < 2; ++i) {
                           double px = x + class_3532.method_15366(level.method_8409(), -1.1, 1.1);
                           double py = y + class_3532.method_15366(level.method_8409(), -0.3, 1.4);
                           double pz = z + class_3532.method_15366(level.method_8409(), -1.1, 1.1);
                           level.method_14166(player, BurntModParticleTypes.FLAME_SMOKE, true, px, py, pz, 0, vx, class_3532.method_15366(level.method_8409(), 0.02, 0.08), vz, (double)1.0F);
                        }

                        for(int i = 0; i < 1; ++i) {
                           double ex = x + class_3532.method_15366(level.method_8409(), (double)-0.5F, (double)0.5F);
                           double ey = y + class_3532.method_15366(level.method_8409(), -0.8, 0.2);
                           double ez = z + class_3532.method_15366(level.method_8409(), (double)-0.5F, (double)0.5F);
                           level.method_14166(player, BurntModParticleTypes.FIRE_PARTICLE, true, ex, ey, ez, 0, vx, class_3532.method_15366(level.method_8409(), (double)0.25F, 0.45), vz, (double)1.0F);
                        }

                        if (level.method_8409().method_43058() < (double)0.5F) {
                           for(int i = 0; i < 1; ++i) {
                              double fx = x + class_3532.method_15366(level.method_8409(), -0.3, 0.3);
                              double fy = baseY + class_3532.method_15366(level.method_8409(), -1.15, (double)-0.75F);
                              double fz = z + class_3532.method_15366(level.method_8409(), -0.3, 0.3);
                              level.method_14166(player, BurntModParticleTypes.FLAMES, true, fx, fy, fz, 0, (double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F);
                           }
                        }

                        sent = true;
                     }
                  }

                  if (sent) {
                     ++emittedThisTick;
                  }

                  return sent;
               }
            }
         }
      }
   }

   private BurntDistantSmoke() {
   }
}
