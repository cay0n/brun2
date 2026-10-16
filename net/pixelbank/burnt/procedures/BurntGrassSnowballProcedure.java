package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.pixelbank.burnt.util.BurntTags;

public class BurntGrassSnowballProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && entity.method_5864().method_20210(BurntTags.ENTITY_SNOWBALL)) {
            ExtinguishBlockProcedure.execute(world, x, y, z);
         }

      }
   }
}
