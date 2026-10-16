package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class CoalRightClickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8884 && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10381) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_COAL.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

      }
   }
}
