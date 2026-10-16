package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_640;
import net.minecraft.class_7923;

public class BurntFarmlandRightClickedProcedure {
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

            if (var10000.method_7909() == class_1802.field_8317 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10293.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_8317);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_46249 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_46286.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_46249);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_46250 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_46287.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_46250);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8567 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10247.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_8567);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8309 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10341.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_8309);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8179 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10609.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_8179);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_42711 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_42749.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_42711);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }

            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_43195 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_43228.method_9564(), 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.crop.plant")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) != class_1934.field_9220 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(class_1802.field_43195);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
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
