package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.CookedMushroomBlockstatesProcedure;
import net.pixelbank.burnt.procedures.CookedRedMushroomBlockAddedProcedure;
import net.pixelbank.burnt.procedures.CookedRedMushroomNeighbourProcedure;

public class CookedRedMushroomBlockBlock extends class_2248 {
   public static final class_2758 BLOCKSTATE = class_2758.method_11867("blockstate", 0, 64);
   public static final class_2746 HOT = class_2746.method_11825("hot");
   public static final class_2746 UP;
   public static final class_2746 DOWN;
   public static final class_2746 NORTH;
   public static final class_2746 EAST;
   public static final class_2746 SOUTH;
   public static final class_2746 WEST;
   private static final class_265 SHAPE;

   public CookedRedMushroomBlockBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11547).method_9629(1.0F, 0.2F).method_9631((s) -> ((<undefinedtype>)(new Object() {
            public int getLightLevel() {
               if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 1) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 2) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 3) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 4) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 5) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 6) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 7) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 8) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 9) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 10) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 11) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 12) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 13) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 14) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 15) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 16) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 17) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 18) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 19) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 20) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 21) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 22) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 23) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 24) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 25) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 26) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 27) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 28) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 29) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 30) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 31) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 32) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 33) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 34) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 35) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 36) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 37) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 38) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 39) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 40) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 41) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 42) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 43) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 44) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 45) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 46) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 47) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 48) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 49) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 50) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 51) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 52) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 53) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 54) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 55) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 56) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 57) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 58) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 59) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 60) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 61) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 62) {
                  return 0;
               } else if ((Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 63) {
                  return 0;
               } else {
                  return (Integer)s.method_11654(CookedRedMushroomBlockBlock.BLOCKSTATE) == 64 ? 0 : 0;
               }
            }
         })).getLightLevel()).method_50012(class_3619.field_15971));
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(HOT, false)).method_11657(UP, true)).method_11657(DOWN, true)).method_11657(NORTH, true)).method_11657(EAST, true)).method_11657(SOUTH, true)).method_11657(WEST, true));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return SHAPE;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{HOT, UP, DOWN, NORTH, EAST, SOUTH, WEST, BLOCKSTATE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(HOT, false)).method_11657(UP, true)).method_11657(DOWN, true)).method_11657(NORTH, true)).method_11657(EAST, true)).method_11657(SOUTH, true)).method_11657(WEST, true);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 1);
      CookedRedMushroomBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      CookedRedMushroomNeighbourProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      CookedMushroomBlockstatesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 1);
   }

   static {
      UP = class_2741.field_12519;
      DOWN = class_2741.field_12546;
      NORTH = class_2741.field_12489;
      EAST = class_2741.field_12487;
      SOUTH = class_2741.field_12540;
      WEST = class_2741.field_12527;
      SHAPE = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
   }
}
