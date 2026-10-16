package net.pixelbank.burnt.procedures;

import net.minecraft.class_1282;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1314;
import net.minecraft.class_1542;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_4050;
import net.minecraft.class_4095;
import net.minecraft.class_4140;
import net.minecraft.class_5532;
import net.minecraft.class_640;
import net.minecraft.class_7924;
import net.minecraft.class_8111;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class FireDamageProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            if (entity instanceof class_1309) {
               class_1309 _sleeper = (class_1309)entity;
               if (_sleeper.method_6113() || _sleeper.method_18376() == class_4050.field_18078) {
                  _sleeper.method_18400();
                  _sleeper.method_18380(class_4050.field_18076);
               }
            }

            if (entity.method_5864().method_20210(BurntTags.ENTITY_SCARED_OF_FIRE) && entity instanceof class_1308) {
               class_1308 _entity = (class_1308)entity;
               class_243 _fleePos = null;
               if (_entity instanceof class_1314) {
                  class_1314 _pmob = (class_1314)_entity;
                  _fleePos = class_5532.method_31511(_pmob, 16, 7, new class_243(x, y, z));
               } else {
                  class_243 _away = _entity.method_19538().method_1023(x, y, z);
                  if (_away.method_1027() < 1.0E-4) {
                     _away = new class_243(world.method_8409().method_43059(), (double)0.0F, world.method_8409().method_43059());
                  }

                  _away = _away.method_1029().method_1021((double)8.0F + world.method_8409().method_43058() * (double)4.0F);
                  _fleePos = _entity.method_19538().method_1031(_away.field_1352, (double)0.0F, _away.field_1350);
               }

               if (_fleePos != null) {
                  _entity.method_5942().method_6337(_fleePos.field_1352, _fleePos.field_1351, _fleePos.field_1350, 1.2);
               }

               if (_entity instanceof class_1646) {
                  class_1646 _villager = (class_1646)_entity;
                  class_4095<class_1646> _brain = _villager.method_18868();
                  _brain.method_18875(class_4140.field_18438);
                  _brain.method_18875(class_4140.field_18439);
                  _brain.method_18875(class_4140.field_18445);
               }
            }

            if ((Boolean)BurntBasicConfigConfiguration.BURN_DAMAGE.get()) {
               if (entity instanceof class_1657) {
                  if (getEntityGameType(entity) == class_1934.field_9215) {
                     label75: {
                        if (entity instanceof class_1309) {
                           class_1309 _livEnt9 = (class_1309)entity;
                           if (_livEnt9.method_6059(class_1294.field_5918)) {
                              break label75;
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
