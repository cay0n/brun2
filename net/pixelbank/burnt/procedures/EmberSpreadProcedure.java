package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1676;
import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.minecraft.class_3532;
import net.minecraft.class_1665.class_1666;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.entity.EmberProjectileEntity;
import net.pixelbank.burnt.init.BurntModEntities;

public class EmberSpreadProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double xSpeed = (double)0.0F;
      double turb = (double)0.0F;
      double zSpeed = (double)0.0F;
      double zDir = (double)0.0F;
      double multiplyer = (double)0.0F;
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.WIND.get()) {
         multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
         xSpeed = WindAngleXProcedure.execute(world) * multiplyer;
         zSpeed = WindAngleZProcedure.execute(world) * multiplyer;
         if (world instanceof class_3218) {
            class_3218 projectileLevel = (class_3218)world;
            class_1676 _entityToSpawn = initArrowProjectile(new EmberProjectileEntity(BurntModEntities.EMBER_PROJECTILE, projectileLevel), (class_1297)null, 0.0F, true, false, false, class_1666.field_7592);
            _entityToSpawn.method_5814(x + xSpeed / (double)10.0F, y + (double)1.0F, z + zSpeed / (double)10.0F);
            _entityToSpawn.method_7485(xSpeed / (double)10.0F * multiplyer, class_3532.method_15366(world.method_8409(), -0.001, 0.001), zSpeed / (double)10.0F * multiplyer, 0.5F, 1.0F);
            projectileLevel.method_8649(_entityToSpawn);
         }
      }

   }

   private static class_1665 initArrowProjectile(class_1665 entityToSpawn, class_1297 shooter, float damage, boolean silent, boolean fire, boolean particles, class_1665.class_1666 pickup) {
      entityToSpawn.method_7432(shooter);
      entityToSpawn.method_7438((double)damage);
      if (silent) {
         entityToSpawn.method_5803(true);
      }

      if (fire) {
         entityToSpawn.method_5639(100.0F);
      }

      if (particles) {
         entityToSpawn.method_7439(true);
      }

      entityToSpawn.field_7572 = pickup;
      return entityToSpawn;
   }
}
