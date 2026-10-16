package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;

public class CookedMushroomBlockstatesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      for(int i = 0; i < 64; ++i) {
         boolean north;
         boolean south;
         boolean east;
         boolean west;
         boolean up;
         boolean down;
         boolean var10000;
         label112: {
            north = (i & 32) == 0;
            south = (i & 16) == 0;
            east = (i & 8) == 0;
            west = (i & 4) == 0;
            up = (i & 2) == 0;
            down = (i & 1) == 0;
            class_2769 var21 = blockstate.method_26204().method_9595().method_11663("north");
            if (var21 instanceof class_2746 _getbpN) {
               if ((Boolean)blockstate.method_11654(_getbpN)) {
                  var10000 = true;
                  break label112;
               }
            }

            var10000 = false;
         }

         if (var10000 == north) {
            label105: {
               class_2769 var26 = blockstate.method_26204().method_9595().method_11663("south");
               if (var26 instanceof class_2746) {
                  class_2746 _getbpS = (class_2746)var26;
                  if ((Boolean)blockstate.method_11654(_getbpS)) {
                     var10000 = true;
                     break label105;
                  }
               }

               var10000 = false;
            }

            if (var10000 == south) {
               label99: {
                  class_2769 var27 = blockstate.method_26204().method_9595().method_11663("east");
                  if (var27 instanceof class_2746) {
                     class_2746 _getbpE = (class_2746)var27;
                     if ((Boolean)blockstate.method_11654(_getbpE)) {
                        var10000 = true;
                        break label99;
                     }
                  }

                  var10000 = false;
               }

               if (var10000 == east) {
                  label93: {
                     class_2769 var28 = blockstate.method_26204().method_9595().method_11663("west");
                     if (var28 instanceof class_2746) {
                        class_2746 _getbpW = (class_2746)var28;
                        if ((Boolean)blockstate.method_11654(_getbpW)) {
                           var10000 = true;
                           break label93;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000 == west) {
                     label87: {
                        class_2769 var29 = blockstate.method_26204().method_9595().method_11663("up");
                        if (var29 instanceof class_2746) {
                           class_2746 _getbpU = (class_2746)var29;
                           if ((Boolean)blockstate.method_11654(_getbpU)) {
                              var10000 = true;
                              break label87;
                           }
                        }

                        var10000 = false;
                     }

                     if (var10000 == up) {
                        label81: {
                           class_2769 var30 = blockstate.method_26204().method_9595().method_11663("down");
                           if (var30 instanceof class_2746) {
                              class_2746 _getbpD = (class_2746)var30;
                              if ((Boolean)blockstate.method_11654(_getbpD)) {
                                 var10000 = true;
                                 break label81;
                              }
                           }

                           var10000 = false;
                        }

                        if (var10000 == down) {
                           int _value = i + 1;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var25 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var25 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var25;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }

                           return;
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
