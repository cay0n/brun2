package net.pixelbank.burnt.block;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1927;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2766;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3620;
import net.minecraft.class_3965;
import net.minecraft.class_9062;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.FireBarrelBlastProcedure;
import net.pixelbank.burnt.procedures.FireBarrelEntityCollidesProcedure;
import net.pixelbank.burnt.procedures.FireBarrelNeighbourBlockChangesProcedure;
import net.pixelbank.burnt.procedures.FireBarrelRedstoneOnProcedure;

public class FireBarrelBlock extends class_2248 {
   public FireBarrelBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_25702).method_9626(class_2498.field_11547).method_9629(1.8F, 10.0F).method_50013().method_51368(class_2766.field_12651));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      if (world.method_49804(pos) > 0) {
         FireBarrelRedstoneOnProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      }

      FireBarrelNeighbourBlockChangesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9586(class_1937 world, class_2338 pos, class_1927 e) {
      super.method_9586(world, pos, e);
      FireBarrelBlastProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public boolean method_9533(class_1927 explosion) {
      return false;
   }

   protected class_9062 method_55765(class_1799 stack, class_2680 state, class_1937 level, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
      if (!stack.method_31574(class_1802.field_8884) && !stack.method_31574(class_1802.field_8814)) {
         return super.method_55765(stack, state, level, pos, player, hand, hit);
      } else {
         FireBarrelRedstoneOnProcedure.execute(level, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
         level.method_8396(player, pos, stack.method_31574(class_1802.field_8814) ? class_3417.field_15013 : class_3417.field_15145, class_3419.field_15245, 1.0F, level.method_8409().method_43057() * 0.4F + 0.8F);
         if (!player.method_7337()) {
            if (stack.method_31574(class_1802.field_8884)) {
               stack.method_7970(1, player, class_1309.method_56079(hand));
            } else {
               stack.method_57008(1, player);
            }
         }

         player.method_7259(class_3468.field_15372.method_14956(stack.method_7909()));
         return class_9062.method_55644(level.field_9236);
      }
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      FireBarrelEntityCollidesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      FireBarrelEntityCollidesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }
}
