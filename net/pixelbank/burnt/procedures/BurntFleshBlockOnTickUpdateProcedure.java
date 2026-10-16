package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;

public class BurntFleshBlockOnTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (Math.random() <= (double)0.25F) {
            WillitburnProcedure.execute(world, x, y, z);
         }

         if (Math.random() <= (double)0.25F) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }
      }

   }
}
