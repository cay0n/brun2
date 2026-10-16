package net.pixelbank.burnt;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_6862;
import net.minecraft.class_7924;

public final class BurntIgnitionHooks {
   private static final class_6862<class_2248> REPLACEABLE_GASES;
   private static final class_6862<class_2248> SOUL_BASE;

   public static boolean isReplaceable(class_1936 world, class_2338 pos) {
      class_2680 s = world.method_8320(pos);
      return s.method_26215() || s.method_45474() || s.method_26164(REPLACEABLE_GASES);
   }

   public static class_2338 resolveTarget(class_1936 world, class_2338 hitPos, class_2350 face) {
      if (isReplaceable(world, hitPos)) {
         return hitPos;
      } else {
         class_2338 off = hitPos.method_10093(face);
         if (isReplaceable(world, off)) {
            return off;
         } else {
            if (face == class_2350.field_11036) {
               class_2338 above = hitPos.method_10084();
               if (isReplaceable(world, above)) {
                  return above;
               }
            }

            return null;
         }
      }
   }

   public static boolean canGroundFireSurvive(class_1936 world, class_2338 pos) {
      class_2338 below = pos.method_10074();
      class_2680 belowState = world.method_8320(below);
      boolean belowSolidTop = belowState.method_26206(world, below, class_2350.field_11036);
      boolean anyFlammable = isFlammable(world.method_8320(pos.method_10095())) || isFlammable(world.method_8320(pos.method_10072())) || isFlammable(world.method_8320(pos.method_10078())) || isFlammable(world.method_8320(pos.method_10067())) || isFlammable(world.method_8320(pos.method_10084())) || isFlammable(world.method_8320(pos.method_10074()));
      return belowSolidTop || anyFlammable;
   }

   private static boolean isFlammable(class_2680 state) {
      FlammableBlockRegistry.Entry e = (FlammableBlockRegistry.Entry)FlammableBlockRegistry.getDefaultInstance().get(state.method_26204());
      return e != null && e.getBurnChance() > 0;
   }

   public static boolean isSoulBase(class_1936 world, class_2338 pos) {
      class_2680 below = world.method_8320(pos.method_10074());
      return below.method_27852(class_2246.field_22090) || below.method_26164(SOUL_BASE);
   }

   static {
      REPLACEABLE_GASES = class_6862.method_40092(class_7924.field_41254, class_2960.method_60655("burnt", "replaceable_gases"));
      SOUL_BASE = class_6862.method_40092(class_7924.field_41254, class_2960.method_60655("burnt", "soul_fire_base"));
   }
}
