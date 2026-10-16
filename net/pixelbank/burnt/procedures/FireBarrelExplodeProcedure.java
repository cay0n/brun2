package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;

public class FireBarrelExplodeProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      double Radius = (double)0.0F;
      if (!world.method_8608()) {
         world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564(), 3);
         if (world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.dragon_fireball.explode")), class_3419.field_15254, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.dragon_fireball.explode")), class_3419.field_15254, 1.0F, 1.0F, false);
            }
         }
      }

   }
}
