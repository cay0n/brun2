package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2754;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingGrassAddedProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip2 = (class_2758)var9;
            var10000 = (Integer)blockstate.method_11654(_getip2);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 2) {
            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10479) {
               class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
               class_2680 _bs = BurntModBlocks.TALL_GRASS_FIRE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var16) {
                     }
                  }
               }
            }

            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == blockStateWithEnum(class_2246.field_10214.method_9564(), "half", "lower").method_26204()) {
               world.method_8652(class_2338.method_49637(x, y + (double)2.0F, z), class_2246.field_10124.method_9564(), 3);
               class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
               class_2680 _bs = BurntModBlocks.DOUBLE_TALL_GRASS_FIRE.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }

            if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_FLOWERS)) {
               world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
            }

            if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_ANIMALS_SPAWNABLE_ON)) {
               class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
               class_2680 _bs = BurntModBlocks.SEMI_BURNT_DIRT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               class_2586 _be = world.method_8321(_bp);
               class_2487 _bnbt = null;
               if (_be != null) {
                  _bnbt = _be.method_38242(world.method_30349());
                  _be.method_11012();
               }

               world.method_8652(_bp, _bs, 3);
               if (_bnbt != null) {
                  _be = world.method_8321(_bp);
                  if (_be != null) {
                     try {
                        _be.method_58690(_bnbt, world.method_30349());
                     } catch (Exception var15) {
                     }
                  }
               }
            }

            BurntVinesPlacementProcedure.execute(world, x, y, z);
         }
      }

   }

   private static class_2680 blockStateWithEnum(class_2680 blockState, String property, String newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2754 ep) {
         if (ep.method_11900(newValue).isPresent()) {
            var10000 = (class_2680)blockState.method_11657(ep, (Enum)ep.method_11900(newValue).get());
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
