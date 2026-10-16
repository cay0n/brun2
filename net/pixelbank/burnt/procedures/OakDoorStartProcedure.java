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

public class OakDoorStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11043) {
            class_2769 _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            String var10000;
            if (_serverworld instanceof class_2754) {
               class_2754 _getep4 = (class_2754)_serverworld;
               var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep4).toString();
            } else {
               var10000 = "";
            }

            if (var10000.equalsIgnoreCase("left")) {
               label301: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp6 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp6)) {
                        var110 = true;
                        break label301;
                     }
                  }

                  var110 = false;
               }

               if (!var110) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_left"));
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
               class_2754 _getep10 = (class_2754)_serverworld;
               var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep10).toString();
            } else {
               var10000 = "";
            }

            if (var10000.equalsIgnoreCase("right")) {
               label291: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp12 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp12)) {
                        var112 = true;
                        break label291;
                     }
                  }

                  var112 = false;
               }

               if (!var112) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_right"));
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
               class_2754 _getep16 = (class_2754)_serverworld;
               var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep16).toString();
            } else {
               var10000 = "";
            }

            if (var10000.equalsIgnoreCase("left")) {
               label281: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp18 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp18)) {
                        var114 = true;
                        break label281;
                     }
                  }

                  var114 = false;
               }

               if (var114) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_left"));
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
               class_2754 _getep22 = (class_2754)_serverworld;
               var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep22).toString();
            } else {
               var10000 = "";
            }

            if (var10000.equalsIgnoreCase("right")) {
               label272: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp24 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp24)) {
                        var116 = true;
                        break label272;
                     }
                  }

                  var116 = false;
               }

               if (var116) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11464).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                     }
                  }
               }
            }
         } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11034) {
            class_2769 _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            String var117;
            if (_serverworld instanceof class_2754) {
               class_2754 _getep30 = (class_2754)_serverworld;
               var117 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep30).toString();
            } else {
               var117 = "";
            }

            if (var117.equalsIgnoreCase("left")) {
               label338: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp32 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp32)) {
                        var118 = true;
                        break label338;
                     }
                  }

                  var118 = false;
               }

               if (!var118) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_left"));
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
               class_2754 _getep36 = (class_2754)_serverworld;
               var117 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep36).toString();
            } else {
               var117 = "";
            }

            if (var117.equalsIgnoreCase("right")) {
               label328: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp38 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp38)) {
                        var120 = true;
                        break label328;
                     }
                  }

                  var120 = false;
               }

               if (!var120) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_right"));
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
               class_2754 _getep42 = (class_2754)_serverworld;
               var117 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep42).toString();
            } else {
               var117 = "";
            }

            if (var117.equalsIgnoreCase("left")) {
               label318: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp44 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp44)) {
                        var122 = true;
                        break label318;
                     }
                  }

                  var122 = false;
               }

               if (var122) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_left"));
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
               class_2754 _getep48 = (class_2754)_serverworld;
               var117 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep48).toString();
            } else {
               var117 = "";
            }

            if (var117.equalsIgnoreCase("right")) {
               label309: {
                  _serverworld = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (_serverworld instanceof class_2746) {
                     class_2746 _getbp50 = (class_2746)_serverworld;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp50)) {
                        var124 = true;
                        break label309;
                     }
                  }

                  var124 = false;
               }

               if (var124) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11465).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                     }
                  }
               }
            }
         } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11035) {
            class_2769 var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            String var125;
            if (var71 instanceof class_2754) {
               class_2754 _getep56 = (class_2754)var71;
               var125 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep56).toString();
            } else {
               var125 = "";
            }

            if (var125.equalsIgnoreCase("left")) {
               label375: {
                  var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var71 instanceof class_2746) {
                     class_2746 _getbp58 = (class_2746)var71;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp58)) {
                        var126 = true;
                        break label375;
                     }
                  }

                  var126 = false;
               }

               if (!var126) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_left"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var71 instanceof class_2754) {
               class_2754 _getep62 = (class_2754)var71;
               var125 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep62).toString();
            } else {
               var125 = "";
            }

            if (var125.equalsIgnoreCase("right")) {
               label365: {
                  var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var71 instanceof class_2746) {
                     class_2746 _getbp64 = (class_2746)var71;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp64)) {
                        var128 = true;
                        break label365;
                     }
                  }

                  var128 = false;
               }

               if (!var128) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var71 instanceof class_2754) {
               class_2754 _getep68 = (class_2754)var71;
               var125 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep68).toString();
            } else {
               var125 = "";
            }

            if (var125.equalsIgnoreCase("left")) {
               label355: {
                  var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var71 instanceof class_2746) {
                     class_2746 _getbp70 = (class_2746)var71;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp70)) {
                        var130 = true;
                        break label355;
                     }
                  }

                  var130 = false;
               }

               if (var130) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_left"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var71 instanceof class_2754) {
               class_2754 _getep74 = (class_2754)var71;
               var125 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep74).toString();
            } else {
               var125 = "";
            }

            if (var125.equalsIgnoreCase("right")) {
               label346: {
                  var71 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var71 instanceof class_2746) {
                     class_2746 _getbp76 = (class_2746)var71;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp76)) {
                        var132 = true;
                        break label346;
                     }
                  }

                  var132 = false;
               }

               if (var132) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11467).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                     }
                  }
               }
            }
         } else if (getBlockDirection(world, class_2338.method_49637(x, y, z)) == class_2350.field_11039) {
            class_2769 var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            String var133;
            if (var83 instanceof class_2754) {
               class_2754 _getep82 = (class_2754)var83;
               var133 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep82).toString();
            } else {
               var133 = "";
            }

            if (var133.equalsIgnoreCase("left")) {
               label412: {
                  var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var83 instanceof class_2746) {
                     class_2746 _getbp84 = (class_2746)var83;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp84)) {
                        var134 = true;
                        break label412;
                     }
                  }

                  var134 = false;
               }

               if (!var134) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_left"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var83 instanceof class_2754) {
               class_2754 _getep88 = (class_2754)var83;
               var133 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep88).toString();
            } else {
               var133 = "";
            }

            if (var133.equalsIgnoreCase("right")) {
               label402: {
                  var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var83 instanceof class_2746) {
                     class_2746 _getbp90 = (class_2746)var83;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp90)) {
                        var136 = true;
                        break label402;
                     }
                  }

                  var136 = false;
               }

               if (!var136) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_closed_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var83 instanceof class_2754) {
               class_2754 _getep94 = (class_2754)var83;
               var133 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep94).toString();
            } else {
               var133 = "";
            }

            if (var133.equalsIgnoreCase("left")) {
               label392: {
                  var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var83 instanceof class_2746) {
                     class_2746 _getbp96 = (class_2746)var83;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp96)) {
                        var138 = true;
                        break label392;
                     }
                  }

                  var138 = false;
               }

               if (var138) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_left"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
                        return;
                     }
                  }

                  return;
               }
            }

            var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hinge");
            if (var83 instanceof class_2754) {
               class_2754 _getep100 = (class_2754)var83;
               var133 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep100).toString();
            } else {
               var133 = "";
            }

            if (var133.equalsIgnoreCase("right")) {
               label383: {
                  var83 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("open");
                  if (var83 instanceof class_2746) {
                     class_2746 _getbp102 = (class_2746)var83;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp102)) {
                        var140 = true;
                        break label383;
                     }
                  }

                  var140 = false;
               }

               if (var140) {
                  world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
                  if (world instanceof class_3218) {
                     class_3218 _serverworld = (class_3218)world;
                     class_3499 template = _serverworld.method_14183().method_15091(class_2960.method_60655("burnt", "oak_open_right"));
                     if (template != null) {
                        template.method_15172(_serverworld, class_2338.method_49637(x, y, z), class_2338.method_49637(x, y, z), (new class_3492()).method_15123(class_2470.field_11463).method_15125(class_2415.field_11302).method_15133(false), _serverworld.field_9229, 3);
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
