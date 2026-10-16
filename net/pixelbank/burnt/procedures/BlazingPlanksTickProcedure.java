package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BlazingPlanksTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if ((world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z)) && (BurntProtection.stopBurning(world, x, y, z) || (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get())) {
            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)20.0F, (double)60.0F), () -> {
               if (Math.random() <= (double)0.5F) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 patt0$temp = BurntModBlocks.EMBER_PLANKS.method_9595().method_11663("hot");
                  class_2680 var10000;
                  if (patt0$temp instanceof class_2746) {
                     class_2746 _withbp4 = (class_2746)patt0$temp;
                     var10000 = (class_2680)BurntModBlocks.EMBER_PLANKS.method_9564().method_11657(_withbp4, true);
                  } else {
                     var10000 = BurntModBlocks.EMBER_PLANKS.method_9564();
                  }

                  class_2680 _bs = var10000;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

            });
         }

         if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_PLANKS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (!world.method_8401().method_156() && !BurntProtection.stopBurning(world, x, y, z) || !IsRainingProcedure.execute(world, x, y, z)) {
            BurntPlanksStage3Procedure.execute(world, x, y, z);
         }
      }

   }
}
