package net.pixelbank.burnt.compat;

import java.lang.reflect.Method;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_2248;

public final class LevelZBridge {
   private static final boolean PRESENT = FabricLoader.getInstance().isModLoaded("levelz");
   private static volatile boolean resolved = false;
   private static Method getLevelManager;
   private static Method hasRequiredItemLevel;
   private static Method hasRequiredBlockLevel;

   public static boolean isActive() {
      return PRESENT;
   }

   public static boolean blocksItem(class_1657 player, class_1792 item) {
      return ready(player) && item != null ? denied(player, hasRequiredItemLevel, item) : false;
   }

   public static boolean blocksBlock(class_1657 player, class_2248 block) {
      return ready(player) && block != null ? denied(player, hasRequiredBlockLevel, block) : false;
   }

   private static boolean ready(class_1657 player) {
      if (PRESENT && player != null) {
         if (!resolved) {
            resolve(player);
         }

         return getLevelManager != null;
      } else {
         return false;
      }
   }

   private static boolean denied(class_1657 player, Method check, Object subject) {
      if (check == null) {
         return false;
      } else {
         try {
            Object lm = getLevelManager.invoke(player);
            if (lm == null) {
               return false;
            } else {
               Object ok = check.invoke(lm, subject);
               boolean var10000;
               if (ok instanceof Boolean) {
                  Boolean b = (Boolean)ok;
                  if (!b) {
                     var10000 = true;
                     return var10000;
                  }
               }

               var10000 = false;
               return var10000;
            }
         } catch (Throwable var6) {
            return false;
         }
      }
   }

   private static synchronized void resolve(class_1657 player) {
      if (!resolved) {
         resolved = true;

         try {
            getLevelManager = player.getClass().getMethod("getLevelManager");
         } catch (Throwable var5) {
            getLevelManager = null;
            return;
         }

         Class<?> lm = getLevelManager.getReturnType();

         try {
            hasRequiredItemLevel = lm.getMethod("hasRequiredItemLevel", class_1792.class);
         } catch (Throwable var4) {
            hasRequiredItemLevel = null;
         }

         try {
            hasRequiredBlockLevel = lm.getMethod("hasRequiredBlockLevel", class_2248.class);
         } catch (Throwable var3) {
            hasRequiredBlockLevel = null;
         }

      }
   }

   private LevelZBridge() {
   }
}
