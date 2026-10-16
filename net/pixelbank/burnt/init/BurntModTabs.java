package net.pixelbank.burnt.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_7706;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class BurntModTabs {
   public static void register() {
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_41060).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         if ((Boolean)BurntBasicConfigConfiguration.ENABLE_FIRE_EXTINGUISHER.get()) {
            entries.method_45421(BurntModItems.EXTINGUISHER);
         }

      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_41059).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModBlocks.BURNT_WOOL);
         if ((Boolean)BurntBasicConfigConfiguration.ENABLE_FLAGS.get()) {
            entries.method_45421(BurntModBlocks.WHITE_FLAG);
            entries.method_45421(BurntModBlocks.BLACK_FLAG);
            entries.method_45421(BurntModBlocks.YELLOW_FLAG);
            entries.method_45421(BurntModBlocks.PINK_FLAG);
            entries.method_45421(BurntModBlocks.BLUE_FLAG);
            entries.method_45421(BurntModBlocks.LIGHT_BLUE_FLAG);
            entries.method_45421(BurntModBlocks.CYAN_FLAG);
            entries.method_45421(BurntModBlocks.GREEN_FLAG);
            entries.method_45421(BurntModBlocks.LIME_FLAG);
            entries.method_45421(BurntModBlocks.PURPLE_FLAG);
            entries.method_45421(BurntModBlocks.MAGENTA_FLAG);
            entries.method_45421(BurntModBlocks.ORANGE_FLAG);
            entries.method_45421(BurntModBlocks.BROWN_FLAG);
            entries.method_45421(BurntModBlocks.GREY_FLAG);
            entries.method_45421(BurntModBlocks.LIGHT_GREY_FLAG);
            entries.method_45421(BurntModBlocks.RED_FLAG);
            entries.method_45421(BurntModBlocks.WIND_FLAG);
            entries.method_45421(BurntModBlocks.RAINBOW_FLAG);
            entries.method_45421(BurntModBlocks.PIRATE_FLAG);
         }

      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_41061).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModItems.BAKED_APPLE);
         entries.method_45421(BurntModItems.EMBER_BERRIES);
      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_41062).register((ItemGroupEvents.ModifyEntries)(entries) -> entries.method_45421(BurntModItems.SOOT));
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_40743).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModBlocks.BURNT_LEAVES);
         entries.method_45421(BurntModBlocks.BURNT_LOG);
         entries.method_45421(BurntModBlocks.BURNT_HOLLOW_LOG);
         entries.method_45421(BurntModBlocks.BROKEN_BURNT_LOG);
         entries.method_45421(BurntModBlocks.BURNT_GRASS);
         entries.method_45421(BurntModBlocks.BURNT_DIRT);
         entries.method_45421(BurntModBlocks.BURNT_PATH);
         entries.method_45421(BurntModBlocks.BURNT_MANGROVE_ROOTS);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_STALK);
         entries.method_45421(BurntModBlocks.BURNT_HAY);
         entries.method_45421(BurntModBlocks.BURNT_MOSS);
         entries.method_45421(BurntModBlocks.BURNT_CACTUS);
         entries.method_45421(BurntModBlocks.BURNT_AZALEA);
         entries.method_45421(BurntModBlocks.BURNT_MOSS_CARPET);
         entries.method_45421(BurntModBlocks.BURNT_PUMPKIN);
         entries.method_45421(BurntModBlocks.BURNT_CARVED_PUMPKIN);
         entries.method_45421(BurntModBlocks.BURNT_JACK_O_LANTERN);
         entries.method_45421(BurntModBlocks.BURNT_MELON);
         entries.method_45421(BurntModBlocks.COOKED_RED_MUSHROOM_BLOCK);
         entries.method_45421(BurntModBlocks.COOKED_BROWN_MUSHROOM_BLOCK);
         entries.method_45421(BurntModBlocks.COOKED_MUSHROOM_STEM);
         entries.method_45421(BurntModBlocks.CHARRED_MYCELIUM);
      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_40195).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModBlocks.BURNT_LOG);
         entries.method_45421(BurntModBlocks.BURNT_HOLLOW_LOG);
         entries.method_45421(BurntModBlocks.BROKEN_BURNT_LOG);
         entries.method_45421(BurntModBlocks.STRIPPED_BURNT_LOG);
         entries.method_45421(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG);
         entries.method_45421(BurntModBlocks.BURNT_WOOD);
         entries.method_45421(BurntModBlocks.STRIPPED_BURNT_WOOD);
         entries.method_45421(BurntModBlocks.BURNT_PLANKS);
         entries.method_45421(BurntModBlocks.BURNT_STAIRS);
         entries.method_45421(BurntModBlocks.BURNT_SLAB);
         entries.method_45421(BurntModBlocks.BURNT_WALL);
         entries.method_45421(BurntModBlocks.BURNT_VERTICAL_SLAB);
         entries.method_45421(BurntModBlocks.BURNT_FENCE);
         entries.method_45421(BurntModBlocks.BURNT_FENCEGATE);
         entries.method_45421(BurntModBlocks.BURNT_BUTTON);
         entries.method_45421(BurntModBlocks.BURNT_PRESSURE_PLATE);
         entries.method_45421(BurntModBlocks.BURNT_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_OAK_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_OAK_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_SPRUCE_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_SPRUCE_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_BIRCH_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_BIRCH_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_ACACIA_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_ACACIA_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_DARK_OAK_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_DARK_OAK_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_JUNGLE_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_JUNGLE_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_MANGROVE_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_MANGROVE_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_CHERRY_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_PALE_OAK_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_CHERRY_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_PALE_OAK_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_DOOR);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_TRAPDOOR);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_BLOCK);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_PLANKS);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_MOSAIC_PLANKS);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_STAIRS);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_MOSAIC_STAIRS);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_SLAB);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_MOSAIC_SLAB);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_FENCE);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_FENCEGATE);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_BUTTON);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_PRESSURE_PLATE);
         entries.method_45421(BurntModBlocks.BURNT_BOOKSHELF);
         entries.method_45421(BurntModBlocks.BURNT_LADDER);
         entries.method_45421(BurntModBlocks.BURNT_SCAFFOLDING);
         entries.method_45421(BurntModBlocks.FALLEN_BURNT_SLAB);
         entries.method_45421(BurntModBlocks.BURNT_CARPET);
      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_40198).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModBlocks.BURNT_BUTTON);
         entries.method_45421(BurntModBlocks.BURNT_PRESSURE_PLATE);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_BUTTON);
         entries.method_45421(BurntModBlocks.BURNT_BAMBOO_PRESSURE_PLATE);
         entries.method_45421(BurntModBlocks.FIRE_BARREL);
         entries.method_45421(BurntModBlocks.SMOKE_DETECTOR);
      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_40197).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.method_45421(BurntModBlocks.BURNT_BARREL);
         entries.method_45421(BurntModBlocks.BURNT_CAMPFIRE);
         if ((Boolean)BurntBasicConfigConfiguration.ENABLE_FLAGS.get()) {
            entries.method_45421(BurntModBlocks.WHITE_FLAG);
            entries.method_45421(BurntModBlocks.BLACK_FLAG);
            entries.method_45421(BurntModBlocks.YELLOW_FLAG);
            entries.method_45421(BurntModBlocks.PINK_FLAG);
            entries.method_45421(BurntModBlocks.BLUE_FLAG);
            entries.method_45421(BurntModBlocks.LIGHT_BLUE_FLAG);
            entries.method_45421(BurntModBlocks.CYAN_FLAG);
            entries.method_45421(BurntModBlocks.GREEN_FLAG);
            entries.method_45421(BurntModBlocks.LIME_FLAG);
            entries.method_45421(BurntModBlocks.PURPLE_FLAG);
            entries.method_45421(BurntModBlocks.MAGENTA_FLAG);
            entries.method_45421(BurntModBlocks.ORANGE_FLAG);
            entries.method_45421(BurntModBlocks.BROWN_FLAG);
            entries.method_45421(BurntModBlocks.GREY_FLAG);
            entries.method_45421(BurntModBlocks.LIGHT_GREY_FLAG);
            entries.method_45421(BurntModBlocks.RED_FLAG);
            entries.method_45421(BurntModBlocks.WIND_FLAG);
            entries.method_45421(BurntModBlocks.RAINBOW_FLAG);
            entries.method_45421(BurntModBlocks.PIRATE_FLAG);
         }

      });
   }
}
