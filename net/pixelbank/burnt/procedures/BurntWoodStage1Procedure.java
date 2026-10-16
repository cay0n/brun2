package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntWoodStage1Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               fireSpeed = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F) * 0.99;
            } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               fireSpeed = BiomeSpecificProcedure.execute(world, x, y, z);
            }

            fireSpeed *= Math.max((double)0.0F, Math.min((double)1.0F, (Double)BurntBasicConfigConfiguration.WOOD_SPREAD.get() / (double)100.0F));
            fireSpeed *= BurntBlockUtil.darkOakSpreadFactor(world, x, y, z);
            if (Math.random() <= fireSpeed && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
               int _value = 2;
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var13 = _bs.method_26204().method_9595().method_11663("stage");
               if (var13 instanceof class_2758) {
                  class_2758 _integerProp = (class_2758)var13;
                  if (_integerProp.method_11898().contains(_value)) {
                     world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                  }
               }
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_WOOD.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
