package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.network.BurntModVariables;

public class ExtinguisherOnLogicProcedure {
   public static void execute(class_1297 entity) {
      if (entity != null) {
         class_1799 var10000;
         if (entity instanceof class_1309) {
            class_1309 _livEnt = (class_1309)entity;
            var10000 = _livEnt.method_6047();
         } else {
            var10000 = class_1799.field_8037;
         }

         if (var10000.method_7909() == BurntModItems.EXTINGUISHER) {
            BurntModVariables.PlayerVariables _vars = BurntModVariables.PlayerVariables.get(entity);
            _vars.extinguisherOn = true;
            _vars.markSyncDirty();
         } else {
            BurntModVariables.PlayerVariables _vars = BurntModVariables.PlayerVariables.get(entity);
            _vars.extinguisherOn = false;
            _vars.markSyncDirty();
         }

      }
   }
}
