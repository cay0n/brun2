package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class SmolderingCobwebOnTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x + (double)1.0F, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x - (double)1.0F, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x, y, z - (double)1.0F);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x, y, z + (double)1.0F);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1 && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10343) {
            class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_COBWEB.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.05) {
            world.method_22352(class_2338.method_49637(x, y, z), false);
         }
      }

   }
}
