package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class HighGrassTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (Math.random() <= 0.1) {
         WillitburnProcedure.execute(world, x, y, z);
         if (world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F, false);
            }
         }
      }

      if (!BurntProtection.stopBurning(world, x, y, z) && !(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
         if (!(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && Math.random() <= 0.05) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_HIGH_GRASS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
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
                  } catch (Exception var13) {
                  }
               }
            }
         }
      } else if (!world.method_8401().method_156() && !BurntProtection.stopBurning(world, x, y, z)) {
         if (!world.method_8401().method_156() && !BurntProtection.stopBurning(world, x, y, z) && Math.random() <= 0.05) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_HIGH_GRASS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
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
         }
      } else {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.BURNT_HIGH_GRASS.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
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
      }

   }
}
