package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.pixelbank.burnt.network.BurntModVariables;

public class ExtinguisherItemIsDroppedByPlayerProcedure {
   public static void execute(class_1297 entity) {
      if (entity != null) {
         BurntModVariables.PlayerVariables _vars = BurntModVariables.PlayerVariables.get(entity);
         _vars.extinguisherOn = false;
         _vars.markSyncDirty();
      }
   }
}
