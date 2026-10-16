package net.pixelbank.burnt.procedures;

import net.minecraft.class_1752;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class RecoveringGrassOnTickUpdateProcedure {
   private static final double GREEN_UP_CHANCE = 0.4;

   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get()) {
            if (!((Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get() <= (double)0.0F)) {
               if (world instanceof class_1937) {
                  class_1937 _dayLvl = (class_1937)world;
                  if (_dayLvl.method_8530()) {
                     if (Math.random() > 0.4) {
                        return;
                     }

                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = class_2246.field_10219.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     if (Math.random() <= 0.2 && world instanceof class_1937) {
                        class_1937 _level = (class_1937)world;
                        class_2338 _bp = class_2338.method_49637(x, y, z);

                        try {
                           if ((class_1752.method_7720(new class_1799(class_1802.field_8324), _level, _bp) || class_1752.method_7719(new class_1799(class_1802.field_8324), _level, _bp, (class_2350)null)) && !_level.method_8608()) {
                              _level.method_20290(2005, _bp, 0);
                           }
                        } catch (Exception var11) {
                        }
                     }

                     return;
                  }
               }

            }
         }
      }
   }
}
