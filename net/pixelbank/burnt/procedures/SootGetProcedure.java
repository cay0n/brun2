package net.pixelbank.burnt.procedures;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3959;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class SootGetProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (Math.random() <= (double)0.5F) {
            class_1799 var10000;
            if (entity instanceof class_1309) {
               class_1309 _livEnt = (class_1309)entity;
               var10000 = _livEnt.method_6047();
            } else {
               var10000 = class_1799.field_8037;
            }

            if (var10000.method_7909() == class_1802.field_42716 && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SOOTY)) {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10340.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10454.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10440.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ANDESITE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10115.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ANDESITE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10016.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ANDESITE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10386.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ANDESITE_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10489.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DIORITE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10508.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DIORITE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10507.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DIORITE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10216.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DIORITE_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10517.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_GRANITE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10474.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_GRANITE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10189.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_GRANITE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10607.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_GRANITE_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10072.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_COBBLESTONE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10445.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_COBBLESTONE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10596.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_COBBLESTONE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10351.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_COBBLESTONE_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10625.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_COBBLESTONE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_9989.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10207.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10405.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_9990.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_BRICKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10056.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHISELED_STONE_BRICKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10552.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_BRICK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10392.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_BRICK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10131.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STONE_BRICK_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10252.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_STONE_BRICKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10065.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10173.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10024.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10059.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BRICKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10104.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BRICK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10089.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BRICK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10191.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BRICK_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10269.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MUD_BRICKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37557.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MUD_BRICK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37558.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MUD_BRICK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37562.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MUD_BRICK_WALL) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37567.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10431.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10037.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10511.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10010.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10306.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37545.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10533.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42729.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_log");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10126.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10155.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10307.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10178.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10303.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37549.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_9999.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42733.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_wood");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10519.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10436.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10366.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10244.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10254.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37548.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10622.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42732.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("stripped_pale_oak_log");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10250.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10558.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10204.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10374.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10084.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37550.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10103.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42730.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_STRIPPED_WOOD) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("stripped_pale_oak_wood");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10161.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_9975.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10148.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10075.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10334.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37577.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10218.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42751.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_PLANKS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_planks");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10563.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10569.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10408.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10616.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10122.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37561.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10256.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42744.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_STAIRS) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_stairs");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10119.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10071.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10257.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10500.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10617.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37564.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10031.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42746.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_SLAB) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_slab");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10620.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10020.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10299.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10132.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10319.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_MANGROVE_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37565.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10144.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42747.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_FENCE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_fence");
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_OAK_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10188.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10291.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_BIRCH_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10513.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10196.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10041.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37563) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_37563.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_ACACIA_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_10457.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_CHERRY_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = class_2246.field_42745.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
               } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntVanilla.stateOf("pale_oak_fence_gate");
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
                     _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.brush.brushing.sand.complete")), class_3419.field_15254, 1.0F, 1.0F);
                  } else {
                     _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.brush.brushing.sand.complete")), class_3419.field_15254, 1.0F, 1.0F, false);
                  }
               }

               world.method_20290(2001, class_2338.method_49637(x, y, z), class_2248.method_9507(BurntModBlocks.SOOT_BLOCK.method_9564()));
               if (getEntityGameType(entity) == class_1934.field_9215) {
                  if (world instanceof class_3218) {
                     class_3218 _level = (class_3218)world;
                     class_1542 entityToSpawn = new class_1542(_level, (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10263(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10264(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10260(), new class_1799(BurntModItems.SOOT));
                     entityToSpawn.method_6982(10);
                     _level.method_8649(entityToSpawn);
                  }

                  if (Math.random() == 0.1 && world instanceof class_3218) {
                     class_3218 _level = (class_3218)world;
                     class_1542 entityToSpawn = new class_1542(_level, (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10263(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10264(), (double)entity.method_37908().method_17742(new class_3959(entity.method_5836(1.0F), entity.method_5836(1.0F).method_1019(entity.method_5828(1.0F).method_1021((double)5.0F)), class_3960.field_17559, class_242.field_1348, entity)).method_17777().method_10260(), new class_1799(BurntModItems.SOOT));
                     entityToSpawn.method_6982(10);
                     _level.method_8649(entityToSpawn);
                  }
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
