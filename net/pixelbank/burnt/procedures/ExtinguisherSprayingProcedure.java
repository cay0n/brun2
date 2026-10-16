package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1676;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_640;
import net.minecraft.class_1665.class_1666;
import net.pixelbank.burnt.entity.SprayEntity;
import net.pixelbank.burnt.init.BurntModEntities;
import net.pixelbank.burnt.network.BurntModVariables;

public class ExtinguisherSprayingProcedure {
   public static void execute(class_1936 world, class_1297 entity, class_1799 itemstack) {
      if (entity != null) {
         if (!world.method_8608() && BurntModVariables.PlayerVariables.get(entity).extinguisherOn) {
            if (world instanceof class_3218) {
               class_3218 projectileLevel = (class_3218)world;
               class_1676 _entityToSpawn = initArrowProjectile(new SprayEntity(BurntModEntities.SPRAY, projectileLevel), (class_1297)null, 0.0F, true, false, false, class_1666.field_7592);
               _entityToSpawn.method_5814(entity.method_23317() + entity.method_5720().field_1352, entity.method_23318() + entity.method_5720().field_1351 + 0.8, entity.method_23321() + entity.method_5720().field_1350);
               _entityToSpawn.method_7485(entity.method_5720().field_1352, entity.method_5720().field_1351 + 0.2, entity.method_5720().field_1350, 1.0F, 0.0F);
               projectileLevel.method_8649(_entityToSpawn);
            }

            if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               itemstack.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
               });
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

   private static class_1934 getEntityGameType(class_1297 entity) {
      if (entity instanceof class_3222 serverPlayer) {
         return serverPlayer.field_13974.method_14257();
      } else {
         if (entity instanceof class_1657 player) {
            if (player.method_37908().method_8608()) {
               class_640 playerInfo = class_310.method_1551().method_1562().method_2871(player.method_7334().getId());
               if (playerInfo != null) {
                  return playerInfo.method_2958();
               }
            }
         }

         return null;
      }
   }
}
