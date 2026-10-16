package net.pixelbank.burnt.ai;

import java.util.EnumSet;
import net.minecraft.class_1314;
import net.minecraft.class_1352;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_6862;
import net.minecraft.class_7924;
import net.minecraft.class_1352.class_4134;

public class FleeFireGoal extends class_1352 {
   private static final class_6862<class_2248> FIRE_TAG;
   private static final int SCAN_RADIUS = 5;
   private static final int SCAN_INTERVAL = 20;
   private final class_1314 mob;
   private final double speed;
   private double fleeX;
   private double fleeY;
   private double fleeZ;
   private boolean cachedCanUse = false;

   public FleeFireGoal(class_1314 mob, double speed) {
      this.mob = mob;
      this.speed = speed;
      this.method_6265(EnumSet.of(class_4134.field_18405));
   }

   public boolean method_6264() {
      class_1937 level = this.mob.method_37908();
      if ((level.method_8510() + (long)this.mob.method_5628()) % 20L != 0L) {
         return this.cachedCanUse;
      } else {
         this.cachedCanUse = this.scanForFire(level);
         return this.cachedCanUse;
      }
   }

   private boolean scanForFire(class_1937 level) {
      class_2338 mobPos = this.mob.method_24515();
      double sumX = (double)0.0F;
      double sumZ = (double)0.0F;
      int count = 0;

      for(class_2338 pos : class_2338.method_10097(mobPos.method_10069(-5, -2, -5), mobPos.method_10069(5, 4, 5))) {
         if (level.method_8320(pos).method_26164(FIRE_TAG)) {
            sumX += (double)pos.method_10263();
            sumZ += (double)pos.method_10260();
            ++count;
         }
      }

      if (count == 0) {
         return false;
      } else {
         double centroidX = sumX / (double)count;
         double centroidZ = sumZ / (double)count;
         class_243 mobPos3 = this.mob.method_19538();
         double dx = mobPos3.field_1352 - centroidX;
         double dz = mobPos3.field_1350 - centroidZ;
         double len = Math.sqrt(dx * dx + dz * dz);
         if (len < 0.001) {
            dx = -Math.sin(Math.toRadians((double)this.mob.method_36454()));
            dz = Math.cos(Math.toRadians((double)this.mob.method_36454()));
            len = (double)1.0F;
         }

         this.fleeX = mobPos3.field_1352 + dx / len * (double)16.0F;
         this.fleeY = mobPos3.field_1351;
         this.fleeZ = mobPos3.field_1350 + dz / len * (double)16.0F;
         return this.mob.method_5942().method_6352(this.fleeX, this.fleeY, this.fleeZ, 0) != null;
      }
   }

   public boolean method_6266() {
      return !this.mob.method_5942().method_6357();
   }

   public void method_6269() {
      this.mob.method_5942().method_6337(this.fleeX, this.fleeY, this.fleeZ, this.speed);
   }

   public void method_6270() {
      this.mob.method_5942().method_6340();
      this.cachedCanUse = false;
   }

   static {
      FIRE_TAG = class_6862.method_40092(class_7924.field_41254, class_2960.method_60655("burnt", "fire"));
   }
}
