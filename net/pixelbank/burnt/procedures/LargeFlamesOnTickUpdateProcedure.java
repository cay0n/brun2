package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class LargeFlamesOnTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && world.method_8401().method_156()) {
            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)40.0F, (double)100.0F), () -> world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3));
         }

         if (Math.random() <= 0.2) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         }
      }

   }
}
