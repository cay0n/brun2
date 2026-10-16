package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.entity.FlagEntity;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntTags;

public class FlagOnEntityTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         double pitch = (double)0.0F;
         double multiplyer = (double)0.0F;
         if (!world.method_8608()) {
            if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
               entity.method_36456((float)BurntModVariables.MapVariables.get(world).windAngle);
               entity.method_36457(0.0F);
               entity.method_5636(entity.method_36454());
               entity.method_5847(entity.method_36454());
               entity.field_5982 = entity.method_36454();
               entity.field_6004 = entity.method_36455();
               if (entity instanceof class_1309) {
                  class_1309 _entity = (class_1309)entity;
                  _entity.field_6220 = _entity.method_36454();
                  _entity.field_6259 = _entity.method_36454();
               }

               multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
               if (entity instanceof FlagEntity) {
                  FlagEntity _datEntSetI = (FlagEntity)entity;
                  _datEntSetI.method_5841().method_12778(FlagEntity.DATA_windSpeed, (int)Math.round(BurntModVariables.MapVariables.get(world).windSpeed * multiplyer));
               }
            }

            if (!world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_FLAGS) && !entity.method_37908().method_8608()) {
               entity.method_31472();
            }
         }

      }
   }
}
