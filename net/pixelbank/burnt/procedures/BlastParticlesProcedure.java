package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class BlastParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 _level = (class_3218)world;
            _level.method_14199(BurntModParticleTypes.BIG_EXPLOSION, x, y, z, 3, (double)0.5F, (double)1.0F, (double)0.5F, (double)0.0F);
         }

         if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get() && world instanceof class_3218) {
            class_3218 _level = (class_3218)world;
            _level.method_14199(BurntModParticleTypes.FLAME_SMOKE, x, y, z, (int)class_3532.method_15366(world.method_8409(), (double)15.0F, (double)30.0F), (double)1.0F, (double)2.0F, (double)1.0F, (double)0.0F);
         }

         if (world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.dragon_fireball.explode")), class_3419.field_15245, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.dragon_fireball.explode")), class_3419.field_15245, 1.0F, 1.0F, false);
            }
         }
      }

   }
}
