package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurningLeavesTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      boolean rainingNow = false;
      boolean useW2 = false;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_LEAVES.method_9564(), 3);
            return;
         }

         if (IsRainingProcedure.isGloballyRaining(world) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && BurntBlockUtil.rainCanReach(world, class_2338.method_49637(x, y + (double)1.0F, z))) {
            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)0.0F, (double)40.0F), () -> {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               if (_bs.method_28498(class_2741.field_12508)) {
                  _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
               }

               world.method_8652(_bp, _bs, 3);
               --BurntModVariables.WorldVariables.get(world).flameCount;
               BurntModVariables.WorldVariables.get(world).markSyncDirty();
            });
            return;
         }

         class_2769 var17 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var17 instanceof class_2758) {
            class_2758 _getip0 = (class_2758)var17;
            var10000 = (Integer)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getip0);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1 && (Boolean)BurntBasicConfigConfiguration.EMBER_SPREAD.get() && BurntModVariables.MapVariables.get(world).windSpeed > (double)30.0F && Math.random() <= BiomeChanceProcedure.execute(world, x, y, z) / (double)10000.0F) {
            EmberSpreadProcedure.execute(world, x, y, z);
         }

         var17 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("stage");
         if (var17 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var17;
            var10000 = (Integer)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (world.method_22347(class_2338.method_49637(x + (double)1.0F, y, z)) && world.method_22347(class_2338.method_49637(x - (double)1.0F, y, z)) && world.method_22347(class_2338.method_49637(x, y + (double)1.0F, z)) && world.method_22347(class_2338.method_49637(x, y - (double)1.0F, z)) && world.method_22347(class_2338.method_49637(x, y, z + (double)1.0F)) && world.method_22347(class_2338.method_49637(x, y, z - (double)1.0F)) && Math.random() <= 0.1) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
               --BurntModVariables.WorldVariables.get(world).flameCount;
               BurntModVariables.WorldVariables.get(world).markSyncDirty();
            }

            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477) {
                  world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
               }

               if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  if (_bs.method_28498(class_2741.field_12508)) {
                     _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
                  }

                  world.method_8652(_bp, _bs, 3);
                  --BurntModVariables.WorldVariables.get(world).flameCount;
                  BurntModVariables.WorldVariables.get(world).markSyncDirty();
               } else {
                  class_2769 _bso = blockstate.method_26204().method_9595().method_11663("stage");
                  if (_bso instanceof class_2758) {
                     class_2758 _getip33 = (class_2758)_bso;
                     var10000 = (Integer)blockstate.method_11654(_getip33);
                  } else {
                     var10000 = -1;
                  }

                  if (var10000 == 1) {
                     if (Math.random() <= (double)0.5F) {
                        BurntLeavesStage2Procedure.execute(world, x, y, z);
                     }
                  } else {
                     _bso = blockstate.method_26204().method_9595().method_11663("stage");
                     if (_bso instanceof class_2758) {
                        class_2758 _getip35 = (class_2758)_bso;
                        var10000 = (Integer)blockstate.method_11654(_getip35);
                     } else {
                        var10000 = -1;
                     }

                     if (var10000 == 2) {
                        BurntLeavesStage3Procedure.execute(world, x, y, z);
                     }
                  }
               }
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               if (_bs.method_28498(class_2741.field_12508)) {
                  _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
               }

               world.method_8652(_bp, _bs, 3);
               --BurntModVariables.WorldVariables.get(world).flameCount;
               BurntModVariables.WorldVariables.get(world).markSyncDirty();
            }

            if (Math.random() <= (double)0.25F) {
               SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
