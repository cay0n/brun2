package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;

public class BurntGrassRecoveryProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.GRASS_RECOVERY.get()) {
            if (!((Double)BurntBasicConfigConfiguration.GRASS_RECOVER_SPEED.get() <= (double)0.0F)) {
               boolean var10000;
               label80: {
                  class_2769 var10 = blockstate.method_26204().method_9595().method_11663("hot");
                  if (var10 instanceof class_2746) {
                     class_2746 _hp = (class_2746)var10;
                     if ((Boolean)blockstate.method_11654(_hp)) {
                        var10000 = true;
                        break label80;
                     }
                  }

                  var10000 = false;
               }

               boolean isHot = var10000;
               if (isHot) {
                  class_2338 _pos = class_2338.method_49637(x, y, z);
                  class_2680 _bs = world.method_8320(_pos);
                  class_2769 var12 = _bs.method_26204().method_9595().method_11663("hot");
                  if (var12 instanceof class_2746) {
                     class_2746 _booleanProp = (class_2746)var12;
                     world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
                  }

               } else {
                  if (world instanceof class_1937) {
                     class_1937 _lvl = (class_1937)world;
                     if (_lvl.method_8530()) {
                        boolean topClear = world.method_22347(class_2338.method_49637(x, y + (double)1.0F, z)) || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.TALL_GRASS_BURNT || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == BurntModBlocks.BURNT_FERN;
                        boolean seedNeighbour = isRecoverySeed(world, x + (double)1.0F, y, z) || isRecoverySeed(world, x - (double)1.0F, y, z) || isRecoverySeed(world, x, y, z - (double)1.0F) || isRecoverySeed(world, x, y, z + (double)1.0F) || isRecoverySeed(world, x + (double)1.0F, y + (double)1.0F, z) || isRecoverySeed(world, x - (double)1.0F, y + (double)1.0F, z) || isRecoverySeed(world, x + (double)1.0F, y - (double)1.0F, z) || isRecoverySeed(world, x - (double)1.0F, y - (double)1.0F, z) || isRecoverySeed(world, x, y + (double)1.0F, z + (double)1.0F) || isRecoverySeed(world, x, y + (double)1.0F, z - (double)1.0F) || isRecoverySeed(world, x, y - (double)1.0F, z + (double)1.0F) || isRecoverySeed(world, x, y - (double)1.0F, z - (double)1.0F);
                        if (topClear && seedNeighbour) {
                           world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.RECOVERING_GRASS.method_9564(), 3);
                        }

                        return;
                     }
                  }

               }
            }
         }
      }
   }

   private static boolean isRecoverySeed(class_1936 world, double x, double y, double z) {
      class_2248 b = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
      return b == class_2246.field_10219 || b == BurntModBlocks.RECOVERING_GRASS;
   }
}
