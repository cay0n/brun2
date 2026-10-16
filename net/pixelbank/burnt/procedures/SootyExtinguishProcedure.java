package net.pixelbank.burnt.procedures;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntVanilla;

public class SootyExtinguishProcedure {
   private static volatile Map<class_2248, class_2248> MAP;

   private static Map<class_2248, class_2248> map() {
      Map<class_2248, class_2248> m = MAP;
      if (m == null) {
         m = new HashMap(160);
         m.put(BurntModBlocks.SMOLDERING_GRASS_START, class_2246.field_10219);
         m.put(BurntModBlocks.SOOTY_OAK_LOG, class_2246.field_10431);
         m.put(BurntModBlocks.SOOTY_SPRUCE_LOG, class_2246.field_10037);
         m.put(BurntModBlocks.SOOTY_BIRCH_LOG, class_2246.field_10511);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_LOG, class_2246.field_10010);
         m.put(BurntModBlocks.SOOTY_JUNGLE_LOG, class_2246.field_10306);
         m.put(BurntModBlocks.SOOTY_MANGROVE_LOG, class_2246.field_37545);
         m.put(BurntModBlocks.SOOTY_ACACIA_LOG, class_2246.field_10533);
         m.put(BurntModBlocks.SOOTY_CHERRY_LOG, class_2246.field_42729);
         m.put(BurntModBlocks.SOOTY_OAK_WOOD, class_2246.field_10126);
         m.put(BurntModBlocks.SOOTY_SPRUCE_WOOD, class_2246.field_10155);
         m.put(BurntModBlocks.SOOTY_BIRCH_WOOD, class_2246.field_10307);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_WOOD, class_2246.field_10178);
         m.put(BurntModBlocks.SOOTY_JUNGLE_WOOD, class_2246.field_10303);
         m.put(BurntModBlocks.SOOTY_MANGROVE_WOOD, class_2246.field_37549);
         m.put(BurntModBlocks.SOOTY_ACACIA_WOOD, class_2246.field_9999);
         m.put(BurntModBlocks.SOOTY_CHERRY_WOOD, class_2246.field_42733);
         m.put(BurntModBlocks.SOOTY_STRIPPED_OAK_LOG, class_2246.field_10519);
         m.put(BurntModBlocks.SOOTY_STRIPPED_SPRUCE_LOG, class_2246.field_10436);
         m.put(BurntModBlocks.SOOTY_STRIPPED_BIRCH_LOG, class_2246.field_10366);
         m.put(BurntModBlocks.SOOTY_STRIPPED_DARK_OAK_LOG, class_2246.field_10244);
         m.put(BurntModBlocks.SOOTY_STRIPPED_JUNGLE_LOG, class_2246.field_10254);
         m.put(BurntModBlocks.SOOTY_STRIPPED_MANGROVE_LOG, class_2246.field_37548);
         m.put(BurntModBlocks.SOOTY_STRIPPED_ACACIA_LOG, class_2246.field_10622);
         m.put(BurntModBlocks.SOOTY_STRIPPED_CHERRY_LOG, class_2246.field_42732);
         m.put(BurntModBlocks.SOOTY_OAK_STRIPPED_WOOD, class_2246.field_10250);
         m.put(BurntModBlocks.SOOTY_SPRUCE_STRIPPED_WOOD, class_2246.field_10558);
         m.put(BurntModBlocks.SOOTY_BIRCH_STRIPPED_WOOD, class_2246.field_10204);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_STRIPPED_WOOD, class_2246.field_10374);
         m.put(BurntModBlocks.SOOTY_JUNGLE_STRIPPED_WOOD, class_2246.field_10084);
         m.put(BurntModBlocks.SOOTY_MANGROVE_STRIPPED_WOOD, class_2246.field_37550);
         m.put(BurntModBlocks.SOOTY_ACACIA_STRIPPED_WOOD, class_2246.field_10103);
         m.put(BurntModBlocks.SOOTY_CHERRY_STRIPPED_WOOD, class_2246.field_42730);
         m.put(BurntModBlocks.SOOTY_OAK_PLANKS, class_2246.field_10161);
         m.put(BurntModBlocks.SOOTY_SPRUCE_PLANKS, class_2246.field_9975);
         m.put(BurntModBlocks.SOOTY_BIRCH_PLANKS, class_2246.field_10148);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_PLANKS, class_2246.field_10075);
         m.put(BurntModBlocks.SOOTY_JUNGLE_PLANKS, class_2246.field_10334);
         m.put(BurntModBlocks.SOOTY_MANGROVE_PLANKS, class_2246.field_37577);
         m.put(BurntModBlocks.SOOTY_ACACIA_PLANKS, class_2246.field_10218);
         m.put(BurntModBlocks.SOOTY_CHERRY_PLANKS, class_2246.field_42751);
         m.put(BurntModBlocks.SOOTY_OAK_STAIRS, class_2246.field_10563);
         m.put(BurntModBlocks.SOOTY_SPRUCE_STAIRS, class_2246.field_10569);
         m.put(BurntModBlocks.SOOTY_BIRCH_STAIRS, class_2246.field_10408);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_STAIRS, class_2246.field_10616);
         m.put(BurntModBlocks.SOOTY_JUNGLE_STAIRS, class_2246.field_10122);
         m.put(BurntModBlocks.SOOTY_MANGROVE_STAIRS, class_2246.field_37561);
         m.put(BurntModBlocks.SOOTY_ACACIA_STAIRS, class_2246.field_10256);
         m.put(BurntModBlocks.SOOTY_CHERRY_STAIRS, class_2246.field_42744);
         m.put(BurntModBlocks.SOOTY_OAK_SLAB, class_2246.field_10119);
         m.put(BurntModBlocks.SOOTY_SPRUCE_SLAB, class_2246.field_10071);
         m.put(BurntModBlocks.SOOTY_BIRCH_SLAB, class_2246.field_10257);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_SLAB, class_2246.field_10500);
         m.put(BurntModBlocks.SOOTY_JUNGLE_SLAB, class_2246.field_10617);
         m.put(BurntModBlocks.SOOTY_MANGROVE_SLAB, class_2246.field_37564);
         m.put(BurntModBlocks.SOOTY_ACACIA_SLAB, class_2246.field_10031);
         m.put(BurntModBlocks.SOOTY_CHERRY_SLAB, class_2246.field_42746);
         m.put(BurntModBlocks.SOOTY_OAK_FENCE, class_2246.field_10620);
         m.put(BurntModBlocks.SOOTY_SPRUCE_FENCE, class_2246.field_10020);
         m.put(BurntModBlocks.SOOTY_BIRCH_FENCE, class_2246.field_10299);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_FENCE, class_2246.field_10132);
         m.put(BurntModBlocks.SOOTY_JUNGLE_FENCE, class_2246.field_10319);
         m.put(BurntModBlocks.SOOTY_MANGROVE_FENCE, class_2246.field_37565);
         m.put(BurntModBlocks.SOOTY_ACACIA_FENCE, class_2246.field_10144);
         m.put(BurntModBlocks.SOOTY_CHERRY_FENCE, class_2246.field_42747);
         m.put(BurntModBlocks.SOOTY_OAK_FENCE_GATE, class_2246.field_10188);
         m.put(BurntModBlocks.SOOTY_SPRUCE_FENCE_GATE, class_2246.field_10291);
         m.put(BurntModBlocks.SOOTY_BIRCH_FENCE_GATE, class_2246.field_10513);
         m.put(BurntModBlocks.SOOTY_DARK_OAK_FENCE_GATE, class_2246.field_10196);
         m.put(BurntModBlocks.SOOTY_JUNGLE_FENCE_GATE, class_2246.field_10041);
         m.put(class_2246.field_37563, class_2246.field_37563);
         m.put(BurntModBlocks.SOOTY_ACACIA_FENCE_GATE, class_2246.field_10457);
         m.put(BurntModBlocks.SOOTY_CHERRY_FENCE_GATE, class_2246.field_42745);
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_LOG, "pale_oak_log");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_WOOD, "pale_oak_wood");
         putVanilla(m, BurntModBlocks.SOOTY_STRIPPED_PALE_OAK_LOG, "stripped_pale_oak_log");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_STRIPPED_WOOD, "stripped_pale_oak_wood");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_PLANKS, "pale_oak_planks");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_STAIRS, "pale_oak_stairs");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_SLAB, "pale_oak_slab");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_FENCE, "pale_oak_fence");
         putVanilla(m, BurntModBlocks.SOOTY_PALE_OAK_FENCE_GATE, "pale_oak_fence_gate");
         m.put(BurntModBlocks.SOOTY_STONE, class_2246.field_10340);
         m.put(BurntModBlocks.SOOTY_STONE_SLAB, class_2246.field_10454);
         m.put(BurntModBlocks.SOOTY_STONE_STAIRS, class_2246.field_10440);
         m.put(BurntModBlocks.SOOTY_COBBLESTONE, class_2246.field_10445);
         m.put(BurntModBlocks.SOOTY_COBBLESTONE_STAIRS, class_2246.field_10596);
         m.put(BurntModBlocks.SOOTY_COBBLESTONE_SLAB, class_2246.field_10351);
         m.put(BurntModBlocks.SOOTY_COBBLESTONE_WALL, class_2246.field_10625);
         m.put(BurntModBlocks.SOOTY_MOSSY_COBBLESTONE, class_2246.field_9989);
         m.put(BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_STAIRS, class_2246.field_10207);
         m.put(BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_SLAB, class_2246.field_10405);
         m.put(BurntModBlocks.SOOTY_MOSSY_COBBLESTONE_WALL, class_2246.field_9990);
         m.put(BurntModBlocks.SOOTY_STONE_BRICKS, class_2246.field_10056);
         m.put(BurntModBlocks.SOOTY_STONE_BRICK_STAIRS, class_2246.field_10392);
         m.put(BurntModBlocks.SOOTY_STONE_BRICK_SLAB, class_2246.field_10131);
         m.put(BurntModBlocks.SOOTY_STONE_BRICK_WALL, class_2246.field_10252);
         m.put(BurntModBlocks.SOOTY_MOSSY_STONE_BRICKS, class_2246.field_10065);
         m.put(BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_STAIRS, class_2246.field_10173);
         m.put(BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_SLAB, class_2246.field_10024);
         m.put(BurntModBlocks.SOOTY_MOSSY_STONE_BRICK_WALL, class_2246.field_10059);
         m.put(BurntModBlocks.SOOTY_BRICKS, class_2246.field_10104);
         m.put(BurntModBlocks.SOOTY_BRICK_STAIRS, class_2246.field_10089);
         m.put(BurntModBlocks.SOOTY_BRICK_SLAB, class_2246.field_10191);
         m.put(BurntModBlocks.SOOTY_BRICK_WALL, class_2246.field_10269);
         m.put(BurntModBlocks.SOOTY_MUD_BRICKS, class_2246.field_37557);
         m.put(BurntModBlocks.SOOTY_MUD_BRICK_STAIRS, class_2246.field_37558);
         m.put(BurntModBlocks.SOOTY_MUD_BRICK_SLAB, class_2246.field_37562);
         m.put(BurntModBlocks.SOOTY_MUD_BRICK_WALL, class_2246.field_37567);
         m.put(BurntModBlocks.SOOTY_ANDESITE, class_2246.field_10115);
         m.put(BurntModBlocks.SOOTY_ANDESITE_STAIRS, class_2246.field_10386);
         m.put(BurntModBlocks.SOOTY_ANDESITE_SLAB, class_2246.field_10016);
         m.put(BurntModBlocks.SOOTY_ANDESITE_WALL, class_2246.field_10489);
         m.put(BurntModBlocks.SOOTY_DIORITE, class_2246.field_10508);
         m.put(BurntModBlocks.SOOTY_DIORITE_STAIRS, class_2246.field_10216);
         m.put(BurntModBlocks.SOOTY_DIORITE_SLAB, class_2246.field_10507);
         m.put(BurntModBlocks.SOOTY_DIORITE_WALL, class_2246.field_10517);
         m.put(BurntModBlocks.SOOTY_GRANITE, class_2246.field_10474);
         m.put(BurntModBlocks.SOOTY_GRANITE_STAIRS, class_2246.field_10607);
         m.put(BurntModBlocks.SOOTY_GRANITE_SLAB, class_2246.field_10189);
         m.put(BurntModBlocks.SOOTY_GRANITE_WALL, class_2246.field_10072);
         MAP = m;
      }

      return m;
   }

   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2338 pos = class_2338.method_49637(x, y, z);
         class_2680 here = world.method_8320(pos);
         class_2248 dest = (class_2248)map().get(here.method_26204());
         if (dest != null) {
            placeWithCopiedProperties(world, pos, here, dest.method_9564());
         }
      }
   }

   private static void putVanilla(Map<class_2248, class_2248> m, class_2248 from, String vanillaId) {
      class_2248 to = BurntVanilla.block(vanillaId);
      if (from != null && to != null) {
         m.put(from, to);
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
}
