package net.pixelbank.burnt.block;

import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.FlagPoleBlockAddedProcedure;
import net.pixelbank.burnt.procedures.FlagPoleBlockValidPlacementConditionProcedure;

public class RedFlagBlock extends class_2248 {
   private static final class_265 SHAPE = method_9541((double)4.0F, (double)0.0F, (double)4.0F, (double)12.0F, (double)32.0F, (double)12.0F);

   public RedFlagBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11547).method_9629(1.0F, 10.0F).method_22488().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false));
   }

   public boolean method_9579(class_2680 state, class_1922 reader, class_2338 pos) {
      return true;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public class_265 method_26159(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return class_259.method_1073();
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return SHAPE;
   }

   public boolean method_9558(class_2680 blockstate, class_4538 worldIn, class_2338 pos) {
      if (worldIn instanceof class_1936 world) {
         int x = pos.method_10263();
         int y = pos.method_10264();
         int z = pos.method_10260();
         return FlagPoleBlockValidPlacementConditionProcedure.execute(world, (double)x, (double)y, (double)z);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      FlagPoleBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }
}
