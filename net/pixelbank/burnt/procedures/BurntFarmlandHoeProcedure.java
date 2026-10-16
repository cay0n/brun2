package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class BurntFarmlandHoeProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNT_DIRT) && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26164(BurntTags.BLOCK_AIR)) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_31573(BurntTags.ITEM_MC_HOES)) {
               if (entity instanceof class_1309) {
                  class_1309 _entity = (class_1309)entity;
                  _entity.method_23667(class_1268.field_5808, true);
               }

               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_FARMLAND.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.hoe.till")), class_3419.field_15245, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.hoe.till")), class_3419.field_15245, 1.0F, 1.0F, false);
                  }
               }

               if (world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var10000 = _livEnt.method_6047();
                  } else {
                     var10000 = class_1799.field_8037;
                  }

                  var10000.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                  });
               }
            }
         }

      }
   }
}
