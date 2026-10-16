package net.pixelbank.burnt.util;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_181;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_5819;
import net.minecraft.class_7923;
import net.minecraft.class_8567;
import net.pixelbank.burnt.init.BurntModBlocks;

public final class BurntAshDrops {
   private static Set<class_2248> lootHandled;

   private static Set<class_2248> lootHandled() {
      Set<class_2248> s = lootHandled;
      if (s == null) {
         s = Collections.newSetFromMap(new IdentityHashMap());
         s.add(BurntModBlocks.BURNT_LOG);
         s.add(BurntModBlocks.BURNT_WOOD);
         s.add(BurntModBlocks.SMALL_BURNT_LOG);
         s.add(BurntModBlocks.CREEKING_BURNT_LOG);
         s.add(BurntModBlocks.STRIPPED_BURNT_LOG);
         s.add(BurntModBlocks.STRIPPED_BURNT_WOOD);
         s.add(BurntModBlocks.BROKEN_BURNT_LOG);
         s.add(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG);
         s.add(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG_2);
         lootHandled = s;
      }

      return s;
   }

   public static boolean isLootHandled(class_2248 block) {
      return lootHandled().contains(block);
   }

   public static void appendAsh(List<class_1799> drops, class_8567.class_8568 builder) {
      try {
         if (!FabricLoader.getInstance().isModLoaded("supplementaries")) {
            return;
         }

         if (!(builder.method_51876(class_181.field_1226) instanceof class_1657)) {
            return;
         }

         class_5819 random = builder.method_51870().method_8409();
         if (random.method_43057() > 0.25F) {
            return;
         }

         class_1792 ash = (class_1792)class_7923.field_41178.method_10223(class_2960.method_60654("supplementaries:ash"));
         if (ash == class_1802.field_8162) {
            return;
         }

         int count = class_3532.method_15395(random, 0, 2);
         if (count > 0) {
            drops.add(new class_1799(ash, count));
         }
      } catch (Throwable var5) {
      }

   }

   private BurntAshDrops() {
   }
}
