package net.pixelbank.burnt.procedures;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

public class FlamablityProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      if (!world.method_22340(class_2338.method_49637(x, y, z))) {
         return false;
      } else {
         class_2680 _state = world.method_8320(class_2338.method_49637(x, y, z));
         FlammableBlockRegistry.Entry _entry = (FlammableBlockRegistry.Entry)FlammableBlockRegistry.getDefaultInstance().get(_state.method_26204());
         return _entry != null && _entry.getBurnChance() > 0;
      }
   }
}
