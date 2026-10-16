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

public class BurntFenceGateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var11 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var11 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var11;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (BurntProtection.stopBurning(world, x, y, z)) {
               class_2338 _kfbp = class_2338.method_49637(x, y, z);
               class_2680 _kfbs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
               class_2680 _kfbso = world.method_8320(_kfbp);

               for(class_2769<?> _prop : _kfbso.method_28501()) {
                  class_2769 _propNew = _kfbs.method_26204().method_9595().method_11663(_prop.method_11899());
                  if (_propNew != null) {
                     try {
                        _kfbs = (class_2680)_kfbs.method_11657(_propNew, _kfbso.method_11654(_prop));
                     } catch (Exception var18) {
                     }
                  }
               }

               world.method_8652(_kfbp, _kfbs, 3);
               return;
            }

            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_FENCEGATE.method_9564();
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
               } else {
                  class_2769 var37 = blockstate.method_26204().method_9595().method_11663("stage");
                  if (var37 instanceof class_2758) {
                     class_2758 _getip28 = (class_2758)var37;
                     var10000 = (Integer)blockstate.method_11654(_getip28);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     BurntFenceStage1Procedure.execute(world, x, y, z);
                  } else {
                     var37 = blockstate.method_26204().method_9595().method_11663("stage");
                     if (var37 instanceof class_2758) {
                        class_2758 _getip30 = (class_2758)var37;
                        var10000 = (Integer)blockstate.method_11654(_getip30);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntFenceStage2Procedure.execute(world, x, y, z);
                     } else {
                        var37 = blockstate.method_26204().method_9595().method_11663("stage");
                        if (var37 instanceof class_2758) {
                           class_2758 _getip32 = (class_2758)var37;
                           var10000 = (Integer)blockstate.method_11654(_getip32);
                        } else {
                           var10000 = -1;
                        }

                        if (var10000 == 3) {
                           BurntFenceStage3Procedure.execute(world, x, y, z);
                        }
                     }
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
               class_2769 var40 = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (var40 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var40;
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
