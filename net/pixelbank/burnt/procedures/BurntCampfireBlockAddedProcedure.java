package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class BurntCampfireBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get() && getBlockNBTNumber(world, class_2338.method_49637(x, y, z), "tagName") >= (double)1.0F) {
         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_VALID_SPAWN)) {
            class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.BURNT_GRASS.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10566) {
            class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.BURNT_DIRT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }

   private static double getBlockNBTNumber(class_1936 world, class_2338 pos, String tag) {
      class_2586 blockEntity = world.method_8321(pos);
      return blockEntity != null ? (double)0.0F : (double)-1.0F;
   }
}
