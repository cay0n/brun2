package net.pixelbank.burnt.procedures;

import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingLeavesStartTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if (world.method_22347(class_2338.method_49637(x + (double)1.0F, y, z)) && world.method_22347(class_2338.method_49637(x - (double)1.0F, y, z)) && world.method_22347(class_2338.method_49637(x, y + (double)1.0F, z)) && world.method_22347(class_2338.method_49637(x, y - (double)1.0F, z)) && world.method_22347(class_2338.method_49637(x, y, z + (double)1.0F)) && world.method_22347(class_2338.method_49637(x, y, z - (double)1.0F)) && Math.random() <= 0.01) {
            world.method_8652(class_2338.method_49637(x, y, z), class_2246.field_10124.method_9564(), 3);
         }

         if ((world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z)) && (BurntProtection.stopBurning(world, x, y, z) || (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get())) {
            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)0.0F, (double)40.0F), () -> {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               if (_bs.method_28498(class_2741.field_12508)) {
                  _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
               }

               world.method_8652(_bp, _bs, 3);
            });
         }

         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if ((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() <= (double)100.0F) {
               fireSpeed = (Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)300.0F;
            } else {
               fireSpeed = 0.99;
            }

            if (BurntBlockUtil.hasAdjacentWater(world, x, y, z)) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               if (_bs.method_28498(class_2741.field_12508)) {
                  _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
               }

               world.method_8652(_bp, _bs, 3);
            } else {
               if (Math.random() <= fireSpeed && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
                  if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_OAK_LEAVES || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_DARK_OAK_LEAVES) && Math.random() <= 0.005 && world instanceof class_3218) {
                     class_3218 _level = (class_3218)world;
                     class_1542 entityToSpawn = new class_1542(_level, x, y, z, new class_1799(BurntModItems.BAKED_APPLE));
                     entityToSpawn.method_6982(10);
                     _level.method_8649(entityToSpawn);
                  }

                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_SMOLDERING_LEAVES).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477) {
                  world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
               }
            }
         } else {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            if (_bs.method_28498(class_2741.field_12508)) {
               _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
            }

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
