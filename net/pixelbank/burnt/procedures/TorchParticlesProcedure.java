package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class TorchParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         double particleRadius = (double)0.0F;
         double particleAmount = (double)0.0F;
         double xDir = (double)0.0F;
         double rad = (double)0.0F;
         double xSpeed = (double)0.0F;
         double turb = (double)0.0F;
         double zSpeed = (double)0.0F;
         double zDir = (double)0.0F;
         double multiplyer = (double)0.0F;
         double tx = (double)0.0F;
         double tz = (double)0.0F;
         double speed = (double)0.0F;
         if (world.method_8608() && Math.random() <= 0.3 && (Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_8810) {
               xSpeed = WindAngleXProcedure.execute(world);
               zSpeed = WindAngleZProcedure.execute(world);
               particleAmount = (double)2.0F;
               particleRadius = 0.7;
               tx = entity.method_5720().field_1352;
               tz = entity.method_5720().field_1350;

               for(int index0 = 0; index0 < class_3532.method_15395(world.method_8409(), 1, 3); ++index0) {
                  world.method_8406(BurntModParticleTypes.TORCH_FIRE_PARTICLE, x - (tz / Math.max(Math.sqrt(tx * tx + tz * tz), 0.001) * 0.7 + tx / Math.max(Math.sqrt(tx * tx + tz * tz), 0.001) * (double)0.25F), y + (double)1.0F, z + tz / Math.max(Math.sqrt(tx * tx + tz * tz), 0.001) * 0.7 + tx / Math.max(Math.sqrt(tx * tx + tz * tz), 0.001) * (double)0.25F, xSpeed / (double)10.0F, (double)0.0F, zSpeed / (double)10.0F);
               }
            }
         }

      }
   }
}
