package net.pixelbank.burnt.block;

import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2465;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3737;
import net.minecraft.class_8567;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.util.BurntAshDrops;

public class SmallBurntLogBlock extends class_2248 implements class_3737 {
   public static final class_2754<class_2350.class_2351> AXIS;
   public static final class_2746 WATERLOGGED;
   public static final class_2746 NORTH;
   public static final class_2746 EAST;
   public static final class_2746 SOUTH;
   public static final class_2746 WEST;
   public static final class_2746 UP;
   public static final class_2746 DOWN;
   private static final class_265 SHAPE_X;
   private static final class_265 SHAPE_Y;
   private static final class_265 SHAPE_Z;

   public SmallBurntLogBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16007).method_9626(class_2498.field_11547).method_9632(2.0F).method_22488().method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(AXIS, class_2351.field_11052)).method_11657(WATERLOGGED, false)).method_11657(NORTH, false)).method_11657(EAST, false)).method_11657(SOUTH, false)).method_11657(WEST, false)).method_11657(UP, false)).method_11657(DOWN, false));
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
      class_265 var10000;
      switch ((class_2350.class_2351)state.method_11654(AXIS)) {
         case field_11048 -> var10000 = SHAPE_X;
         case field_11052 -> var10000 = SHAPE_Y;
         case field_11051 -> var10000 = SHAPE_Z;
         default -> var10000 = SHAPE_Y;
      }

      return var10000;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{AXIS, WATERLOGGED, NORTH, EAST, SOUTH, WEST, UP, DOWN});
   }

   public class_2680 method_9605(class_1750 context) {
      boolean flag = context.method_8045().method_8316(context.method_8037()).method_15772() == class_3612.field_15910;
      class_2680 placed = (class_2680)((class_2680)super.method_9605(context).method_11657(AXIS, context.method_8038().method_10166())).method_11657(WATERLOGGED, flag);
      return SmallSmolderingLogBlock.withConnections(context.method_8045(), context.method_8037(), placed);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return class_2465.method_36377(state, rot);
   }

   public class_3610 method_9545(class_2680 state) {
      return (Boolean)state.method_11654(WATERLOGGED) ? class_3612.field_15910.method_15729(false) : super.method_9545(state);
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      if ((Boolean)state.method_11654(WATERLOGGED)) {
         world.method_39281(currentPos, class_3612.field_15910, class_3612.field_15910.method_15789(world));
      }

      state = SmallSmolderingLogBlock.withConnections(world, currentPos, state);
      return super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   public List<class_1799> method_9560(class_2680 state, class_8567.class_8568 builder) {
      List<class_1799> drops = super.method_9560(state, builder);
      BurntAshDrops.appendAsh(drops, builder);
      return drops;
   }

   static {
      AXIS = class_2741.field_12496;
      WATERLOGGED = class_2741.field_12508;
      NORTH = class_2741.field_12489;
      EAST = class_2741.field_12487;
      SOUTH = class_2741.field_12540;
      WEST = class_2741.field_12527;
      UP = class_2741.field_12519;
      DOWN = class_2741.field_12546;
      SHAPE_X = method_9541((double)0.0F, (double)4.0F, (double)4.0F, (double)16.0F, (double)12.0F, (double)12.0F);
      SHAPE_Y = method_9541((double)4.0F, (double)0.0F, (double)4.0F, (double)12.0F, (double)16.0F, (double)12.0F);
      SHAPE_Z = method_9541((double)4.0F, (double)4.0F, (double)0.0F, (double)12.0F, (double)12.0F, (double)16.0F);
   }
}
