package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class HandExtinguishProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      execute((Object)null, world, x, y, z);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
         class_2769 var9 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip3 = (class_2758)var9;
            var10000 = (Integer)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getip3);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            ExtinguishProcedure.execute(world, x, y, z);
         }
      }

   }
}
