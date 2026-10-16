package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
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
import net.minecraft.class_2758;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3737;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.procedures.BurntLogsFireDamageProcedure;
import net.pixelbank.burnt.procedures.BurntLogsParticlesProcedure;
import net.pixelbank.burnt.procedures.SmallLogsSnowballProcedure;
import net.pixelbank.burnt.procedures.SmallLogsTickProcedure;
import net.pixelbank.burnt.util.BurntTags;

public class SmallSmolderingLogBlock extends class_2248 implements class_3737 {
   public static final class_2754<class_2350.class_2351> AXIS;
   public static final class_2746 WATERLOGGED;
   public static final class_2746 NORTH;
   public static final class_2746 EAST;
   public static final class_2746 SOUTH;
   public static final class_2746 WEST;
   public static final class_2746 UP;
   public static final class_2746 DOWN;
   public static final class_2758 STAGE;
   private static final class_265 SHAPE_X;
   private static final class_265 SHAPE_Y;
   private static final class_265 SHAPE_Z;

   public static class_2680 deriveConnections(class_2680 state) {
      if (!state.method_28498(NORTH)) {
         return state;
      } else if (!(Boolean)state.method_11654(NORTH) && !(Boolean)state.method_11654(EAST) && !(Boolean)state.method_11654(SOUTH) && !(Boolean)state.method_11654(WEST) && !(Boolean)state.method_11654(UP) && !(Boolean)state.method_11654(DOWN)) {
         class_2680 var10000;
         switch ((class_2350.class_2351)state.method_11654(AXIS)) {
            case field_11048 -> var10000 = (class_2680)((class_2680)state.method_11657(EAST, true)).method_11657(WEST, true);
            case field_11051 -> var10000 = (class_2680)((class_2680)state.method_11657(NORTH, true)).method_11657(SOUTH, true);
            default -> var10000 = (class_2680)((class_2680)state.method_11657(UP, true)).method_11657(DOWN, true);
         }

         return var10000;
      } else {
         return state;
      }
   }

   public static class_2680 withConnections(class_1936 world, class_2338 pos, class_2680 state) {
      if (!state.method_28498(NORTH)) {
         return state;
      } else {
         for(class_2350 d : class_2350.values()) {
            boolean axisEnd = d.method_10166() == state.method_11654(AXIS);
            state = (class_2680)state.method_11657(propertyFor(d), axisEnd || connectable(world.method_8320(pos.method_10093(d))));
         }

         return state;
      }
   }

   public static boolean connectable(class_2680 neighbour) {
      return neighbour.method_27852(BurntModBlocks.SMALL_SMOLDERING_LOG) || neighbour.method_27852(BurntModBlocks.SMALL_BURNT_LOG) || neighbour.method_26164(BurntTags.BLOCK_BURNS_TO_SMALL_LOG);
   }

   private static class_2746 propertyFor(class_2350 d) {
      class_2746 var10000;
      switch (d) {
         case field_11043 -> var10000 = NORTH;
         case field_11034 -> var10000 = EAST;
         case field_11035 -> var10000 = SOUTH;
         case field_11039 -> var10000 = WEST;
         case field_11036 -> var10000 = UP;
         case field_11033 -> var10000 = DOWN;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public SmallSmolderingLogBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16020).method_9626(class_2498.field_11547).method_9632(2.0F).method_9631((s) -> 10).method_22488().method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(AXIS, class_2351.field_11052)).method_11657(STAGE, 0)).method_11657(WATERLOGGED, false)).method_11657(NORTH, false)).method_11657(EAST, false)).method_11657(SOUTH, false)).method_11657(WEST, false)).method_11657(UP, false)).method_11657(DOWN, false));
   }

   public boolean method_9522(class_2680 state, class_2680 adjacentBlockState, class_2350 side) {
      return adjacentBlockState.method_26204() == this ? true : super.method_9522(state, adjacentBlockState, side);
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
         case field_11051 -> var10000 = SHAPE_Z;
         case field_11052 -> var10000 = SHAPE_Y;
         default -> var10000 = SHAPE_Y;
      }

      return var10000;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{AXIS, STAGE, WATERLOGGED, NORTH, EAST, SOUTH, WEST, UP, DOWN});
   }

   public class_2680 method_9605(class_1750 context) {
      boolean flag = context.method_8045().method_8316(context.method_8037()).method_15772() == class_3612.field_15910;
      class_2680 placed = (class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(AXIS, context.method_8038().method_10166())).method_11657(STAGE, 0)).method_11657(WATERLOGGED, flag);
      return withConnections(context.method_8045(), context.method_8037(), placed);
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

      state = withConnections(world, currentPos, state);
      return super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.SMALL_BURNT_LOG);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 16);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      SmallLogsTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 16);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      BurntLogsParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }

   public void method_19286(class_1937 world, class_2680 blockstate, class_3965 hit, class_1676 entity) {
      SmallLogsSnowballProcedure.execute(world, (double)hit.method_17777().method_10263(), (double)hit.method_17777().method_10264(), (double)hit.method_17777().method_10260(), entity);
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
      STAGE = class_2758.method_11867("stage", 0, 3);
      SHAPE_X = method_9541((double)0.0F, (double)4.0F, (double)4.0F, (double)16.0F, (double)12.0F, (double)12.0F);
      SHAPE_Y = method_9541((double)4.0F, (double)0.0F, (double)4.0F, (double)12.0F, (double)16.0F, (double)12.0F);
      SHAPE_Z = method_9541((double)4.0F, (double)4.0F, (double)0.0F, (double)12.0F, (double)12.0F, (double)16.0F);
   }
}
