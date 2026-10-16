package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderLogAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_LOG) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_SMOLDERING_LOGS).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
      }

   }
}
