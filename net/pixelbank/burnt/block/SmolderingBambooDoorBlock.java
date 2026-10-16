package net.pixelbank.burnt.block;

import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2766;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_8177;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.BambooDoorTickProcedure;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;

public class SmolderingBambooDoorBlock extends class_2323 {
   public SmolderingBambooDoorBlock() {
      super(class_8177.field_42823, class_2251.method_9637().method_31710(class_3620.field_16002).method_9626(class_2498.field_11547).method_9632(3.0F).method_9631((s) -> 15).method_22488().method_50012(class_3619.field_15971).method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 10;
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_BAMBOO_DOOR);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 60);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      BambooDoorTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 60);
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }
}
