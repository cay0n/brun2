package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class SparkSpawnProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && !world.method_8401().method_156()) {
               if (world.method_8320(class_2338.method_49637(entity.method_23317() + (double)1.0F, entity.method_23318(), entity.method_23321())).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317() + (double)1.0F, entity.method_23318(), entity.method_23321());
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317() - (double)1.0F, entity.method_23318(), entity.method_23321())).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317() - (double)1.0F, entity.method_23318(), entity.method_23321());
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317(), entity.method_23318(), entity.method_23321() + (double)1.0F)).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321() + (double)1.0F);
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317(), entity.method_23318(), entity.method_23321() - (double)1.0F)).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321() - (double)1.0F);
               }
            } else if (!(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
               if (world.method_8320(class_2338.method_49637(entity.method_23317() + (double)1.0F, entity.method_23318(), entity.method_23321())).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317() + (double)1.0F, entity.method_23318(), entity.method_23321());
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317() - (double)1.0F, entity.method_23318(), entity.method_23321())).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317() - (double)1.0F, entity.method_23318(), entity.method_23321());
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317(), entity.method_23318(), entity.method_23321() + (double)1.0F)).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321() + (double)1.0F);
               }

               if (world.method_8320(class_2338.method_49637(entity.method_23317(), entity.method_23318(), entity.method_23321() - (double)1.0F)).method_26225()) {
                  ArrowFlamesPlacementProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321() - (double)1.0F);
               }
            }
         }

      }
   }
}
