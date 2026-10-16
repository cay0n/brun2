package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class CopperFireUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && world.method_8401().method_156()) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
            return;
         }

         class_2338 firePos = class_2338.method_49637(x, y, z);
         class_2338 copperPos = null;

         for(class_2350 horiz : new class_2350[]{class_2350.field_11034, class_2350.field_11039, class_2350.field_11043, class_2350.field_11035}) {
            class_2338 candidate = firePos.method_10093(horiz);
            if (world.method_8320(candidate).method_26164(BurntTags.BLOCK_COPPER)) {
               copperPos = candidate;
               break;
            }
         }

         if (copperPos == null) {
            world.method_8652(firePos, class_2246.field_10124.method_9564(), 3);
            return;
         }

         boolean hasFireSource = false;

         for(class_2350 d : class_2350.values()) {
            class_2338 checkPos = copperPos.method_10093(d);
            if (!checkPos.equals(firePos) && world.method_8320(checkPos).method_26164(BurntTags.BLOCK_ON_FIRE)) {
               hasFireSource = true;
               break;
            }
         }

         if (!hasFireSource) {
            world.method_8652(firePos, class_2246.field_10124.method_9564(), 3);
         }
      }

   }
}
