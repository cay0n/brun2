package net.pixelbank.burnt.procedures;

import net.minecraft.class_1282;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_640;
import net.minecraft.class_7924;
import net.minecraft.class_8111;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class TallGrassFireDamageProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.BURN_DAMAGE.get()) {
            if (entity instanceof class_1657) {
               if (getEntityGameType(entity) == class_1934.field_9215) {
                  label39: {
                     if (entity instanceof class_1309) {
                        class_1309 _livEnt4 = (class_1309)entity;
                        if (_livEnt4.method_6059(class_1294.field_5918)) {
                           break label39;
                        }
                     }

                     entity.method_5639(2.0F);
                     entity.method_5643(new class_1282(world.method_30349().method_46762(class_7924.field_42534).method_46747(class_8111.field_42335)), 1.0F);
                  }
               }
            } else if (!entity.method_5864().method_20210(BurntTags.ENTITY_FIRE_RESISTANT)) {
               entity.method_5639(2.0F);
               entity.method_5643(new class_1282(world.method_30349().method_46762(class_7924.field_42534).method_46747(class_8111.field_42335)), 1.0F);
            }

            if (entity instanceof class_1542 && !entity.method_5753()) {
               entity.method_5639(5.0F);
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
