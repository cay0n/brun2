package net.pixelbank.burnt.block;

import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2766;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_8177;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;

public class BurntDarkOakDoorBlock extends class_2323 {
   public BurntDarkOakDoorBlock() {
      super(class_8177.field_42823, class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9632(3.0F).method_22488().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }
}
