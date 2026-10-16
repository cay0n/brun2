package net.pixelbank.burnt.init;

import net.minecraft.class_2378;
import net.minecraft.class_2400;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class BurntModParticleTypes {
   public static class_2400 FIRE_PARTICLE;
   public static class_2400 FLAMES;
   public static class_2400 FLAME_SMOKE;
   public static class_2400 LIGHT_FLAME_SMOKE;
   public static class_2400 BIG_EXPLOSION;
   public static class_2400 LARGE_STEAM_PARTICLE;
   public static class_2400 MEDIUM_STEAM_PARTICLE;
   public static class_2400 LARGE_FLAME_SMOKE;
   public static class_2400 FOG;
   public static class_2400 TALL_FOG;
   public static class_2400 THICK_FOG;
   public static class_2400 TEST_PARTICLE;
   public static class_2400 BURNT_LEAVES_PARTICLE;
   public static class_2400 SMOLDER_LEAVES_PARTICLE;
   public static class_2400 SOOT_PARTICLE;
   public static class_2400 MOSS_FIRE_PARTICLE;
   public static class_2400 BLUE_FLAME_PARTICLE;
   public static class_2400 FLESH_BUBBLE;
   public static class_2400 AIR_PARTICLE;
   public static class_2400 TORCH_FIRE_PARTICLE;

   public static void register() {
      FIRE_PARTICLE = register("fire_particle", false);
      FLAMES = register("flames", false);
      FLAME_SMOKE = register("flame_smoke", false);
      LIGHT_FLAME_SMOKE = register("light_flame_smoke", false);
      BIG_EXPLOSION = register("big_explosion", true);
      LARGE_STEAM_PARTICLE = register("large_steam_particle", false);
      MEDIUM_STEAM_PARTICLE = register("medium_steam_particle", false);
      LARGE_FLAME_SMOKE = register("large_flame_smoke", false);
      FOG = register("fog", false);
      TALL_FOG = register("tall_fog", false);
      THICK_FOG = register("thick_fog", false);
      TEST_PARTICLE = register("test_particle", false);
      BURNT_LEAVES_PARTICLE = register("burnt_leaves_particle", false);
      SMOLDER_LEAVES_PARTICLE = register("smolder_leaves_particle", true);
      SOOT_PARTICLE = register("soot_particle", false);
      MOSS_FIRE_PARTICLE = register("moss_fire_particle", false);
      BLUE_FLAME_PARTICLE = register("blue_flame_particle", false);
      FLESH_BUBBLE = register("flesh_bubble", true);
      AIR_PARTICLE = register("air_particle", false);
      TORCH_FIRE_PARTICLE = register("torch_fire_particle", false);
   }

   private static class_2400 register(String name, boolean overrideLimiter) {
      return (class_2400)class_2378.method_10230(class_7923.field_41180, class_2960.method_60655("burnt", name), new class_2400(overrideLimiter) {
      });
   }
}
