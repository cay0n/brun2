package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_640;
import net.pixelbank.burnt.init.BurntModItems;

public class SootyBlockDestroyedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
            class_3218 _level = (class_3218)world;
            class_1542 entityToSpawn = new class_1542(_level, x, y, z, new class_1799(BurntModItems.SOOT));
            entityToSpawn.method_6982(10);
            _level.method_8649(entityToSpawn);
         }

      }
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
