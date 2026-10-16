package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntFarmlandNeighbourProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26225()) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.BURNT_DIRT.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
      }

   }
}
