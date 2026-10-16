package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class TheBurnProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            double faceChance = (double)1.0F;
            double downChance = 0.9;
            double adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)1.0F, (double)0.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)-1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)-1.0F, (double)0.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)0.0F, (double)0.0F, (double)1.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)-1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)0.0F, (double)0.0F, (double)-1.0F);
            TryStartBurnOffsetProcedure.execute(world, faceChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, downChance, x, y, z, (double)0.0F, (double)-1.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)1.0F, (double)-1.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)-1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)-1.0F, (double)-1.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)0.0F, (double)-1.0F, (double)1.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)-1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance, x, y, z, (double)0.0F, (double)-1.0F, (double)-1.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance * (double)5.0F, x, y, z, (double)1.0F, (double)1.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)-1.0F, (double)0.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance * (double)5.0F, x, y, z, (double)-1.0F, (double)1.0F, (double)0.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)1.0F);
            adjChance = Math.cbrt(WindAdjustedChanceBlocksProcedure.execute(world, x, y, z, faceChance, (double)0.0F, (double)-1.0F));
            TryStartBurnOffsetProcedure.execute(world, adjChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)-1.0F);
         } else {
            double faceChance = (double)1.0F;
            double downChance = 0.9;
            double diagonalChance = 0.8;
            TryStartBurnOffsetProcedure.execute(world, faceChance, x, y, z, (double)1.0F, (double)0.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, faceChance, x, y, z, (double)-1.0F, (double)0.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, faceChance, x, y, z, (double)0.0F, (double)0.0F, (double)1.0F);
            TryStartBurnOffsetProcedure.execute(world, faceChance, x, y, z, (double)0.0F, (double)0.0F, (double)-1.0F);
            TryStartBurnOffsetProcedure.execute(world, faceChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, downChance, x, y, z, (double)0.0F, (double)-1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance, x, y, z, (double)1.0F, (double)-1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance, x, y, z, (double)-1.0F, (double)-1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance, x, y, z, (double)0.0F, (double)-1.0F, (double)1.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance, x, y, z, (double)0.0F, (double)-1.0F, (double)-1.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance * (double)5.0F, x, y, z, (double)1.0F, (double)1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance * (double)5.0F, x, y, z, (double)-1.0F, (double)1.0F, (double)0.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)1.0F);
            TryStartBurnOffsetProcedure.execute(world, diagonalChance * (double)5.0F, x, y, z, (double)0.0F, (double)1.0F, (double)-1.0F);
         }
      }

   }
}
