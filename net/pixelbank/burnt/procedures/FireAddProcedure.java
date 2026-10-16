package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.network.BurntModVariables;

public class FireAddProcedure {
   public static void execute(class_1936 world) {
      ++BurntModVariables.WorldVariables.get(world).flameCount;
      BurntModVariables.WorldVariables.get(world).markSyncDirty();
   }
}
