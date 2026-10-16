package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class BurntLogsStage3Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double burnTime = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var35 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
            class_2680 var37;
            if (var35 instanceof class_2746) {
               class_2746 _withbp10 = (class_2746)var35;
               var37 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp10, true);
            } else {
               var37 = BurntModBlocks.BURNT_LOG.method_9564();
            }

            class_2680 _bs = var37;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            return;
         }

         burnTime = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPEED.get() / (double)100.0F, (double)1.0F), (double)1.5F) * (double)100.0F;
         if ((double)class_3532.method_15395(world.method_8409(), 0, 500) <= burnTime) {
            if (Math.random() <= 0.1) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = ((<undefinedtype>)(new Object() {
                  public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                     class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                     class_2680 var10000;
                     if (_prop instanceof class_2758 _ip) {
                        if (_prop.method_11898().contains(_newValue)) {
                           var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                           return var10000;
                        }
                     }

                     var10000 = _bs;
                     return var10000;
                  }
               })).with(BurntModBlocks.BROKEN_BLAZING_LOG.method_9564(), "blockstate", class_3532.method_15395(world.method_8409(), 0, 1));
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (Math.random() <= 0.1) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BLAZING_LOG.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (Math.random() <= 0.4) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var12 = BurntModBlocks.EMBER_LOG.method_9595().method_11663("hot");
               class_2680 var10000;
               if (var12 instanceof class_2746) {
                  class_2746 _withbp8 = (class_2746)var12;
                  var10000 = (class_2680)BurntModBlocks.EMBER_LOG.method_9564().method_11657(_withbp8, true);
               } else {
                  var10000 = BurntModBlocks.EMBER_LOG.method_9564();
               }

               class_2680 _bs = var10000;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2769 var34 = BurntModBlocks.BURNT_LOG.method_9595().method_11663("fragile");
               class_2680 var36;
               if (var34 instanceof class_2746) {
                  class_2746 _withbp10 = (class_2746)var34;
                  var36 = (class_2680)BurntModBlocks.BURNT_LOG.method_9564().method_11657(_withbp10, true);
               } else {
                  var36 = BurntModBlocks.BURNT_LOG.method_9564();
               }

               class_2680 _bs = var36;
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_COPPER)) {
            CopperFlamesPlacementProcedure.execute(world, x + (double)1.0F, y, z);
         }

         if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26164(BurntTags.BLOCK_COPPER)) {
            CopperFlamesPlacementProcedure.execute(world, x - (double)1.0F, y, z);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26164(BurntTags.BLOCK_COPPER)) {
            CopperFlamesPlacementProcedure.execute(world, x, y, z + (double)1.0F);
         }

         if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26164(BurntTags.BLOCK_COPPER)) {
            CopperFlamesPlacementProcedure.execute(world, x, y, z - (double)1.0F);
         }
      }

   }
}
