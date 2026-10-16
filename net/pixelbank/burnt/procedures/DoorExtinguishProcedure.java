package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.init.BurntModBlocks;

public class DoorExtinguishProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_DOOR) {
            DoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_OAK_DOOR) {
            OakDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_DARK_OAK_DOOR) {
            DarkOakDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_SPRUCE_DOOR) {
            SpruceDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_BIRCH_DOOR) {
            BirchDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_JUNGLE_DOOR) {
            JungleDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_MANGROVE_DOOR) {
            MangroveDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_CHERRY_DOOR) {
            CherryDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_ACACIA_DOOR) {
            AcaciaDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_BAMBOO_DOOR) {
            BambooDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_PALE_OAK_DOOR) {
            PaleOakDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_ACACIA_DOOR) {
            AcaciaDoorTickProcedure.execute(world, x, y, z);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_BAMBOO_DOOR) {
            BambooDoorTickProcedure.execute(world, x, y, z);
         }
      }

   }
}
