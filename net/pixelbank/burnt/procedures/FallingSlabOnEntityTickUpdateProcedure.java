package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class FallingSlabOnEntityTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_WOOL_CARPETS)) {
               world.method_8652(class_2338.method_49637(x, y - (double)1.0F, z), blockStateWithDirection(BurntModBlocks.FALLEN_BURNT_SLAB.method_9564(), class_2350.method_10162(world.method_8409())), 3);
               world.method_20290(2001, class_2338.method_49637(x, y - (double)1.0F, z), class_2248.method_9507(BurntModBlocks.BURNT_SLAB.method_9564()));
               if (!entity.method_37908().method_8608()) {
                  entity.method_31472();
               }
            } else if (!world.method_8320(class_2338.method_49637(x, y - (double)2.0F, z)).method_26164(BurntTags.BLOCK_BREAKS_FALLING_SLABS) && !world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_BREAKS_FALLING_SLABS)) {
               if (!world.method_8320(class_2338.method_49637(x, y, z)).method_26225() && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() != class_2246.field_10124) {
                  world.method_8652(class_2338.method_49637(x, y, z), blockStateWithDirection(BurntModBlocks.FALLEN_BURNT_SLAB.method_9564(), class_2350.method_10162(world.method_8409())), 3);
                  world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.BURNT_SLAB.method_9564()));
                  if (!entity.method_37908().method_8608()) {
                     entity.method_31472();
                  }
               } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26225()) {
                  world.method_8652(class_2338.method_49637(x, y, z), blockStateWithDirection(BurntModBlocks.FALLEN_BURNT_SLAB.method_9564(), class_2350.method_10162(world.method_8409())), 3);
                  world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.BURNT_SLAB.method_9564()));
                  if (!entity.method_37908().method_8608()) {
                     entity.method_31472();
                  }
               } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() != class_2246.field_10124 && !entity.method_37908().method_8608()) {
                  entity.method_31472();
               }
            } else {
               world.method_20290(2001, class_2338.method_49637(x, y - (double)1.0F, z), class_2248.method_9507(BurntModBlocks.BURNT_SLAB.method_9564()));
               if (!entity.method_37908().method_8608()) {
                  entity.method_31472();
               }
            }
         }

      }
   }

   private static class_2680 blockStateWithDirection(class_2680 blockState, class_2350 newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663("facing");
      if (prop instanceof class_2753 dp) {
         if (dp.method_11898().contains(newValue)) {
            return (class_2680)blockState.method_11657(dp, newValue);
         }
      }

      prop = blockState.method_26204().method_9595().method_11663("axis");
      class_2680 var10000;
      if (prop instanceof class_2754 ep) {
         if (ep.method_11898().contains(newValue.method_10166())) {
            var10000 = (class_2680)blockState.method_11657(ep, newValue.method_10166());
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
