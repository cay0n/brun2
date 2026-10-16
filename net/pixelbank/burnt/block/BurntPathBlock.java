package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.AshParticlesProcedure;
import net.pixelbank.burnt.procedures.BurntPathNeighbourBlockChangesProcedure;

public class BurntPathBlock extends class_2248 {
   private static final class_265 SHAPE = method_9541((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)15.0F, (double)16.0F);

   public BurntPathBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_15988).method_9626(class_2498.field_11529).method_9629(0.6F, 3.0F).method_22488().method_26236((bs, br, bp) -> false));
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

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      BurntPathNeighbourBlockChangesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      AshParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }
}
