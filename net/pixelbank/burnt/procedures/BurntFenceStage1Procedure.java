package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class BurntFenceStage1Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double fireSpeed = (double)0.0F;
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z) || IsRainingProcedure.execute(world, x, y, z) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = ((class_2248)((class_6880)class_7923.field_41175.method_40260(BurntTags.BLOCK_BURNT_FENCES).method_40243(world.method_8409()).orElseGet(() -> class_7923.field_41175.method_47983(class_2246.field_10124))).comp_349()).method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bsNew = world.method_8320(_pos);
            class_2769 var15 = _bsNew.method_26204().method_9595().method_11663("waterlogged");
            if (var15 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var15;
               world.method_8652(_pos, (class_2680)_bsNew.method_11657(_booleanProp, false), 3);
            }

            return;
         }

         if (!(Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            fireSpeed = Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F) * 0.99;
         } else if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
            fireSpeed = BiomeSpecificProcedure.execute(world, x, y, z);
         }

         fireSpeed *= Math.max((double)0.0F, Math.min((double)1.0F, (Double)BurntBasicConfigConfiguration.WOOD_SPREAD.get() / (double)100.0F));
         fireSpeed *= BurntBlockUtil.darkOakSpreadFactor(world, x, y, z);
         if (Math.random() <= fireSpeed && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
            int _value = 2;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 _bsNew = _bs.method_26204().method_9595().method_11663("stage");
            if (_bsNew instanceof class_2758) {
               class_2758 _integerProp = (class_2758)_bsNew;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_FIRE_DESTROYS)) {
            world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
         }
      }

   }
}
