package net.pixelbank.burnt.procedures;

import net.minecraft.class_1923;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_3218;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.util.BurntTags;

public class FireOutCommandProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (world instanceof class_3218 serverLevel) {
         for(class_3218 level : serverLevel.method_8503().method_3738()) {
            level.method_14178().field_17254.method_17264().forEach((chunkHolder) -> {
               class_2818 chunk = chunkHolder.method_16144();
               if (chunk != null) {
                  class_1923 cp = chunk.method_12004();
                  int x0 = cp.method_8326();
                  int z0 = cp.method_8328();
                  int minY = level.method_31607();
                  int maxY = level.method_31600();

                  for(int bx = x0; bx < x0 + 16; ++bx) {
                     for(int bz = z0; bz < z0 + 16; ++bz) {
                        for(int by = minY; by < maxY; ++by) {
                           class_2338 pos = new class_2338(bx, by, bz);
                           class_2680 state = chunk.method_8320(pos);
                           if (!state.method_26215() && state.method_26164(BurntTags.BLOCK_ACTIVE_FIRE)) {
                              level.method_8652(pos, class_2246.field_10124.method_9564(), 3);
                           }
                        }
                     }
                  }

               }
            });
         }

         BurntMod.killFire = true;
         BurntMod.queueServerWork(1200, () -> BurntMod.killFire = false);
         class_3218 overworld = serverLevel.method_8503().method_30002();
         boolean alreadyRaining = overworld.method_8401().method_156();
         BurntMod.forceRain = true;
         if (alreadyRaining) {
            BurntMod.queueServerWork(40, () -> BurntMod.forceRain = false);
         } else {
            overworld.method_27910(0, 40, true, false);
            BurntMod.queueServerWork(40, () -> {
               BurntMod.forceRain = false;
               overworld.method_27910(6000, 0, false, false);
            });
         }

      }
   }
}
