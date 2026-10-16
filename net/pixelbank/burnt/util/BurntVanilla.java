package net.pixelbank.burnt.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class BurntVanilla {
   private static final Map<String, class_2248> CACHE = new ConcurrentHashMap();

   private BurntVanilla() {
   }

   public static class_2248 block(String path) {
      class_2248 found = (class_2248)CACHE.computeIfAbsent(path, (p) -> {
         class_2960 id = class_2960.method_60655("minecraft", p);
         class_2248 b = class_7923.field_41175.method_10250(id) ? (class_2248)class_7923.field_41175.method_10223(id) : null;
         return b == null ? class_2246.field_10124 : b;
      });
      return found == class_2246.field_10124 ? null : found;
   }

   public static boolean isPresent(String path) {
      return block(path) != null;
   }

   public static boolean is(class_2680 state, String path) {
      class_2248 b = block(path);
      return b != null && state.method_26204() == b;
   }

   public static class_2680 stateOf(String path) {
      class_2248 b = block(path);
      return b != null ? b.method_9564() : class_2246.field_10124.method_9564();
   }

   public static class_1799 itemOf(String path) {
      class_2248 b = block(path);
      return b != null ? new class_1799(b) : class_1799.field_8037;
   }
}
