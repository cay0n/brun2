package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingAzeleaTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_AZALEA.method_9564(), 3);
            return;
         }

         if (Math.random() <= (double)0.5F) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_AZALEA.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564()));
            WillitburnProcedure.execute(world, x, y, z);
         }
      }

   }
}
