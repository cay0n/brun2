package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class TallGrassFireSoundProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (Math.random() <= 0.3 && world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F);
            } else {
               _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.campfire.crackle")), class_3419.field_15254, 1.0F, 1.0F, false);
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_VALID_SPAWN)) {
            world.method_8652(class_2338.method_49637(x, y - (double)1.0F, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS.method_9564(), "age", 2), 3);
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
