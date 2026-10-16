package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1538;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_5554;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class LightningStrikeProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && (world.method_8401().method_156() || world.method_8401().method_203()) && (Boolean)BurntBasicConfigConfiguration.LIGHTNING_IGNITES.get() && entity instanceof class_1538) {
            int horizontalRadiusSphere = 1;
            int verticalRadiusSphere = 1;
            int yIterationsSphere = verticalRadiusSphere;

            for(int i = -verticalRadiusSphere; i <= yIterationsSphere; ++i) {
               for(int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; ++xi) {
                  for(int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; ++zi) {
                     double distanceSq = (double)(xi * xi) / (double)(horizontalRadiusSphere * horizontalRadiusSphere) + (double)(i * i) / (double)(verticalRadiusSphere * verticalRadiusSphere) + (double)(zi * zi) / (double)(horizontalRadiusSphere * horizontalRadiusSphere);
                     if (distanceSq <= (double)1.0F) {
                        if (!world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT) && !(world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26204() instanceof class_5554)) {
                           world.method_8652(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi), BurntModBlocks.FIRE_SET_BLOCK.method_9564(), 3);
                        }

                        if (world.method_8320(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi)).method_26204() == BurntModBlocks.FIRE_BARREL) {
                           world.method_8652(class_2338.method_49637(x + (double)xi, y + (double)i, z + (double)zi), BurntModBlocks.FIRE_BARREL_BLAST_BLOCK.method_9564(), 3);
                        }
                     }
                  }
               }
            }

            LeavesCollapseProcedure.execute(world, x, y, z);
         }

      }
   }
}
