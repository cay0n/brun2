package net.pixelbank.burnt.block;

import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.FireBarrelBlastProcedure;

public class FireBarrelBlastBlockBlock extends class_2248 {
   public FireBarrelBlastBlockBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_44608).method_9629(10.0F, 0.0F).method_9631((s) -> 15).method_9634().method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_51371());
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

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      FireBarrelBlastProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }
}
