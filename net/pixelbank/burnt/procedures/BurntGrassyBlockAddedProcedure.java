package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class BurntGrassyBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_TALL_GRASS)) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.TALL_GRASS_FIRE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_REPLACEABLE) || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_FLOWERS)) {
            world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
         }

         if (Math.random() <= (double)0.25F) {
            BurntMod.queueServerWork(50, () -> WillitburnProcedure.execute(world, x, y, z));
         }
      }

   }
}
