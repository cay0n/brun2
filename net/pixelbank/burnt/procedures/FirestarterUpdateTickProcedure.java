package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class FirestarterUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (world.method_8401().method_156() && IsRainingProcedure.execute(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10515) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_10036.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10114) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = class_2246.field_22089.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         boolean var10000;
         label135: {
            class_2769 var25 = blockstate.method_26204().method_9595().method_11663("down");
            if (var25 instanceof class_2746) {
               class_2746 _getbp10 = (class_2746)var25;
               if ((Boolean)blockstate.method_11654(_getbp10)) {
                  var10000 = true;
                  break label135;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            int _value = 0;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var47 = _bs.method_26204().method_9595().method_11663("blockstate");
            if (var47 instanceof class_2758) {
               class_2758 _integerProp = (class_2758)var47;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         } else {
            label128: {
               class_2769 _pos = blockstate.method_26204().method_9595().method_11663("north");
               if (_pos instanceof class_2746) {
                  class_2746 _getbp13 = (class_2746)_pos;
                  if ((Boolean)blockstate.method_11654(_getbp13)) {
                     var10000 = true;
                     break label128;
                  }
               }

               var10000 = false;
            }

            if (var10000) {
               int _value = 2;
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var53 = _bs.method_26204().method_9595().method_11663("blockstate");
               if (var53 instanceof class_2758) {
                  class_2758 _integerProp = (class_2758)var53;
                  if (_integerProp.method_11898().contains(_value)) {
                     world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                  }
               }
            } else {
               label122: {
                  class_2769 _bs = blockstate.method_26204().method_9595().method_11663("east");
                  if (_bs instanceof class_2746) {
                     class_2746 _getbp16 = (class_2746)_bs;
                     if ((Boolean)blockstate.method_11654(_getbp16)) {
                        var10000 = true;
                        break label122;
                     }
                  }

                  var10000 = false;
               }

               if (var10000) {
                  int _value = 3;
                  class_2338 _pos = class_2338.method_49637(x, y, z);
                  class_2680 _bs = world.method_8320(_pos);
                  class_2769 var57 = _bs.method_26204().method_9595().method_11663("blockstate");
                  if (var57 instanceof class_2758) {
                     class_2758 _integerProp = (class_2758)var57;
                     if (_integerProp.method_11898().contains(_value)) {
                        world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                     }
                  }
               } else {
                  label116: {
                     class_2769 _integerProp = blockstate.method_26204().method_9595().method_11663("south");
                     if (_integerProp instanceof class_2746) {
                        class_2746 _getbp19 = (class_2746)_integerProp;
                        if ((Boolean)blockstate.method_11654(_getbp19)) {
                           var10000 = true;
                           break label116;
                        }
                     }

                     var10000 = false;
                  }

                  if (var10000) {
                     int _value = 4;
                     class_2338 _pos = class_2338.method_49637(x, y, z);
                     class_2680 _bs = world.method_8320(_pos);
                     class_2769 var60 = _bs.method_26204().method_9595().method_11663("blockstate");
                     if (var60 instanceof class_2758) {
                        class_2758 _integerProp = (class_2758)var60;
                        if (_integerProp.method_11898().contains(_value)) {
                           world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                        }
                     }
                  } else {
                     label110: {
                        class_2769 _integerProp = blockstate.method_26204().method_9595().method_11663("west");
                        if (_integerProp instanceof class_2746) {
                           class_2746 _getbp22 = (class_2746)_integerProp;
                           if ((Boolean)blockstate.method_11654(_getbp22)) {
                              var10000 = true;
                              break label110;
                           }
                        }

                        var10000 = false;
                     }

                     if (var10000) {
                        int _value = 5;
                        class_2338 _pos = class_2338.method_49637(x, y, z);
                        class_2680 _bs = world.method_8320(_pos);
                        class_2769 var62 = _bs.method_26204().method_9595().method_11663("blockstate");
                        if (var62 instanceof class_2758) {
                           class_2758 _integerProp = (class_2758)var62;
                           if (_integerProp.method_11898().contains(_value)) {
                              world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                           }
                        }
                     } else {
                        label104: {
                           class_2769 _integerProp = blockstate.method_26204().method_9595().method_11663("up");
                           if (_integerProp instanceof class_2746) {
                              class_2746 _getbp25 = (class_2746)_integerProp;
                              if ((Boolean)blockstate.method_11654(_getbp25)) {
                                 var10000 = true;
                                 break label104;
                              }
                           }

                           var10000 = false;
                        }

                        if (var10000) {
                           int _value = 6;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var18 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var18 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var18;
                              if (_integerProp.method_11898().contains(_value)) {
                                 world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                              }
                           }
                        } else {
                           int _value = 0;
                           class_2338 _pos = class_2338.method_49637(x, y, z);
                           class_2680 _bs = world.method_8320(_pos);
                           class_2769 var63 = _bs.method_26204().method_9595().method_11663("blockstate");
                           if (var63 instanceof class_2758) {
                              class_2758 _integerProp = (class_2758)var63;
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

         double burnoutChance = (Double)BurntBasicConfigConfiguration.FIRE_BURNOUT_CHANCE.get() / (double)100.0F;
         if (burnoutChance > (double)0.0F && Math.random() <= burnoutChance) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         }

         WillitburnProcedure.execute(world, x, y, z);
      }

   }
}
