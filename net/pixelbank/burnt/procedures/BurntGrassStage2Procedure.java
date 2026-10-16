package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class BurntGrassStage2Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
            return;
         }

         if ((world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_REPLACEABLE) || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_FLOWERS)) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() != BurntModBlocks.TALL_GRASS_FIRE && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() != BurntModBlocks.DOUBLE_TALL_GRASS_FIRE && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() != BurntModBlocks.TALL_GRASS_BURNT) {
            world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
         }

         GrassCatchProcedure.execute(world, x, y, z);
         int _value = 3;
         class_2338 _pos = class_2338.method_49637(x, y, z);
         class_2680 _bs = world.method_8320(_pos);
         class_2769 var13 = _bs.method_26204().method_9595().method_11663("stage");
         if (var13 instanceof class_2758) {
            class_2758 _integerProp = (class_2758)var13;
            if (_integerProp.method_11898().contains(_value)) {
               world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
            }
         }

         if (Math.random() <= BiomeChanceProcedure.execute(world, x, y, z) / (double)200.0F) {
            WillitburnProcedure.execute(world, x, y, z);
         }
      }

   }
}
