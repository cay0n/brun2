package net.pixelbank.burnt.util;

import net.minecraft.class_1936;
import net.minecraft.class_3218;

public final class BurntCollapseBudget {
   private static final int MAX_PER_SECOND = 20;
   private static long window = -1L;
   private static int spawned = 0;

   private static void roll(class_3218 level) {
      long now = level.method_8510() / 20L;
      if (now != window) {
         window = now;
         spawned = 0;
      }

   }

   public static boolean hasHeadroom(class_1936 world) {
      if (world instanceof class_3218 level) {
         roll(level);
         return spawned < 20;
      } else {
         return true;
      }
   }

   public static void noteSpawn(class_1936 world) {
      if (world instanceof class_3218 level) {
         roll(level);
         ++spawned;
      }
   }

   private BurntCollapseBudget() {
   }
}
