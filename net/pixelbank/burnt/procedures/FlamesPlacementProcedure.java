package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.util.BurntTags;

public class FlamesPlacementProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         boolean var10000;
         label47: {
            class_2769 var16 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("hot");
            if (var16 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var16;
               if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp2)) {
                  var10000 = 1;
                  break label47;
               }
            }

            var10000 = 0;
         }

         if (!var10000) {
            class_2769 var17 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("stage");
            if (var17 instanceof class_2758) {
               class_2758 _getip4 = (class_2758)var17;
               var10000 = (Integer)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getip4);
            } else {
               var10000 = -1;
            }

            if (var10000 < 1) {
               return;
            }
         }

         if (Math.random() <= 0.6 && world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_FLAMES_VALID)) {
            world.method_8652(class_2338.method_49637(x + (double)1.0F, y, z), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_WOOD_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11034), 3);
         }

         if (Math.random() <= 0.6 && world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_FLAMES_VALID)) {
            world.method_8652(class_2338.method_49637(x - (double)1.0F, y, z), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_WOOD_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11039), 3);
         }

         if (Math.random() <= 0.6 && world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_FLAMES_VALID)) {
            world.method_8652(class_2338.method_49637(x, y, z + (double)1.0F), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_WOOD_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11035), 3);
         }

         if (Math.random() <= 0.6 && world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_FLAMES_VALID)) {
            world.method_8652(class_2338.method_49637(x, y, z - (double)1.0F), blockStateWithDirection(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_WOOD_FIRE).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), class_2350.field_11043), 3);
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
