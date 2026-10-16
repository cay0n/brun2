package net.pixelbank.burnt.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.BurntMod;

public final class BurntProtection {
   private static final List<BurnBlocker> BLOCKERS = new CopyOnWriteArrayList();

   public static void register(BurnBlocker blocker) {
      if (blocker != null) {
         BLOCKERS.add(blocker);
         BurntMod.LOGGER.info("[Burnt] Burn blocker registered ({} active).", BLOCKERS.size());
      }
   }

   public static boolean isProtected(class_1936 level, class_2338 from, class_2338 to) {
      if (BLOCKERS.isEmpty()) {
         return false;
      } else {
         for(int i = 0; i < BLOCKERS.size(); ++i) {
            BurnBlocker blocker = (BurnBlocker)BLOCKERS.get(i);

            try {
               if (blocker.isProtected(level, from, to)) {
                  return true;
               }
            } catch (Throwable t) {
               BLOCKERS.remove(blocker);
               BurntMod.LOGGER.error("[Burnt] Burn blocker threw and was removed.", t);
            }
         }

         return false;
      }
   }

   public static boolean isProtected(class_1936 level, class_2338 pos) {
      return isProtected(level, pos, pos);
   }

   public static boolean isProtected(class_1936 level, double x, double y, double z) {
      if (BLOCKERS.isEmpty()) {
         return false;
      } else {
         class_2338 pos = class_2338.method_49637(x, y, z);
         return isProtected(level, pos, pos);
      }
   }

   public static boolean isProtected(class_1936 level, double fx, double fy, double fz, double tx, double ty, double tz) {
      return BLOCKERS.isEmpty() ? false : isProtected(level, class_2338.method_49637(fx, fy, fz), class_2338.method_49637(tx, ty, tz));
   }

   public static boolean hasBlockers() {
      return !BLOCKERS.isEmpty();
   }

   public static boolean stopBurning(class_1936 level, double x, double y, double z) {
      return BurntMod.killFire || isProtected(level, x, y, z);
   }

   private BurntProtection() {
   }

   @FunctionalInterface
   public interface BurnBlocker {
      boolean isProtected(class_1936 var1, class_2338 var2, class_2338 var3);
   }
}
