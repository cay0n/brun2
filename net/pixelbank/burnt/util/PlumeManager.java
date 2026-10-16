package net.pixelbank.burnt.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class PlumeManager {
   private static final Map<UUID, int[]> COUNTERS = new HashMap();

   public static int getAge(UUID uuid) {
      int[] c = (int[])COUNTERS.get(uuid);
      return c == null ? 0 : c[0];
   }

   public static void resetLife(UUID uuid) {
      int[] c = (int[])COUNTERS.computeIfAbsent(uuid, (id) -> new int[2]);
      c[1] = 0;
   }

   public static List<UUID> tick(Collection<UUID> livingPlumeUUIDs, int maxLife) {
      COUNTERS.keySet().retainAll(livingPlumeUUIDs);
      List<UUID> toKill = new ArrayList();

      for(UUID uuid : livingPlumeUUIDs) {
         int[] c = (int[])COUNTERS.computeIfAbsent(uuid, (id) -> new int[2]);
         int var10002 = c[0]++;
         var10002 = c[1]++;
         if (c[0] >= maxLife || c[1] >= maxLife) {
            toKill.add(uuid);
         }
      }

      return toKill;
   }

   public static void remove(UUID uuid) {
      COUNTERS.remove(uuid);
   }

   public static void clear() {
      COUNTERS.clear();
   }

   private PlumeManager() {
   }
}
