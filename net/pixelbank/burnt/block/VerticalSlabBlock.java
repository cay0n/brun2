package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_3726;
import net.minecraft.class_3737;
import net.minecraft.class_4970;

public class VerticalSlabBlock extends class_2248 implements class_3737 {
   public static final class_2754<VerticalSlabType> TYPE = class_2754.method_11850("type", VerticalSlabType.class);
   public static final class_2746 WATERLOGGED;

   public VerticalSlabBlock(class_4970.class_2251 properties) {
      super(properties);
      this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(TYPE, VerticalSlabType.NORTH)).method_11657(WATERLOGGED, false));
   }

   public boolean method_9526(class_2680 state) {
      return state.method_11654(TYPE) != VerticalSlabType.DOUBLE;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      builder.method_11667(new class_2769[]{TYPE, WATERLOGGED});
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return ((VerticalSlabType)state.method_11654(TYPE)).shape;
   }

   public class_2680 method_9605(class_1750 context) {
      class_2338 pos = context.method_8037();
      class_2680 existing = context.method_8045().method_8320(pos);
      if (existing.method_27852(this)) {
         return (class_2680)((class_2680)existing.method_11657(TYPE, VerticalSlabType.DOUBLE)).method_11657(WATERLOGGED, false);
      } else {
         boolean water = context.method_8045().method_8316(pos).method_15772() == class_3612.field_15910;
         return (class_2680)((class_2680)this.method_9564().method_11657(TYPE, VerticalSlabType.fromDirection(this.getDirectionForPlacement(context)))).method_11657(WATERLOGGED, water);
      }
   }

   private class_2350 getDirectionForPlacement(class_1750 context) {
      class_2350 face = context.method_8038();
      if (face.method_10166().method_10179()) {
         return face.method_10153();
      } else {
         class_243 hit = context.method_17698();
         double dx = hit.field_1352 - (double)context.method_8037().method_10263() - (double)0.5F;
         double dz = hit.field_1350 - (double)context.method_8037().method_10260() - (double)0.5F;
         return Math.abs(dx) > Math.abs(dz) ? (dx > (double)0.0F ? class_2350.field_11034 : class_2350.field_11039) : (dz > (double)0.0F ? class_2350.field_11035 : class_2350.field_11043);
      }
   }

   public boolean method_9616(class_2680 state, class_1750 context) {
      VerticalSlabType type = (VerticalSlabType)state.method_11654(TYPE);
      if (type != VerticalSlabType.DOUBLE && context.method_8041().method_31574(this.method_8389())) {
         if (!context.method_7717()) {
            return true;
         } else {
            return context.method_8038() == type.direction;
         }
      } else {
         return false;
      }
   }

   public class_3610 method_9545(class_2680 state) {
      return (Boolean)state.method_11654(WATERLOGGED) ? class_3612.field_15910.method_15729(false) : super.method_9545(state);
   }

   public boolean method_10311(class_1936 world, class_2338 pos, class_2680 state, class_3610 fluidState) {
      return state.method_11654(TYPE) != VerticalSlabType.DOUBLE && super.method_10311(world, pos, state, fluidState);
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      if ((Boolean)state.method_11654(WATERLOGGED)) {
         world.method_39281(currentPos, class_3612.field_15910, class_3612.field_15910.method_15789(world));
      }

      return super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   static {
      WATERLOGGED = class_2741.field_12508;
   }
}
