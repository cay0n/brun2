package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3218;
import net.minecraft.class_3730;
import net.pixelbank.burnt.init.BurntModEntities;

public class FlagPoleBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world instanceof class_3218 _level) {
         class_1297 entityToSpawn = BurntModEntities.FLAG.method_47821(_level, class_2338.method_49637(x, y + (double)1.0F, z), class_3730.field_16471);
         if (entityToSpawn != null) {
            entityToSpawn.method_18800((double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }
}
