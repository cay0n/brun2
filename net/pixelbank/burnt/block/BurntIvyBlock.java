package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2318;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntVineBlockValidPlacementConditionProcedure;

public class BurntIvyBlock extends class_2248 {
   public static final class_2753 FACING;
   private static final class_265 SHAPE_NORTH;
   private static final class_265 SHAPE_SOUTH;
   private static final class_265 SHAPE_EAST;
   private static final class_265 SHAPE_WEST;
   private static final class_265 SHAPE_UP;
   private static final class_265 SHAPE_DOWN;

   public BurntIvyBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11535).method_9618().method_22488().method_26236((bs, br, bp) -> false));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043));
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
      class_265 var10000;
      switch ((class_2350)state.method_11654(FACING)) {
         case field_11043 -> var10000 = SHAPE_NORTH;
         case field_11035 -> var10000 = SHAPE_SOUTH;
         case field_11034 -> var10000 = SHAPE_EAST;
         case field_11039 -> var10000 = SHAPE_WEST;
         case field_11036 -> var10000 = SHAPE_UP;
         case field_11033 -> var10000 = SHAPE_DOWN;
         default -> var10000 = SHAPE_NORTH;
      }

      return var10000;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(FACING, context.method_7715().method_10153());
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return (class_2680)state.method_11657(FACING, rot.method_10503((class_2350)state.method_11654(FACING)));
   }

   public class_2680 method_9569(class_2680 state, class_2415 mirrorIn) {
      return state.method_26186(mirrorIn.method_10345((class_2350)state.method_11654(FACING)));
   }

   public boolean method_9558(class_2680 blockstate, class_4538 worldIn, class_2338 pos) {
      if (worldIn instanceof class_1936 world) {
         int x = pos.method_10263();
         int y = pos.method_10264();
         int z = pos.method_10260();
         return BurntVineBlockValidPlacementConditionProcedure.execute(world, (double)x, (double)y, (double)z, blockstate);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   static {
      FACING = class_2318.field_10927;
      SHAPE_NORTH = method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_SOUTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F);
      SHAPE_EAST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F);
      SHAPE_WEST = method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_UP = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)1.0F, (double)16.0F);
      SHAPE_DOWN = method_9541((double)0.0F, (double)15.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
   }
}
