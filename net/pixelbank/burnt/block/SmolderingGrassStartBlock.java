package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1799;
import net.minecraft.class_1821;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_9062;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntDirtNeighbourBlockChangesProcedure;
import net.pixelbank.burnt.procedures.BurntGrassDestroyedProcedure;
import net.pixelbank.burnt.procedures.BurntGrassParticlesProcedure;
import net.pixelbank.burnt.procedures.BurntGrassSnowballProcedure;
import net.pixelbank.burnt.procedures.BurntGrassStartTickProcedure;
import net.pixelbank.burnt.procedures.GrassHoeProcedure;
import net.pixelbank.burnt.procedures.GrassPathProcedure;
import net.pixelbank.burnt.procedures.GrassStartProcedure;
import net.pixelbank.burnt.procedures.SmolderingBlockAddedProcedure;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingGrassStartBlock extends class_2248 {
   public SmolderingGrassStartBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_15995).method_9626(class_2498.field_11529).method_9632(0.5F).method_9631((s) -> 12).method_22488().method_26236((bs, br, bp) -> false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public class_265 method_26159(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return class_259.method_1073();
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(class_2246.field_10219);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      GrassStartProcedure.convertPlantsAbove(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 5);
      SmolderingBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      BurntDirtNeighbourBlockChangesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      BurntGrassStartTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 5);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      BurntGrassParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntGrassDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   public void method_19286(class_1937 world, class_2680 blockstate, class_3965 hit, class_1676 entity) {
      BurntGrassSnowballProcedure.execute(world, (double)hit.method_17777().method_10263(), (double)hit.method_17777().method_10264(), (double)hit.method_17777().method_10260(), entity);
   }

   public class_9062 method_55765(class_1799 stack, class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_1268 hand, class_3965 hit) {
      if (stack.method_31573(BurntTags.ITEM_MC_HOES)) {
         GrassHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_9062.field_47728;
      } else if (stack.method_7909() instanceof class_1821) {
         GrassPathProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_9062.field_47728;
      } else {
         return class_9062.field_47732;
      }
   }

   public class_1269 method_55766(class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_3965 hit) {
      class_1799 held = entity.method_6047();
      if (held.method_31573(BurntTags.ITEM_MC_HOES)) {
         GrassHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else if (held.method_7909() instanceof class_1821) {
         GrassPathProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else {
         return class_1269.field_5811;
      }
   }
}
