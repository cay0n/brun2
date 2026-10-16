package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class StrippedWoodBurntProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BURNT_WOOD || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_WOOD || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BLAZING_WOOD || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.EMBER_WOOD)) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() instanceof class_1743) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
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

               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }
            }
         }

      }
   }
}
