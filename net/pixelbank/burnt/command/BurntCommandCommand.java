package net.pixelbank.burnt.command;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.class_1937;
import net.minecraft.class_2168;
import net.minecraft.class_2170;
import net.minecraft.class_2262;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_3218;
import net.pixelbank.burnt.procedures.FireOutCommandProcedure;
import net.pixelbank.burnt.procedures.WindAngleCommandProcedure;
import net.pixelbank.burnt.procedures.WindResetCommandProcedure;
import net.pixelbank.burnt.procedures.WindSpeedCommandProcedure;
import net.pixelbank.burnt.util.BurntNoBurnRegions;

public class BurntCommandCommand {
   public static void register() {
      CommandRegistrationCallback.EVENT.register((CommandRegistrationCallback)(dispatcher, registryAccess, environment) -> dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_2170.method_9247("burnt").requires((s) -> s.method_9259(1))).then(class_2170.method_9247("killFire").executes((arguments) -> {
            class_1937 world = ((class_2168)arguments.getSource()).method_9225();
            double x = ((class_2168)arguments.getSource()).method_9222().method_10216();
            double y = ((class_2168)arguments.getSource()).method_9222().method_10214();
            double z = ((class_2168)arguments.getSource()).method_9222().method_10215();
            FireOutCommandProcedure.execute(world, x, y, z);
            return 1;
         }))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_2170.method_9247("noburn").requires((s) -> s.method_9259(2))).then(class_2170.method_9247("add").then(class_2170.method_9244("from", class_2262.method_9698()).then(class_2170.method_9244("to", class_2262.method_9698()).executes((arguments) -> {
            class_2338 a = class_2262.method_9696(arguments, "from");
            class_2338 b = class_2262.method_9696(arguments, "to");
            int n = BurntNoBurnRegions.add(((class_2168)arguments.getSource()).method_9225(), a, b);
            ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470("Burnt fire is now blocked in that box (" + n + " region(s) total)."), true);
            return 1;
         }))))).then(class_2170.method_9247("here").executes((arguments) -> {
            class_3218 level = ((class_2168)arguments.getSource()).method_9225();
            class_2338 p = class_2338.method_49638(((class_2168)arguments.getSource()).method_9222());
            int cx = p.method_10263() >> 4;
            int cz = p.method_10260() >> 4;
            class_2338 a = new class_2338(cx << 4, level.method_31607(), cz << 4);
            class_2338 b = new class_2338((cx << 4) + 15, level.method_31600(), (cz << 4) + 15);
            int n = BurntNoBurnRegions.add(level, a, b);
            ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470("Burnt fire is now blocked in this chunk (" + n + " region(s) total)."), true);
            return 1;
         }))).then(class_2170.method_9247("list").executes((arguments) -> {
            List<String> lines = BurntNoBurnRegions.list(((class_2168)arguments.getSource()).method_9211());
            if (lines.isEmpty()) {
               ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470("No no-burn regions defined."), false);
            } else {
               ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470("No-burn regions:\n" + String.join("\n", lines)), false);
            }

            return lines.size();
         }))).then(class_2170.method_9247("remove").then(class_2170.method_9244("index", IntegerArgumentType.integer(1)).executes((arguments) -> {
            int i = IntegerArgumentType.getInteger(arguments, "index");
            boolean ok = BurntNoBurnRegions.remove(((class_2168)arguments.getSource()).method_9211(), i);
            ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470(ok ? "Removed no-burn region " + i + "." : "No no-burn region with index " + i + "."), true);
            return ok ? 1 : 0;
         })))).then(class_2170.method_9247("clear").executes((arguments) -> {
            int n = BurntNoBurnRegions.clear(((class_2168)arguments.getSource()).method_9211());
            ((class_2168)arguments.getSource()).method_9226(() -> class_2561.method_43470("Cleared " + n + " no-burn region(s)."), true);
            return n;
         })))).then(((LiteralArgumentBuilder)class_2170.method_9247("wind").then(class_2170.method_9247("reset").executes((arguments) -> {
            class_1937 world = ((class_2168)arguments.getSource()).method_9225();
            WindResetCommandProcedure.execute(world);
            return 0;
         }))).then(((LiteralArgumentBuilder)class_2170.method_9247("set").then(class_2170.method_9247("strength").then(class_2170.method_9244("speed", DoubleArgumentType.doubleArg((double)0.0F, (double)100.0F)).executes((arguments) -> {
            class_1937 world = ((class_2168)arguments.getSource()).method_9225();
            WindSpeedCommandProcedure.execute(world, arguments);
            return 0;
         })))).then(class_2170.method_9247("angle").then(class_2170.method_9244("angle", DoubleArgumentType.doubleArg((double)1.0F, (double)360.0F)).executes((arguments) -> {
            class_1937 world = ((class_2168)arguments.getSource()).method_9225();
            WindAngleCommandProcedure.execute(world, arguments);
            return 0;
         })))))));
   }
}
