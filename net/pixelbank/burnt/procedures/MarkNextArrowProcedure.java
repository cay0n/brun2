package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1936;
import net.minecraft.class_7924;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntTags;

public class MarkNextArrowProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1799 itemstack) {
      execute((Object)null, world, x, y, z, itemstack);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1799 itemstack) {
      class_1799 used = class_1799.field_8037;
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
         used = itemstack.method_7972();
         if (used.method_31573(BurntTags.ITEM_BOWS) && (Boolean)BurntBasicConfigConfiguration.FLAME_BOW.get() && class_1890.method_8225(world.method_30349().method_46762(class_7924.field_41265).method_46747(class_1893.field_9126), itemstack) > 0) {
            BurntMod.queueServerWork(40, () -> SetArrowFireProcedure.execute(world, x, y, z));
         }
      }

   }
}
