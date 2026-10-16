package net.pixelbank.burnt.util;

import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1810;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_5819;
import net.pixelbank.burnt.init.BurntModBlocks;

public final class BurntTerracottaCracking {
   private static Map<class_2248, class_2248> map;

   private static Map<class_2248, class_2248> map() {
      Map<class_2248, class_2248> m = map;
      if (m == null) {
         m = new IdentityHashMap();
         m.put(class_2246.field_10415, BurntModBlocks.CRACKED_TERRACOTTA);
         m.put(class_2246.field_10611, BurntModBlocks.CRACKED_WHITE_TERRACOTTA);
         m.put(class_2246.field_10184, BurntModBlocks.CRACKED_ORANGE_TERRACOTTA);
         m.put(class_2246.field_10015, BurntModBlocks.CRACKED_MAGENTA_TERRACOTTA);
         m.put(class_2246.field_10325, BurntModBlocks.CRACKED_LIGHT_BLUE_TERRACOTTA);
         m.put(class_2246.field_10143, BurntModBlocks.CRACKED_YELLOW_TERRACOTTA);
         m.put(class_2246.field_10014, BurntModBlocks.CRACKED_LIME_TERRACOTTA);
         m.put(class_2246.field_10444, BurntModBlocks.CRACKED_PINK_TERRACOTTA);
         m.put(class_2246.field_10349, BurntModBlocks.CRACKED_GREY_TERRACOTTA);
         m.put(class_2246.field_10590, BurntModBlocks.CRACKED_LIGHT_GREY_TERRACOTTA);
         m.put(class_2246.field_10235, BurntModBlocks.CRACKED_CYAN_TERRACOTTA);
         m.put(class_2246.field_10570, BurntModBlocks.CRACKED_PURPLE_TERRACOTTA);
         m.put(class_2246.field_10409, BurntModBlocks.CRACKED_BLUE_TERRACOTTA);
         m.put(class_2246.field_10123, BurntModBlocks.CRACKED_BROWN_TERRACOTTA);
         m.put(class_2246.field_10526, BurntModBlocks.CRACKED_GREEN_TERRACOTTA);
         m.put(class_2246.field_10328, BurntModBlocks.CRACKED_RED_TERRACOTTA);
         m.put(class_2246.field_10626, BurntModBlocks.CRACKED_BLACK_TERRACOTTA);
         map = m;
      }

      return m;
   }

   @Nullable
   public static class_2680 getCracked(class_2680 state) {
      class_2248 to = (class_2248)map().get(state.method_26204());
      return to == null ? null : to.method_9564();
   }

   private static class_2680 randomFacing(class_2680 state, class_5819 random) {
      return !state.method_28498(class_2383.field_11177) ? state : (class_2680)state.method_11657(class_2383.field_11177, class_2350.method_10139(random.method_43048(4)));
   }

   public static boolean tryCrack(class_1937 level, class_2338 pos, class_1657 player, class_1268 hand, class_1799 stack) {
      if (!(stack.method_7909() instanceof class_1810)) {
         return false;
      } else if (!player.method_7294()) {
         return false;
      } else {
         class_2680 cracked = getCracked(level.method_8320(pos));
         if (cracked == null) {
            return false;
         } else {
            if (!level.method_8608()) {
               level.method_8652(pos, randomFacing(cracked, level.method_8409()), 11);
               level.method_8396((class_1657)null, pos, class_3417.field_14658, class_3419.field_15245, 1.0F, 0.85F);
               if (level instanceof class_3218) {
                  class_3218 _sl = (class_3218)level;
                  class_3222 var10003;
                  if (player instanceof class_3222) {
                     class_3222 _sp = (class_3222)player;
                     var10003 = _sp;
                  } else {
                     var10003 = null;
                  }

                  stack.method_7956(1, _sl, var10003, (_it) -> {
                  });
               }
            }

            return true;
         }
      }
   }

   private BurntTerracottaCracking() {
   }
}
