package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2533;
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
import net.pixelbank.burnt.procedures.FireDamageProcedure;
import net.pixelbank.burnt.procedures.TrapdoorBurnTickProcedure;
import net.pixelbank.burnt.procedures.WoodParticlesProcedure;

public class SmolderingMangroveTrapdoorBlock extends class_2533 {
   public SmolderingMangroveTrapdoorBlock() {
      super(class_8177.field_42823, class_2251.method_9637().method_31710(class_3620.field_16002).method_9626(class_2498.field_11547).method_9632(3.0F).method_9631((s) -> 10).method_22488().method_50012(class_3619.field_15971).method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_26236((bs, br, bp) -> false).method_50013().method_51368(class_2766.field_12651));
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_MANGROVE_TRAPDOOR);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 20);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      TrapdoorBurnTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 20);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      WoodParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      FireDamageProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      FireDamageProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }
}
