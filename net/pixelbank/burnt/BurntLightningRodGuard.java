package net.pixelbank.burnt;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2338;

public final class BurntLightningRodGuard {
   private static final Map<Long, Long> ROD_STRUCK = new ConcurrentHashMap();
   private static final Map<Long, Long> STRIKE_NO_BURN = new ConcurrentHashMap();

   private BurntLightningRodGuard() {
   }

   public static void markRodStruck(class_2338 rodPos, long gameTime) {
      ROD_STRUCK.put(rodPos.method_10063(), gameTime + 20L);
   }

   public static boolean isNearStruckRod(long gameTime, class_2338 firePos) {
      for(Map.Entry<Long, Long> e : ROD_STRUCK.entrySet()) {
         if ((Long)e.getValue() >= gameTime && firePos.method_19771(class_2338.method_10092((Long)e.getKey()), (double)4.0F)) {
            return true;
         }
      }

      return false;
   }

   public static void markStrikeNoBurn(class_2338 strikePos, long gameTime) {
      STRIKE_NO_BURN.put(strikePos.method_10063(), gameTime + 20L);
   }

   public static boolean isNearNoBurnStrike(long gameTime, class_2338 firePos) {
      for(Map.Entry<Long, Long> e : STRIKE_NO_BURN.entrySet()) {
         if ((Long)e.getValue() >= gameTime && firePos.method_19771(class_2338.method_10092((Long)e.getKey()), (double)4.0F)) {
            return true;
         }
      }

      return false;
   }

   public static void cleanupStale(long gameTime) {
      ROD_STRUCK.entrySet().removeIf((e) -> (Long)e.getValue() < gameTime);
      STRIKE_NO_BURN.entrySet().removeIf((e) -> (Long)e.getValue() < gameTime);
   }
}
