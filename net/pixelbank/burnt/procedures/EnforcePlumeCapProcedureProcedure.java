package net.pixelbank.burnt.procedures;

import java.util.ArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_3218;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.PlumeManager;

public class EnforcePlumeCapProcedureProcedure {
   public static void execute(class_1936 world) {
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 level = (class_3218)world;
            int cap = (Integer)BurntBasicConfigConfiguration.PLUME_CAP.get();
            if (cap > 0) {
               ArrayList<class_1297> plumes = new ArrayList();

               for(class_1297 e : level.method_27909()) {
                  if (e.method_5864() == class_1299.field_42456 && e.method_5752().contains("burnt_any_plume")) {
                     plumes.add(e);
                  }
               }

               int count = plumes.size();
               if (count > cap) {
                  plumes.sort((a, b) -> Integer.compare(PlumeManager.getAge(b.method_5667()), PlumeManager.getAge(a.method_5667())));

                  for(int i = 0; i < count - cap; ++i) {
                     class_1297 e = (class_1297)plumes.get(i);
                     e.method_31472();
                     PlumeManager.remove(e.method_5667());
                  }

               }
            }
         }
      }
   }
}
