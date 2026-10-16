package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3492;
import net.minecraft.class_3499;
import net.minecraft.class_2350.class_2352;

public class DoorTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      class_2350 dir = class_2350.field_11043;
      if (!world.method_8608()) {
         class_2769 var16 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("half");
         String var10000;
         if (var16 instanceof class_2754) {
            class_2754 _getep2 = (class_2754)var16;
            var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep2).toString();
         } else {
            var10000 = "";
         }

         if (var10000.equals("lower")) {
            if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11043) {
               class_2769 _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep6 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep6).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label306: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp8 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp8)) {
                           var114 = true;
                           break label306;
                        }
                     }

                     var114 = false;
                  }

                  if (!var114) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11464).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep12 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep12).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label296: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp14 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp14)) {
                           var116 = true;
                           break label296;
                        }
                     }

                     var116 = false;
                  }

                  if (!var116) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11464).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep18 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep18).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label286: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp20 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp20)) {
                           var118 = true;
                           break label286;
                        }
                     }

                     var118 = false;
                  }

                  if (var118) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11464).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep24 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep24).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label277: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp26 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp26)) {
                           var120 = true;
                           break label277;
                        }
                     }

                     var120 = false;
                  }

                  if (var120) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11464).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11034) {
               class_2769 _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep32 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep32).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label343: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp34 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp34)) {
                           var122 = true;
                           break label343;
                        }
                     }

                     var122 = false;
                  }

                  if (!var122) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep38 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep38).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label333: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp40 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp40)) {
                           var124 = true;
                           break label333;
                        }
                     }

                     var124 = false;
                  }

                  if (!var124) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep44 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep44).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label323: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp46 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp46)) {
                           var126 = true;
                           break label323;
                        }
                     }

                     var126 = false;
                  }

                  if (var126) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (_serverworld instanceof class_2754) {
                  class_2754 _getep50 = (class_2754)_serverworld;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep50).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label314: {
                     _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (_serverworld instanceof class_2746) {
                        class_2746 _getbp52 = (class_2746)_serverworld;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp52)) {
                           var128 = true;
                           break label314;
                        }
                     }

                     var128 = false;
                  }

                  if (var128) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11035) {
               class_2769 var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var74 instanceof class_2754) {
                  class_2754 _getep58 = (class_2754)var74;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep58).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label380: {
                     var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var74 instanceof class_2746) {
                        class_2746 _getbp60 = (class_2746)var74;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp60)) {
                           var130 = true;
                           break label380;
                        }
                     }

                     var130 = false;
                  }

                  if (!var130) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var74 instanceof class_2754) {
                  class_2754 _getep64 = (class_2754)var74;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep64).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label370: {
                     var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var74 instanceof class_2746) {
                        class_2746 _getbp66 = (class_2746)var74;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp66)) {
                           var132 = true;
                           break label370;
                        }
                     }

                     var132 = false;
                  }

                  if (!var132) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var74 instanceof class_2754) {
                  class_2754 _getep70 = (class_2754)var74;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep70).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label360: {
                     var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var74 instanceof class_2746) {
                        class_2746 _getbp72 = (class_2746)var74;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp72)) {
                           var134 = true;
                           break label360;
                        }
                     }

                     var134 = false;
                  }

                  if (var134) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var74 instanceof class_2754) {
                  class_2754 _getep76 = (class_2754)var74;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep76).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label351: {
                     var74 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var74 instanceof class_2746) {
                        class_2746 _getbp78 = (class_2746)var74;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp78)) {
                           var136 = true;
                           break label351;
                        }
                     }

                     var136 = false;
                  }

                  if (var136) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11039) {
               class_2769 var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var86 instanceof class_2754) {
                  class_2754 _getep84 = (class_2754)var86;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep84).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label417: {
                     var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var86 instanceof class_2746) {
                        class_2746 _getbp86 = (class_2746)var86;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp86)) {
                           var138 = true;
                           break label417;
                        }
                     }

                     var138 = false;
                  }

                  if (!var138) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var86 instanceof class_2754) {
                  class_2754 _getep90 = (class_2754)var86;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep90).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label407: {
                     var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var86 instanceof class_2746) {
                        class_2746 _getbp92 = (class_2746)var86;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp92)) {
                           var140 = true;
                           break label407;
                        }
                     }

                     var140 = false;
                  }

                  if (!var140) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var86 instanceof class_2754) {
                  class_2754 _getep96 = (class_2754)var86;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep96).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label397: {
                     var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var86 instanceof class_2746) {
                        class_2746 _getbp98 = (class_2746)var86;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp98)) {
                           var142 = true;
                           break label397;
                        }
                     }

                     var142 = false;
                  }

                  if (var142) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var86 instanceof class_2754) {
                  class_2754 _getep102 = (class_2754)var86;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep102).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label388: {
                     var86 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var86 instanceof class_2746) {
                        class_2746 _getbp104 = (class_2746)var86;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp104)) {
                           var144 = true;
                           break label388;
                        }
                     }

                     var144 = false;
                  }

                  if (var144) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_door_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   private static class_2350 getBlockDirection(class_1936 world, class_2338 pos) {
      class_2680 blockState = world.method_8320(pos);
      class_2769<?> property = blockState.method_26204().method_9595().method_11663("facing");
      if (property != null) {
         Comparable var5 = blockState.method_11654(property);
         if (var5 instanceof class_2350) {
            class_2350 direction = (class_2350)var5;
            return direction;
         }
      }

      if (blockState.method_28498(class_2741.field_12496)) {
         return class_2350.method_10169((class_2350.class_2351)blockState.method_11654(class_2741.field_12496), class_2352.field_11056);
      } else {
         return blockState.method_28498(class_2741.field_12529) ? class_2350.method_10169((class_2350.class_2351)blockState.method_11654(class_2741.field_12529), class_2352.field_11056) : class_2350.field_11043;
      }
   }
}
