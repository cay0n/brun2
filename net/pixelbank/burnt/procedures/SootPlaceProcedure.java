package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class SootPlaceProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      execute((Object)null, world, x, y, z, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == BurntModItems.SOOT && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SOOT_PLACES_ON)) {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10340) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10454) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10440) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10115) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ANDESITE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10016) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ANDESITE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10386) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ANDESITE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10489) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ANDESITE_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10508) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DIORITE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10507) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DIORITE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10216) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DIORITE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10517) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DIORITE_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10474) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_GRANITE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10189) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_GRANITE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10607) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_GRANITE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10072) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_GRANITE_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10445) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_COBBLESTONE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10596) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_COBBLESTONE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10351) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_COBBLESTONE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10625) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_COBBLESTONE_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9989) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_COBBLESTONE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10207) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10405) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9990) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10056) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_BRICKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10392) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_BRICK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10131) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_BRICK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10252) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STONE_BRICK_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10065) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_STONE_BRICKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10552) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHISELED_STONE_BRICKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10173) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10024) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10059) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10104) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BRICKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10089) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BRICK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10191) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BRICK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10269) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BRICK_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37557) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MUD_BRICKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37558) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MUD_BRICK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37562) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MUD_BRICK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37567) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MUD_BRICK_WALL.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10431) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10037) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10511) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10010) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10306) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37545) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10533) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42729) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_log")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10126) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10155) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10307) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10178) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10303) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37549) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9999) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42733) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_wood")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10519) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10436) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10366) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10244) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10254) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37548) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10622) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42732) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "stripped_pale_oak_log")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10250) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10558) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10204) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10374) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10084) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37550) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10103) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42730) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "stripped_pale_oak_wood")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_STRIPPED_WOOD.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10161) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9975) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10148) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10075) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10334) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37577) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10218) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42751) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_planks")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_PLANKS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10563) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10569) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10408) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10616) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10122) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37561) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10256) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42744) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_stairs")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_STAIRS.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10119) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10071) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10257) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10500) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10617) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37564) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10031) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42746) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_slab")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_SLAB.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10620) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10020) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10299) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10132) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10319) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37565) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_MANGROVE_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10144) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42747) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_fence")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_FENCE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10188) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_OAK_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10291) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10513) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_BIRCH_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10196) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10041) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37563) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37563.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10457) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_ACACIA_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42745) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_CHERRY_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_fence_gate")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (entity instanceof class_1309) {
                  class_1309 _entity = (class_1309)entity;
                  _entity.method_23667(class_1268.field_5808, true);
               }

               if (world instanceof class_1937) {
                  class_1937 _level = (class_1937)world;
                  if (!_level.method_8608()) {
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.sand.place")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("block.sand.place")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               if (getEntityGameType(entity) == class_1934.field_9215 && entity instanceof class_1657) {
                  class_1657 _player = (class_1657)entity;
                  class_1799 _stktoremove = new class_1799(BurntModItems.SOOT);
                  _player.method_31548().method_29280((p) -> _stktoremove.method_7909() == p.method_7909(), 1, _player.field_7498.method_29281());
               }
            }
         }

      }
   }

   private static class_1934 getEntityGameType(class_1297 entity) {
      if (entity instanceof class_3222 serverPlayer) {
         return serverPlayer.field_13974.method_14257();
      } else {
         if (entity instanceof class_1657 player) {
            if (player.method_37908().method_8608()) {
               class_640 playerInfo = class_310.method_1551().method_1562().method_2871(player.method_7334().getId());
               if (playerInfo != null) {
                  return playerInfo.method_2958();
               }
            }
         }

         return null;
      }
   }
}
