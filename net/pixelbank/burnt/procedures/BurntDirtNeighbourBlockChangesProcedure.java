package net.pixelbank.burnt.procedures;

import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class BurntDirtNeighbourBlockChangesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26225()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_DIRT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10293) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(class_1802.field_8317));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10341) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(class_1802.field_8309));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_46286) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(class_1802.field_46249));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_46287) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(class_1802.field_46250));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_42749) {
            world.method_8652(class_2338.method_49637(x, y + (double)1.0F, z), class_2246.field_10124.method_9564(), 3);
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(class_1802.field_42711));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }
      }

   }
}
