package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.compat.ImmersiveWindsBridge;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindWakerProcedure {
   public static void execute(class_1936 world) {
      if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
         if (!world.method_8608()) {
            if (ImmersiveWindsBridge.isActive()) {
               BurntModVariables.MapVariables mv = BurntModVariables.MapVariables.get(world);
               double newSpeed = ImmersiveWindsBridge.getBurntSpeed();
               double newAngle = ImmersiveWindsBridge.getBurntAngle();
               boolean changed = false;
               if (Math.abs(newSpeed - mv.windSpeed) > 0.1) {
                  mv.windSpeed = newSpeed;
                  changed = true;
               }

               if (Math.abs(newAngle - mv.windAngle) > 0.1) {
                  mv.windAngle = newAngle;
                  changed = true;
               }

               if (changed) {
                  mv.markSyncDirty();
               }

            } else {
               BurntModVariables.MapVariables mv = BurntModVariables.MapVariables.get(world);
               boolean changed = false;
               long gameTime = world.method_8401().method_188();
               if (!mv.windSpeedLock) {
                  if (gameTime % 150L == 0L && Math.random() <= (double)0.25F) {
                     double r = Math.random();
                     boolean targetChanged = false;
                     int newTarget = 0;
                     if (r < 0.01) {
                        newTarget = class_3532.method_15395(world.method_8409(), 31, 50);
                        targetChanged = true;
                     } else if (r < 0.1) {
                        newTarget = class_3532.method_15395(world.method_8409(), 21, 30);
                        targetChanged = true;
                     } else if (r < 0.3) {
                        newTarget = class_3532.method_15395(world.method_8409(), 11, 20);
                        targetChanged = true;
                     } else if (r < 0.4) {
                        newTarget = class_3532.method_15395(world.method_8409(), 0, 10);
                        targetChanged = true;
                     }

                     if (targetChanged) {
                        mv.windTargetSpeed = (double)newTarget;
                        changed = true;
                     }
                  }

                  double speed = mv.windBaseSpeed;
                  double newSpeed = Math.max((double)0.0F, Math.min((double)100.0F, speed + (mv.windTargetSpeed - speed) * 0.05));
                  if (Math.abs(newSpeed - speed) > 0.01) {
                     mv.windBaseSpeed = newSpeed;
                     changed = true;
                  }

                  if (gameTime % 5L == 0L) {
                     if (mv.gustTimer <= (double)0.0F) {
                        if (gameTime % 20L == 0L) {
                           double gustStartChance = 0.05 + 0.2 * (mv.windBaseSpeed / (double)100.0F);
                           if (Math.random() < gustStartChance) {
                              mv.gustTimer = (double)class_3532.method_15395(world.method_8409(), 40, 140);
                              mv.gustTarget = class_3532.method_15366(world.method_8409(), 0.3, (double)1.0F);
                              mv.gustMaxAdd = (double)class_3532.method_15395(world.method_8409(), 10, 35);
                              changed = true;
                           }
                        }
                     } else {
                        mv.gustTimer = Math.max((double)0.0F, mv.gustTimer - (double)5.0F);
                        changed = true;
                        double gs = mv.gustStrength;
                        double newGs = Math.max((double)0.0F, Math.min((double)1.0F, gs + (mv.gustTarget - gs) * 0.2));
                        if (Math.abs(newGs - gs) > 0.001) {
                           mv.gustStrength = newGs;
                           changed = true;
                        }
                     }

                     if (mv.gustTimer <= (double)0.0F) {
                        if (mv.gustTarget != (double)0.0F) {
                           mv.gustTarget = (double)0.0F;
                           changed = true;
                        }

                        double gs = mv.gustStrength;
                        double newGs = Math.max((double)0.0F, Math.min((double)1.0F, gs + ((double)0.0F - gs) * 0.08));
                        if (Math.abs(newGs - gs) > 0.001) {
                           mv.gustStrength = newGs;
                           changed = true;
                        }
                     }

                     if (mv.gustStrength > 0.2 && gameTime % 10L == 0L) {
                        double jitterMax = (double)2.0F + (double)10.0F * mv.gustStrength;
                        mv.windAngle = (mv.windAngle + class_3532.method_15366(world.method_8409(), -jitterMax, jitterMax) + (double)360.0F) % (double)360.0F;
                        changed = true;
                     }
                  }

                  double gustAdd = mv.gustStrength * mv.gustMaxAdd;
                  double finalSpeed = Math.max((double)0.0F, Math.min((double)100.0F, mv.windBaseSpeed + gustAdd));
                  if (Math.abs(finalSpeed - mv.windSpeed) > 0.01) {
                     mv.windSpeed = finalSpeed;
                     changed = true;
                  }
               }

               if (!mv.windAngleLock && gameTime % 100L == 0L) {
                  double angle = mv.windAngle;
                  double maxTurn = 1.2;
                  double delta = (mv.windTargetAngle - angle) % (double)360.0F - (double)180.0F;
                  delta = Math.max(-maxTurn, Math.min(maxTurn, delta));
                  double newAngle = (angle + delta + (double)360.0F) % (double)360.0F;
                  if (Math.abs(newAngle - angle) > 0.001) {
                     mv.windAngle = newAngle;
                     changed = true;
                  }
               }

               if (changed) {
                  mv.markSyncDirty();
               }

            }
         }
      }
   }
}
