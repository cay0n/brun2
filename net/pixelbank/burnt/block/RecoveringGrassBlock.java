package net.pixelbank.burnt.block;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1821;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2256;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_9062;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.BurntDirtNeighbourBlockChangesProcedure;
import net.pixelbank.burnt.procedures.BurntFarmlandHoeProcedure;
import net.pixelbank.burnt.procedures.GrassPathProcedure;
import net.pixelbank.burnt.procedures.GrassStartProcedure;
import net.pixelbank.burnt.procedures.RecoveringGrassBlockAddedProcedure;
import net.pixelbank.burnt.procedures.RecoveringGrassOnTickUpdateProcedure;
import net.pixelbank.burnt.util.BurntBonemeal;
import net.pixelbank.burnt.util.BurntTags;

public class RecoveringGrassBlock extends class_2248 implements class_2256 {
   public RecoveringGrassBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16018).method_9626(class_2498.field_11529).method_9632(0.5F).method_9640());
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_GRASS);
   }

   public class_9062 method_55765(class_1799 stack, class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_1268 hand, class_3965 hit) {
      if (stack.method_31573(BurntTags.ITEM_MC_HOES)) {
         BurntFarmlandHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
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
         BurntFarmlandHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else if (held.method_7909() instanceof class_1821) {
         GrassPathProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else {
         return class_1269.field_5811;
      }
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      GrassStartProcedure.convertPlantsAbove(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      RecoveringGrassBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 serverLevel = (class_3218)world;
            if ((Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get()) {
               double speed = (Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get();
               if (!(speed <= (double)0.0F)) {
                  if (!serverLevel.method_14196().method_8674(pos, this)) {
                     this.scheduleNextStep(serverLevel, pos, speed);
                  }

               }
            }
         }
      }
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      BurntDirtNeighbourBlockChangesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      if ((Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get()) {
         double speed = (Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get();
         if (!(speed <= (double)0.0F)) {
            double p = speed / (double)100.0F * (speed / (double)100.0F);
            if (Math.random() < p) {
               RecoveringGrassOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
            }

            if (world.method_8320(pos).method_26204() == this && !world.method_14196().method_8674(pos, this)) {
               this.scheduleNextStep(world, pos, speed);
            }

         }
      }
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      if ((Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get()) {
         double speed = (Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get();
         if (!(speed <= (double)0.0F)) {
            RecoveringGrassOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
            if (world.method_8320(pos).method_26204() == this) {
               this.scheduleNextStep(world, pos, speed);
            }

         }
      }
   }

   private void scheduleNextStep(class_3218 world, class_2338 pos, double speed) {
      world.method_39279(pos, this, ticksUntilNextStep(speed));
   }

   private static int ticksUntilNextStep(double speed) {
      double exp = ((double)100.0F - speed) / (double)50.0F;
      double ticks = (double)20.0F * Math.pow((double)41.0F, exp);
      return (int)Math.max((double)20.0F, ticks);
   }

   public boolean method_9651(class_4538 level, class_2338 pos, class_2680 state) {
      return (Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get();
   }

   public boolean method_9650(class_1937 level, class_5819 random, class_2338 pos, class_2680 state) {
      return true;
   }

   public void method_9652(class_3218 level, class_5819 random, class_2338 pos, class_2680 state) {
      BurntBonemeal.spread(level, random, pos, this, class_2246.field_10219.method_9564());
   }
}
