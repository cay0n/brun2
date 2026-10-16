package net.pixelbank.burnt.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2400;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3999;
import net.minecraft.class_4002;
import net.minecraft.class_4003;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;

@Environment(EnvType.CLIENT)
public class FireParticleParticle extends class_4003 {
   private final class_4002 spriteSet;
   private boolean distant;
   private static final double NEAR_DISTANCE = (double)32.0F;
   private static final double FAR_DISTANCE = (double)160.0F;
   private static final double MAX_DISTANCE_SCALE = (double)3.0F;

   public static FireParticleParticleProvider provider(class_4002 spriteSet) {
      return new FireParticleParticleProvider(spriteSet);
   }

   protected FireParticleParticle(class_638 world, double x, double y, double z, double vx, double vy, double vz, class_4002 spriteSet) {
      super(world, x, y, z);
      this.spriteSet = spriteSet;
      this.method_3080(0.2F, 0.2F);
      boolean distant = false;
      class_4184 cam0 = class_310.method_1551().field_1773.method_19418();
      if (cam0 != null) {
         class_243 e0 = cam0.method_19326();
         double ddx = x - e0.field_1352;
         double ddy = y - e0.field_1351;
         double ddz = z - e0.field_1350;
         distant = ddx * ddx + ddy * ddy + ddz * ddz > (double)784.0F;
      }

      this.distant = distant;
      if (distant) {
         this.field_3847 = 40 + this.field_3840.method_43048(30);
         this.field_17867 *= 1.8F;
      } else {
         this.field_3847 = Math.max(1, 20 + (this.field_3840.method_43048(8) - 4));
      }

      this.field_3844 = -0.1F;
      this.field_3862 = false;
      this.field_3852 = vx * 0.3;
      this.field_3869 = vy * 0.3;
      this.field_3850 = vz * 0.3;
      this.method_18142(spriteSet);
   }

   public int method_3068(float partialTick) {
      return 15728880;
   }

   public class_3999 method_18122() {
      return class_3999.field_17829;
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

   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         if (this.distant) {
            this.method_18142(this.spriteSet);
         } else {
            this.method_18141(this.spriteSet.method_18138(this.field_3866 / 1 % 48 + 1, 48));
         }
      }

   }

   public static class FireParticleParticleProvider implements class_707<class_2400> {
      private final class_4002 spriteSet;

      public FireParticleParticleProvider(class_4002 spriteSet) {
         this.spriteSet = spriteSet;
      }

      public class_703 createParticle(class_2400 typeIn, class_638 worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
         return new FireParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
      }
   }
}
