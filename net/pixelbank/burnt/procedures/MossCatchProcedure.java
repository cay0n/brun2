package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;

public class MossCatchProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      class_2680 targetBlock = class_2246.field_10124.method_9564();
      boolean oxygen = false;
      double GrassSpeed = (double)0.0F;
      double fireSpeed = (double)0.0F;
      double targetz = (double)0.0F;
      double targety = (double)0.0F;
      double targetx = (double)0.0F;
      double dist = (double)0.0F;
      double spread = (double)0.0F;
      if (!world.method_8608()) {
         dist = (Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get();
         spread = (Double)BurntBasicConfigConfiguration.BURN_SPREAD.get();
         if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            GrassSpeed = BiomeSpecificGroundProcedure.execute(world, x, y, z);
         } else {
            GrassSpeed = (Double)BurntBasicConfigConfiguration.GROUND_SPREAD.get();
         }

         if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= spread) {
            targetx = x + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, y, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, y, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetx = x - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, y, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, y, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, y - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, y, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetz = z + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, y, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, y, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, y, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetz = z - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, y, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, y, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, y - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, y, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetx = x + (double)1.0F;
            targety = y + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetx = x - (double)1.0F;
            targety = y + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targety = y + (double)1.0F;
            targetz = z + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targety = y + (double)1.0F;
            targetz = z - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetx = x + (double)1.0F;
            targety = y - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targetx = x - (double)1.0F;
            targety = y - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
            oxygen = !(world.method_30347(class_2338.method_49637(targetx + (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx - (double)1.0F, targety, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety, z + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety + (double)1.0F, z)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(targetx, targety - (double)1.0F, z)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targety = y - (double)1.0F;
            targetz = z + (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
            }
         }

         if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
            targety = y - (double)1.0F;
            targetz = z - (double)1.0F;
            targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
            oxygen = !(world.method_30347(class_2338.method_49637(x + (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x - (double)1.0F, targety, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz - (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety, targetz + (double)1.0F)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety + (double)1.0F, targetz)) > (double)0.0F) || !(world.method_30347(class_2338.method_49637(x, targety - (double)1.0F, targetz)) > (double)0.0F);
            if (targetBlock.method_26204() == class_2246.field_28681 && oxygen) {
               if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= GrassSpeed) {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS.method_9564(), "stage", 1), 3);
               } else {
                  world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_MOSS.method_9564(), 3);
               }
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
