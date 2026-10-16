package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_4970.class_2251;

public class CrackedBlueTerracottaBlock extends class_2248 {
   public static final class_2753 FACING;

   public CrackedBlueTerracottaBlock() {
      super(class_2251.method_9637().method_9629(1.0F, 3.0F));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(FACING, class_2350.method_10139(context.method_8045().method_8409().method_43048(4)));
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return (class_2680)state.method_11657(FACING, rot.method_10503((class_2350)state.method_11654(FACING)));
   }

   public class_2680 method_9569(class_2680 state, class_2415 mirrorIn) {
      return state.method_26186(mirrorIn.method_10345((class_2350)state.method_11654(FACING)));
   }

   static {
      FACING = class_2383.field_11177;
   }
}
