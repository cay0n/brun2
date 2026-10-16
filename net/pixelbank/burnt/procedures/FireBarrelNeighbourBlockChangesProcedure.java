package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class FireBarrelNeighbourBlockChangesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         label65: {
            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204()).toString().equals("supplementaries:gunpowder")) {
               class_2769 var12 = world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204().method_9595().method_11663("burning");
               int var10000;
               if (var12 instanceof class_2758) {
                  class_2758 _getip4 = (class_2758)var12;
                  var10000 = (Integer)world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_11654(_getip4);
               } else {
                  var10000 = -1;
               }

               if (var10000 >= 1) {
                  break label65;
               }
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204()).toString().equals("supplementaries:gunpowder")) {
               class_2769 var15 = world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204().method_9595().method_11663("burning");
               int var21;
               if (var15 instanceof class_2758) {
                  class_2758 _getip8 = (class_2758)var15;
                  var21 = (Integer)world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_11654(_getip8);
               } else {
                  var21 = -1;
               }

               if (var21 >= 1) {
                  break label65;
               }
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204()).toString().equals("supplementaries:gunpowder")) {
               class_2769 var16 = world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204().method_9595().method_11663("burning");
               int var22;
               if (var16 instanceof class_2758) {
                  class_2758 _getip12 = (class_2758)var16;
                  var22 = (Integer)world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_11654(_getip12);
               } else {
                  var22 = -1;
               }

               if (var22 >= 1) {
                  break label65;
               }
            }

            if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204()).toString().equals("supplementaries:gunpowder")) {
               class_2769 var17 = world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204().method_9595().method_11663("burning");
               int var23;
               if (var17 instanceof class_2758) {
                  class_2758 _getip16 = (class_2758)var17;
                  var23 = (Integer)world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_11654(_getip16);
               } else {
                  var23 = -1;
               }

               if (var23 >= 1) {
                  break label65;
               }
            }

            if (!class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204()).toString().equals("supplementaries:gunpowder")) {
               return;
            }

            class_2769 var18 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204().method_9595().method_11663("burning");
            int var24;
            if (var18 instanceof class_2758) {
               class_2758 _getip20 = (class_2758)var18;
               var24 = (Integer)world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_11654(_getip20);
            } else {
               var24 = -1;
            }

            if (var24 < 1) {
               return;
            }
         }

         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.FIRE_BARREL_ACTIVE.method_9564();
         class_2680 _bso = world.method_8320(_bp);
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         world.method_8652(_bp, _bs, 3);
      }

   }
}
