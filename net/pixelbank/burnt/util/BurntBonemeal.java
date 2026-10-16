package net.pixelbank.burnt.util;

import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_5819;

public final class BurntBonemeal {
   private static final int RADIUS = 3;
   private static final double FALLOFF = (double)4.5F;

   public static void spread(class_3218 level, class_5819 random, class_2338 origin, class_2248 from, class_2680 to) {
      if (level.method_8320(origin).method_27852(from)) {
         level.method_8652(origin, to, 3);
      }

      for(class_2338 p : class_2338.method_10097(origin.method_10069(-3, -1, -3), origin.method_10069(3, 1, 3))) {
         if (level.method_22340(p) && level.method_8320(p).method_27852(from) && (level.method_8320(p.method_10084()).method_26215() || !level.method_8320(p.method_10084()).method_26225())) {
            double d = Math.sqrt(p.method_10262(origin));
            if (!(random.method_43058() > (double)1.0F - d / (double)4.5F)) {
               level.method_8652(p.method_10062(), to, 3);
            }
         }
      }

   }

   private BurntBonemeal() {
   }
}
