package net.pixelbank.burnt.init;

import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_7923;

public class BurntModSounds {
   public static class_3414 BURNT_AMBIENT;
   public static class_3414 WISP_TREASURE;
   public static class_3414 WISP_QUICK;
   public static class_3414 WISP_SLOW;
   public static class_3414 BURNT_EERIE;
   public static class_3414 BURNT;
   public static class_3414 THERMAL;
   public static class_3414 THERMAL_TICK;

   public static void register() {
      BURNT_AMBIENT = register("burnt_ambient");
      WISP_TREASURE = register("wisp_treasure");
      WISP_QUICK = register("wisp_quick");
      WISP_SLOW = register("wisp_slow");
      BURNT_EERIE = register("burnt_eerie");
      BURNT = register("burnt");
      THERMAL = register("thermal");
      THERMAL_TICK = register("thermal_tick");
   }

   private static class_3414 register(String name) {
      class_2960 id = class_2960.method_60655("burnt", name);
      return (class_3414)class_2378.method_10230(class_7923.field_41172, id, class_3414.method_47908(id));
   }
}
