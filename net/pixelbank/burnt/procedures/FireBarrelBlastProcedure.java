package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_1937.class_7867;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class FireBarrelBlastProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         BlastParticlesProcedure.execute(world, x, y, z);
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.FIRE_BARREL_BLAST_BLOCK) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.FIRE_SET_BLOCK.method_9564(), 3);
         }

         if (world instanceof class_1937) {
            class_1937 _level = (class_1937)world;
            if (!_level.method_8608()) {
               _level.method_8437((class_1297)null, x, y, z, 1.0F, class_7867.field_40891);
            }
         }

         int horizontalRadiusSphere = 2;
         int verticalRadiusSphere = 2;
         int yIterationsSphere = verticalRadiusSphere;

         for(int i = -verticalRadiusSphere; i <= yIterationsSphere; ++i) {
            for(int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; ++xi) {
               for(int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; ++zi) {
                  double distanceSq = (double)(xi * xi) / (double)(horizontalRadiusSphere * horizontalRadiusSphere) + (double)(i * i) / (double)(verticalRadiusSphere * verticalRadiusSphere) + (double)(zi * zi) / (double)(horizontalRadiusSphere * horizontalRadiusSphere);
                  if (distanceSq <= (double)1.0F) {
                     if (world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_45474() || world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26164(BurntTags.BLOCK_AIR)) {
                        world.method_8652(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi), BurntModBlocks.FIRE_SET_BLOCK.method_9564(), 3);
                     }

                     if (world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26204() == BurntModBlocks.FIRE_BARREL || world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26204() == BurntModBlocks.FIRE_BARREL_ACTIVE) {
                        world.method_8652(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi), BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564(), 3);
                     }

                     if (world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26204() == class_2246.field_10375) {
                        class_2338 _bp = class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi);
                        class_2680 _bs = BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564();
                        class_2680 _bso = world.method_8320(_bp);
                        _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                        world.method_8652(_bp, _bs, 3);
                     }
                  }
               }
            }
         }

         LeavesCollapseProcedure.execute(world, x, y, z);
         if (Math.random() <= 0.3) {
            CollapseProcedure.execute(world, x, y, z);
         }
      }

   }
}
