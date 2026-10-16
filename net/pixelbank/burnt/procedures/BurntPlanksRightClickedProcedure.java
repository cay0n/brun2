package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntPlanksRightClickedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8884) {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.EMBER_PLANKS.method_9564(), 3);
            }
         }

      }
   }
}
