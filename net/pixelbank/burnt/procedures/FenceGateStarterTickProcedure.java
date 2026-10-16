package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class FenceGateStarterTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FENCEGATE.method_9564(), 3);
            return;
         }

         boolean var10000;
         label36: {
            class_2769 var11 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var11 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var11;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label36;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
                  fireSpeed = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F) * 0.99;
               } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
                  fireSpeed = BiomeSpecificProcedure.execute(world, x, y, z);
               }

               if (Math.random() <= fireSpeed) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_FENCEGATE.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  _bp = class_2338.method_49637(x, y, z);
                  _bs = world.method_8320(_bp);
                  class_2769 var14 = _bs.method_26204().method_9595().method_11663("waterlogged");
                  if (var14 instanceof class_2746) {
                     class_2746 _booleanProp = (class_2746)var14;
                     world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
                  }
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               _bp = class_2338.method_49637(x, y, z);
               _bs = world.method_8320(_bp);
               class_2769 var27 = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (var27 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var27;
                  world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            }
         }
      }

   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
