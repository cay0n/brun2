package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2398;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntMossCompostProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         double particleRadius = (double)0.0F;
         double particleAmount = (double)0.0F;
         class_1799 var10000;
         if (entity instanceof class_1309) {
            class_1309 _livEnt = (class_1309)entity;
            var10000 = _livEnt.method_6047();
         } else {
            var10000 = class_1799.field_8037;
         }

         if (var10000.method_7909() == BurntModBlocks.BURNT_MOSS.method_8389() && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_17563) {
            if (getEntityGameType(entity) == class_1934.field_9215 && entity instanceof class_1657) {
               class_1657 _player = (class_1657)entity;
               class_1799 _stktoremove = new class_1799(BurntModBlocks.BURNT_MOSS);
               _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
            }

            if (Math.random() <= (double)0.5F) {
               class_2769 var16 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("level");
               int var27;
               if (var16 instanceof class_2758) {
                  class_2758 _getip7 = (class_2758)var16;
                  var27 = (Integer)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getip7);
               } else {
                  var27 = -1;
               }

               int _value = var27 + 1;
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var18 = _bs.method_26204().method_9595().method_11663("level");
               if (var18 instanceof class_2758) {
                  class_2758 _integerProp = (class_2758)var18;
                  if (_integerProp.method_11898().contains(_value)) {
                     world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                  }
               }
            }

            if (world instanceof class_1937) {
               class_1937 _level = (class_1937)world;
               if (!_level.method_8608()) {
                  _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.gravel.place")), class_3419.field_15254, 0.5F, 1.0F);
               } else {
                  _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.gravel.place")), class_3419.field_15254, 0.5F, 1.0F, false);
               }
            }

            particleAmount = (double)8.0F;
            particleRadius = (double)0.5F;

            for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
               world.method_8406(class_2398.field_17741, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, 0.7), z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-0.5F, (double)0.5F) * particleRadius, (double)0.0F, (double)0.0F, (double)0.0F);
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
