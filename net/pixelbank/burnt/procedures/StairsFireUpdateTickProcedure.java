package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class StairsFireUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && world.method_8401().method_156()) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
            --BurntModVariables.WorldVariables.get(world).flameCount;
            BurntModVariables.WorldVariables.get(world).markSyncDirty();
         }

         if (Math.random() <= (double)0.5F) {
            SootyProcedure.execute(world, x, y, z);
         } else if (Math.random() <= 0.1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_10124.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            --BurntModVariables.WorldVariables.get(world).flameCount;
            BurntModVariables.WorldVariables.get(world).markSyncDirty();
         }
      }

   }
}
