package net.pixelbank.burnt.util;

import net.minecraft.class_1540;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2397;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3481;
import net.minecraft.class_5819;
import net.minecraft.class_6862;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.minecraft.class_2350.class_2353;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public final class BurntBlockUtil {
   public static final class_5819 RAND = class_5819.method_43047();
   public static final class_6862<class_2248> TAG_IS_WATER;
   private static final ThreadLocal<class_2338.class_2339> SCRATCH_POS;
   private static long cacheTick;
   private static long cachePackedPos;
   private static int cacheWorldHash;
   private static boolean cacheResult;

   public static boolean hasAdjacentWater(class_1936 world, double x, double y, double z) {
      int bx = (int)Math.floor(x);
      int by = (int)Math.floor(y);
      int bz = (int)Math.floor(z);
      long var10000;
      if (world instanceof class_1937 lvl) {
         var10000 = lvl.method_8510();
      } else {
         var10000 = Long.MIN_VALUE;
      }

      long now = var10000;
      long key = class_2338.method_10064(bx, by, bz);
      int worldHash = System.identityHashCode(world);
      if (now != Long.MIN_VALUE && now == cacheTick && key == cachePackedPos && worldHash == cacheWorldHash) {
         return cacheResult;
      } else {
         class_2338.class_2339 pos = (class_2338.class_2339)SCRATCH_POS.get();
         boolean result = world.method_8320(pos.method_10103(bx + 1, by, bz)).method_26164(TAG_IS_WATER) || world.method_8320(pos.method_10103(bx - 1, by, bz)).method_26164(TAG_IS_WATER) || world.method_8320(pos.method_10103(bx, by, bz + 1)).method_26164(TAG_IS_WATER) || world.method_8320(pos.method_10103(bx, by, bz - 1)).method_26164(TAG_IS_WATER) || world.method_8320(pos.method_10103(bx, by - 1, bz)).method_26164(TAG_IS_WATER) || world.method_8320(pos.method_10103(bx, by + 1, bz)).method_26164(TAG_IS_WATER);
         cacheTick = now;
         cachePackedPos = key;
         cacheWorldHash = worldHash;
         cacheResult = result;
         return result;
      }
   }

   public static boolean rainCanReach(class_1936 world, class_2338 pos) {
      int maxY = world.method_31600();
      class_2338.class_2339 cursor = new class_2338.class_2339(pos.method_10263(), pos.method_10264(), pos.method_10260());

      while(cursor.method_10264() < maxY) {
         class_2680 state = world.method_8320(cursor);
         class_2248 block = state.method_26204();
         boolean isLeaf = state.method_26164(class_3481.field_15503) || block instanceof class_2397;
         if (!state.method_26215() && !isLeaf) {
            return false;
         }

         if (world.method_22348(cursor)) {
            return true;
         }

         cursor.method_10100(0, 1, 0);
      }

      return true;
   }

   public static class_2680 copyProperties(class_2680 from, class_2680 to) {
      for(class_2769<?> prop : from.method_28501()) {
         class_2769<?> match = to.method_26204().method_9595().method_11663(prop.method_11899());
         if (match != null) {
            to = setValue(to, match, from.method_11654(prop));
         }
      }

      return to;
   }

   private static <T extends Comparable<T>> class_2680 setValue(class_2680 state, class_2769<T> prop, Comparable<?> value) {
      try {
         return (class_2680)state.method_11657(prop, value);
      } catch (Exception var4) {
         return state;
      }
   }

   public static class_1540 fallNoDrop(class_3218 level, class_2338 pos, class_2680 state) {
      BurntCollapseBudget.noteSpawn(level);
      class_1540 _fbe = class_1540.method_40005(level, pos, state);
      _fbe.field_7193 = false;
      return _fbe;
   }

   public static boolean isDarkOak(class_2680 state) {
      if (state == null) {
         return false;
      } else if (WoodSpecies.readFrom(state) == WoodSpecies.DARK_OAK) {
         return true;
      } else {
         class_2960 id = class_7923.field_41175.method_10221(state.method_26204());
         return id != null && id.method_12832().contains("dark_oak");
      }
   }

   public static double darkOakSpreadFactor(class_1936 world, double x, double y, double z) {
      return !isDarkOak(world.method_8320(class_2338.method_49637(x, y, z))) ? (double)1.0F : Math.max((double)0.0F, Math.min((double)1.0F, (Double)BurntBasicConfigConfiguration.DARK_OAK_SPREAD.get() / (double)100.0F));
   }

   public static boolean isHorizontallyExposed(class_1936 world, double x, double y, double z) {
      class_2338 pos = class_2338.method_49637(x, y, z);

      for(class_2350 dir : class_2353.field_11062) {
         class_2680 side = world.method_8320(pos.method_10093(dir));
         if (!side.method_26215() && side.method_26225()) {
            return false;
         }
      }

      return true;
   }

   private BurntBlockUtil() {
   }

   static {
      TAG_IS_WATER = class_6862.method_40092(class_7924.field_41254, class_2960.method_60654("burnt:is_water"));
      SCRATCH_POS = ThreadLocal.withInitial(class_2338.class_2339::new);
      cacheTick = Long.MIN_VALUE;
      cachePackedPos = 0L;
      cacheWorldHash = 0;
      cacheResult = false;
   }
}
