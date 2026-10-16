package net.pixelbank.burnt.procedures;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.class_1936;
import net.minecraft.class_2168;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindAngleCommandProcedure {
   public static void execute(class_1936 world, CommandContext<class_2168> arguments) {
      BurntModVariables.MapVariables.get(world).windAngle = DoubleArgumentType.getDouble(arguments, "angle");
      BurntModVariables.MapVariables.get(world).windAngleLock = true;
      BurntModVariables.MapVariables.get(world).markSyncDirty();
   }
}
