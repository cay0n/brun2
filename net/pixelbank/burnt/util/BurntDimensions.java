package net.pixelbank.burnt.util;

import java.util.List;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_5321;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public final class BurntDimensions {
   public static boolean isDisabled(class_1936 world) {
      if (world == null) {
         return false;
      } else if (world instanceof class_1937) {
         class_1937 lvl = (class_1937)world;
         class_5321 dim = lvl.method_27983();
         if (!(Boolean)BurntBasicConfigConfiguration.BURN_MODDED_DIMENSIONS.get() && !isVanilla(dim)) {
            return true;
         } else {
            List<String> list = BurntBasicConfigConfiguration.DISABLED_DIMENSIONS.get();
            return list != null && !list.isEmpty() && list.contains(dim.method_29177().toString());
         }
      } else {
         return false;
      }
   }

   private static boolean isVanilla(class_5321<class_1937> dim) {
      return dim.equals(class_1937.field_25179) || dim.equals(class_1937.field_25180) || dim.equals(class_1937.field_25181);
   }

   private BurntDimensions() {
   }
}
