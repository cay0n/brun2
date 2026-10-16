package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BlazingHollowLogTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((BurntProtection.stopBurning(world, x, y, z) || (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) && (world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z))) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var10 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9595().method_11663("fragile");
            class_2680 var10000;
            if (var10 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var10;
               var10000 = (class_2680)BurntModBlocks.BURNT_HOLLOW_LOG.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.2) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.EMBER_HOLLOW_LOG.method_9595().method_11663("hot");
            class_2680 var19;
            if (var18 instanceof class_2746) {
               class_2746 _withbp5 = (class_2746)var18;
               var19 = (class_2680)BurntModBlocks.EMBER_HOLLOW_LOG.method_9564().method_11657(_withbp5, true);
            } else {
               var19 = BurntModBlocks.EMBER_HOLLOW_LOG.method_9564();
            }

            class_2680 _bs = var19;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
