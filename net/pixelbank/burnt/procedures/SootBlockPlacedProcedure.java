package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;

public class SootBlockPlacedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26206(world, class_2338.method_49637(x, y, z + (double)1.0F), class_2350.field_11043)) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var10 = _bs.method_26204().method_9595().method_11663("north");
            if (var10 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var10;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var32 = _bs.method_26204().method_9595().method_11663("north");
            if (var32 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var32;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26206(world, class_2338.method_49637(x + (double)1.0F, y, z), class_2350.field_11034)) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var33 = _bs.method_26204().method_9595().method_11663("east");
            if (var33 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var33;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var34 = _bs.method_26204().method_9595().method_11663("east");
            if (var34 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var34;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26206(world, class_2338.method_49637(x, y, z - (double)1.0F), class_2350.field_11035)) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var35 = _bs.method_26204().method_9595().method_11663("south");
            if (var35 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var35;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var36 = _bs.method_26204().method_9595().method_11663("south");
            if (var36 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var36;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26206(world, class_2338.method_49637(x - (double)1.0F, y, z), class_2350.field_11039)) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var37 = _bs.method_26204().method_9595().method_11663("west");
            if (var37 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var37;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, true), 3);
            }
         } else {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var38 = _bs.method_26204().method_9595().method_11663("west");
            if (var38 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var38;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }
      }

   }
}
