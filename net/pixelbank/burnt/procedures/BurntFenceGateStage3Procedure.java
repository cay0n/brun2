package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class BurntFenceGateStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_FENCE_GATES).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bsNew = world.method_8320(_pos);
            class_2769 var15 = _bsNew.method_26204().method_9595().method_11663("waterlogged");
            if (var15 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var15;
               world.method_8652(_pos, (class_2680)_bsNew.method_11657(_booleanProp, false), 3);
            }

            return;
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 250) <= burnTime) {
            if (Math.random() <= 0.05) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_FENCE_GATES).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               _bp = class_2338.method_49637(x, y, z);
               _bs = world.method_8320(_bp);
               class_2769 _pos = _bs.method_26204().method_9595().method_11663("waterlogged");
               if (_pos instanceof class_2746) {
                  class_2746 _booleanProp = (class_2746)_pos;
                  world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
               }
            }
         }
      }

   }
}
