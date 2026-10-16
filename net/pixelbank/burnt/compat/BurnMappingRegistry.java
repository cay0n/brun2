package net.pixelbank.burnt.compat;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_2248;

public final class BurnMappingRegistry {
   private static final Map<class_2248, class_2248> MAPPINGS = new HashMap();

   public static void clear() {
      MAPPINGS.clear();
   }

   public static void put(class_2248 from, class_2248 to) {
      MAPPINGS.put(from, to);
   }

   public static class_2248 get(class_2248 source) {
      return (class_2248)MAPPINGS.get(source);
   }

   private BurnMappingRegistry() {
   }
}
