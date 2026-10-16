package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntGrassDestroyedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_6880.class_6883 var10000 = world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9099);
            class_1799 var10001;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10001 = _livEnt.method_6047();
            } else {
               var10001 = class_1799.field_8037;
            }

            if (class_1890.method_8225(var10000, var10001) != 0 && world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y, z, new class_1799(BurntModBlocks.BURNT_GRASS));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }
         }

      }
   }
}
