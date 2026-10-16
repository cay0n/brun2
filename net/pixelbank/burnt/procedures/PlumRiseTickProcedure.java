package net.pixelbank.burnt.procedures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.PlumeManager;

public class PlumRiseTickProcedure {
   private static final double MAX_PLUME_Y = (double)316.0F;

   public static void execute(class_1936 world) {
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 level = (class_3218)world;
            if ((Boolean)BurntBasicConfigConfiguration.DISTANT_PLUMES.get()) {
               long gameTime = level.method_8401().method_188();
               BurntModVariables.MapVariables mv = BurntModVariables.MapVariables.get(world);
               double dx = (double)0.0F;
               double dz = (double)0.0F;
               boolean hasWind = (Boolean)BurntBasicConfigConfiguration.WIND.get() && mv.windSpeed > (double)5.0F;
               if (hasWind) {
                  double angleRad = Math.toRadians((double)Math.round(mv.windAngle * (double)10.0F) / (double)10.0F);
                  double horizSpeed = mv.windSpeed > (double)40.0F ? 0.04 : (mv.windSpeed > (double)20.0F ? 0.03 : 0.02);
                  dx = (double)(-Math.round(Math.sin(angleRad))) * horizSpeed;
                  dz = (double)Math.round(Math.cos(angleRad)) * horizSpeed;
               }

               List<class_1297> snapshot = new ArrayList();

               try {
                  Iterable var10000 = level.method_27909();
                  Objects.requireNonNull(snapshot);
                  var10000.forEach(snapshot::add);
               } catch (Exception var14) {
                  return;
               }

               for(class_1297 e : snapshot) {
                  if (e != null && e.method_5864() == class_1299.field_42456 && !e.method_31481()) {
                     Set<String> tags = e.method_5752();
                     if (tags.contains("burnt_any_plume")) {
                        if (e.method_23318() >= (double)316.0F) {
                           e.method_31472();
                           PlumeManager.remove(e.method_5667());
                        } else if (hasWind || (!tags.contains("far_burnt_plume") || gameTime % 2L == 0L) && (!tags.contains("distant_burnt_plume") || gameTime % 4L == 0L)) {
                           e.method_5814(e.method_23317() + dx, e.method_23318() + 0.03, e.method_23321() + dz);
                        }
                     }
                  }
               }

            }
         }
      }
   }
}
