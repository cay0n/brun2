package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.pixelbank.burnt.compat.BurnMappingRegistry;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;
import net.pixelbank.burnt.util.BurntTags;

public class TryStartBurnOffsetProcedure {
   public static void execute(class_1936 world, double chance, double cx, double cy, double cz, double dx, double dy, double dz) {
      double tx = (double)0.0F;
      double ty = (double)0.0F;
      double tz = (double)0.0F;
      if (!world.method_8608()) {
         tx = cx + dx;
         ty = cy + dy;
         tz = cz + dz;
         if (BurntProtection.isProtected(world, cx, cy, cz, tx, ty, tz)) {
            return;
         }

         if (world.method_22340(class_2338.method_49637(tx, ty, tz))) {
            class_2680 targetState = world.method_8320(class_2338.method_49637(tx, ty, tz));
            boolean canBurn = targetState.method_26164(BurntTags.BLOCK_WILL_BURN) || targetState.method_26164(BurntTags.BLOCK_FLESH) || BurntTags.isCompatBurnable(targetState) || BurnMappingRegistry.get(targetState.method_26204()) != null;
            if (canBurn && !targetState.method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !targetState.method_26164(BurntTags.BLOCK_WILL_NOT_BURN)) {
               boolean _slowDown = targetState.method_26164(BurntTags.BLOCK_SLOW_DOWNWARD_SPREAD);
               if (!_slowDown && targetState.method_26164(BurntTags.BLOCK_SLOW_DOWNWARD_SPREAD_UNLESS_EXPOSED)) {
                  _slowDown = !BurntBlockUtil.isHorizontallyExposed(world, tx, ty, tz);
               }

               if (dy < (double)0.0F && _slowDown) {
                  chance *= Math.max((double)0.0F, Math.min((double)1.0F, (Double)BurntBasicConfigConfiguration.WOOD_DOWNWARD_SPREAD.get() / (double)100.0F));
               }

               if (chance < (double)1.0F) {
                  if (Math.random() <= chance) {
                     BurnBabyProcedure.execute(world, tx, ty, tz);
                  }
               } else {
                  BurnBabyProcedure.execute(world, tx, ty, tz);
               }
            }

            if (targetState.method_26164(BurntTags.BLOCK_COPPER)) {
               CopperFlamesPlacementProcedure.execute(world, tx, ty, tz);
            }
         }
      }

   }
}
