package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_6862;
import net.minecraft.class_7924;
import net.pixelbank.burnt.init.BurntModBlocks;

public class ExtinguishEntityProcedure {
   private static final class_6862<class_1299<?>> FIRE_ENTITY_TAG;

   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            if (entity.method_5809()) {
               entity.method_5646();
            }

            if (entity.method_5864().method_20210(FIRE_ENTITY_TAG)) {
               if (entity.method_59922().method_43057() <= 0.05F && world instanceof class_1937) {
                  class_1937 level = (class_1937)world;
                  class_2338 pos = class_2338.method_49637(entity.method_23317(), entity.method_23318(), entity.method_23321());
                  level.method_20290(2001, pos, class_2248.method_9507(BurntModBlocks.SPLASH.method_9564()));
               }

               if (world instanceof class_1937) {
                  class_1937 level = (class_1937)world;
                  entity.method_5643(level.method_48963().method_48824(), 2.0F);
               }
            }

         }
      }
   }

   static {
      FIRE_ENTITY_TAG = class_6862.method_40092(class_7924.field_41266, class_2960.method_60655("burnt", "fire_entity"));
   }
}
