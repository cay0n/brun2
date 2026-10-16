package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingCampfireUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               fireSpeed = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F) * 0.99;
            } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_HOT) && world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_DRY)) {
                  fireSpeed = 0.7;
               } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_HOT) && world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_WET)) {
                  fireSpeed = (double)0.5F;
               } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_COLD)) {
                  fireSpeed = 0.05;
               } else {
                  fireSpeed = 0.1;
               }
            }

            if (Math.random() <= fireSpeed && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
               WillitburnProcedure.execute(world, x, y, z);
            }

            if (Math.random() <= 0.1) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = blockStateWithInt(BurntModBlocks.EMBER_CAMPFIRE.method_9564(), "stage", 1);
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_CAMPFIRE.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
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
