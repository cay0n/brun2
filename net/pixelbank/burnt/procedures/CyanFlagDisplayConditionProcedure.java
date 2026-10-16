package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.pixelbank.burnt.entity.FlagEntity;

public class CyanFlagDisplayConditionProcedure {
   public static boolean execute(class_1297 entity) {
      if (entity == null) {
         return false;
      } else {
         String var10000;
         if (entity instanceof FlagEntity) {
            FlagEntity _datEntS = (FlagEntity)entity;
            var10000 = (String)_datEntS.method_5841().method_12789(FlagEntity.DATA_color);
         } else {
            var10000 = "";
         }

         return var10000.equals("cyan");
      }
   }
}
