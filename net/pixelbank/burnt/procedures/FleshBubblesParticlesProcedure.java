package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class FleshBubblesParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && Math.random() <= (double)0.5F) {
         world.method_8406(BurntModParticleTypes.FLESH_BUBBLE, x + class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.0F), y + (double)1.0F, z + class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.0F), (double)0.0F, 0.06, (double)0.0F);
         if (Math.random() <= 0.05 && world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.bubble_column.bubble_pop")), class_3419.field_15256, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.bubble_column.bubble_pop")), class_3419.field_15256, 1.0F, 1.0F, false);
            }
         }
      }

   }
}
