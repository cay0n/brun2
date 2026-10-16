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

public class DarkOakDoorTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var15 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("half");
         String var10000;
         if (var15 instanceof class_2754) {
            class_2754 _getep2 = (class_2754)var15;
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
                           var113 = true;
                           break label306;
                        }
                     }

                     var113 = false;
                  }

                  if (!var113) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_left"));
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
                           var115 = true;
                           break label296;
                        }
                     }

                     var115 = false;
                  }

                  if (!var115) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_right"));
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
                           var117 = true;
                           break label286;
                        }
                     }

                     var117 = false;
                  }

                  if (var117) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_left"));
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
                           var119 = true;
                           break label277;
                        }
                     }

                     var119 = false;
                  }

                  if (var119) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_right"));
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
                           var121 = true;
                           break label343;
                        }
                     }

                     var121 = false;
                  }

                  if (!var121) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_left"));
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
                           var123 = true;
                           break label333;
                        }
                     }

                     var123 = false;
                  }

                  if (!var123) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_right"));
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
                           var125 = true;
                           break label323;
                        }
                     }

                     var125 = false;
                  }

                  if (var125) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_left"));
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
                           var127 = true;
                           break label314;
                        }
                     }

                     var127 = false;
                  }

                  if (var127) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11035) {
               class_2769 var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var73 instanceof class_2754) {
                  class_2754 _getep58 = (class_2754)var73;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep58).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label380: {
                     var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var73 instanceof class_2746) {
                        class_2746 _getbp60 = (class_2746)var73;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp60)) {
                           var129 = true;
                           break label380;
                        }
                     }

                     var129 = false;
                  }

                  if (!var129) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var73 instanceof class_2754) {
                  class_2754 _getep64 = (class_2754)var73;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep64).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label370: {
                     var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var73 instanceof class_2746) {
                        class_2746 _getbp66 = (class_2746)var73;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp66)) {
                           var131 = true;
                           break label370;
                        }
                     }

                     var131 = false;
                  }

                  if (!var131) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var73 instanceof class_2754) {
                  class_2754 _getep70 = (class_2754)var73;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep70).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label360: {
                     var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var73 instanceof class_2746) {
                        class_2746 _getbp72 = (class_2746)var73;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp72)) {
                           var133 = true;
                           break label360;
                        }
                     }

                     var133 = false;
                  }

                  if (var133) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var73 instanceof class_2754) {
                  class_2754 _getep76 = (class_2754)var73;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep76).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label351: {
                     var73 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var73 instanceof class_2746) {
                        class_2746 _getbp78 = (class_2746)var73;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp78)) {
                           var135 = true;
                           break label351;
                        }
                     }

                     var135 = false;
                  }

                  if (var135) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        }
                     }
                  }
               }
            } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11039) {
               class_2769 var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var85 instanceof class_2754) {
                  class_2754 _getep84 = (class_2754)var85;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep84).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label417: {
                     var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var85 instanceof class_2746) {
                        class_2746 _getbp86 = (class_2746)var85;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp86)) {
                           var137 = true;
                           break label417;
                        }
                     }

                     var137 = false;
                  }

                  if (!var137) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var85 instanceof class_2754) {
                  class_2754 _getep90 = (class_2754)var85;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep90).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label407: {
                     var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var85 instanceof class_2746) {
                        class_2746 _getbp92 = (class_2746)var85;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp92)) {
                           var139 = true;
                           break label407;
                        }
                     }

                     var139 = false;
                  }

                  if (!var139) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_closed_right"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var85 instanceof class_2754) {
                  class_2754 _getep96 = (class_2754)var85;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep96).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("left")) {
                  label397: {
                     var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var85 instanceof class_2746) {
                        class_2746 _getbp98 = (class_2746)var85;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp98)) {
                           var141 = true;
                           break label397;
                        }
                     }

                     var141 = false;
                  }

                  if (var141) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_left"));
                        if (template != null) {
                           template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                           return;
                        }
                     }

                     return;
                  }
               }

               var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
               if (var85 instanceof class_2754) {
                  class_2754 _getep102 = (class_2754)var85;
                  var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep102).toString();
               } else {
                  var10000 = "";
               }

               if (var10000.equals("right")) {
                  label388: {
                     var85 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                     if (var85 instanceof class_2746) {
                        class_2746 _getbp104 = (class_2746)var85;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp104)) {
                           var143 = true;
                           break label388;
                        }
                     }

                     var143 = false;
                  }

                  if (var143) {
                     world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                     if (world instanceof class_3218) {
                        class_3218 _serverworld = (class_3218)world;
                        class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "burnt_dark_oak_open_right"));
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
