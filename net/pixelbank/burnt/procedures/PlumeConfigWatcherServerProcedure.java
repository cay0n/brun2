package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.PlumeManager;

public class PlumeConfigWatcherServerProcedure {
   public static void execute(class_1936 world) {
      execute((Object)null, world);
   }

   private static void execute(@Nullable Object event, class_1936 world) {
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 level = (class_3218)world;
            boolean enabled = (Boolean)BurntBasicConfigConfiguration.DISTANT_PLUMES.get() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get();
            BurntModVariables.MapVariables vars = BurntModVariables.MapVariables.get(world);
            if (vars.prevDistantSmoke && !enabled) {
               for(class_1297 e : level.method_27909()) {
                  if (e != null && e.method_5864() == class_1299.field_42456 && e.method_5752().contains("burnt_any_plume")) {
                     e.method_31472();
                     PlumeManager.remove(e.method_5667());
                  }
               }
            }

            if (vars.prevDistantSmoke != enabled) {
               vars.prevDistantSmoke = enabled;
               vars.markSyncDirty();
            }

         }
      }
   }
}
