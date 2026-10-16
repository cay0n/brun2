package net.pixelbank.burnt.entity;

import javax.annotation.Nullable;
import net.minecraft.class_1282;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3856;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_5134;
import net.minecraft.class_5819;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.pixelbank.burnt.init.BurntModEntities;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.procedures.ExtinguishBlockProcedure;
import net.pixelbank.burnt.procedures.ExtinguishEntityProcedure;
import net.pixelbank.burnt.procedures.SprayProjectileHitsPlayerProcedure;
import net.pixelbank.burnt.procedures.SprayWhileProjectileFlyingTickProcedure;

public class SprayEntity extends class_1665 implements class_3856 {
   public static final class_1799 PROJECTILE_ITEM;
   private int knockback = 0;

   public SprayEntity(class_1299<? extends SprayEntity> type, class_1937 world) {
      super(type, world);
   }

   public SprayEntity(class_1299<? extends SprayEntity> type, double x, double y, double z, class_1937 world, @Nullable class_1799 firedFromWeapon) {
      super(type, x, y, z, world, PROJECTILE_ITEM, firedFromWeapon);
      if (firedFromWeapon != null) {
         this.setKnockback(class_1890.method_8225(world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9121), firedFromWeapon));
      }

   }

   public SprayEntity(class_1299<? extends SprayEntity> type, class_1309 entity, class_1937 world, @Nullable class_1799 firedFromWeapon) {
      super(type, entity, world, PROJECTILE_ITEM, firedFromWeapon);
      if (firedFromWeapon != null) {
         this.setKnockback(class_1890.method_8225(world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9121), firedFromWeapon));
      }

   }

   public boolean method_5753() {
      return true;
   }

   public class_1799 method_7495() {
      return PROJECTILE_ITEM;
   }

   protected class_1799 method_57314() {
      return new class_1799(BurntModItems.EXTINGUISHER_SPRAY);
   }

   protected void method_7450(class_1309 entity) {
      super.method_7450(entity);
      entity.method_6097(entity.method_6022() - 1);
   }

   public void setKnockback(int knockback) {
      this.knockback = knockback;
   }

   protected void method_59957(class_1309 livingEntity, class_1282 damageSource) {
      if ((double)this.knockback > (double)0.0F) {
         double d1 = Math.max((double)0.0F, (double)1.0F - livingEntity.method_45325(class_5134.field_23718));
         class_243 vec3 = this.method_18798().method_18805((double)1.0F, (double)0.0F, (double)1.0F).method_1029().method_1021((double)this.knockback * 0.6 * d1);
         if (vec3.method_1027() > (double)0.0F) {
            livingEntity.method_5762(vec3.field_1352, 0.1, vec3.field_1350);
         }
      } else {
         super.method_59957(livingEntity, damageSource);
      }

   }

   public void method_5694(class_1657 entity) {
      super.method_5694(entity);
      SprayProjectileHitsPlayerProcedure.execute(this.method_37908(), this.method_23317(), this.method_23318(), this.method_23321(), entity, this.method_24921());
   }

   public void method_7454(class_3966 entityHitResult) {
      super.method_7454(entityHitResult);
      ExtinguishEntityProcedure.execute(this.method_37908(), entityHitResult.method_17782());
   }

   public void method_24920(class_3965 blockHitResult) {
      super.method_24920(blockHitResult);
      ExtinguishBlockProcedure.execute(this.method_37908(), (double)blockHitResult.method_17777().method_10263(), (double)blockHitResult.method_17777().method_10264(), (double)blockHitResult.method_17777().method_10260());
   }

   public void method_5773() {
      super.method_5773();
      SprayWhileProjectileFlyingTickProcedure.execute(this.method_37908(), this.method_23317(), this.method_23318(), this.method_23321(), this);
      if (this.field_7588) {
         this.method_31472();
      }

   }

   public static SprayEntity shoot(class_1937 world, class_1309 entity, class_5819 source) {
      return shoot(world, entity, source, 2.0F, (double)0.0F, 0);
   }

   public static SprayEntity shoot(class_1937 world, class_1309 entity, class_5819 source, float pullingPower) {
      return shoot(world, entity, source, pullingPower * 2.0F, (double)0.0F, 0);
   }

   public static SprayEntity shoot(class_1937 world, class_1309 entity, class_5819 random, float power, double damage, int knockback) {
      SprayEntity entityarrow = new SprayEntity(BurntModEntities.SPRAY, entity, world, (class_1799)null);
      entityarrow.method_7485(entity.method_5828(1.0F).field_1352, entity.method_5828(1.0F).field_1351, entity.method_5828(1.0F).field_1350, power * 2.0F, 0.0F);
      entityarrow.method_5803(true);
      entityarrow.method_7439(false);
      entityarrow.method_7438(damage);
      entityarrow.setKnockback(knockback);
      world.method_8649(entityarrow);
      world.method_43128((class_1657)null, entity.method_23317(), entity.method_23318(), entity.method_23321(), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.water.ambient")), class_3419.field_15248, 1.0F, 1.0F / (random.method_43057() * 0.5F + 1.0F) + power / 2.0F);
      return entityarrow;
   }

   public static SprayEntity shoot(class_1309 entity, class_1309 target) {
      SprayEntity entityarrow = new SprayEntity(BurntModEntities.SPRAY, entity, entity.method_37908(), (class_1799)null);
      double dx = target.method_23317() - entity.method_23317();
      double dy = target.method_23318() + (double)target.method_5751() - 1.1;
      double dz = target.method_23321() - entity.method_23321();
      entityarrow.method_7485(dx, dy - entityarrow.method_23318() + Math.hypot(dx, dz) * (double)0.2F, dz, 4.0F, 12.0F);
      entityarrow.method_5803(true);
      entityarrow.method_7438((double)0.0F);
      entityarrow.setKnockback(0);
      entityarrow.method_7439(false);
      entity.method_37908().method_8649(entityarrow);
      entity.method_37908().method_43128((class_1657)null, entity.method_23317(), entity.method_23318(), entity.method_23321(), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.water.ambient")), class_3419.field_15248, 1.0F, 1.0F / (class_5819.method_43047().method_43057() * 0.5F + 1.0F));
      return entityarrow;
   }

   static {
      PROJECTILE_ITEM = new class_1799(BurntModItems.EXTINGUISHER_SPRAY);
   }
}
