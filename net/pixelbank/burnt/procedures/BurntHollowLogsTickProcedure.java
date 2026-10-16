package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntHollowLogsTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var11 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var11 instanceof class_2758) {
            class_2758 _getip0 = (class_2758)var11;
            var10000 = (Integer)blockstate.method_11654(_getip0);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1 && (Boolean)BurntBasicConfigConfiguration.EMBER_SPREAD.get() && BurntModVariables.MapVariables.get(world).windSpeed > (double)30.0F && Math.random() <= BiomeChanceProcedure.execute(world, x, y, z) / (double)10000.0F) {
            EmberSpreadProcedure.execute(world, x, y, z);
         }

         var11 = blockstate.method_26204().method_9595().method_11663("stage");
         if (var11 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var11;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2769 var14 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9595().method_11663("fragile");
                  class_2680 var33;
                  if (var14 instanceof class_2746) {
                     class_2746 _withbp24 = (class_2746)var14;
                     var33 = (class_2680)BurntModBlocks.BURNT_HOLLOW_LOG.method_9564().method_11657(_withbp24, true);
                  } else {
                     var33 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
                  }

                  class_2680 _bs = var33;
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else {
                  class_2769 var28 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var28 instanceof class_2758) {
                     class_2758 _getip27 = (class_2758)var28;
                     var10000 = (Integer)blockstate.method_11654(_getip27);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     BurntHollowLogsStage1Procedure.execute(world, x, y, z);
                  } else {
                     var28 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var28 instanceof class_2758) {
                        class_2758 _getip29 = (class_2758)var28;
                        var10000 = (Integer)blockstate.method_11654(_getip29);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntHollowLogsStage2Procedure.execute(world, x, y, z);
                     } else {
                        var28 = blockstate.method_26204().method_9595().method_11663("stage");
                        if (var28 instanceof class_2758) {
                           class_2758 _getip31 = (class_2758)var28;
                           var10000 = (Integer)blockstate.method_11654(_getip31);
                        } else {
                           var10000 = -1;
                        }

                        if (var10000 == 3) {
                           BurntHollowLogsStage3Procedure.execute(world, x, y, z);
                        }
                     }
                  }
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var31 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9595().method_11663("fragile");
               class_2680 var37;
               if (var31 instanceof class_2746) {
                  class_2746 _withbp32 = (class_2746)var31;
                  var37 = (class_2680)BurntModBlocks.BURNT_HOLLOW_LOG.method_9564().method_11657(_withbp32, true);
               } else {
                  var37 = BurntModBlocks.BURNT_HOLLOW_LOG.method_9564();
               }

               class_2680 _bs = var37;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= (double)0.25F) {
            SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
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
