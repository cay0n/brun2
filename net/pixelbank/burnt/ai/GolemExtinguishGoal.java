package net.pixelbank.burnt.ai;

import java.util.EnumSet;
import net.minecraft.class_1352;
import net.minecraft.class_1439;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3481;
import net.minecraft.class_6862;
import net.minecraft.class_7924;
import net.minecraft.class_1352.class_4134;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.procedures.ExtinguishBlockProcedure;

public class GolemExtinguishGoal extends class_1352 {
   private static final class_6862<class_2248> FIRE_TAG;
   private static final int SEEK_RADIUS = 6;
   private static final int SCAN_INTERVAL = 20;
   private boolean cachedCanUse = false;
   private static final double SWING_RANGE_SQ = (double)4.0F;
   private static final double FALLBACK_RANGE_SQ = (double)16.0F;
   private static final long COOLDOWN_TICKS = 100L;
   private static final int SWING_DELAY_TICKS = 15;
   private final class_1439 golem;
   private class_2338 targetFire = null;
   private long lastExtinguishTime = -4611686018427387904L;
   private int swingCountdown = -1;

   public GolemExtinguishGoal(class_1439 golem) {
      this.golem = golem;
      this.method_6265(EnumSet.of(class_4134.field_18405));
   }

   public boolean method_6264() {
      if (!BurntBasicConfigConfiguration.get().iron_golem_fight_fires) {
         return false;
      } else {
         long now = this.golem.method_37908().method_8510();
         if (now - this.lastExtinguishTime < 100L) {
            return false;
         } else if ((now + (long)this.golem.method_5628()) % 20L == 0L) {
            this.targetFire = this.findNearestFire();
            this.cachedCanUse = this.targetFire != null;
            return this.cachedCanUse;
         } else {
            return this.cachedCanUse && this.targetFire != null;
         }
      }
   }

   public boolean method_6266() {
      if (this.swingCountdown >= 0) {
         return true;
      } else {
         return this.targetFire == null ? false : this.golem.method_37908().method_8320(this.targetFire).method_26164(FIRE_TAG);
      }
   }

   public void method_6269() {
      if (this.targetFire != null) {
         this.golem.method_5942().method_6337((double)this.targetFire.method_10263() + (double)0.5F, (double)this.targetFire.method_10264(), (double)this.targetFire.method_10260() + (double)0.5F, (double)1.0F);
      }

   }

   public void method_6268() {
      if (this.swingCountdown >= 0) {
         if (this.swingCountdown % 10 == 0) {
            this.golem.method_37908().method_8421(this.golem, (byte)4);
         }

         if (this.swingCountdown == 0) {
            if (this.targetFire != null) {
               this.golem.method_37908().method_20290(1009, this.targetFire, 0);
               class_1937 var2 = this.golem.method_37908();
               if (var2 instanceof class_3218) {
                  class_3218 serverLevel = (class_3218)var2;
                  serverLevel.method_14199(BurntModParticleTypes.FIRE_PARTICLE, (double)this.targetFire.method_10263() + (double)0.5F, (double)this.targetFire.method_10264() + (double)0.5F, (double)this.targetFire.method_10260() + (double)0.5F, 24, 0.4, 0.4, 0.4, 0.15);
               }

               ExtinguishBlockProcedure.execute(this.golem.method_37908(), (double)this.targetFire.method_10263(), (double)this.targetFire.method_10264(), (double)this.targetFire.method_10260(), false);
            }

            this.lastExtinguishTime = this.golem.method_37908().method_8510();
            this.targetFire = null;
            this.swingCountdown = -1;
         } else {
            --this.swingCountdown;
         }

      } else if (this.targetFire != null) {
         this.golem.method_5988().method_6230((double)this.targetFire.method_10263() + (double)0.5F, (double)this.targetFire.method_10264() + (double)0.5F, (double)this.targetFire.method_10260() + (double)0.5F, 30.0F, 30.0F);
         double distSq = this.golem.method_5649((double)this.targetFire.method_10263() + (double)0.5F, (double)this.targetFire.method_10264() + (double)0.5F, (double)this.targetFire.method_10260() + (double)0.5F);
         boolean idealRange = distSq <= (double)4.0F;
         boolean navStuck = this.golem.method_5942().method_6357() && distSq <= (double)16.0F;
         if (idealRange || navStuck) {
            this.golem.method_5942().method_6340();
            this.swingCountdown = 15;
         }

      }
   }

   public void method_6270() {
      this.targetFire = null;
      this.swingCountdown = -1;
      this.cachedCanUse = false;
      this.golem.method_5942().method_6340();
   }

   private class_2338 findNearestFire() {
      class_1937 level = this.golem.method_37908();
      class_2338 golemPos = this.golem.method_24515();
      class_2338 nearest = null;
      double nearestDistSq = Double.MAX_VALUE;

      for(class_2338 pos : class_2338.method_10097(golemPos.method_10069(-6, -2, -6), golemPos.method_10069(6, 3, 6))) {
         class_2680 state = level.method_8320(pos);
         if (state.method_26164(FIRE_TAG) && !state.method_27852(class_2246.field_10164) && state.method_26204() != BurntModBlocks.SMOLDERING_COAL && state.method_26204() != class_2246.field_17350 && state.method_26204() != class_2246.field_23860 && state.method_26204() != BurntModBlocks.SMOLDERING_CAMPFIRE && (!state.method_27852(class_2246.field_10036) || !level.method_8320(pos.method_10074()).method_27852(class_2246.field_10515)) && !state.method_26164(class_3481.field_23799) && state.method_26204() != BurntModBlocks.SMOLDERING_CAMPFIRE && state.method_26204() != BurntModBlocks.EMBER_CAMPFIRE) {
            double distSq = golemPos.method_10262(pos);
            if (distSq < nearestDistSq) {
               nearestDistSq = distSq;
               nearest = pos.method_10062();
            }
         }
      }

      return nearest;
   }

   static {
      FIRE_TAG = class_6862.method_40092(class_7924.field_41254, class_2960.method_60655("burnt", "on_fire"));
   }
}
