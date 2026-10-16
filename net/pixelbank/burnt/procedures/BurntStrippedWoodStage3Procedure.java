package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntStrippedWoodStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (Math.random() <= 2.5E-4) {
            RandomCollapseProcedure.execute(world, x, y, z);
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 500) <= burnTime) {
            if (Math.random() <= 0.3) {
               world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564()));
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }
      }

   }
}
