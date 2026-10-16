package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.pixelbank.burnt.entity.FlagEntity;

public class NoWindPlaybackConditionProcedure {
   public static boolean execute(class_1297 entity) {
      if (entity == null) {
         return false;
      } else {
         int var10000;
         if (entity instanceof FlagEntity) {
            FlagEntity _datEntI = (FlagEntity)entity;
            var10000 = (Integer)_datEntI.method_5841().method_12789(FlagEntity.DATA_windSpeed);
         } else {
            var10000 = 0;
         }

         return var10000 < 1;
      }
   }
}
