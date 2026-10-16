package net.pixelbank.burnt.block;

import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2251;

public class SplashBlock extends class_2248 {
   public SplashBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_27884).method_9618().method_9634().method_51371());
   }

   public boolean method_9579(class_2680 state, class_1922 reader, class_2338 pos) {
      return true;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(class_2246.field_10124);
   }
}
