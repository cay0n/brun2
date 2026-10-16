package net.pixelbank.burnt.block;

import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2397;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntLeavesShearsProcedure;
import net.pixelbank.burnt.procedures.BurntLeavesTickProcedure;

public class BurntLeavesBlock extends class_2397 {
   public BurntLeavesBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16028).method_9626(class_2498.field_11535).method_9632(0.2F).method_22488().method_9640().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false).method_50013().method_26243((bs, br, bp) -> false).method_26245((bs, br, bp) -> false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 3;
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      BurntLeavesTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntLeavesShearsProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }
}
