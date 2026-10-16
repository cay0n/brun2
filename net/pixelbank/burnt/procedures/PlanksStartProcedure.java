package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class PlanksStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10161) {
            class_2338 var10001 = class_2338.method_49637(x, y, z);
            class_2769 var16 = BurntModBlocks.SOOTY_OAK_PLANKS.method_9595().method_11663("hot");
            class_2680 var10002;
            if (var16 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var16;
               var10002 = (class_2680)BurntModBlocks.SOOTY_OAK_PLANKS.method_9564().method_11657(_withbp3, true);
            } else {
               var10002 = BurntModBlocks.SOOTY_OAK_PLANKS.method_9564();
            }

            world.method_8652(var10001, var10002, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9975) {
            class_2338 var34 = class_2338.method_49637(x, y, z);
            class_2769 var26 = BurntModBlocks.SOOTY_SPRUCE_PLANKS.method_9595().method_11663("hot");
            class_2680 var42;
            if (var26 instanceof class_2746) {
               class_2746 _withbp7 = (class_2746)var26;
               var42 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_PLANKS.method_9564().method_11657(_withbp7, true);
            } else {
               var42 = BurntModBlocks.SOOTY_SPRUCE_PLANKS.method_9564();
            }

            world.method_8652(var34, var42, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10148) {
            class_2338 var35 = class_2338.method_49637(x, y, z);
            class_2769 var27 = BurntModBlocks.SOOTY_BIRCH_PLANKS.method_9595().method_11663("hot");
            class_2680 var43;
            if (var27 instanceof class_2746) {
               class_2746 _withbp11 = (class_2746)var27;
               var43 = (class_2680)BurntModBlocks.SOOTY_BIRCH_PLANKS.method_9564().method_11657(_withbp11, true);
            } else {
               var43 = BurntModBlocks.SOOTY_BIRCH_PLANKS.method_9564();
            }

            world.method_8652(var35, var43, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10334) {
            class_2338 var36 = class_2338.method_49637(x, y, z);
            class_2769 var28 = BurntModBlocks.SOOTY_JUNGLE_PLANKS.method_9595().method_11663("hot");
            class_2680 var44;
            if (var28 instanceof class_2746) {
               class_2746 _withbp15 = (class_2746)var28;
               var44 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_PLANKS.method_9564().method_11657(_withbp15, true);
            } else {
               var44 = BurntModBlocks.SOOTY_JUNGLE_PLANKS.method_9564();
            }

            world.method_8652(var36, var44, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10218) {
            class_2338 var37 = class_2338.method_49637(x, y, z);
            class_2769 var29 = BurntModBlocks.SOOTY_ACACIA_PLANKS.method_9595().method_11663("hot");
            class_2680 var45;
            if (var29 instanceof class_2746) {
               class_2746 _withbp19 = (class_2746)var29;
               var45 = (class_2680)BurntModBlocks.SOOTY_ACACIA_PLANKS.method_9564().method_11657(_withbp19, true);
            } else {
               var45 = BurntModBlocks.SOOTY_ACACIA_PLANKS.method_9564();
            }

            world.method_8652(var37, var45, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10075) {
            class_2338 var38 = class_2338.method_49637(x, y, z);
            class_2769 var30 = BurntModBlocks.SOOTY_DARK_OAK_PLANKS.method_9595().method_11663("hot");
            class_2680 var46;
            if (var30 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var30;
               var46 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_PLANKS.method_9564().method_11657(_withbp23, true);
            } else {
               var46 = BurntModBlocks.SOOTY_DARK_OAK_PLANKS.method_9564();
            }

            world.method_8652(var38, var46, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37577) {
            class_2338 var39 = class_2338.method_49637(x, y, z);
            class_2769 var31 = BurntModBlocks.SOOTY_MANGROVE_PLANKS.method_9595().method_11663("hot");
            class_2680 var47;
            if (var31 instanceof class_2746) {
               class_2746 _withbp27 = (class_2746)var31;
               var47 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_PLANKS.method_9564().method_11657(_withbp27, true);
            } else {
               var47 = BurntModBlocks.SOOTY_MANGROVE_PLANKS.method_9564();
            }

            world.method_8652(var39, var47, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42751) {
            class_2338 var40 = class_2338.method_49637(x, y, z);
            class_2769 var32 = BurntModBlocks.SOOTY_CHERRY_PLANKS.method_9595().method_11663("hot");
            class_2680 var48;
            if (var32 instanceof class_2746) {
               class_2746 _withbp31 = (class_2746)var32;
               var48 = (class_2680)BurntModBlocks.SOOTY_CHERRY_PLANKS.method_9564().method_11657(_withbp31, true);
            } else {
               var48 = BurntModBlocks.SOOTY_CHERRY_PLANKS.method_9564();
            }

            world.method_8652(var40, var48, 3);
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_40294) {
            world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_PLANKS.method_9564(), "stage", 1), 3);
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_planks")) {
            class_2338 var41 = class_2338.method_49637(x, y, z);
            class_2769 var33 = BurntModBlocks.SOOTY_PALE_OAK_PLANKS.method_9595().method_11663("hot");
            class_2680 var49;
            if (var33 instanceof class_2746) {
               class_2746 _withbppo31 = (class_2746)var33;
               var49 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_PLANKS.method_9564().method_11657(_withbppo31, true);
            } else {
               var49 = BurntModBlocks.SOOTY_PALE_OAK_PLANKS.method_9564();
            }

            world.method_8652(var41, var49, 3);
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "bamboo_planks")) {
            world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_BAMBOO_PLANKS.method_9564(), "stage", 1), 3);
         } else if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_PLANKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_PLANKS)) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_TF_TOWERWOOD)) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_PLANKS.method_9564(), "stage", 1), 3);
               }
            });
         }
      }

   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
