package net.pixelbank.burnt.procedures;

import net.minecraft.class_1928;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntDimensions;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class WillitburnProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!BurntProtection.isProtected(world, x, y, z)) {
         boolean rainOK = false;
         boolean isCave = false;
         boolean waterNear = false;
         boolean isRaining = false;
         boolean allowBurn = false;
         if (!world.method_8608() && world.method_8401().method_146().method_8355(class_1928.field_19387) && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get() && !BurntDimensions.isDisabled(world)) {
            if (world.method_8401().method_156()) {
               isRaining = IsRainingProcedure.execute(world, x, y, z);
            } else {
               isRaining = false;
            }

            if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_CAVE)) {
               isCave = true;
            }

            if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
               if (!isRaining) {
                  rainOK = true;
               } else if (isCave) {
                  rainOK = true;
               }
            } else {
               rainOK = true;
            }

            if (rainOK) {
               label102: {
                  class_2680 bs1 = world.method_8320(class_2338.method_49637(x + (double)1.0F, y - (double)1.0F, z));
                  class_2680 bs2 = world.method_8320(class_2338.method_49637(x - (double)1.0F, y - (double)1.0F, z));
                  class_2680 bs3 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z - (double)1.0F));
                  class_2680 bs4 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z + (double)1.0F));
                  class_2680 bs5 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z));
                  if (bs1.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                     boolean var10000;
                     label99: {
                        class_2769 var22 = bs1.method_26204().method_9595().method_11663("waterlogged");
                        if (var22 instanceof class_2746) {
                           class_2746 _getbp9 = (class_2746)var22;
                           if ((Boolean)bs1.method_11654(_getbp9)) {
                              var10000 = true;
                              break label99;
                           }
                        }

                        var10000 = false;
                     }

                     if (!var10000 && bs2.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                        label92: {
                           class_2769 var24 = bs2.method_26204().method_9595().method_11663("waterlogged");
                           if (var24 instanceof class_2746) {
                              class_2746 _getbp13 = (class_2746)var24;
                              if ((Boolean)bs2.method_11654(_getbp13)) {
                                 var10000 = true;
                                 break label92;
                              }
                           }

                           var10000 = false;
                        }

                        if (!var10000 && bs3.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                           label85: {
                              class_2769 var25 = bs3.method_26204().method_9595().method_11663("waterlogged");
                              if (var25 instanceof class_2746) {
                                 class_2746 _getbp17 = (class_2746)var25;
                                 if ((Boolean)bs3.method_11654(_getbp17)) {
                                    var10000 = true;
                                    break label85;
                                 }
                              }

                              var10000 = false;
                           }

                           if (!var10000 && bs4.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                              label78: {
                                 class_2769 var26 = bs4.method_26204().method_9595().method_11663("waterlogged");
                                 if (var26 instanceof class_2746) {
                                    class_2746 _getbp21 = (class_2746)var26;
                                    if ((Boolean)bs4.method_11654(_getbp21)) {
                                       var10000 = true;
                                       break label78;
                                    }
                                 }

                                 var10000 = false;
                              }

                              if (!var10000 && bs5.method_26227().method_15759().method_26204() != class_2246.field_10382) {
                                 label71: {
                                    class_2769 var27 = bs5.method_26204().method_9595().method_11663("waterlogged");
                                    if (var27 instanceof class_2746) {
                                       class_2746 _getbp25 = (class_2746)var27;
                                       if ((Boolean)bs5.method_11654(_getbp25)) {
                                          var10000 = true;
                                          break label71;
                                       }
                                    }

                                    var10000 = false;
                                 }

                                 if (!var10000) {
                                    break label102;
                                 }
                              }
                           }
                        }
                     }
                  }

                  waterNear = true;
               }

               if (!waterNear) {
                  allowBurn = true;
               }

               if (allowBurn) {
                  TheBurnProcedure.execute(world, x, y, z);
               }
            }
         }

      }
   }
}
