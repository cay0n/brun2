package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.util.BurntTags;

public class BambooStairsFlamesPlacementProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         class_2769 var16 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var16 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var16;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (Math.random() <= (double)0.5F && world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x + (double)1.0F, y, z), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_STAIRS_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11034), 3);
            }

            if (Math.random() <= (double)0.5F && world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x - (double)1.0F, y, z), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_STAIRS_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11039), 3);
            }

            if (Math.random() <= (double)0.5F && world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y, z + (double)1.0F), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_STAIRS_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11035), 3);
            }

            if (Math.random() <= (double)0.5F && world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_10124) {
               world.method_8652(class_2338.method_49637(x, y, z - (double)1.0F), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_STAIRS_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11043), 3);
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
