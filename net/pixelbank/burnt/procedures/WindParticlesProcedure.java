package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindParticlesProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      execute((Object)null, world, x, y, z);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z) {
      double xSpeed = (double)0.0F;
      double zSpeed = (double)0.0F;
      double dx = (double)0.0F;
      double dz = (double)0.0F;
      double baseX = (double)0.0F;
      double baseY = (double)0.0F;
      double segments = (double)0.0F;
      double spacing = (double)0.0F;
      double i = (double)0.0F;
      double px = (double)0.0F;
      double pz = (double)0.0F;
      double baseZ = (double)0.0F;
      double multiplyer = (double)0.0F;
      double speed = (double)0.0F;
      double particleRadius = (double)0.0F;
      double xDir = (double)0.0F;
      double rad = (double)0.0F;
      double turb = (double)0.0F;
      double zDir = (double)0.0F;
      double tx = (double)0.0F;
      double tz = (double)0.0F;
      double faceX = (double)0.0F;
      double faceY = (double)0.0F;
      double faceZ = (double)0.0F;
      if (world.method_8608() && (Boolean)BurntBasicConfigConfiguration.WIND.get()) {
         speed = BurntModVariables.MapVariables.get(world).windSpeed / (double)5.0F;
         if (speed >= (double)5.0F) {
            xSpeed = WindAngleXProcedure.execute(world);
            zSpeed = WindAngleZProcedure.execute(world);
            multiplyer = ParticleWindMultiplyerProcedure.execute(world, x, y, z);
            if (Math.random() <= speed / (double)100.0F) {
               baseX = x + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * (double)10.0F;
               baseY = y + class_3532.method_15366(world.method_8409(), (double)8.0F, (double)16.0F);
               baseZ = z + class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F) * (double)10.0F;
               segments = (double)10.0F * speed * multiplyer;
               spacing = 1.0E-4 * speed;
               i = (double)0.0F;

               for(int index0 = 0; index0 < (int)segments; ++index0) {
                  px = baseX - xSpeed * i * spacing;
                  pz = baseZ - zSpeed * i * spacing;
                  world.method_8406(BurntModParticleTypes.AIR_PARTICLE, px, baseY, pz, (double)Math.round(Math.pow((double)10.0F, (double)1.0F) * (xSpeed / (double)10.0F)) / Math.pow((double)10.0F, (double)1.0F) * multiplyer, (double)0.0F, (double)Math.round(Math.pow((double)10.0F, (double)1.0F) * (zSpeed / (double)10.0F)) / Math.pow((double)10.0F, (double)1.0F) * multiplyer);
                  ++i;
               }
            }
         }
      }

   }
}
