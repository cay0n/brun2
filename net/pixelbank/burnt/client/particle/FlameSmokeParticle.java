package net.pixelbank.burnt.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2400;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3481;
import net.minecraft.class_3999;
import net.minecraft.class_4002;
import net.minecraft.class_4003;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.procedures.ParticleWindMultiplyerProcedure;
import net.pixelbank.burnt.procedures.WindAngleXProcedure;
import net.pixelbank.burnt.procedures.WindAngleZProcedure;
import net.pixelbank.burnt.util.BurntSmokeBudget;
import net.pixelbank.burnt.util.BurntTags;

@Environment(EnvType.CLIENT)
public class FlameSmokeParticle extends class_4003 {
   private final class_4002 spriteSet;
   private final class_2338 originBlock;
   private double windFactor;
   private int windFactorCountdown;
   private final double windBias;
   private final double windSkewCos;
   private final double windSkewSin;
   private final double windFollow;
   private static final int WIND_FACTOR_INTERVAL = 20;
   private static long windTick = Long.MIN_VALUE;
   private static double windX;
   private static double windZ;
   private static final double WIND_FOLLOW = 0.06;
   private static final double NEAR_DISTANCE = (double)32.0F;
   private static final double FAR_DISTANCE = (double)160.0F;
   private static final double MAX_DISTANCE_SCALE = (double)3.0F;
   private boolean budgetReleased = false;

   public static FlameSmokeParticleProvider provider(class_4002 spriteSet) {
      return new FlameSmokeParticleProvider(spriteSet);
   }

   private static void refreshWind(class_638 level) {
      long t = level.method_8510();
      if (t != windTick) {
         windTick = t;
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            windX = WindAngleXProcedure.execute(level) / (double)25.0F;
            windZ = WindAngleZProcedure.execute(level) / (double)25.0F;
         } else {
            windX = (double)0.0F;
            windZ = (double)0.0F;
         }

      }
   }

   protected FlameSmokeParticle(class_638 world, double x, double y, double z, double vx, double vy, double vz, class_4002 spriteSet) {
      super(world, x, y, z);
      this.originBlock = class_2338.method_49637(x, y, z);
      BurntSmokeBudget.acquire(world);
      float _shade = 0.65F + this.field_3840.method_43057() * 0.35F;
      this.method_3084(_shade, _shade, _shade);
      this.spriteSet = spriteSet;
      this.method_3080(1.0F, 1.0F);
      this.field_17867 *= 7.0F;
      this.field_17867 *= 0.6F + this.field_3840.method_43057() * 1.2F;
      this.field_3847 = 60 + this.field_3840.method_43048(391);
      this.field_3844 = -0.07F - this.field_3840.method_43057() * 0.06F;
      this.field_3862 = false;
      this.field_3852 = vx * (double)1.0F;
      this.field_3869 = vy * (double)1.0F;
      this.field_3850 = vz * (double)1.0F;
      this.windFactor = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
      this.windFactorCountdown = 1 + this.field_3840.method_43048(20);
      this.windBias = (double)0.75F + this.field_3840.method_43058() * (double)0.5F;
      double skew = (this.field_3840.method_43058() - (double)0.5F) * 0.8;
      this.windSkewCos = Math.cos(skew);
      this.windSkewSin = Math.sin(skew);
      this.windFollow = 0.06 * (0.6 + this.field_3840.method_43058() * 0.8);
      this.method_18142(spriteSet);
   }

   public class_3999 method_18122() {
      return class_3999.field_17829;
   }

   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         class_2338 at = class_2338.method_49637(this.field_3874, this.field_3854, this.field_3871);
         if (!at.equals(this.originBlock)) {
            class_2680 hit = this.field_3851.method_8320(at);
            if ((hit.method_26216(this.field_3851, at) || hit.method_26164(class_3481.field_15490)) && !hit.method_26164(BurntTags.BLOCK_ON_FIRE)) {
               this.method_3085();
               return;
            }
         }

         this.method_18142(this.spriteSet);
         if (--this.windFactorCountdown <= 0) {
            this.windFactorCountdown = 20;
            this.windFactor = ParticleWindMultiplyerProcedure.execute(this.field_3851, this.field_3874, this.field_3854, this.field_3871);
         }

         refreshWind(this.field_3851);
         double wx = windX * this.windSkewCos - windZ * this.windSkewSin;
         double wz = windX * this.windSkewSin + windZ * this.windSkewCos;
         double gust = this.windFactor * this.windBias;
         this.field_3852 += (wx * gust - this.field_3852) * this.windFollow;
         this.field_3850 += (wz * gust - this.field_3850) * this.windFollow;
      }

   }

   public float method_18132(float partialTicks) {
      float base = super.method_18132(partialTicks);
      class_4184 cam = class_310.method_1551().field_1773.method_19418();
      if (cam == null) {
         return base;
      } else {
         class_243 eye = cam.method_19326();
         double dx = this.field_3874 - eye.field_1352;
         double dy = this.field_3854 - eye.field_1351;
         double dz = this.field_3871 - eye.field_1350;
         double d = Math.sqrt(dx * dx + dy * dy + dz * dz);
         if (d <= (double)32.0F) {
            return base;
         } else {
            double t = Math.min((double)1.0F, (d - (double)32.0F) / (double)128.0F);
            return (float)((double)base * ((double)1.0F + t * (double)2.0F));
         }
      }
   }

   public void method_3085() {
      if (!this.budgetReleased) {
         this.budgetReleased = true;
         BurntSmokeBudget.release();
      }

      super.method_3085();
   }

   public static class FlameSmokeParticleProvider implements class_707<class_2400> {
      private final class_4002 spriteSet;

      public FlameSmokeParticleProvider(class_4002 spriteSet) {
         this.spriteSet = spriteSet;
      }

      public class_703 createParticle(class_2400 typeIn, class_638 worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
         return new FlameSmokeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
      }
   }
}
