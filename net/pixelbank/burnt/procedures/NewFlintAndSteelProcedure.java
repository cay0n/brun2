package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1928;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3959;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class NewFlintAndSteelProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         boolean found = false;
         double sx = (double)0.0F;
         double sy = (double)0.0F;
         double sz = (double)0.0F;
         if (!world.method_8608() && getEntityGameType(entity) != class_1934.field_9219 && !entity.method_5869() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get() && world.method_8401().method_146().method_8355(class_1928.field_19387)) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() != class_1802.field_8884) {
               if (entity instanceof class_1309) {
                  class_1309 _livEnt = (class_1309)entity;
                  var10000 = _livEnt.method_6047();
               } else {
                  var10000 = class_1799.field_8037;
               }

               if (var10000.method_7909() != class_1802.field_8814) {
                  return;
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _entity = (class_1309)entity;
               _entity.method_23667(class_1268.field_5808, true);
            }

            if (world instanceof class_1937) {
               class_1937 _level = (class_1937)world;
               if (!_level.method_8608()) {
                  _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.flintandsteel.use")), class_3419.field_15248, 1.0F, 1.0F);
               } else {
                  _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.flintandsteel.use")), class_3419.field_15248, 1.0F, 1.0F, false);
               }
            }

            StartFlintBurnProcedure.execute(world, (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1347, entity)).method_17777().method_10263(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1347, entity)).method_17777().method_10264(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1347, entity)).method_17777().method_10260());
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
