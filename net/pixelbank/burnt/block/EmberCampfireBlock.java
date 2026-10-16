package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
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
import net.minecraft.class_2753;
import net.minecraft.class_2758;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.procedures.BurntCampfireBlockAddedProcedure;
import net.pixelbank.burnt.procedures.EmberCampfireUpdateTickProcedure;
import net.pixelbank.burnt.procedures.WoodParticlesProcedure;

public class EmberCampfireBlock extends class_2248 {
   public static final class_2753 FACING;
   public static final class_2758 STAGE;
   private static final class_265 SHAPE_NORTH;
   private static final class_265 SHAPE_SOUTH;
   private static final class_265 SHAPE_EAST;
   private static final class_265 SHAPE_WEST;

   public EmberCampfireBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9632(2.0F).method_9631((s) -> 6).method_22488().method_9640().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043)).method_11657(STAGE, 0));
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
         default -> var10000 = SHAPE_NORTH;
      }

      return var10000;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING, STAGE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)super.method_9605(context).method_11657(FACING, context.method_8042().method_10153())).method_11657(STAGE, 0);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return (class_2680)state.method_11657(FACING, rot.method_10503((class_2350)state.method_11654(FACING)));
   }

   public class_2680 method_9569(class_2680 state, class_2415 mirrorIn) {
      return state.method_26186(mirrorIn.method_10345((class_2350)state.method_11654(FACING)));
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      BurntCampfireBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      EmberCampfireUpdateTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      WoodParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   static {
      FACING = class_2383.field_11177;
      STAGE = class_2758.method_11867("stage", 0, 3);
      SHAPE_NORTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)7.0F, (double)16.0F);
      SHAPE_SOUTH = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)7.0F, (double)16.0F);
      SHAPE_EAST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)7.0F, (double)16.0F);
      SHAPE_WEST = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)7.0F, (double)16.0F);
   }
}
