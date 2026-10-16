package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingCropsTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double GrassSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_FARMLAND.method_9564(), 3);
            return;
         }

         if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            if ((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() <= (double)100.0F) {
               GrassSpeed = (Double)BurntBasicConfigConfiguration.BURN_SPREAD.get();
            } else {
               GrassSpeed = 0.99;
            }
         } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_HOT) && world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_DRY)) {
               GrassSpeed = (double)80.0F;
            } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_HOT) && world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_WET)) {
               GrassSpeed = (double)30.0F;
            } else if (world.method_23753(class_2338.method_49637(x, y, z)).method_40220(BurntTags.BIOME_MC_IS_COLD)) {
               GrassSpeed = (double)10.0F;
            } else {
               GrassSpeed = (double)40.0F;
            }
         }

         if ((double)class_3532.method_15395(world.method_8409(), 0, 200) <= (Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() * (double)2.0F) {
            WillitburnProcedure.execute(world, x, y, z);
         }

         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10362) {
            class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.BURNT_FARMLAND.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.1) {
            if (Math.random() <= 0.7) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_CROPS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            }
         }

         if (Math.random() <= 0.1) {
            SpawnSignalPlumeXYZProcedure.execute(world, x, y, z);
         }
      }

   }
}
