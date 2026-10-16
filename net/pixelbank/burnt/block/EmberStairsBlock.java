package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2510;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2746;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.procedures.EmberStairsTickProcedure;
import net.pixelbank.burnt.procedures.WoodParticlesProcedure;

public class EmberStairsBlock extends class_2510 {
   public static final class_2746 HOT = class_2746.method_11825("hot");

   public EmberStairsBlock() {
      super(class_2246.field_10124.method_9564(), class_2251.method_9637().method_31710(class_3620.field_16027).method_9626(class_2498.field_11547).method_9629(1.5F, 2.0F).method_9631((s) -> 8).method_9640().method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(HOT, false));
   }

   public float method_9520() {
      return 2.0F;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{HOT});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(HOT, false);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, world.method_8409().method_43048(600) + 600);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      EmberStairsTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, world.method_8409().method_43048(600) + 600);
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      EmberStairsTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
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
