package net.pixelbank.burnt.procedures;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;

public class BurntForestSoundProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double idx = (double)0.0F;
      double foundIndex = (double)0.0F;
      double size = (double)0.0F;
      double ex = (double)0.0F;
      double ey = (double)0.0F;
      double ez = (double)0.0F;
      new JsonObject();
      new JsonObject();
      String ptText = "";
      new JsonArray();
      if (world instanceof class_1937 _level) {
         if (!_level.method_8608()) {
            _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("burnt:burnt_ambient")), class_3419.field_15256, 1.0F, 1.0F);
         } else {
            _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("burnt:burnt_ambient")), class_3419.field_15256, 1.0F, 1.0F, false);
         }
      }

   }
}
