package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntPlanksStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_PLANKS.method_9564(), 3);
            return;
         }

         if (Math.random() <= 0.05) {
            RandomCollapseProcedure.execute(world, x, y, z);
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 250) <= burnTime) {
            if (Math.random() <= 0.05) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_SLAB.method_9564();
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var15) {
                     }
                  }
               }

               world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_PLANKS.method_9564()));
            } else if (Math.random() <= 0.05) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
               world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SMOLDERING_PLANKS.method_9564()));
               if (world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  _level.method_14199(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.5F, y + (double)0.5F, z + (double)0.5F, 10, (double)1.0F, (double)1.0F, (double)1.0F, 0.1);
               }
            } else if (Math.random() <= 0.1) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BLAZING_PLANKS.method_9564();
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var14) {
                     }
                  }
               }
            } else if (Math.random() <= 0.2) {
               class_2338 var10001 = class_2338.method_49637(x, y, z);
               class_2769 var21 = BurntModBlocks.EMBER_PLANKS.method_9595().method_11663("hot");
               class_2680 var10002;
               if (var21 instanceof class_2746) {
                  class_2746 _withbp10 = (class_2746)var21;
                  var10002 = (class_2680)BurntModBlocks.EMBER_PLANKS.method_9564().method_11657(_withbp10, true);
               } else {
                  var10002 = BurntModBlocks.EMBER_PLANKS.method_9564();
               }

               world.method_8652(var10001, var10002, 3);
            } else {
               world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_PLANKS.method_9564(), 3);
            }
         }
      }

   }
}
