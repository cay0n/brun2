package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class GrassTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double recovery = (double)0.0F;
      if (!world.method_8608()) {
         if ((Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get() <= (double)100.0F) {
            recovery = (Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get();
         } else {
            recovery = (double)30.0F;
         }

         if (world instanceof class_1937) {
            class_1937 _lvl3 = (class_1937)world;
            if (_lvl3.method_8530() && (double)class_3532.method_15395(world.method_8409(), 0, 100) <= recovery) {
               if ((world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_FURTILE) || world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_FURTILE) || world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_FURTILE) || world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_FURTILE)) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
                  class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                  class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_GROWS).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_BURNT_GROWS)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10566.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }
            }
         }

         if ((world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z)) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124 && Math.random() <= 0.2) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_GROWS).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if ((world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z)) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_BURNT_GROWS) && Math.random() <= 0.2) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_10219.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }
}
