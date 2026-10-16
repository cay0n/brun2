package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class GrassFlamesAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == BurntModBlocks.FIRE_BARREL) {
            class_2338 _bp = class_2338.method_49637(x + (double)1.0F, y, z);
            class_2680 _bs = BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == BurntModBlocks.FIRE_BARREL) {
            class_2338 _bp = class_2338.method_49637(x - (double)1.0F, y, z);
            class_2680 _bs = BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == BurntModBlocks.FIRE_BARREL) {
            class_2338 _bp = class_2338.method_49637(x, y, z - (double)1.0F);
            class_2680 _bs = BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == BurntModBlocks.FIRE_BARREL) {
            class_2338 _bp = class_2338.method_49637(x, y, z + (double)1.0F);
            class_2680 _bs = BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
