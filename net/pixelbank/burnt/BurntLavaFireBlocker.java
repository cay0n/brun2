package net.pixelbank.burnt;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_3486;

public final class BurntLavaFireBlocker {
   private static final Map<String, Long> ALLOW_FIRE_UNTIL = new ConcurrentHashMap();

   private BurntLavaFireBlocker() {
   }

   public static String key(class_1937 level, class_2338 pos) {
      String var10000 = level.method_27983().method_29177().toString();
      return var10000 + ":" + pos.method_10063();
   }

   public static void markEntityPlaced(class_1937 level, class_2338 pos) {
      ALLOW_FIRE_UNTIL.put(key(level, pos), level.method_8510() + 60L);
   }

   public static boolean isEntityPlaced(class_1937 level, class_2338 pos) {
      Long until = (Long)ALLOW_FIRE_UNTIL.get(key(level, pos));
      return until != null && until >= level.method_8510();
   }

   public static boolean isNearLava(class_1937 level, class_2338 pos) {
      int radius = 2;

      for(int dx = -radius; dx <= radius; ++dx) {
         for(int dy = -radius; dy <= radius; ++dy) {
            for(int dz = -radius; dz <= radius; ++dz) {
               if ((dx != 0 || dy != 0 || dz != 0) && level.method_8316(pos.method_10069(dx, dy, dz)).method_15767(class_3486.field_15518)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void cleanupStale(long now) {
      ALLOW_FIRE_UNTIL.entrySet().removeIf((e) -> (Long)e.getValue() < now);
   }
}
