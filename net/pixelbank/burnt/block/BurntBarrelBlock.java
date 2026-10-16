package net.pixelbank.burnt.block;

import net.minecraft.class_1264;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2318;
import net.minecraft.class_2338;
import net.minecraft.class_2343;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2586;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3908;
import net.minecraft.class_3965;
import net.minecraft.class_5819;
import net.minecraft.class_9062;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.block.entity.BurntBarrelBlockEntity;
import net.pixelbank.burnt.procedures.BarrelFlamesPlacementProcedure;
import net.pixelbank.burnt.procedures.BurntBarrelOnTickUpdateProcedure;

public class BurntBarrelBlock extends class_2248 implements class_2343 {
   public static final class_2758 BLOCKSTATE = class_2758.method_11867("blockstate", 0, 1);
   public static final class_2753 FACING;
   public static final class_2746 HOT;
   public static final class_2746 OPEN;
   private static final class_265 SHAPE_NORTH;
   private static final class_265 SHAPE_SOUTH;
   private static final class_265 SHAPE_EAST;
   private static final class_265 SHAPE_WEST;
   private static final class_265 SHAPE_UP;
   private static final class_265 SHAPE_DOWN;

   public BurntBarrelBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9632(2.5F).method_9631((s) -> ((<undefinedtype>)(new Object() {
            public int getLightLevel() {
               return (Integer)s.method_11654(BurntBarrelBlock.BLOCKSTATE) == 1 ? 0 : 0;
            }
         })).getLightLevel()));
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043)).method_11657(HOT, false)).method_11657(OPEN, false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
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
      builder.method_11667(new class_2769[]{FACING, HOT, OPEN, BLOCKSTATE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(FACING, context.method_7715().method_10153())).method_11657(HOT, false)).method_11657(OPEN, false);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return (class_2680)state.method_11657(FACING, rot.method_10503((class_2350)state.method_11654(FACING)));
   }

   public class_2680 method_9569(class_2680 state, class_2415 mirrorIn) {
      return state.method_26186(mirrorIn.method_10345((class_2350)state.method_11654(FACING)));
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 1);
      BarrelFlamesPlacementProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      BurntBarrelOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 1);
   }

   protected class_9062 method_55765(class_1799 stack, class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_1268 hand, class_3965 hit) {
      if (!entity.method_18276()) {
         if (entity instanceof class_3222) {
            class_3222 player = (class_3222)entity;
            class_2586 var10 = world.method_8321(pos);
            if (var10 instanceof BurntBarrelBlockEntity) {
               BurntBarrelBlockEntity be = (BurntBarrelBlockEntity)var10;
               player.method_17355(be);
            }
         }

         return class_9062.field_47728;
      } else {
         return class_9062.field_47731;
      }
   }

   public class_1269 method_55766(class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_3965 hit) {
      if (entity instanceof class_3222 player) {
         class_2586 var8 = world.method_8321(pos);
         if (var8 instanceof BurntBarrelBlockEntity be) {
            player.method_17355(be);
         }
      }

      return class_1269.field_5812;
   }

   public class_3908 method_17454(class_2680 state, class_1937 worldIn, class_2338 pos) {
      class_2586 tileEntity = worldIn.method_8321(pos);
      class_3908 var10000;
      if (tileEntity instanceof class_3908 menuProvider) {
         var10000 = menuProvider;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public class_2586 method_10123(class_2338 pos, class_2680 state) {
      return new BurntBarrelBlockEntity(pos, state);
   }

   public boolean method_9592(class_2680 state, class_1937 world, class_2338 pos, int eventID, int eventParam) {
      super.method_9592(state, world, pos, eventID, eventParam);
      class_2586 blockEntity = world.method_8321(pos);
      return blockEntity != null && blockEntity.method_11004(eventID, eventParam);
   }

   public void method_9536(class_2680 state, class_1937 world, class_2338 pos, class_2680 newState, boolean isMoving) {
      if (state.method_26204() != newState.method_26204()) {
         class_2586 blockEntity = world.method_8321(pos);
         if (blockEntity instanceof BurntBarrelBlockEntity) {
            BurntBarrelBlockEntity be = (BurntBarrelBlockEntity)blockEntity;
            class_1264.method_5451(world, pos, be);
            world.method_8455(pos, this);
         }

         super.method_9536(state, world, pos, newState, isMoving);
      }

   }

   public boolean method_9498(class_2680 state) {
      return true;
   }

   public int method_9572(class_2680 blockState, class_1937 world, class_2338 pos) {
      class_2586 tileentity = world.method_8321(pos);
      if (tileentity instanceof BurntBarrelBlockEntity be) {
         return class_1703.method_7618(be);
      } else {
         return 0;
      }
   }

   static {
      FACING = class_2318.field_10927;
      HOT = class_2746.method_11825("hot");
      OPEN = class_2746.method_11825("open");
      SHAPE_NORTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_SOUTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_EAST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_WEST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_UP = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
      SHAPE_DOWN = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
   }
}
