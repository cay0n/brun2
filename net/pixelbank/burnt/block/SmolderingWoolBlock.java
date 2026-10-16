package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.BurntLogsFireDamageProcedure;
import net.pixelbank.burnt.procedures.BurntPumpkinFlamesProcedure;
import net.pixelbank.burnt.procedures.SmolderingPlanksParticlesProcedure;
import net.pixelbank.burnt.procedures.SmolderingWoolTickProcedure;

public class SmolderingWoolBlock extends class_2248 {
   public static final class_2746 HOT = class_2746.method_11825("hot");

   public SmolderingWoolBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16002).method_9626(class_2498.field_11543).method_9632(0.8F).method_9631((s) -> 12).method_50012(class_3619.field_15971).method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_50013());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(HOT, false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{HOT});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(HOT, false);
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_WOOL);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 1);
      BurntPumpkinFlamesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      SmolderingWoolTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 1);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      SmolderingPlanksParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }
}
