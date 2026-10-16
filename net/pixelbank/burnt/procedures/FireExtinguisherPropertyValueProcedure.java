package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.pixelbank.burnt.network.BurntModVariables;

public class FireExtinguisherPropertyValueProcedure {
   public static double execute(class_1297 entity) {
      if (entity == null) {
         return (double)0.0F;
      } else {
         return BurntModVariables.PlayerVariables.get(entity).extinguisherOn ? (double)1.0F : (double)0.0F;
      }
   }
}
