package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.AshParticlesProcedure;

public class BurntSailBlock extends class_2248 {
   public static final class_2753 FACING;
   private static final class_265 SHAPE_UP;
   private static final class_265 SHAPE_DOWN;
   private static final class_265 SHAPE_NORTH;
   private static final class_265 SHAPE_SOUTH;
   private static final class_265 SHAPE_EAST;
   private static final class_265 SHAPE_WEST;

   public BurntSailBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11543).method_9632(0.8F).method_50012(class_3619.field_15971).method_50013());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11036));
   }

   public class_265 method_9530(class_2680 state, class_1922 level, class_2338 pos, class_3726 context) {
      class_265 var10000;
      switch ((class_2350)state.method_11654(FACING)) {
         case field_11033 -> var10000 = SHAPE_DOWN;
         case field_11043 -> var10000 = SHAPE_NORTH;
         case field_11035 -> var10000 = SHAPE_SOUTH;
         case field_11034 -> var10000 = SHAPE_EAST;
         case field_11039 -> var10000 = SHAPE_WEST;
         default -> var10000 = SHAPE_UP;
      }

      return var10000;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(FACING, context.method_8038().method_10153());
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_SAIL);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      AshParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   static {
      FACING = class_2741.field_12525;
      SHAPE_UP = class_2248.method_9541((double)0.0F, (double)5.0F, (double)0.0F, (double)16.0F, (double)9.0F, (double)16.0F);
      SHAPE_DOWN = class_2248.method_9541((double)0.0F, (double)7.0F, (double)0.0F, (double)16.0F, (double)11.0F, (double)16.0F);
      SHAPE_NORTH = class_2248.method_9541((double)0.0F, (double)0.0F, (double)7.0F, (double)16.0F, (double)16.0F, (double)11.0F);
      SHAPE_SOUTH = class_2248.method_9541((double)0.0F, (double)0.0F, (double)5.0F, (double)16.0F, (double)16.0F, (double)9.0F);
      SHAPE_EAST = class_2248.method_9541((double)7.0F, (double)0.0F, (double)0.0F, (double)11.0F, (double)16.0F, (double)16.0F);
      SHAPE_WEST = class_2248.method_9541((double)5.0F, (double)0.0F, (double)0.0F, (double)9.0F, (double)16.0F, (double)16.0F);
   }
}
