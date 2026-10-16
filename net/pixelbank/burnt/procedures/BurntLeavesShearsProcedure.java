package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntLeavesShearsProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && getEntityGameType(entity) == class_1934.field_9215) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8868) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               if (world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  class_1542 entityToSpawn = new class_1542(_level, x, y, z, new class_1799(BurntModBlocks.BURNT_LEAVES));
                  entityToSpawn.method_6982(10);
                  _level.method_8649(entityToSpawn);
               }
            }

            class_6880.class_6883 var14 = world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9099);
            class_1799 var10001;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10001 = _livEnt.method_6047();
            } else {
               var10001 = class_1799.field_8037;
            }

            if (class_1890.method_8225(var14, var10001) != 0) {
               world.method_22352(class_2338.method_49637(x, y, z), false);
               if (world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  class_1542 entityToSpawn = new class_1542(_level, x, y, z, new class_1799(BurntModBlocks.BURNT_LEAVES));
                  entityToSpawn.method_6982(10);
                  _level.method_8649(entityToSpawn);
               }
            }
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
