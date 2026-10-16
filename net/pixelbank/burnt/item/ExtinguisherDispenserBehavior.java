package net.pixelbank.burnt.item;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2315;
import net.minecraft.class_2338;
import net.minecraft.class_2342;
import net.minecraft.class_2347;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2601;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3726;
import net.minecraft.class_1665.class_1666;
import net.minecraft.class_2350.class_2351;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.entity.SprayEntity;
import net.pixelbank.burnt.entity.VisualSprayEntity;
import net.pixelbank.burnt.init.BurntModEntities;
import net.pixelbank.burnt.init.BurntModItems;

public class ExtinguisherDispenserBehavior extends class_2347 {
   private static final double SPREAD_HORIZONTAL = 0.4;
   private static final double SPREAD_UP = 0.6;
   private static final double SPREAD_DOWN = (double)2.0F;
   private static final float SPEED = 1.5F;
   private static final float SPEED_VERTICAL = 1.0F;
   private static final double HORIZONTAL_Y_OFFSET = -0.2;
   private static final int SPRAY_INTERVAL_TICKS = 2;
   private static final Set<Long> ACTIVE = ConcurrentHashMap.newKeySet();

   protected class_1799 method_10135(class_2342 source, class_1799 stack) {
      class_3218 world = source.comp_1967();
      class_2350 facing = (class_2350)source.comp_1969().method_11654(class_2315.field_10918);
      long key = source.comp_1968().method_10063();
      if (ACTIVE.add(key)) {
         scheduleSpray(world, source.comp_1968(), facing, key);
      }

      return stack;
   }

   private static void scheduleSpray(class_3218 world, class_2338 pos, class_2350 facing, long key) {
      BurntMod.queueServerWork(2, () -> {
         if (!world.method_49803(pos)) {
            ACTIVE.remove(key);
         } else {
            class_2586 patt0$temp = world.method_8321(pos);
            if (!(patt0$temp instanceof class_2601)) {
               ACTIVE.remove(key);
            } else {
               class_2601 be = (class_2601)patt0$temp;
               class_1799 extStack = class_1799.field_8037;
               int extSlot = -1;

               for(int i = 0; i < be.method_5439(); ++i) {
                  if (be.method_5438(i).method_31574(BurntModItems.EXTINGUISHER)) {
                     extStack = be.method_5438(i);
                     extSlot = i;
                     break;
                  }
               }

               if (extSlot < 0) {
                  ACTIVE.remove(key);
               } else {
                  spawnSpray(world, pos, facing);
                  extStack.method_7956(1, world, (class_3222)null, (item) -> be.method_5447(extSlot, class_1799.field_8037));
                  world.method_8396((class_1657)null, pos, class_3417.field_15237, class_3419.field_15245, 1.0F, 0.8F + world.method_8409().method_43057() * 0.4F);
                  scheduleSpray(world, pos, facing, key);
               }
            }
         }
      });
   }

   private static void spawnSpray(class_3218 world, class_2338 dispenserPos, class_2350 facing) {
      class_2338 frontPos = dispenserPos.method_10079(facing, 1);
      if (world.method_8320(frontPos).method_26194(world, frontPos, class_3726.method_16194()).method_1110()) {
         class_243 spawnPos = class_243.method_24953(frontPos);
         if (facing.method_10166() != class_2351.field_11052) {
            spawnPos = spawnPos.method_1031((double)0.0F, -0.2, (double)0.0F);
         }

         SprayEntity spray = new SprayEntity(BurntModEntities.SPRAY, world);
         spray.method_5814(spawnPos.field_1352, spawnPos.field_1351, spawnPos.field_1350);
         double var10000;
         switch (facing) {
            case field_11033 -> var10000 = (double)2.0F;
            case field_11036 -> var10000 = 0.6;
            default -> var10000 = 0.4;
         }

         double spread = var10000;
         double dx = (double)facing.method_10148() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         double dy = (double)facing.method_10164() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         double dz = (double)facing.method_10165() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         float speed = facing.method_10166() == class_2351.field_11052 ? 1.0F : 1.5F;
         spray.method_7485(dx, dy, dz, speed, 0.0F);
         spray.method_5803(true);
         spray.field_7572 = class_1666.field_7592;
         spray.method_7438((double)0.0F);
         world.method_8649(spray);
         double vdx = (double)facing.method_10148() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         double vdy = (double)facing.method_10164() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         double vdz = (double)facing.method_10165() + (world.method_8409().method_43058() - (double)0.5F) * spread;
         VisualSprayEntity visual = new VisualSprayEntity(BurntModEntities.VISUAL_SPRAY, world);
         visual.method_5814(spawnPos.field_1352, spawnPos.field_1351, spawnPos.field_1350);
         visual.method_7485(vdx, vdy, vdz, speed, 0.0F);
         visual.method_5803(true);
         visual.field_7572 = class_1666.field_7592;
         world.method_8649(visual);
      }
   }
}
