package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1676;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_1665.class_1666;
import net.pixelbank.burnt.entity.FireballEntity;
import net.pixelbank.burnt.init.BurntModEntities;

public class FireballThrownProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_1937 projectileLevel = entity.method_37908();
            if (!projectileLevel.method_8608()) {
               class_1676 _entityToSpawn = initArrowProjectile(new FireballEntity(BurntModEntities.FIREBALL, projectileLevel), (class_1297)null, 0.0F, true, false, false, class_1666.field_7592);
               _entityToSpawn.method_5814(entity.method_23317(), entity.method_23320() - 0.1, entity.method_23321());
               _entityToSpawn.method_7485(entity.method_5720().field_1352, entity.method_5720().field_1351, entity.method_5720().field_1350, 0.5F, 0.0F);
               projectileLevel.method_8649(_entityToSpawn);
            }
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
