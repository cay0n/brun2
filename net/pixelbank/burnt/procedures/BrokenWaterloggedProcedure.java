package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class BrokenWaterloggedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
         boolean var10000;
         label25: {
            class_2769 var9 = blockstate.method_26204().method_9595().method_11663("fragile");
            if (var9 instanceof class_2746) {
               class_2746 _getbp28 = (class_2746)var9;
               if ((Boolean)blockstate.method_11654(_getbp28)) {
                  var10000 = true;
                  break label25;
               }
            }

            var10000 = false;
         }

         if (var10000 && (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR) || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) && Math.random() <= 0.001) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }
      }

   }
}
