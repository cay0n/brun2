package net.pixelbank.burnt.block;

import net.minecraft.class_1297;
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
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntCactusBlockValidPlacementConditionProcedure;
import net.pixelbank.burnt.procedures.CactusDamageProcedure;

public class BurntCactusBlock extends class_2248 {
   private static final class_265 SHAPE = method_9541((double)1.0F, (double)0.0F, (double)1.0F, (double)15.0F, (double)16.0F, (double)15.0F);

   public BurntCactusBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16028).method_9626(class_2498.field_11543).method_9632(0.4F).method_22488().method_26236((bs, br, bp) -> false));
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
         return BurntCactusBlockValidPlacementConditionProcedure.execute(world, (double)x, (double)y, (double)z);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      CactusDamageProcedure.execute(world, entity);
   }
}
