package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2358;
import net.minecraft.class_2680;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class GrassStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double GrassSpeed = (double)0.0F;
      double fireSpeed = (double)0.0F;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean done = false;
      if (!world.method_8608() && (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS))) {
         convertPlantsAbove(world, x, y, z);
         world.method_8652(class_2338.method_49637(x, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
      }

   }

   public static void convertPlantsAbove(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2338 abovePos = class_2338.method_49637(x, y + (double)1.0F, z);
         class_2248 aboveBlock = world.method_8320(abovePos).method_26204();
         class_2960 _key = class_7923.field_41175.method_10221(aboveBlock);
         if (_key == null || !"burnt".equals(_key.method_12836())) {
            if (aboveBlock != class_2246.field_10112 && aboveBlock != class_2246.field_10313) {
               if (aboveBlock != class_2246.field_10479 && aboveBlock != class_2246.field_10428) {
                  if (aboveBlock == class_2246.field_10214) {
                     class_2680 aboveState = world.method_8320(abovePos);
                     class_2769 var13 = aboveState.method_26204().method_9595().method_11663("half");
                     String var10000;
                     if (var13 instanceof class_2754) {
                        class_2754<?> _ep = (class_2754)var13;
                        var10000 = ((Enum)aboveState.method_11654(_ep)).toString();
                     } else {
                        var10000 = "";
                     }

                     boolean isLower = var10000.equals("lower");
                     if (isLower) {
                        world.method_8652(class_2338.method_49637(x, y + (double)2.0F, z), class_2246.field_10124.method_9564(), 3);
                        world.method_8652(abovePos, BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564(), 3);
                     }
                  } else {
                     class_2680 aboveState = world.method_8320(abovePos);
                     if (aboveState.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_TALL_GRASS)) {
                        world.method_8652(abovePos, BurntModBlocks.TALL_GRASS_FIRE.method_9564(), 3);
                     } else if (aboveState.method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_FERN)) {
                        world.method_8652(abovePos, BurntModBlocks.SMOLDERING_FERN.method_9564(), 3);
                     } else if (!aboveState.method_26215() && !aboveState.method_26225() && aboveState.method_26227().method_15769() && !(aboveBlock instanceof class_2358)) {
                        world.method_22352(abovePos, false);
                     }
                  }
               } else {
                  world.method_8652(abovePos, BurntModBlocks.TALL_GRASS_FIRE.method_9564(), 3);
               }
            } else {
               world.method_8652(abovePos, BurntModBlocks.SMOLDERING_FERN.method_9564(), 3);
            }

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
