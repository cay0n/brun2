package net.pixelbank.burnt.block;

import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntFarmlandEntityWalksOnTheBlockProcedure;
import net.pixelbank.burnt.procedures.BurntFarmlandNeighbourProcedure;
import net.pixelbank.burnt.procedures.BurntFarmlandRightClickedProcedure;
import net.pixelbank.burnt.procedures.BurntFarmlandTickProcedure;

public class BurntFarmlandBlock extends class_2248 {
   private static final class_265 SHAPE = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)15.0F, (double)16.0F);

   public BurntFarmlandBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_15992).method_9626(class_2498.field_11529).method_9632(0.5F).method_22488().method_9640().method_50012(class_3619.field_15971).method_26236((bs, br, bp) -> false));
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
      return SHAPE;
   }

   public class_1269 method_55766(class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_3965 hit) {
      super.method_55766(blockstate, world, pos, entity, hit);
      BurntFarmlandRightClickedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return class_1269.field_5812;
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      BurntFarmlandNeighbourProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      BurntFarmlandTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      BurntFarmlandEntityWalksOnTheBlockProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }
}
