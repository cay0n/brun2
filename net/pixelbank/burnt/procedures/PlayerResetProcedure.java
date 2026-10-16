package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.pixelbank.burnt.network.BurntModVariables;

public class PlayerResetProcedure {
   public static void execute(class_1936 world, class_1297 entity) {
      execute((Object)null, world, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            BurntModVariables.PlayerVariables _vars = BurntModVariables.PlayerVariables.get(entity);
            _vars.extinguisherOn = false;
            _vars.markSyncDirty();
         }

      }
   }
}
