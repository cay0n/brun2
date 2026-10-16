package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntSmokeBudget;
import net.pixelbank.burnt.util.BurntTags;

public class PlankSmokeParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double xSpeed = (double)0.0F;
      double multiplyer = (double)0.0F;
      double turb = (double)0.0F;
      double zSpeed = (double)0.0F;
      double zDir = (double)0.0F;
      if (world.method_8608()) {
         class_2769 var28 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var28 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var28;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 < 1) {
            label54: {
               var28 = blockstate.method_26204().method_9595().method_11663("hot");
               if (var28 instanceof class_2746) {
                  class_2746 _getbp = (class_2746)var28;
                  if ((Boolean)blockstate.method_11654(_getbp)) {
                     var10000 = 1;
                     break label54;
                  }
               }

               var10000 = 0;
            }

            if (!var10000) {
               WoodParticlesProcedure.execute(world, x, y, z);
               return;
            }
         }

         if ((Boolean)BurntBasicConfigConfiguration.SMOKE.get() && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
               xSpeed = WindAngleXProcedure.execute(world);
               zSpeed = WindAngleZProcedure.execute(world);
               multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
               particleAmount = class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.0F) + BurntModVariables.MapVariables.get(world).windSpeed / (double)20.0F;
               particleAmount *= BurntSmokeBudget.densityFactor();
               particleRadius = 0.6;

               for(int index0 = 0; index0 < (int)particleAmount && BurntSmokeBudget.allowSpawn(world.method_8409()); ++index0) {
                  world.method_8406(BurntModParticleTypes.FLAME_SMOKE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, xSpeed / (double)25.0F * multiplyer, class_3532.method_15366(world.method_8409(), -0.001, 0.001), zSpeed / (double)25.0F * multiplyer);
               }
            } else {
               particleAmount = class_3532.method_15366(world.method_8409(), (double)2.0F, (double)4.0F);
               particleAmount *= BurntSmokeBudget.densityFactor();
               particleRadius = 0.6;

               for(int index1 = 0; index1 < (int)particleAmount && BurntSmokeBudget.allowSpawn(world.method_8409()); ++index1) {
                  world.method_8406(BurntModParticleTypes.FLAME_SMOKE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, y + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), -0.6, 0.6) * particleRadius, (double)0.0F, class_3532.method_15366(world.method_8409(), 0.02, 0.1), (double)0.0F);
               }
            }
         }
      }

   }
}
