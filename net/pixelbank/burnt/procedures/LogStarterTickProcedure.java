package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntVanilla;
import net.pixelbank.burnt.util.WoodSpecies;

public class LogStarterTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         boolean var10000;
         label84: {
            class_2769 var11 = blockstate.method_26204().method_9595().method_11663("hot");
            if (var11 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var11;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label84;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            class_2338 _abovePos = class_2338.method_49637(x, y + (double)1.0F, z);
            if (world.method_8320(_abovePos).method_26204() == class_2246.field_10477) {
               world.method_22352(_abovePos, false);
            }

            if ((world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z)) && (BurntProtection.stopBurning(world, x, y, z) || (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get())) {
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var15 = _bs.method_26204().method_9595().method_11663("hot");
               if (var15 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var15;
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            }

            if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
                  fireSpeed = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F);
               } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
                  fireSpeed = BiomeSpecificProcedure.execute(world, x, y, z);
               }

               if (Math.random() <= fireSpeed) {
                  if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_LOG) {
                     if (Math.random() <= (double)0.5F) {
                        world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(class_2246.field_10511.method_9564()));
                     }
                  } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_LOG) {
                     if (Math.random() <= 0.2) {
                        world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(class_2246.field_10306.method_9564()));
                     }
                  } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_LOG) {
                     if (Math.random() <= 0.2) {
                        world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(class_2246.field_37545.method_9564()));
                     }
                  } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_LOG) {
                     if (Math.random() <= 0.2) {
                        world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(class_2246.field_42729.method_9564()));
                     }
                  } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_LOG && Math.random() <= 0.2) {
                     world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntVanilla.stateOf("pale_oak_log")));
                  }

                  if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_LOG) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_DARK_OAK_LOG.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     _bs = WoodSpecies.applyTo(_bs, WoodSpecies.fromBlock(_bso.method_26204()));
                     world.method_8652(_bp, _bs, 3);
                  } else if (Math.random() <= 0.3) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_LOG_2.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     _bs = WoodSpecies.applyTo(_bs, WoodSpecies.fromBlock(_bso.method_26204()));
                     world.method_8652(_bp, _bs, 3);
                  } else if (Math.random() <= 0.3) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_LOG_3.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     _bs = WoodSpecies.applyTo(_bs, WoodSpecies.fromBlock(_bso.method_26204()));
                     world.method_8652(_bp, _bs, 3);
                  } else {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_LOG.method_9564(), "stage", 1);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     _bs = WoodSpecies.applyTo(_bs, WoodSpecies.fromBlock(_bso.method_26204()));
                     world.method_8652(_bp, _bs, 3);
                  }
               }
            } else {
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var40 = _bs.method_26204().method_9595().method_11663("hot");
               if (var40 instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)var40;
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
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
