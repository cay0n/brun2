package net.pixelbank.burnt.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2400;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3999;
import net.minecraft.class_4002;
import net.minecraft.class_4003;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;
import net.pixelbank.burnt.util.BurntSmokeBudget;
import net.pixelbank.burnt.util.BurntTags;

@Environment(EnvType.CLIENT)
public class LightFlameSmokeParticle extends class_4003 {
   private final class_4002 spriteSet;
   private final class_2338 originBlock;
   private boolean budgetReleased = false;

   public static LightFlameSmokeParticleProvider provider(class_4002 spriteSet) {
      return new LightFlameSmokeParticleProvider(spriteSet);
   }

   protected LightFlameSmokeParticle(class_638 world, double x, double y, double z, double vx, double vy, double vz, class_4002 spriteSet) {
      super(world, x, y, z);
      this.originBlock = class_2338.method_49637(x, y, z);
      BurntSmokeBudget.acquire(world);
      float _shade = 0.65F + this.field_3840.method_43057() * 0.35F;
      this.method_3084(_shade, _shade, _shade);
      this.spriteSet = spriteSet;
      this.method_3080(1.0F, 1.0F);
      this.field_17867 *= 2.0F;
      this.field_3847 = 34;
      this.field_3844 = -0.15F;
      this.field_3862 = false;
      this.field_3852 = vx * 0.1;
      this.field_3869 = vy * 0.1;
      this.field_3850 = vz * 0.1;
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

         this.method_18141(this.spriteSet.method_18138(this.field_3866 / 2 % 18 + 1, 18));
      }

   }

   public void method_3085() {
      if (!this.budgetReleased) {
         this.budgetReleased = true;
         BurntSmokeBudget.release();
      }

      super.method_3085();
   }

   public static class LightFlameSmokeParticleProvider implements class_707<class_2400> {
      private final class_4002 spriteSet;

      public LightFlameSmokeParticleProvider(class_4002 spriteSet) {
         this.spriteSet = spriteSet;
      }

      public class_703 createParticle(class_2400 typeIn, class_638 worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
         return new LightFlameSmokeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
      }
   }
}
