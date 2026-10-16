package net.pixelbank.burnt.procedures;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_640;
import net.minecraft.class_7924;
import net.minecraft.class_8111;

public class CactusDamageProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && getEntityGameType(entity) == class_1934.field_9215) {
            entity.method_5643(new class_1282(world.method_30349().method_46762(class_7924.field_42534).method_46747(class_8111.field_42344)), 1.0F);
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
