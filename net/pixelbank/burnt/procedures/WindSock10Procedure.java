package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindSock10Procedure {
   public static boolean execute(class_1936 world) {
      return BurntModVariables.MapVariables.get(world).windSpeed >= (double)4.0F;
   }
}
