package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_3726;
import net.minecraft.class_3737;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2250;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBambooStalkBlockValidPlacementConditionProcedure;

public class BurntBambooStalkBlock extends class_2248 implements class_3737 {
   public static final class_2746 WATERLOGGED;
   private static final class_265 SHAPE;

   public BurntBambooStalkBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11542).method_9632(0.5F).method_22488().method_26236((bs, br, bp) -> false).method_9624().method_49229(class_2250.field_10657).method_50013());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(WATERLOGGED, false));
   }

   public boolean method_9579(class_2680 state, class_1922 reader, class_2338 pos) {
      return state.method_26227().method_15769();
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public class_265 method_26159(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return class_259.method_1073();
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      class_243 offset = state.method_26226(world, pos);
      return SHAPE.method_1096(offset.field_1352, offset.field_1351, offset.field_1350);
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{WATERLOGGED});
   }

   public class_2680 method_9605(class_1750 context) {
      boolean flag = context.method_8045().method_8316(context.method_8037()).method_15772() == class_3612.field_15910;
      return (class_2680)super.method_9605(context).method_11657(WATERLOGGED, flag);
   }

   public boolean method_9558(class_2680 blockstate, class_4538 worldIn, class_2338 pos) {
      if (worldIn instanceof class_1936 world) {
         int x = pos.method_10263();
         int y = pos.method_10264();
         int z = pos.method_10260();
         return BurntBambooStalkBlockValidPlacementConditionProcedure.execute(world, (double)x, (double)y, (double)z);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_3610 method_9545(class_2680 state) {
      return (Boolean)state.method_11654(WATERLOGGED) ? class_3612.field_15910.method_15729(false) : super.method_9545(state);
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      if ((Boolean)state.method_11654(WATERLOGGED)) {
         world.method_39281(currentPos, class_3612.field_15910, class_3612.field_15910.method_15789(world));
      }

      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   static {
      WATERLOGGED = class_2741.field_12508;
      SHAPE = method_9541((double)6.5F, (double)0.0F, (double)6.5F, (double)9.5F, (double)16.0F, (double)9.5F);
   }
}
