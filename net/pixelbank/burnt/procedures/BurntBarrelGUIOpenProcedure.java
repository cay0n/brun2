package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;

public class BurntBarrelGUIOpenProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      class_2338 _pos = class_2338.method_49637(x, y, z);
      class_2680 _bs = world.method_8320(_pos);
      class_2769 var10 = _bs.method_26204().method_9595().method_11663("open");
      if (var10 instanceof class_2746 _booleanProp) {
         world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
      }

      if (world instanceof class_1937 _level) {
         if (!_level.method_8608()) {
            _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.barrel.open")), class_3419.field_15254, 1.0F, 1.0F);
         } else {
            _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.barrel.open")), class_3419.field_15254, 1.0F, 1.0F, false);
         }
      }

   }
}
