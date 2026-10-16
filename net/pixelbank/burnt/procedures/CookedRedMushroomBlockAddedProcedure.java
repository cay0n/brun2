package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;

public class CookedRedMushroomBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var10 = _bs.method_26204().method_9595().method_11663("north");
            if (var10 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var10;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var26 = _bs.method_26204().method_9595().method_11663("south");
            if (var26 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var26;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var27 = _bs.method_26204().method_9595().method_11663("east");
            if (var27 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var27;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var28 = _bs.method_26204().method_9595().method_11663("west");
            if (var28 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var28;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var29 = _bs.method_26204().method_9595().method_11663("up");
            if (var29 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var29;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         if ((world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10240 || world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK) && world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() != class_2246.field_10124) {
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var30 = _bs.method_26204().method_9595().method_11663("down");
            if (var30 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var30;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }

         FlamesPlacementProcedure.execute(world, x, y, z);
      }

   }
}
