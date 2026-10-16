package net.pixelbank.burnt.util;

import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;

public final class BurntStripping {
   private static Map<class_2248, class_2248> map;
   private static Map<class_2248, class_2248> sootyMap;

   private static Map<class_2248, class_2248> map() {
      Map<class_2248, class_2248> m = map;
      if (m == null) {
         m = new IdentityHashMap();
         put(m, BurntModBlocks.BURNT_LOG, BurntModBlocks.STRIPPED_BURNT_LOG);
         put(m, BurntModBlocks.EMBER_LOG, BurntModBlocks.STRIPPED_BURNT_LOG);
         put(m, BurntModBlocks.SMOLDERING_LOG, BurntModBlocks.SMOLDERING_STRIPPED_LOG);
         put(m, BurntModBlocks.SMOLDERING_LOG_2, BurntModBlocks.SMOLDERING_STRIPPED_LOG);
         put(m, BurntModBlocks.SMOLDERING_LOG_3, BurntModBlocks.SMOLDERING_STRIPPED_LOG);
         put(m, BurntModBlocks.BLAZING_LOG, BurntModBlocks.SMOLDERING_STRIPPED_LOG);
         put(m, BurntModBlocks.BROKEN_BURNT_LOG, BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG);
         put(m, BurntModBlocks.BROKEN_BLAZING_LOG, BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG);
         put(m, BurntModBlocks.BROKEN_BLAZING_LOG_2, BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG);
         put(m, BurntModBlocks.BURNT_WOOD, BurntModBlocks.STRIPPED_BURNT_WOOD);
         put(m, BurntModBlocks.EMBER_WOOD, BurntModBlocks.STRIPPED_BURNT_WOOD);
         put(m, BurntModBlocks.SMOLDERING_WOOD, BurntModBlocks.SMOLDERING_STRIPPED_WOOD);
         put(m, BurntModBlocks.BLAZING_WOOD, BurntModBlocks.SMOLDERING_STRIPPED_WOOD);
         map = m;
      }

      return m;
   }

   private static void put(Map<class_2248, class_2248> m, @Nullable class_2248 from, @Nullable class_2248 to) {
      if (from != null && to != null) {
         m.put(from, to);
      }

   }

   private static Map<class_2248, class_2248> sootyMap() {
      Map<class_2248, class_2248> m = sootyMap;
      if (m == null) {
         m = new IdentityHashMap();
         put(m, BurntModBlocks.SOOTY_OAK_LOG, class_2246.field_10519);
         put(m, BurntModBlocks.SOOTY_SPRUCE_LOG, class_2246.field_10436);
         put(m, BurntModBlocks.SOOTY_BIRCH_LOG, class_2246.field_10366);
         put(m, BurntModBlocks.SOOTY_JUNGLE_LOG, class_2246.field_10254);
         put(m, BurntModBlocks.SOOTY_ACACIA_LOG, class_2246.field_10622);
         put(m, BurntModBlocks.SOOTY_DARK_OAK_LOG, class_2246.field_10244);
         put(m, BurntModBlocks.SOOTY_MANGROVE_LOG, class_2246.field_37548);
         put(m, BurntModBlocks.SOOTY_CHERRY_LOG, class_2246.field_42732);
         put(m, BurntModBlocks.SOOTY_PALE_OAK_LOG, BurntVanilla.block("stripped_pale_oak_log"));
         put(m, BurntModBlocks.SOOTY_OAK_WOOD, class_2246.field_10250);
         put(m, BurntModBlocks.SOOTY_SPRUCE_WOOD, class_2246.field_10558);
         put(m, BurntModBlocks.SOOTY_BIRCH_WOOD, class_2246.field_10204);
         put(m, BurntModBlocks.SOOTY_JUNGLE_WOOD, class_2246.field_10084);
         put(m, BurntModBlocks.SOOTY_ACACIA_WOOD, class_2246.field_10103);
         put(m, BurntModBlocks.SOOTY_DARK_OAK_WOOD, class_2246.field_10374);
         put(m, BurntModBlocks.SOOTY_MANGROVE_WOOD, class_2246.field_37550);
         put(m, BurntModBlocks.SOOTY_CHERRY_WOOD, class_2246.field_42730);
         put(m, BurntModBlocks.SOOTY_PALE_OAK_WOOD, BurntVanilla.block("stripped_pale_oak_wood"));
         sootyMap = m;
      }

      return m;
   }

   public static boolean dropsSoot(class_2680 state) {
      return sootyMap().containsKey(state.method_26204());
   }

   @Nullable
   public static class_2680 getStripped(class_2680 state) {
      class_2248 to = (class_2248)map().get(state.method_26204());
      if (to == null) {
         to = (class_2248)sootyMap().get(state.method_26204());
      }

      return to == null ? null : BurntBlockUtil.copyProperties(state, to.method_9564());
   }

   public static void registerFabric() {
      for(Map.Entry<class_2248, class_2248> e : map().entrySet()) {
         try {
            StrippableBlockRegistry.register((class_2248)e.getKey(), (class_2248)e.getValue());
         } catch (Throwable var3) {
         }
      }

   }

   private BurntStripping() {
   }
}
