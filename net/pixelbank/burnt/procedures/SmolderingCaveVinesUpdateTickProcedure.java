package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingCaveVinesUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_CAVE_VINES.method_9564(), 3);
            return;
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28675) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = class_2246.field_28676.method_9564();
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

         if (Math.random() <= 0.04 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28676) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
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

         if (Math.random() <= 0.007) {
            if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_28676) {
               class_2338 _bp = class_2338.method_49637(x + (double)1.0F, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_28675) {
               class_2338 _bp = class_2338.method_49637(x + (double)1.0F, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.007) {
            if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_28676) {
               class_2338 _bp = class_2338.method_49637(x - (double)1.0F, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_28675) {
               class_2338 _bp = class_2338.method_49637(x - (double)1.0F, y, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.007) {
            if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_28676) {
               class_2338 _bp = class_2338.method_49637(x, y, z - (double)1.0F);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_28675) {
               class_2338 _bp = class_2338.method_49637(x, y, z - (double)1.0F);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.007) {
            if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_28676) {
               class_2338 _bp = class_2338.method_49637(x, y, z + (double)1.0F);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_28675) {
               class_2338 _bp = class_2338.method_49637(x, y, z + (double)1.0F);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.005) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_CAVE_VINES.method_9564();
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
      }

   }
}
