package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3218;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntCollapseBudget;
import net.pixelbank.burnt.util.BurntTags;

public class LeavesCollapseProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      double particleRadius = (double)0.0F;
      double particleAmount = (double)0.0F;
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.COLLAPSE.get()) {
         if (!BurntCollapseBudget.hasHeadroom(world)) {
            return;
         }

         sx = (double)-5.0F;

         for(int index0 = 0; index0 < 10; ++index0) {
            sy = (double)-12.0F;

            for(int index1 = 0; index1 < 24; ++index1) {
               sz = (double)-5.0F;

               for(int index2 = 0; index2 < 10; ++index2) {
                  class_2338 _cell = class_2338.method_49637(x + sx, y + sy, z + sz);
                  if (world.method_22340(_cell) && world.method_8320(_cell).method_26164(BurntTags.BLOCK_MC_LEAVES)) {
                     if (Math.random() <= 0.2) {
                        class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
                        class_2680 _bso = world.method_8320(_cell);
                        _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                        if (_bs.method_28498(class_2741.field_12508)) {
                           _bs = (class_2680)_bs.method_11657(class_2741.field_12508, false);
                        }

                        world.method_8652(_cell, _bs, 3);
                     } else if (Math.random() <= 0.2) {
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.BLAST_LEAVES.method_9564());
                        }
                     } else if (Math.random() <= (double)0.5F) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           _level.method_14199(BurntModParticleTypes.BURNT_LEAVES_PARTICLE, x + sx, y + sy, z + sz, 1, (double)1.0F, (double)1.0F, (double)1.0F, 0.15);
                        }

                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           _level.method_14199(BurntModParticleTypes.SMOLDER_LEAVES_PARTICLE, x + sx, y + sy, z + sz, 2, (double)1.0F, (double)1.0F, (double)1.0F, 0.2);
                        }
                     }
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }
      }

   }
}
