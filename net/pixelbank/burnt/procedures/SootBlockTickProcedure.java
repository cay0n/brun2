package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;

public class SootBlockTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         boolean var10000;
         label1011: {
            class_2769 var72 = blockstate.method_26204().method_9595().method_11663("north");
            if (var72 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var72;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label1011;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label1004: {
               class_2769 var78 = blockstate.method_26204().method_9595().method_11663("east");
               if (var78 instanceof class_2746) {
                  class_2746 _getbp4 = (class_2746)var78;
                  if ((Boolean)blockstate.method_11654(_getbp4)) {
                     var10000 = true;
                     break label1004;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label998: {
                  class_2769 var79 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var79 instanceof class_2746) {
                     class_2746 _getbp6 = (class_2746)var79;
                     if ((Boolean)blockstate.method_11654(_getbp6)) {
                        var10000 = true;
                        break label998;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label992: {
                     class_2769 var80 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var80 instanceof class_2746) {
                        class_2746 _getbp8 = (class_2746)var80;
                        if ((Boolean)blockstate.method_11654(_getbp8)) {
                           var10000 = true;
                           break label992;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 4;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var295 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var295 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var295;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label985: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp12 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp12)) {
                  var10000 = true;
                  break label985;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label978: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp14 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp14)) {
                     var10000 = true;
                     break label978;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label972: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp16 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp16)) {
                        var10000 = true;
                        break label972;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label966: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp18 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp18)) {
                           var10000 = true;
                           break label966;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 0;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var293 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var293 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var293;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11043;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label954: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp23 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp23)) {
                  var10000 = true;
                  break label954;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label947: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp25 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp25)) {
                     var10000 = true;
                     break label947;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label941: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp27 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp27)) {
                        var10000 = true;
                        break label941;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label935: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp29 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp29)) {
                           var10000 = true;
                           break label935;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 0;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var291 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var291 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var291;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11039;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label923: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp34 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp34)) {
                  var10000 = true;
                  break label923;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label916: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp36 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp36)) {
                     var10000 = true;
                     break label916;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label910: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp38 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp38)) {
                        var10000 = true;
                        break label910;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label904: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp40 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp40)) {
                           var10000 = true;
                           break label904;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 0;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var289 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var289 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var289;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11035;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label892: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp45 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp45)) {
                  var10000 = true;
                  break label892;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label885: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp47 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp47)) {
                     var10000 = true;
                     break label885;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label879: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp49 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp49)) {
                        var10000 = true;
                        break label879;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label873: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp51 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp51)) {
                           var10000 = true;
                           break label873;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 0;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var287 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var287 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var287;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11034;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label861: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp56 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp56)) {
                  var10000 = true;
                  break label861;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label854: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp58 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp58)) {
                     var10000 = true;
                     break label854;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label848: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp60 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp60)) {
                        var10000 = true;
                        break label848;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label842: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp62 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp62)) {
                           var10000 = true;
                           break label842;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 2;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var285 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var285 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var285;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11043;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label830: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp67 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp67)) {
                  var10000 = true;
                  break label830;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label823: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("east");
               if (_value instanceof class_2746) {
                  class_2746 _getbp69 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp69)) {
                     var10000 = true;
                     break label823;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label817: {
                  class_2769 _dir = blockstate.method_26204().method_9595().method_11663("south");
                  if (_dir instanceof class_2746) {
                     class_2746 _getbp71 = (class_2746)_dir;
                     if ((Boolean)blockstate.method_11654(_getbp71)) {
                        var10000 = true;
                        break label817;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label811: {
                     class_2769 _value = blockstate.method_26204().method_9595().method_11663("west");
                     if (_value instanceof class_2746) {
                        class_2746 _getbp73 = (class_2746)_value;
                        if ((Boolean)blockstate.method_11654(_getbp73)) {
                           var10000 = true;
                           break label811;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 2;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var283 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var283 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var283;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11034;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label799: {
            class_2769 _dir = blockstate.method_26204().method_9595().method_11663("north");
            if (_dir instanceof class_2746) {
               class_2746 _getbp78 = (class_2746)_dir;
               if ((Boolean)blockstate.method_11654(_getbp78)) {
                  var10000 = true;
                  break label799;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label792: {
               class_2769 var106 = blockstate.method_26204().method_9595().method_11663("east");
               if (var106 instanceof class_2746) {
                  class_2746 _getbp80 = (class_2746)var106;
                  if ((Boolean)blockstate.method_11654(_getbp80)) {
                     var10000 = true;
                     break label792;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label786: {
                  class_2769 var107 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var107 instanceof class_2746) {
                     class_2746 _getbp82 = (class_2746)var107;
                     if ((Boolean)blockstate.method_11654(_getbp82)) {
                        var10000 = true;
                        break label786;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label780: {
                     class_2769 var108 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var108 instanceof class_2746) {
                        class_2746 _getbp84 = (class_2746)var108;
                        if ((Boolean)blockstate.method_11654(_getbp84)) {
                           var10000 = true;
                           break label780;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 3;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var281 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var281 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var281;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11043;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label768: {
            class_2769 var109 = blockstate.method_26204().method_9595().method_11663("north");
            if (var109 instanceof class_2746) {
               class_2746 _getbp89 = (class_2746)var109;
               if ((Boolean)blockstate.method_11654(_getbp89)) {
                  var10000 = true;
                  break label768;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label761: {
               class_2769 var110 = blockstate.method_26204().method_9595().method_11663("east");
               if (var110 instanceof class_2746) {
                  class_2746 _getbp91 = (class_2746)var110;
                  if ((Boolean)blockstate.method_11654(_getbp91)) {
                     var10000 = true;
                     break label761;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label755: {
                  class_2769 var111 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var111 instanceof class_2746) {
                     class_2746 _getbp93 = (class_2746)var111;
                     if ((Boolean)blockstate.method_11654(_getbp93)) {
                        var10000 = true;
                        break label755;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label749: {
                     class_2769 var112 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var112 instanceof class_2746) {
                        class_2746 _getbp95 = (class_2746)var112;
                        if ((Boolean)blockstate.method_11654(_getbp95)) {
                           var10000 = true;
                           break label749;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 3;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11034;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label737: {
            class_2769 var113 = blockstate.method_26204().method_9595().method_11663("north");
            if (var113 instanceof class_2746) {
               class_2746 _getbp100 = (class_2746)var113;
               if ((Boolean)blockstate.method_11654(_getbp100)) {
                  var10000 = true;
                  break label737;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label730: {
               class_2769 var114 = blockstate.method_26204().method_9595().method_11663("east");
               if (var114 instanceof class_2746) {
                  class_2746 _getbp102 = (class_2746)var114;
                  if ((Boolean)blockstate.method_11654(_getbp102)) {
                     var10000 = true;
                     break label730;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label724: {
                  class_2769 var115 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var115 instanceof class_2746) {
                     class_2746 _getbp104 = (class_2746)var115;
                     if ((Boolean)blockstate.method_11654(_getbp104)) {
                        var10000 = true;
                        break label724;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label718: {
                     class_2769 var116 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var116 instanceof class_2746) {
                        class_2746 _getbp106 = (class_2746)var116;
                        if ((Boolean)blockstate.method_11654(_getbp106)) {
                           var10000 = true;
                           break label718;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 3;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11035;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label706: {
            class_2769 var117 = blockstate.method_26204().method_9595().method_11663("north");
            if (var117 instanceof class_2746) {
               class_2746 _getbp111 = (class_2746)var117;
               if ((Boolean)blockstate.method_11654(_getbp111)) {
                  var10000 = true;
                  break label706;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label699: {
               class_2769 var118 = blockstate.method_26204().method_9595().method_11663("east");
               if (var118 instanceof class_2746) {
                  class_2746 _getbp113 = (class_2746)var118;
                  if ((Boolean)blockstate.method_11654(_getbp113)) {
                     var10000 = true;
                     break label699;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label693: {
                  class_2769 var119 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var119 instanceof class_2746) {
                     class_2746 _getbp115 = (class_2746)var119;
                     if ((Boolean)blockstate.method_11654(_getbp115)) {
                        var10000 = true;
                        break label693;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label687: {
                     class_2769 var120 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var120 instanceof class_2746) {
                        class_2746 _getbp117 = (class_2746)var120;
                        if ((Boolean)blockstate.method_11654(_getbp117)) {
                           var10000 = true;
                           break label687;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 3;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11039;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label675: {
            class_2769 var121 = blockstate.method_26204().method_9595().method_11663("north");
            if (var121 instanceof class_2746) {
               class_2746 _getbp122 = (class_2746)var121;
               if ((Boolean)blockstate.method_11654(_getbp122)) {
                  var10000 = true;
                  break label675;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label668: {
               class_2769 var122 = blockstate.method_26204().method_9595().method_11663("east");
               if (var122 instanceof class_2746) {
                  class_2746 _getbp124 = (class_2746)var122;
                  if ((Boolean)blockstate.method_11654(_getbp124)) {
                     var10000 = true;
                     break label668;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label662: {
                  class_2769 var123 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var123 instanceof class_2746) {
                     class_2746 _getbp126 = (class_2746)var123;
                     if ((Boolean)blockstate.method_11654(_getbp126)) {
                        var10000 = true;
                        break label662;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label656: {
                     class_2769 var124 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var124 instanceof class_2746) {
                        class_2746 _getbp128 = (class_2746)var124;
                        if ((Boolean)blockstate.method_11654(_getbp128)) {
                           var10000 = true;
                           break label656;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 1;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11039;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label644: {
            class_2769 var125 = blockstate.method_26204().method_9595().method_11663("north");
            if (var125 instanceof class_2746) {
               class_2746 _getbp133 = (class_2746)var125;
               if ((Boolean)blockstate.method_11654(_getbp133)) {
                  var10000 = true;
                  break label644;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label637: {
               class_2769 var126 = blockstate.method_26204().method_9595().method_11663("east");
               if (var126 instanceof class_2746) {
                  class_2746 _getbp135 = (class_2746)var126;
                  if ((Boolean)blockstate.method_11654(_getbp135)) {
                     var10000 = true;
                     break label637;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label631: {
                  class_2769 var127 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var127 instanceof class_2746) {
                     class_2746 _getbp137 = (class_2746)var127;
                     if ((Boolean)blockstate.method_11654(_getbp137)) {
                        var10000 = true;
                        break label631;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label625: {
                     class_2769 var128 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var128 instanceof class_2746) {
                        class_2746 _getbp139 = (class_2746)var128;
                        if ((Boolean)blockstate.method_11654(_getbp139)) {
                           var10000 = true;
                           break label625;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     int _value = 1;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11035;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label613: {
            class_2769 var129 = blockstate.method_26204().method_9595().method_11663("north");
            if (var129 instanceof class_2746) {
               class_2746 _getbp144 = (class_2746)var129;
               if ((Boolean)blockstate.method_11654(_getbp144)) {
                  var10000 = true;
                  break label613;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label606: {
               class_2769 var130 = blockstate.method_26204().method_9595().method_11663("east");
               if (var130 instanceof class_2746) {
                  class_2746 _getbp146 = (class_2746)var130;
                  if ((Boolean)blockstate.method_11654(_getbp146)) {
                     var10000 = true;
                     break label606;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label600: {
                  class_2769 var131 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var131 instanceof class_2746) {
                     class_2746 _getbp148 = (class_2746)var131;
                     if ((Boolean)blockstate.method_11654(_getbp148)) {
                        var10000 = true;
                        break label600;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label594: {
                     class_2769 var132 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var132 instanceof class_2746) {
                        class_2746 _getbp150 = (class_2746)var132;
                        if ((Boolean)blockstate.method_11654(_getbp150)) {
                           var10000 = true;
                           break label594;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 1;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11034;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label582: {
            class_2769 var133 = blockstate.method_26204().method_9595().method_11663("north");
            if (var133 instanceof class_2746) {
               class_2746 _getbp155 = (class_2746)var133;
               if ((Boolean)blockstate.method_11654(_getbp155)) {
                  var10000 = true;
                  break label582;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label575: {
               class_2769 var134 = blockstate.method_26204().method_9595().method_11663("east");
               if (var134 instanceof class_2746) {
                  class_2746 _getbp157 = (class_2746)var134;
                  if ((Boolean)blockstate.method_11654(_getbp157)) {
                     var10000 = true;
                     break label575;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label569: {
                  class_2769 var135 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var135 instanceof class_2746) {
                     class_2746 _getbp159 = (class_2746)var135;
                     if ((Boolean)blockstate.method_11654(_getbp159)) {
                        var10000 = true;
                        break label569;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label563: {
                     class_2769 var136 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var136 instanceof class_2746) {
                        class_2746 _getbp161 = (class_2746)var136;
                        if ((Boolean)blockstate.method_11654(_getbp161)) {
                           var10000 = true;
                           break label563;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 1;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 _dp = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (_dp instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)_dp;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }

                     class_2350 _dir = class_2350.field_11043;
                     _pos = class_2338.method_49637(x, y, z);
                     _bs = world.method_8320(_pos);
                     class_2769<?> _property = _bs.method_26204().method_9595().method_11663("facing");
                     if (_property instanceof class_2753) {
                        class_2753 _dp = (class_2753)_property;
                        if (_dp.method_11898().contains(_dir)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_dp, _dir), 3);
                           return;
                        }
                     }

                     _property = _bs.method_26204().method_9595().method_11663("axis");
                     if (_property instanceof class_2754) {
                        class_2754 _ap = (class_2754)_property;
                        if (_ap.method_11898().contains(_dir.method_10166())) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_ap, _dir.method_10166()), 3);
                           return;
                        }
                     }

                     return;
                  }
               }
            }
         }

         label551: {
            class_2769 var137 = blockstate.method_26204().method_9595().method_11663("north");
            if (var137 instanceof class_2746) {
               class_2746 _getbp166 = (class_2746)var137;
               if ((Boolean)blockstate.method_11654(_getbp166)) {
                  var10000 = true;
                  break label551;
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            label545: {
               class_2769 var138 = blockstate.method_26204().method_9595().method_11663("east");
               if (var138 instanceof class_2746) {
                  class_2746 _getbp168 = (class_2746)var138;
                  if ((Boolean)blockstate.method_11654(_getbp168)) {
                     var10000 = true;
                     break label545;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               label539: {
                  class_2769 var139 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var139 instanceof class_2746) {
                     class_2746 _getbp170 = (class_2746)var139;
                     if ((Boolean)blockstate.method_11654(_getbp170)) {
                        var10000 = true;
                        break label539;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  label533: {
                     class_2769 var140 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var140 instanceof class_2746) {
                        class_2746 _getbp172 = (class_2746)var140;
                        if ((Boolean)blockstate.method_11654(_getbp172)) {
                           var10000 = true;
                           break label533;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     world.method_22352(class_2338.method_49637(x, y, z), false);
                  }
               }
            }
         }
      }

   }
}
