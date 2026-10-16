package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntStrippedLogsStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            return;
         }

         if (Math.random() <= 2.5E-4) {
            RandomCollapseProcedure.execute(world, x, y, z);
         }

         if (Math.random() <= 0.05) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = ((<undefinedtype>)(new Object() {
               public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                  class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                  class_2680 var10000;
                  if (_prop instanceof class_2758 _ip) {
                     if (_prop.method_11898().contains(_newValue)) {
                        var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                        return var10000;
                     }
                  }

                  var10000 = _bs;
                  return var10000;
               }
            })).with(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG.method_9564(), "blockstate", (int)class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.0F));
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (Math.random() <= 0.3) {
            world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.STRIPPED_BURNT_LOG.method_9564()));
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
