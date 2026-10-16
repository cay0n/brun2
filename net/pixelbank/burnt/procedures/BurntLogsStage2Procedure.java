package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntLogsStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2338 _abovePos = class_2338.method_49637(x, y + (double)1.0F, z);
         if (world.method_8320(_abovePos).method_26204() == class_2246.field_10477) {
            world.method_22352(_abovePos, false);
         }

         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
            class_2680 var10000;
            if (var18 instanceof class_2746) {
               class_2746 _withbp = (class_2746)var18;
               var10000 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp, true);
            } else {
               var10000 = BurntModBlocks.BURNT_LOG.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            return;
         }

         if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            if (Math.random() <= BiomeChanceProcedure.execute(world, x, y, z) / (double)100.0F) {
               WillitburnProcedure.execute(world, x, y, z);
            }
         } else {
            WillitburnProcedure.execute(world, x, y, z);
         }

         int _value = 3;
         class_2338 _pos = class_2338.method_49637(x, y, z);
         class_2680 _bs = world.method_8320(_pos);
         class_2769 var12 = _bs.method_26204().method_9595().method_11663("stage");
         if (var12 instanceof class_2758) {
            class_2758 _integerProp = (class_2758)var12;
            if (_integerProp.method_11898().contains(_value)) {
               world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
            }
         }
      }

   }
}
