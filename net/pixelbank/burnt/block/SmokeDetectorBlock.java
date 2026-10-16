package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2738;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.util.BurntTags;

public class SmokeDetectorBlock extends class_2248 {
   public static final class_2746 POWERED;
   public static final class_2754<class_2738> FACE;
   public static final class_2753 FACING;
   private static final int RADIUS = 7;
   private static final int SCAN_INTERVAL = 20;
   private static final class_265 SHAPE_FLOOR;
   private static final class_265 SHAPE_CEILING;
   private static final class_265 SHAPE_WALL_NORTH;
   private static final class_265 SHAPE_WALL_SOUTH;
   private static final class_265 SHAPE_WALL_EAST;
   private static final class_265 SHAPE_WALL_WEST;

   public SmokeDetectorBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16005).method_9626(class_2498.field_11544).method_9629(0.5F, 3.0F).method_22488());
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACE, class_2738.field_12475)).method_11657(FACING, class_2350.field_11043)).method_11657(POWERED, false));
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      builder.method_11667(new class_2769[]{FACE, FACING, POWERED});
   }

   public class_2680 method_9605(class_1750 ctx) {
      class_2350 clicked = ctx.method_8038();
      class_2350 hDir = ctx.method_8042().method_10153();
      class_2680 var10000;
      switch (clicked) {
         case field_11036 -> var10000 = (class_2680)((class_2680)this.method_9564().method_11657(FACE, class_2738.field_12475)).method_11657(FACING, hDir);
         case field_11033 -> var10000 = (class_2680)((class_2680)this.method_9564().method_11657(FACE, class_2738.field_12473)).method_11657(FACING, hDir);
         default -> var10000 = (class_2680)((class_2680)this.method_9564().method_11657(FACE, class_2738.field_12471)).method_11657(FACING, clicked);
      }

      return var10000;
   }

   public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
      boolean var10000;
      switch ((class_2738)state.method_11654(FACE)) {
         case field_12475:
            var10000 = world.method_8320(pos.method_10074()).method_26206(world, pos.method_10074(), class_2350.field_11036);
            break;
         case field_12473:
            var10000 = world.method_8320(pos.method_10084()).method_26206(world, pos.method_10084(), class_2350.field_11033);
            break;
         case field_12471:
            class_2350 wallDir = ((class_2350)state.method_11654(FACING)).method_10153();
            class_2338 wallPos = pos.method_10093(wallDir);
            var10000 = world.method_8320(wallPos).method_26206(world, wallPos, (class_2350)state.method_11654(FACING));
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 ctx) {
      class_265 var10000;
      switch ((class_2738)state.method_11654(FACE)) {
         case field_12475:
            var10000 = SHAPE_FLOOR;
            break;
         case field_12473:
            var10000 = SHAPE_CEILING;
            break;
         case field_12471:
            switch ((class_2350)state.method_11654(FACING)) {
               case field_11043:
                  var10000 = SHAPE_WALL_NORTH;
                  return var10000;
               case field_11035:
                  var10000 = SHAPE_WALL_SOUTH;
                  return var10000;
               case field_11034:
                  var10000 = SHAPE_WALL_EAST;
                  return var10000;
               case field_11039:
                  var10000 = SHAPE_WALL_WEST;
                  return var10000;
               default:
                  var10000 = SHAPE_FLOOR;
                  return var10000;
            }
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 ctx) {
      return class_259.method_1073();
   }

   public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      if (!world.method_8608()) {
         world.method_39279(pos, this, 20);
      }

   }

   public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
      boolean shouldBePowered = this.scanForFire(world, pos);
      if (shouldBePowered != (Boolean)state.method_11654(POWERED)) {
         world.method_8652(pos, (class_2680)state.method_11657(POWERED, shouldBePowered), 3);

         for(class_2350 dir : class_2350.values()) {
            world.method_8492(pos.method_10093(dir), this, pos);
         }
      }

      world.method_39279(pos, this, 20);
   }

   private boolean scanForFire(class_1937 world, class_2338 center) {
      for(class_2338 nearby : class_2338.method_10097(center.method_10069(-7, -7, -7), center.method_10069(7, 7, 7))) {
         if (world.method_8320(nearby).method_26164(BurntTags.BLOCK_ON_FIRE)) {
            return true;
         }
      }

      return false;
   }

   public boolean method_9506(class_2680 state) {
      return true;
   }

   public int method_9524(class_2680 state, class_1922 world, class_2338 pos, class_2350 dir) {
      return (Boolean)state.method_11654(POWERED) ? 15 : 0;
   }

   static {
      POWERED = class_2741.field_12484;
      FACE = class_2741.field_12555;
      FACING = class_2741.field_12481;
      SHAPE_FLOOR = class_2248.method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)8.0F, (double)16.0F);
      SHAPE_CEILING = class_2248.method_9541((double)0.0F, (double)8.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_WALL_NORTH = class_2248.method_9541((double)0.0F, (double)0.0F, (double)8.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_WALL_SOUTH = class_2248.method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)8.0F);
      SHAPE_WALL_EAST = class_2248.method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)8.0F, (double)16.0F, (double)16.0F);
      SHAPE_WALL_WEST = class_2248.method_9541((double)8.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
   }
}
