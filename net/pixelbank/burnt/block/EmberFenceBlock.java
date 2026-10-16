package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2354;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2758;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.procedures.EmberFencesTickProcedure;
import net.pixelbank.burnt.procedures.WoodParticlesProcedure;

public class EmberFenceBlock extends class_2354 {
   public static final class_2758 STAGE = class_2758.method_11867("stage", 0, 3);

   public EmberFenceBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9629(1.5F, 2.0F).method_9631((s) -> 6).method_9640().method_50013().method_51368(class_2766.field_12651).method_51369());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(STAGE, 0));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{STAGE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(STAGE, 0);
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      EmberFencesTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
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
}
