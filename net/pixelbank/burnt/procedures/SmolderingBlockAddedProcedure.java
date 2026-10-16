package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingBlockAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SMOLDERING_LEAVES)) {
            ++BurntModVariables.WorldVariables.get(world).flameCount;
            BurntModVariables.WorldVariables.get(world).markSyncDirty();
         }

         class_2769 var10 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var10 instanceof class_2758) {
            class_2758 _getip4 = (class_2758)var10;
            var10000 = (Integer)blockstate.method_11654(_getip4);
         } else {
            var10000 = -1;
         }

         if (var10000 < 1) {
            label24: {
               var10 = blockstate.method_26204().method_9595().method_11663("hot");
               if (var10 instanceof class_2746) {
                  class_2746 _getbp6 = (class_2746)var10;
                  if ((Boolean)blockstate.method_11654(_getbp6)) {
                     var10000 = 1;
                     break label24;
                  }
               }

               var10000 = 0;
            }

            if (!var10000) {
               return;
            }
         }

         BurntVinesPlacementProcedure.execute(world, x, y, z);
      }

   }
}
