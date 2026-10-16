package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class FiresstarterBlockPlacedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var17 = _bs.method_26204().method_9595().method_11663("up");
            if (var17 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var17;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var58 = _bs.method_26204().method_9595().method_11663("up");
            if (var58 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var58;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var59 = _bs.method_26204().method_9595().method_11663("down");
            if (var59 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var59;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var60 = _bs.method_26204().method_9595().method_11663("down");
            if (var60 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var60;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var61 = _bs.method_26204().method_9595().method_11663("north");
            if (var61 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var61;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var62 = _bs.method_26204().method_9595().method_11663("north");
            if (var62 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var62;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var63 = _bs.method_26204().method_9595().method_11663("east");
            if (var63 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var63;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var64 = _bs.method_26204().method_9595().method_11663("east");
            if (var64 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var64;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var65 = _bs.method_26204().method_9595().method_11663("south");
            if (var65 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var65;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var66 = _bs.method_26204().method_9595().method_11663("south");
            if (var66 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var66;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26225()) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var67 = _bs.method_26204().method_9595().method_11663("west");
            if (var67 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var67;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var68 = _bs.method_26204().method_9595().method_11663("west");
            if (var68 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var68;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((Boolean)BurntBasicConfigConfiguration.LAVA_BURN.get()) {
            WillitburnProcedure.execute(world, x, y, z);
         } else {
            found = false;
            sx = (double)-5.0F;

            for(int index0 = 0; index0 < 10; ++index0) {
               sy = (double)-5.0F;

               for(int index1 = 0; index1 < 10; ++index1) {
                  sz = (double)-5.0F;

                  for(int index2 = 0; index2 < 10; ++index2) {
                     if (world.method_8316(class_2338.method_49637(x + sx, y + sy, z + sz)).method_15759().method_26204() == class_2246.field_10164) {
                        found = true;
                     }

                     ++sz;
                  }

                  ++sy;
               }

               ++sx;
            }

            if (found) {
               world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
            } else {
               WillitburnProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
