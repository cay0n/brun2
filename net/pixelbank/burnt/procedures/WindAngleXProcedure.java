package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_3532;
import net.pixelbank.burnt.network.BurntModVariables;

public class WindAngleXProcedure {
   public static double execute(class_1936 world) {
      double xSpeed = (double)0.0F;
      double rad = (double)0.0F;
      double xDir = (double)0.0F;
      double turb = (double)0.0F;
      rad = BurntModVariables.MapVariables.get(world).windAngle * 0.0174532925;
      xDir = Math.sin(rad * (double)-1.0F);
      xSpeed = xDir * (BurntModVariables.MapVariables.get(world).windSpeed / (double)5.0F);
      turb = 0.1 * (BurntModVariables.MapVariables.get(world).windSpeed / (double)5.0F);
      xSpeed += turb * class_3532.method_15366(world.method_8409(), (double)-1.0F, (double)1.0F);
      return xSpeed;
   }
}
