package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntVinesLeavesPlacementProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_10597) {
            world.method_8652(class_2338.method_49637(x + (double)1.0F, y, z), blockStateWithDirection(BurntModBlocks.BURNT_VINE.method_9564(), class_2350.field_11034), 3);
         }

         if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_10597) {
            world.method_8652(class_2338.method_49637(x - (double)1.0F, y, z), blockStateWithDirection(BurntModBlocks.BURNT_VINE.method_9564(), class_2350.field_11039), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_10597) {
            world.method_8652(class_2338.method_49637(x, y, z + (double)1.0F), blockStateWithDirection(BurntModBlocks.BURNT_VINE.method_9564(), class_2350.field_11035), 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_10597) {
            world.method_8652(class_2338.method_49637(x, y, z - (double)1.0F), blockStateWithDirection(BurntModBlocks.BURNT_VINE.method_9564(), class_2350.field_11043), 3);
         }

         if (Math.random() <= 0.3 && world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F, false);
            }
         }
      }

   }

   private static class_2680 blockStateWithDirection(class_2680 blockState, class_2350 newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663("facing");
      if (prop instanceof class_2753 dp) {
         if (dp.method_11898().contains(newValue)) {
            return (class_2680)blockState.method_11657(dp, newValue);
         }
      }

      prop = blockState.method_26204().method_9595().method_11663("axis");
      class_2680 var10000;
      if (prop instanceof class_2754 ep) {
         if (ep.method_11898().contains(newValue.method_10166())) {
            var10000 = (class_2680)blockState.method_11657(ep, newValue.method_10166());
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
