package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_3620;
import net.minecraft.class_3737;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.AshParticlesProcedure;

public class BurntBookshelfBlock extends class_2248 implements class_3737 {
   public static final class_2746 WATERLOGGED;

   public BurntBookshelfBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9632(1.5F).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(WATERLOGGED, false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{WATERLOGGED});
   }

   public class_2680 method_9605(class_1750 context) {
      boolean flag = context.method_8045().method_8316(context.method_8037()).method_15772() == class_3612.field_15910;
      return (class_2680)super.method_9605(context).method_11657(WATERLOGGED, flag);
   }

   public class_3610 method_9545(class_2680 state) {
      return (Boolean)state.method_11654(WATERLOGGED) ? class_3612.field_15910.method_15729(false) : super.method_9545(state);
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      if ((Boolean)state.method_11654(WATERLOGGED)) {
         world.method_39281(currentPos, class_3612.field_15910, class_3612.field_15910.method_15789(world));
      }

      return super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      AshParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   static {
      WATERLOGGED = class_2741.field_12508;
   }
}
