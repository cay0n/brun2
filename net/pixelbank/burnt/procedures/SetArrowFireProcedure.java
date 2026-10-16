package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2165;
import net.minecraft.class_2168;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_3218;

public class SetArrowFireProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world instanceof class_3218 _level) {
         _level.method_8503().method_3734().method_44252((new class_2168(class_2165.field_17395, new class_243(x, y, z), class_241.field_1340, _level, 4, "", class_2561.method_43470(""), _level.method_8503(), (class_1297)null)).method_9217(), "execute as @e[type=arrow,nbt={Fire:1b,inBlockState:{}}] at @s positioned ~ ~-0.5 ~ run summon burnt:spark ~ ~ ~");
      }

      if (world instanceof class_3218 _level) {
         _level.method_8503().method_3734().method_44252((new class_2168(class_2165.field_17395, new class_243(x, y, z), class_241.field_1340, _level, 4, "", class_2561.method_43470(""), _level.method_8503(), (class_1297)null)).method_9217(), "execute as @e[type=arrow,nbt=!{Fire:-1s}] at @s run summon burnt:spark ~ ~ ~");
      }

      if (!world.method_8401().method_156() && world instanceof class_3218 _level) {
         _level.method_8503().method_3734().method_44252((new class_2168(class_2165.field_17395, new class_243(x, y, z), class_241.field_1340, _level, 4, "", class_2561.method_43470(""), _level.method_8503(), (class_1297)null)).method_9217(), "/kill @e[type=minecraft:arrow,nbt={inGround:1b},nbt=!{Fire:-1}]");
      }

   }
}
