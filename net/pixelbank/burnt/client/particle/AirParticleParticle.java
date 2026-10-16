package net.pixelbank.burnt.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2400;
import net.minecraft.class_3999;
import net.minecraft.class_4002;
import net.minecraft.class_4003;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;

@Environment(EnvType.CLIENT)
public class AirParticleParticle extends class_4003 {
   private final class_4002 spriteSet;

   public static AirParticleParticleProvider provider(class_4002 spriteSet) {
      return new AirParticleParticleProvider(spriteSet);
   }

   protected AirParticleParticle(class_638 world, double x, double y, double z, double vx, double vy, double vz, class_4002 spriteSet) {
      super(world, x, y, z);
      this.spriteSet = spriteSet;
      this.method_3080(0.2F, 0.2F);
      this.field_3847 = 15;
      this.field_3844 = 0.0F;
      this.field_3862 = false;
      this.field_3852 = vx * (double)1.0F;
      this.field_3869 = vy * (double)1.0F;
      this.field_3850 = vz * (double)1.0F;
      this.method_18142(spriteSet);
   }

   public class_3999 method_18122() {
      return class_3999.field_17829;
   }

   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         this.method_18141(this.spriteSet.method_18138(this.field_3866 / 1 % 16 + 1, 16));
      }

   }

   public static class AirParticleParticleProvider implements class_707<class_2400> {
      private final class_4002 spriteSet;

      public AirParticleParticleProvider(class_4002 spriteSet) {
         this.spriteSet = spriteSet;
      }

      public class_703 createParticle(class_2400 typeIn, class_638 worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
         return new AirParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
      }
   }
}
