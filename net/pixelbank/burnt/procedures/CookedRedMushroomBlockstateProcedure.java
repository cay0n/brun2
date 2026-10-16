package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;

public class CookedRedMushroomBlockstateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         boolean var10000;
         label309: {
            class_2769 var14 = blockstate.method_26204().method_9595().method_11663("north");
            if (var14 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var14;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label309;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label302: {
               class_2769 var37 = blockstate.method_26204().method_9595().method_11663("east");
               if (var37 instanceof class_2746) {
                  class_2746 _getbp4 = (class_2746)var37;
                  if ((Boolean)blockstate.method_11654(_getbp4)) {
                     var10000 = true;
                     break label302;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label296: {
                  class_2769 var38 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var38 instanceof class_2746) {
                     class_2746 _getbp6 = (class_2746)var38;
                     if ((Boolean)blockstate.method_11654(_getbp6)) {
                        var10000 = true;
                        break label296;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label290: {
                     class_2769 var39 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var39 instanceof class_2746) {
                        class_2746 _getbp8 = (class_2746)var39;
                        if ((Boolean)blockstate.method_11654(_getbp8)) {
                           var10000 = true;
                           break label290;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     label284: {
                        class_2769 var40 = blockstate.method_26204().method_9595().method_11663("up");
                        if (var40 instanceof class_2746) {
                           class_2746 _getbp10 = (class_2746)var40;
                           if ((Boolean)blockstate.method_11654(_getbp10)) {
                              var10000 = true;
                              break label284;
                           }
                        }

                        var10000 = false;
                     }

                     if (var10000) {
                        label278: {
                           class_2769 var41 = blockstate.method_26204().method_9595().method_11663("down");
                           if (var41 instanceof class_2746) {
                              class_2746 _getbp12 = (class_2746)var41;
                              if ((Boolean)blockstate.method_11654(_getbp12)) {
                                 var10000 = true;
                                 break label278;
                              }
                           }

                           var10000 = false;
                        }

                        if (var10000) {
                           int _value = 1;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var18 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var18 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var18;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         label267: {
            class_2769 var43 = blockstate.method_26204().method_9595().method_11663("north");
            if (var43 instanceof class_2746) {
               class_2746 _getbp15 = (class_2746)var43;
               if ((Boolean)blockstate.method_11654(_getbp15)) {
                  var10000 = true;
                  break label267;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label260: {
               class_2769 var44 = blockstate.method_26204().method_9595().method_11663("east");
               if (var44 instanceof class_2746) {
                  class_2746 _getbp17 = (class_2746)var44;
                  if ((Boolean)blockstate.method_11654(_getbp17)) {
                     var10000 = true;
                     break label260;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label254: {
                  class_2769 var45 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var45 instanceof class_2746) {
                     class_2746 _getbp19 = (class_2746)var45;
                     if ((Boolean)blockstate.method_11654(_getbp19)) {
                        var10000 = true;
                        break label254;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label248: {
                     class_2769 var46 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var46 instanceof class_2746) {
                        class_2746 _getbp21 = (class_2746)var46;
                        if ((Boolean)blockstate.method_11654(_getbp21)) {
                           var10000 = true;
                           break label248;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     label242: {
                        class_2769 var47 = blockstate.method_26204().method_9595().method_11663("up");
                        if (var47 instanceof class_2746) {
                           class_2746 _getbp23 = (class_2746)var47;
                           if ((Boolean)blockstate.method_11654(_getbp23)) {
                              var10000 = true;
                              break label242;
                           }
                        }

                        var10000 = false;
                     }

                     if (var10000) {
                        label236: {
                           class_2769 var48 = blockstate.method_26204().method_9595().method_11663("down");
                           if (var48 instanceof class_2746) {
                              class_2746 _getbp25 = (class_2746)var48;
                              if ((Boolean)blockstate.method_11654(_getbp25)) {
                                 var10000 = true;
                                 break label236;
                              }
                           }

                           var10000 = false;
                        }

                        if (!var10000) {
                           int _value = 2;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var73 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var73 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var73;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         label225: {
            class_2769 var50 = blockstate.method_26204().method_9595().method_11663("north");
            if (var50 instanceof class_2746) {
               class_2746 _getbp28 = (class_2746)var50;
               if ((Boolean)blockstate.method_11654(_getbp28)) {
                  var10000 = true;
                  break label225;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label218: {
               class_2769 var51 = blockstate.method_26204().method_9595().method_11663("east");
               if (var51 instanceof class_2746) {
                  class_2746 _getbp30 = (class_2746)var51;
                  if ((Boolean)blockstate.method_11654(_getbp30)) {
                     var10000 = true;
                     break label218;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label212: {
                  class_2769 var52 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var52 instanceof class_2746) {
                     class_2746 _getbp32 = (class_2746)var52;
                     if ((Boolean)blockstate.method_11654(_getbp32)) {
                        var10000 = true;
                        break label212;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label206: {
                     class_2769 var53 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var53 instanceof class_2746) {
                        class_2746 _getbp34 = (class_2746)var53;
                        if ((Boolean)blockstate.method_11654(_getbp34)) {
                           var10000 = true;
                           break label206;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     label200: {
                        class_2769 var54 = blockstate.method_26204().method_9595().method_11663("up");
                        if (var54 instanceof class_2746) {
                           class_2746 _getbp36 = (class_2746)var54;
                           if ((Boolean)blockstate.method_11654(_getbp36)) {
                              var10000 = true;
                              break label200;
                           }
                        }

                        var10000 = false;
                     }

                     if (!var10000) {
                        label194: {
                           class_2769 var55 = blockstate.method_26204().method_9595().method_11663("down");
                           if (var55 instanceof class_2746) {
                              class_2746 _getbp38 = (class_2746)var55;
                              if ((Boolean)blockstate.method_11654(_getbp38)) {
                                 var10000 = true;
                                 break label194;
                              }
                           }

                           var10000 = false;
                        }

                        if (var10000) {
                           int _value = 3;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var74 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var74 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var74;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         label183: {
            class_2769 var57 = blockstate.method_26204().method_9595().method_11663("north");
            if (var57 instanceof class_2746) {
               class_2746 _getbp41 = (class_2746)var57;
               if ((Boolean)blockstate.method_11654(_getbp41)) {
                  var10000 = true;
                  break label183;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            label177: {
               class_2769 var58 = blockstate.method_26204().method_9595().method_11663("east");
               if (var58 instanceof class_2746) {
                  class_2746 _getbp43 = (class_2746)var58;
                  if ((Boolean)blockstate.method_11654(_getbp43)) {
                     var10000 = true;
                     break label177;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               label171: {
                  class_2769 var59 = blockstate.method_26204().method_9595().method_11663("south");
                  if (var59 instanceof class_2746) {
                     class_2746 _getbp45 = (class_2746)var59;
                     if ((Boolean)blockstate.method_11654(_getbp45)) {
                        var10000 = true;
                        break label171;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  label165: {
                     class_2769 var60 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var60 instanceof class_2746) {
                        class_2746 _getbp47 = (class_2746)var60;
                        if ((Boolean)blockstate.method_11654(_getbp47)) {
                           var10000 = true;
                           break label165;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     label159: {
                        class_2769 var61 = blockstate.method_26204().method_9595().method_11663("up");
                        if (var61 instanceof class_2746) {
                           class_2746 _getbp49 = (class_2746)var61;
                           if ((Boolean)blockstate.method_11654(_getbp49)) {
                              var10000 = true;
                              break label159;
                           }
                        }

                        var10000 = false;
                     }

                     if (!var10000) {
                        label153: {
                           class_2769 var62 = blockstate.method_26204().method_9595().method_11663("down");
                           if (var62 instanceof class_2746) {
                              class_2746 _getbp51 = (class_2746)var62;
                              if ((Boolean)blockstate.method_11654(_getbp51)) {
                                 var10000 = true;
                                 break label153;
                              }
                           }

                           var10000 = false;
                        }

                        if (!var10000) {
                           int _value = 4;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var75 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var75 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var75;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
