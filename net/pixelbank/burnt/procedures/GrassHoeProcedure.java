package net.pixelbank.burnt.procedures;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class GrassHoeProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_31573(BurntTags.ITEM_MC_HOES)) {
               if (entity instanceof class_1309) {
                  class_1309 _entity = (class_1309)entity;
                  _entity.method_23667(class_1268.field_5808, true);
               }

               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = class_2246.field_10362.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.hoe.till")), class_3419.field_15245, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.hoe.till")), class_3419.field_15245, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var10000 = _livEnt.method_6047();
                  } else {
                     var10000 = class_1799.field_8037;
                  }

                  var10000.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                  });
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
