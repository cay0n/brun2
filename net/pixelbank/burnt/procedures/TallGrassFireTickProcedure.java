package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
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

public class TallGrassFireTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.TALL_GRASS_BURNT.method_9564(), 3);
            return;
         }

         if (Math.random() <= 0.1 && world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F, false);
            }
         }

         if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            if (world.method_8401().method_156()) {
               if (IsRainingProcedure.execute(world, x, y, z)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.TALL_GRASS_BURNT.method_9564();
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
               } else if (Math.random() <= 0.1) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.TALL_GRASS_BURNT.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }
            } else if (Math.random() <= 0.1) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.TALL_GRASS_BURNT.method_9564();
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
         } else if (!(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && Math.random() <= 0.1) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.TALL_GRASS_BURNT.method_9564();
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

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10219) {
            class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_GRASS_START.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.025) {
            WillitburnProcedure.execute(world, x, y + (double)1.0F, z);
         }

         if (Math.random() <= 0.2) {
            SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
         }
      }

   }
}
