package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntVerticalSlabStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 500) <= burnTime) {
            if (Math.random() <= 0.005) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_VERTICAL_SLAB.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_VERTICAL_SLAB.method_9564()));
            } else if (Math.random() <= 0.01) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            } else if (Math.random() <= (double)0.5F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var12 = BurntModBlocks.EMBER_VERTICAL_SLAB.method_9595().method_11663("hot");
               class_2680 var10000;
               if (var12 instanceof class_2746) {
                  class_2746 _withbp7 = (class_2746)var12;
                  var10000 = (class_2680)BurntModBlocks.EMBER_VERTICAL_SLAB.method_9564().method_11657(_withbp7, true);
               } else {
                  var10000 = BurntModBlocks.EMBER_VERTICAL_SLAB.method_9564();
               }

               class_2680 _bs = var10000;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_VERTICAL_SLAB.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }
      }

   }
}
