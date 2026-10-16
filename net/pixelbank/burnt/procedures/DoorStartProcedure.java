package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class DoorStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var15 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("half");
         String var10000;
         if (var15 instanceof class_2754) {
            class_2754 _getep2 = (class_2754)var15;
            var10000 = world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getep2).toString();
         } else {
            var10000 = "";
         }

         if (var10000.equalsIgnoreCase("lower")) {
            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10149) {
               OakDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10521) {
               SpruceDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10352) {
               BirchDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10403) {
               DarkOakDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10232) {
               AcaciaDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10627) {
               JungleDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37566) {
               MangroveDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42748) {
               CherryDoorStartProcedure.execute(world, x, y, z);
            } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40291) {
               BambooDoorStartProcedure.execute(world, x, y, z);
            } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_door")) {
               PaleOakDoorStartProcedure.execute(world, x, y, z);
            } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "bamboo_door")) {
               BambooDoorStartProcedure.execute(world, x, y, z);
            } else if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_DOORS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_DOOR)) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
               BurntDoorStartProcedure.execute(world, x, y, z);
            }
         }
      }

   }
}
