package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindResetCommandProcedure {
   public static void execute(class_1936 world) {
      BurntModVariables.MapVariables.get(world).windAngleLock = false;
      BurntModVariables.MapVariables.get(world).windSpeedLock = false;
      BurntModVariables.MapVariables.get(world).markSyncDirty();
   }
}
