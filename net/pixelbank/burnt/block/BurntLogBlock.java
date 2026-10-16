package net.pixelbank.burnt.block;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2465;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_8567;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.procedures.BurntLogOnTickUpdateProcedure;
import net.pixelbank.burnt.procedures.BurntLogsParticlesProcedure;
import net.pixelbank.burnt.util.BurntAshDrops;
import net.pixelbank.burnt.util.WoodSpecies;

public class BurntLogBlock extends class_2248 {
   public static final class_2754<class_2350.class_2351> AXIS;
   public static final class_2746 FRAGILE;
   public static final class_2754<WoodSpecies> SPECIES;
   private static final double RANDOM_TICK_GATE = (double)0.0F;

   public BurntLogBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16007).method_9626(class_2498.field_11547).method_9632(2.0F).method_9640().method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(AXIS, class_2351.field_11052)).method_11657(FRAGILE, false)).method_11657(SPECIES, WoodSpecies.UNKNOWN));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{AXIS, FRAGILE, SPECIES});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)((class_2680)super.method_9605(context).method_11657(AXIS, context.method_8038().method_10166())).method_11657(FRAGILE, false)).method_11657(SPECIES, WoodSpecies.UNKNOWN);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return class_2465.method_36377(state, rot);
   }

   public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(state, world, pos, random);
      if ((Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
         double speed = (Double)BurntBasicConfigConfiguration.FOREST_RECOVER_SPEED.get();
         if (!(speed <= (double)0.0F)) {
            if (speed >= (double)0.0F) {
               BurntLogOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), state);
            }

            class_2680 current = world.method_8320(pos);
            if (current.method_26204() == this && (Boolean)current.method_11654(FRAGILE) && !world.method_14196().method_8674(pos, this)) {
               this.scheduleNextBreakdown(world, pos, speed);
            }

         }
      }
   }

   public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(state, world, pos, random);
      if ((Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
         double speed = (Double)BurntBasicConfigConfiguration.FOREST_RECOVER_SPEED.get();
         if (!(speed <= (double)0.0F)) {
            BurntLogOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), state);
            class_2680 current = world.method_8320(pos);
            if (current.method_26204() == this && (Boolean)current.method_11654(FRAGILE)) {
               this.scheduleNextBreakdown(world, pos, speed);
            }

         }
      }
   }

   private void scheduleNextBreakdown(class_3218 world, class_2338 pos, double speed) {
      world.method_39279(pos, this, ticksUntilNextBreakdown(speed));
   }

   private static int ticksUntilNextBreakdown(double speed) {
      double exp = ((double)100.0F - speed) / (double)50.0F;
      double ticks = (double)20.0F * Math.pow((double)60.0F, exp);
      return (int)Math.max((double)20.0F, ticks);
   }

   public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(state, world, pos, oldState, moving);
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 serverLevel = (class_3218)world;
            if ((Boolean)state.method_11654(FRAGILE)) {
               if ((Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
                  double speed = (Double)BurntBasicConfigConfiguration.FOREST_RECOVER_SPEED.get();
                  if (!(speed <= (double)0.0F)) {
                     if (!serverLevel.method_14196().method_8674(pos, this)) {
                        this.scheduleNextBreakdown(serverLevel, pos, speed);
                     }

                  }
               }
            }
         }
      }
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      BurntLogsParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   public List<class_1799> method_9560(class_2680 state, class_8567.class_8568 builder) {
      List<class_1799> drops = super.method_9560(state, builder);
      BurntAshDrops.appendAsh(drops, builder);
      return drops;
   }

   static {
      AXIS = class_2741.field_12496;
      FRAGILE = class_2746.method_11825("fragile");
      SPECIES = class_2754.method_11850("species", WoodSpecies.class);
   }
}
