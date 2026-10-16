package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3959;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class FireAspectProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.FIRE_ASPECT.get() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get() && !entity.method_5869()) {
            class_6880.class_6883 var10000 = world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9124);
            class_1799 var10001;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10001 = _livEnt.method_6047();
            } else {
               var10001 = class_1799.field_8037;
            }

            if (class_1890.method_8225(var10000, var10001) != 0 && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_WILL_BURN)) {
               WillitburnProcedure.execute(world, (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)3.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10263(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)3.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10264(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)3.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10260());
            }
         }

      }
   }
}
