package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.TestSootValidPlacementProcedure;

public class SootBlockBlock extends class_2248 {
   public static final class_2758 BLOCKSTATE = class_2758.method_11867("blockstate", 0, 4);
   public static final class_2753 FACING;
   public static final class_2746 NORTH;
   public static final class_2746 SOUTH;
   public static final class_2746 EAST;
   public static final class_2746 WEST;
   private static final class_265 SHAPE_1_NORTH;
   private static final class_265 SHAPE_1_SOUTH;
   private static final class_265 SHAPE_1_EAST;
   private static final class_265 SHAPE_1_WEST;
   private static final class_265 SHAPE_2_NORTH;
   private static final class_265 SHAPE_2_SOUTH;
   private static final class_265 SHAPE_2_EAST;
   private static final class_265 SHAPE_2_WEST;
   private static final class_265 SHAPE_3_NORTH;
   private static final class_265 SHAPE_3_SOUTH;
   private static final class_265 SHAPE_3_EAST;
   private static final class_265 SHAPE_3_WEST;
   private static final class_265 SHAPE_4_NORTH;
   private static final class_265 SHAPE_4_SOUTH;
   private static final class_265 SHAPE_4_EAST;
   private static final class_265 SHAPE_4_WEST;
   private static final class_265 SHAPE_NORTH;
   private static final class_265 SHAPE_SOUTH;
   private static final class_265 SHAPE_EAST;
   private static final class_265 SHAPE_WEST;

   public SootBlockBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11526).method_9618().method_9631((s) -> ((<undefinedtype>)(new Object() {
            public int getLightLevel() {
               if ((Integer)s.method_11654(SootBlockBlock.BLOCKSTATE) == 1) {
                  return 0;
               } else if ((Integer)s.method_11654(SootBlockBlock.BLOCKSTATE) == 2) {
                  return 0;
               } else if ((Integer)s.method_11654(SootBlockBlock.BLOCKSTATE) == 3) {
                  return 0;
               } else {
                  return (Integer)s.method_11654(SootBlockBlock.BLOCKSTATE) == 4 ? 0 : 0;
               }
            }
         })).getLightLevel()).method_9634().method_22488().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false).method_51371());
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043)).method_11657(NORTH, false)).method_11657(SOUTH, false)).method_11657(EAST, false)).method_11657(WEST, false));
   }

   public boolean method_9522(class_2680 state, class_2680 adjacentBlockState, class_2350 side) {
      return adjacentBlockState.method_26204() == this ? true : super.method_9522(state, adjacentBlockState, side);
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
      if ((Integer)state.method_11654(BLOCKSTATE) == 1) {
         class_265 var8;
         switch ((class_2350)state.method_11654(FACING)) {
            case field_11043 -> var8 = SHAPE_1_NORTH;
            case field_11035 -> var8 = SHAPE_1_SOUTH;
            case field_11034 -> var8 = SHAPE_1_EAST;
            case field_11039 -> var8 = SHAPE_1_WEST;
            default -> var8 = SHAPE_1_NORTH;
         }

         return var8;
      } else if ((Integer)state.method_11654(BLOCKSTATE) == 2) {
         class_265 var7;
         switch ((class_2350)state.method_11654(FACING)) {
            case field_11043 -> var7 = SHAPE_2_NORTH;
            case field_11035 -> var7 = SHAPE_2_SOUTH;
            case field_11034 -> var7 = SHAPE_2_EAST;
            case field_11039 -> var7 = SHAPE_2_WEST;
            default -> var7 = SHAPE_2_NORTH;
         }

         return var7;
      } else if ((Integer)state.method_11654(BLOCKSTATE) == 3) {
         class_265 var6;
         switch ((class_2350)state.method_11654(FACING)) {
            case field_11043 -> var6 = SHAPE_3_NORTH;
            case field_11035 -> var6 = SHAPE_3_SOUTH;
            case field_11034 -> var6 = SHAPE_3_EAST;
            case field_11039 -> var6 = SHAPE_3_WEST;
            default -> var6 = SHAPE_3_NORTH;
         }

         return var6;
      } else if ((Integer)state.method_11654(BLOCKSTATE) == 4) {
         class_265 var5;
         switch ((class_2350)state.method_11654(FACING)) {
            case field_11043 -> var5 = SHAPE_4_NORTH;
            case field_11035 -> var5 = SHAPE_4_SOUTH;
            case field_11034 -> var5 = SHAPE_4_EAST;
            case field_11039 -> var5 = SHAPE_4_WEST;
            default -> var5 = SHAPE_4_NORTH;
         }

         return var5;
      } else {
         class_265 var10000;
         switch ((class_2350)state.method_11654(FACING)) {
            case field_11043 -> var10000 = SHAPE_NORTH;
            case field_11035 -> var10000 = SHAPE_SOUTH;
            case field_11034 -> var10000 = SHAPE_EAST;
            case field_11039 -> var10000 = SHAPE_WEST;
            default -> var10000 = SHAPE_NORTH;
         }

         return var10000;
      }
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING, NORTH, SOUTH, EAST, WEST, BLOCKSTATE});
   }

   public class_2680 method_9605(class_1750 context) {
      return context.method_8038().method_10166() == class_2351.field_11052 ? (class_2680)((class_2680)((class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(FACING, class_2350.field_11043)).method_11657(NORTH, false)).method_11657(SOUTH, false)).method_11657(EAST, false)).method_11657(WEST, false) : (class_2680)((class_2680)((class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(FACING, context.method_8038())).method_11657(NORTH, false)).method_11657(SOUTH, false)).method_11657(EAST, false)).method_11657(WEST, false);
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
         return TestSootValidPlacementProcedure.execute(world, (double)x, (double)y, (double)z);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   static {
      FACING = class_2383.field_11177;
      NORTH = class_2746.method_11825("north");
      SOUTH = class_2746.method_11825("south");
      EAST = class_2746.method_11825("east");
      WEST = class_2746.method_11825("west");
      SHAPE_1_NORTH = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F));
      SHAPE_1_SOUTH = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F));
      SHAPE_1_EAST = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F));
      SHAPE_1_WEST = class_259.method_1084(method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F));
      SHAPE_2_NORTH = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F));
      SHAPE_2_SOUTH = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F));
      SHAPE_2_EAST = class_259.method_1084(method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F));
      SHAPE_2_WEST = class_259.method_1084(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F));
      SHAPE_3_NORTH = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F)});
      SHAPE_3_SOUTH = class_259.method_17786(method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F)});
      SHAPE_3_EAST = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F)});
      SHAPE_3_WEST = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F)});
      SHAPE_4_NORTH = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), new class_265[]{method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F)});
      SHAPE_4_SOUTH = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F)});
      SHAPE_4_EAST = class_259.method_17786(method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F)});
      SHAPE_4_WEST = class_259.method_17786(method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F), new class_265[]{method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F), method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F), method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F)});
      SHAPE_NORTH = method_9541((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_SOUTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F);
      SHAPE_EAST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F);
      SHAPE_WEST = method_9541((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
   }
}
