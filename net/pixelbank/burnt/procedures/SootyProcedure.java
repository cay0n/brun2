package net.pixelbank.burnt.procedures;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2753;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;

public class SootyProcedure {
   private static volatile Map<class_2248, class_2248> SOOT;
   private static volatile Map<class_2248, class_2248> CRACKS;

   private static Map<class_2248, class_2248> sootMap() {
      Map<class_2248, class_2248> m = SOOT;
      if (m == null) {
         m = new HashMap();
         m.put(class_2246.field_10340, BurntModBlocks.SOOTY_STONE);
         m.put(class_2246.field_10454, BurntModBlocks.SOOTY_STONE_SLAB);
         m.put(class_2246.field_10440, BurntModBlocks.SOOTY_STONE_STAIRS);
         m.put(class_2246.field_10115, BurntModBlocks.SOOTY_ANDESITE);
         m.put(class_2246.field_10016, BurntModBlocks.SOOTY_ANDESITE_SLAB);
         m.put(class_2246.field_10386, BurntModBlocks.SOOTY_ANDESITE_STAIRS);
         m.put(class_2246.field_10489, BurntModBlocks.SOOTY_ANDESITE_WALL);
         m.put(class_2246.field_10508, BurntModBlocks.SOOTY_DIORITE);
         m.put(class_2246.field_10474, BurntModBlocks.SOOTY_GRANITE);
         m.put(class_2246.field_10189, BurntModBlocks.SOOTY_GRANITE_SLAB);
         m.put(class_2246.field_10607, BurntModBlocks.SOOTY_GRANITE_STAIRS);
         m.put(class_2246.field_10072, BurntModBlocks.SOOTY_GRANITE_WALL);
         m.put(class_2246.field_10445, BurntModBlocks.SOOTY_COBBLESTONE);
         m.put(class_2246.field_10596, BurntModBlocks.SOOTY_COBBLESTONE_STAIRS);
         m.put(class_2246.field_10351, BurntModBlocks.SOOTY_COBBLESTONE_SLAB);
         m.put(class_2246.field_10625, BurntModBlocks.SOOTY_COBBLESTONE_WALL);
         m.put(class_2246.field_9989, BurntModBlocks.SOOTY_MOSSY_COBBLESTONE);
         m.put(class_2246.field_10207, BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_STAIRS);
         m.put(class_2246.field_10405, BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_SLAB);
         m.put(class_2246.field_10056, BurntModBlocks.SOOTY_STONE_BRICKS);
         m.put(class_2246.field_10552, BurntModBlocks.SOOTY_CHISELED_STONE_BRICKS);
         m.put(class_2246.field_10392, BurntModBlocks.SOOTY_STONE_BRICK_STAIRS);
         m.put(class_2246.field_10131, BurntModBlocks.SOOTY_STONE_BRICK_SLAB);
         m.put(class_2246.field_10252, BurntModBlocks.SOOTY_STONE_BRICK_WALL);
         m.put(class_2246.field_10065, BurntModBlocks.SOOTY_MOSSY_STONE_BRICKS);
         m.put(class_2246.field_10173, BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_STAIRS);
         m.put(class_2246.field_10024, BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_SLAB);
         m.put(class_2246.field_10059, BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_WALL);
         m.put(class_2246.field_10104, BurntModBlocks.SOOTY_BRICKS);
         m.put(class_2246.field_10089, BurntModBlocks.SOOTY_BRICK_STAIRS);
         m.put(class_2246.field_10191, BurntModBlocks.SOOTY_BRICK_SLAB);
         m.put(class_2246.field_10269, BurntModBlocks.SOOTY_BRICK_WALL);
         m.put(class_2246.field_37557, BurntModBlocks.SOOTY_MUD_BRICKS);
         m.put(class_2246.field_37558, BurntModBlocks.SOOTY_MUD_BRICK_STAIRS);
         m.put(class_2246.field_37562, BurntModBlocks.SOOTY_MUD_BRICK_SLAB);
         m.put(class_2246.field_37567, BurntModBlocks.SOOTY_MUD_BRICK_WALL);
         SOOT = m;
      }

      return m;
   }

   private static Map<class_2248, class_2248> crackMap() {
      Map<class_2248, class_2248> m = CRACKS;
      if (m == null) {
         m = new HashMap();
         m.put(class_2246.field_10415, BurntModBlocks.CRACKED_TERRACOTTA);
         m.put(class_2246.field_10611, BurntModBlocks.CRACKED_WHITE_TERRACOTTA);
         m.put(class_2246.field_10184, BurntModBlocks.CRACKED_ORANGE_TERRACOTTA);
         m.put(class_2246.field_10015, BurntModBlocks.CRACKED_MAGENTA_TERRACOTTA);
         m.put(class_2246.field_10325, BurntModBlocks.CRACKED_LIGHT_BLUE_TERRACOTTA);
         m.put(class_2246.field_10143, BurntModBlocks.CRACKED_YELLOW_TERRACOTTA);
         m.put(class_2246.field_10014, BurntModBlocks.CRACKED_LIME_TERRACOTTA);
         m.put(class_2246.field_10444, BurntModBlocks.CRACKED_PINK_TERRACOTTA);
         m.put(class_2246.field_10349, BurntModBlocks.CRACKED_GREY_TERRACOTTA);
         m.put(class_2246.field_10590, BurntModBlocks.CRACKED_LIGHT_GREY_TERRACOTTA);
         m.put(class_2246.field_10235, BurntModBlocks.CRACKED_CYAN_TERRACOTTA);
         m.put(class_2246.field_10570, BurntModBlocks.CRACKED_PURPLE_TERRACOTTA);
         m.put(class_2246.field_10409, BurntModBlocks.CRACKED_BLUE_TERRACOTTA);
         m.put(class_2246.field_10123, BurntModBlocks.CRACKED_BROWN_TERRACOTTA);
         m.put(class_2246.field_10526, BurntModBlocks.CRACKED_GREEN_TERRACOTTA);
         m.put(class_2246.field_10328, BurntModBlocks.CRACKED_RED_TERRACOTTA);
         m.put(class_2246.field_10626, BurntModBlocks.CRACKED_BLACK_TERRACOTTA);
         CRACKS = m;
      }

      return m;
   }

   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         boolean doSoot = (Boolean)BurntBasicConfigConfiguration.SOOT.get();
         boolean doCracks = (Boolean)BurntBasicConfigConfiguration.CRACKS.get();
         if (doSoot || doCracks) {
            Map<class_2248, class_2248> soot = doSoot ? sootMap() : null;
            Map<class_2248, class_2248> cracks = doCracks ? crackMap() : null;
            int bx = (int)Math.floor(x);
            int by = (int)Math.floor(y);
            int bz = (int)Math.floor(z);
            class_2338.class_2339 cursor = new class_2338.class_2339();

            for(int dx = -1; dx <= 1; ++dx) {
               for(int dy = -1; dy <= 1; ++dy) {
                  for(int dz = -1; dz <= 1; ++dz) {
                     cursor.method_10103(bx + dx, by + dy, bz + dz);
                     class_2680 here = world.method_8320(cursor);
                     class_2248 hereBlock = here.method_26204();
                     if (soot != null) {
                        class_2248 sootDest = (class_2248)soot.get(hereBlock);
                        if (sootDest != null && Math.random() <= 0.3) {
                           placeWithCopiedProperties(world, cursor.method_10062(), here, sootDest.method_9564());
                           continue;
                        }
                     }

                     if (cracks != null) {
                        class_2248 crackDest = (class_2248)cracks.get(hereBlock);
                        if (crackDest != null && Math.random() <= 0.3) {
                           class_2680 crackedState = blockStateWithDirection(crackDest.method_9564(), class_2350.method_10139(world.method_8409().method_43048(4)));
                           placeWithCopiedProperties(world, cursor.method_10062(), here, crackedState);
                        }
                     }
                  }
               }
            }

         }
      }
   }

   private static void placeWithCopiedProperties(class_1936 world, class_2338 pos, class_2680 source, class_2680 target) {
      class_2680 out = target;

      for(class_2769<?> propOld : source.method_28501()) {
         class_2769 propNew = out.method_26204().method_9595().method_11663(propOld.method_11899());
         if (propNew != null && out.method_11654(propNew) != null) {
            try {
               out = (class_2680)out.method_11657(propNew, source.method_11654(propOld));
            } catch (Exception var9) {
            }
         }
      }

      world.method_8652(pos, out, 3);
   }

   private static class_2680 blockStateWithDirection(class_2680 blockState, class_2350 newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663("facing");
      if (prop instanceof class_2753 dp) {
         if (dp.method_11898().contains(newValue)) {
            return (class_2680)blockState.method_11657(dp, newValue);
         }
      }

      prop = blockState.method_26204().method_9595().method_11663("axis");
      class_2680 var10000;
      if (prop instanceof class_2754 ep) {
         if (ep.method_11898().contains(newValue.method_10166())) {
            var10000 = (class_2680)blockState.method_11657(ep, newValue.method_10166());
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
