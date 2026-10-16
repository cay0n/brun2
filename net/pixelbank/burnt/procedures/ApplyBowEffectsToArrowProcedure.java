package net.pixelbank.burnt.procedures;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1667;
import net.minecraft.class_1679;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1936;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_7924;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class ApplyBowEffectsToArrowProcedure {
   private static final Set<UUID> PROCESSED_ARROWS = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
   public static final Set<UUID> SOUL_ARROWS = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         boolean done = false;
         class_1799 mh = class_1799.field_8037;
         class_1799 oh = class_1799.field_8037;
         if (!world.method_8608() && (entity instanceof class_1667 || entity instanceof class_1679) && !PROCESSED_ARROWS.contains(entity.method_5667())) {
            done = false;
            class_243 _center = new class_243(x, y, z);

            for(class_1297 entityiterator : world.method_8390(class_1297.class, (new class_238(_center, _center)).method_1014((double)2.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.method_5707(_center))).toList()) {
               if (done) {
                  break;
               }

               if (entityiterator instanceof class_1657 && (Boolean)BurntBasicConfigConfiguration.FLAME_BOW.get()) {
                  SOUL_ARROWS.add(entity.method_5667());
                  PROCESSED_ARROWS.add(entity.method_5667());
                  done = true;
                  break;
               }

               class_1799 var10000;
               if (entityiterator instanceof class_1309) {
                  class_1309 _livEnt = (class_1309)entityiterator;
                  var10000 = _livEnt.method_6047();
               } else {
                  var10000 = class_1799.field_8037;
               }

               mh = var10000.method_7972();
               if (entityiterator instanceof class_1309) {
                  class_1309 _livEnt = (class_1309)entityiterator;
                  var10000 = _livEnt.method_6079();
               } else {
                  var10000 = class_1799.field_8037;
               }

               oh = var10000.method_7972();
               if (mh.method_31573(BurntTags.ITEM_BOWS) && class_1890.method_8225(world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9126), mh) > 0 || oh.method_31573(BurntTags.ITEM_BOWS) && class_1890.method_8225(world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9126), oh) > 0) {
                  entity.method_5639(5.0F);
                  PROCESSED_ARROWS.add(entity.method_5667());
               }
            }
         }

      }
   }
}
