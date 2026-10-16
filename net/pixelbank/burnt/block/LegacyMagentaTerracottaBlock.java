package net.pixelbank.burnt.block;

import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class LegacyMagentaTerracottaBlock extends class_2248 {
   public static final class_2753 FACING;

   public LegacyMagentaTerracottaBlock() {
      super(class_2251.method_9637().method_9629(1.0F, 3.0F).method_9640());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043));
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      builder.method_11667(new class_2769[]{FACING});
   }

   public void method_9514(class_2680 state, class_3218 level, class_2338 pos, class_5819 random) {
      level.method_8652(pos, BurntBlockUtil.copyProperties(state, BurntModBlocks.CRACKED_MAGENTA_TERRACOTTA.method_9564()), 3);
   }

   static {
      FACING = class_2383.field_11177;
   }
}
