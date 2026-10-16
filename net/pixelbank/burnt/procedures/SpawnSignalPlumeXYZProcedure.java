package net.pixelbank.burnt.procedures;

import java.util.Objects;
import java.util.Optional;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2489;
import net.minecraft.class_2494;
import net.minecraft.class_2499;
import net.minecraft.class_2519;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntDistantSmoke;
import net.pixelbank.burnt.util.PlumeManager;

public class SpawnSignalPlumeXYZProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 level = (class_3218)world;
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               BurntDistantSmoke.emit(level, x + (double)0.5F, y + (double)1.5F, z + (double)0.5F);
               x += (double)class_3532.method_15395(level.method_8409(), 0, 3);
               y += (double)class_3532.method_15395(level.method_8409(), 0, 3);
               z += (double)class_3532.method_15395(level.method_8409(), 0, 3);
               if ((Boolean)BurntBasicConfigConfiguration.DISTANT_PLUMES.get()) {
                  class_1297 nearest = null;
                  double nearestDistSq = (double)9.0F;

                  for(class_1297 e : level.method_27909()) {
                     if (e.method_5864() == class_1299.field_42456 && e.method_5752().contains("burnt_any_plume")) {
                        double d = e.method_5649(x, y, z);
                        if (d < nearestDistSq) {
                           nearestDistSq = d;
                           nearest = e;
                        }
                     }
                  }

                  if (nearest != null) {
                     PlumeManager.resetLife(nearest.method_5667());
                  }

                  if (world.method_22348(class_2338.method_49637(x, y, z))) {
                     if (!anyPlayerWithin(level, x, y, z, (double)15.0F)) {
                        double particleRange = (Double)BurntBasicConfigConfiguration.SMOKE_PARTICLE_RANGE.get();
                        double plumeFloor = particleRange > (double)0.0F ? particleRange * (double)0.75F : (double)0.0F;
                        boolean inBandDistant = anyPlayerInBand(level, x, y, z, Math.max((double)71.0F, plumeFloor), (double)512.0F);
                        boolean inBandFar = anyPlayerInBand(level, x, y, z, Math.max((double)51.0F, plumeFloor), (double)70.0F);
                        boolean inBandNear = anyPlayerInBand(level, x, y, z, Math.max((double)31.0F, plumeFloor), (double)50.0F);
                        if (inBandDistant || inBandFar || inBandNear) {
                           boolean distantPlumeNear20 = false;
                           boolean plumeNear20 = false;
                           boolean plumeNear10 = false;

                           for(class_1297 e : level.method_27909()) {
                              if (e.method_5864() == class_1299.field_42456) {
                                 double d = e.method_5649(x, y, z);
                                 if (!(d > (double)400.0F)) {
                                    if (e.method_5752().contains("distant_burnt_plume")) {
                                       distantPlumeNear20 = true;
                                    }

                                    if (e.method_5752().contains("burnt_plume")) {
                                       plumeNear20 = true;
                                       if (d <= (double)100.0F) {
                                          plumeNear10 = true;
                                       }
                                    }
                                 }
                              }
                           }

                           if (inBandDistant && !distantPlumeNear20 && Math.random() <= 0.004) {
                              spawnPlume(level, x, y, z, "burnt:tall_smoke_sprite", "distant_burnt_plume", 16.0F);
                           }

                           if (inBandDistant && !plumeNear20 && Math.random() <= 0.004) {
                              spawnPlume(level, x, y, z, "burnt:tall_smoke_sprite_2", "distant_burnt_plume", 8.0F);
                           }

                           if (inBandFar && !plumeNear10) {
                              if (Math.random() <= 0.01) {
                                 spawnPlume(level, x, y, z, "burnt:tall_smoke_sprite_2", "far_burnt_plume", 8.0F);
                              }

                              if (Math.random() <= 0.02) {
                                 spawnPlume(level, x, y, z, "burnt:tall_smoke_sprite", "far_burnt_plume", 12.0F);
                              }

                              if (Math.random() <= 0.02) {
                                 spawnPlume(level, x, y, z, "burnt:smoke_sprite", "far_burnt_plume", 6.0F);
                              }
                           }

                           if (inBandNear && !plumeNear10) {
                              if (Math.random() <= 0.2) {
                                 spawnPlume(level, x, y, z, "burnt:distant_smoke_sprite", "burnt_plume", 4.0F);
                              }

                              if (Math.random() <= 0.2) {
                                 spawnPlume(level, x, y, z, "burnt:tall_smoke_sprite", "burnt_plume", 8.0F);
                              }

                              if (Math.random() <= 0.2) {
                                 spawnPlume(level, x, y, z, "burnt:smoke_sprite", "burnt_plume", 4.0F);
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

   private static boolean anyPlayerWithin(class_3218 level, double x, double y, double z, double radius) {
      double r2 = radius * radius;

      for(class_3222 p : level.method_18456()) {
         if (!p.method_7325() && p.method_5649(x, y, z) <= r2) {
            return true;
         }
      }

      return false;
   }

   private static boolean anyPlayerInBand(class_3218 level, double x, double y, double z, double min, double max) {
      double minSq = min * min;
      double maxSq = max * max;

      for(class_3222 p : level.method_18456()) {
         if (!p.method_7325()) {
            double d = p.method_5649(x, y, z);
            if (d >= minSq && d <= maxSq) {
               return true;
            }
         }
      }

      return false;
   }

   private static void spawnPlume(class_3218 level, double x, double y, double z, String itemId, String primaryTag, float xyScale) {
      class_2487 nbt = new class_2487();
      nbt.method_10582("id", "minecraft:item_display");
      double jx = (level.method_8409().method_43058() - (double)0.5F) * 0.8;
      double jz = (level.method_8409().method_43058() - (double)0.5F) * 0.8;
      double jy = (level.method_8409().method_43058() - (double)0.5F) * 0.4;
      class_2499 pos = new class_2499();
      pos.add(class_2489.method_23241(x + jx));
      pos.add(class_2489.method_23241(y + (double)1.0F + jy));
      pos.add(class_2489.method_23241(z + jz));
      nbt.method_10566("Pos", pos);
      class_2499 motion = new class_2499();
      motion.add(class_2489.method_23241((double)0.0F));
      motion.add(class_2489.method_23241((double)0.0F));
      motion.add(class_2489.method_23241((double)0.0F));
      nbt.method_10566("Motion", motion);
      class_2499 rotation = new class_2499();
      rotation.add(class_2494.method_23244(0.0F));
      rotation.add(class_2494.method_23244(0.0F));
      nbt.method_10566("Rotation", rotation);
      class_2499 tagList = new class_2499();
      tagList.add(class_2519.method_23256(primaryTag));
      tagList.add(class_2519.method_23256("burnt_any_plume"));
      nbt.method_10566("Tags", tagList);
      class_2487 item = new class_2487();
      item.method_10582("id", itemId);
      item.method_10569("count", 1);
      nbt.method_10566("item", item);
      nbt.method_10582("billboard", "center");
      nbt.method_10582("item_display_transform", "none");
      nbt.method_10569("interpolation_duration", 10);
      class_2487 transformation = new class_2487();
      transformation.method_10566("left_rotation", identityQuat());
      transformation.method_10566("right_rotation", identityQuat());
      transformation.method_10566("translation", vec3f(0.0F, 0.0F, 0.0F));
      transformation.method_10566("scale", vec3f(xyScale, xyScale, 0.05F));
      nbt.method_10566("transformation", transformation);
      Optional var10000 = class_1299.method_5892(nbt, level);
      Objects.requireNonNull(level);
      var10000.ifPresent(level::method_8649);
   }

   private static class_2499 identityQuat() {
      class_2499 t = new class_2499();
      t.add(class_2494.method_23244(0.0F));
      t.add(class_2494.method_23244(0.0F));
      t.add(class_2494.method_23244(0.0F));
      t.add(class_2494.method_23244(1.0F));
      return t;
   }

   private static class_2499 vec3f(float a, float b, float c) {
      class_2499 t = new class_2499();
      t.add(class_2494.method_23244(a));
      t.add(class_2494.method_23244(b));
      t.add(class_2494.method_23244(c));
      return t;
   }
}
