package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;

public class HighGrassFlameParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FLAMES.get() && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((double)8.0F), (e) -> true).isEmpty()) {
         particleAmount = (double)1.0F;
         particleRadius = (double)0.5F;

         for(int index0 = 0; index0 < (int)particleAmount; ++index0) {
            world.method_8406(BurntModParticleTypes.FLAMES, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.5F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), (double)0.0F, (double)0.0F), class_3532.method_15366(world.method_8409(), (double)0.0F, 0.2), class_3532.method_15366(world.method_8409(), (double)0.0F, (double)0.0F));
            world.method_8406(BurntModParticleTypes.FIRE_PARTICLE, x + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, y + class_3532.method_15366(world.method_8409(), (double)0.0F, (double)1.5F) * particleRadius, z + (double)0.5F + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * particleRadius, class_3532.method_15366(world.method_8409(), -0.1, 0.1), class_3532.method_15366(world.method_8409(), 0.1, (double)0.5F), class_3532.method_15366(world.method_8409(), -0.1, 0.1));
         }
      }

   }
}
