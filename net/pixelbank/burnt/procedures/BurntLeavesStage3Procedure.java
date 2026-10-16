package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class BurntLeavesStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 200) <= burnTime) {
            if (!world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK) && !world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK) && !world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK) && !world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK) && !world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK) && !world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_BURNT_LEAVES_STICK)) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
               --BurntModVariables.WorldVariables.get(world).flameCount;
               BurntModVariables.WorldVariables.get(world).markSyncDirty();
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               if (_bs.method_28498(class_2741.field_12508)) {
                  _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
               }

               world.method_8652(_bp, _bs, 3);
               --BurntModVariables.WorldVariables.get(world).flameCount;
               BurntModVariables.WorldVariables.get(world).markSyncDirty();
            }
         }
      }

   }
}
