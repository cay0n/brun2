package net.pixelbank.burnt.block;

import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2482;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.FallingSlabTickProcedure;

public class FallingBurntSlabBlock extends class_2482 {
   public FallingBurntSlabBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9618().method_22488().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 1);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      FallingSlabTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 1);
   }
}
