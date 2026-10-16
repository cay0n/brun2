package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingHayTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (!world.method_8401().method_156() && !BurntProtection.stopBurning(world, x, y, z)) {
            if (Math.random() <= 0.3) {
               WillitburnProcedure.execute(world, x, y, z);
               if (Math.random() <= (double)0.5F) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_HAY.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
               }
            }
         } else if (!BurntProtection.stopBurning(world, x, y, z) && !(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            if (Math.random() <= 0.3) {
               WillitburnProcedure.execute(world, x, y, z);
               if (Math.random() <= (double)0.5F) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_HAY.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  world.method_22352(class_2338.method_49637(x, y, z), false);
               }
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_HAY.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= (double)0.5F) {
            SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
         }
      }

   }
}
