package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingAzeleaBlockValidPlacementProcedure {
   public static boolean execute(class_1936 world, double x, double y, double z) {
      return world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_AZALEA_GROWS_ON);
   }
}
