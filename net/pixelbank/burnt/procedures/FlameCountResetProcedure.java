package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1936;
import net.pixelbank.burnt.network.BurntModVariables;

public class FlameCountResetProcedure {
   public static void execute(class_1936 world) {
      execute((Object)null, world);
   }

   private static void execute(@Nullable Object event, class_1936 world) {
      double count = (double)0.0F;
      count = BurntModVariables.WorldVariables.get(world).flameCount;
      if (count < (double)0.0F) {
         count = (double)0.0F;
      }

      if (world.method_8401().method_188() % 10L == 0L) {
         if (world.method_8401().method_156()) {
            count -= (double)50.0F;
         } else {
            count -= (double)25.0F;
         }
      }

      if (count > (double)10000.0F) {
         count = (double)10000.0F;
      }

      BurntModVariables.WorldVariables.get(world).flameCount = count;
      BurntModVariables.WorldVariables.get(world).markSyncDirty();
   }
}
