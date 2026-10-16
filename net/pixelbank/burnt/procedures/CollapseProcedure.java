package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntCollapseBudget;
import net.pixelbank.burnt.util.BurntTags;

public class CollapseProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.COLLAPSE.get()) {
         if (!BurntCollapseBudget.hasHeadroom(world)) {
            return;
         }

         sx = (double)-4.0F;

         for(int index0 = 0; index0 < 8; ++index0) {
            sy = (double)-4.0F;

            for(int index1 = 0; index1 < 8; ++index1) {
               sz = (double)-4.0F;

               for(int index2 = 0; index2 < 8; ++index2) {
                  class_2338 _below = class_2338.method_49637(x + sx, y + sy - (double)1.0F, z + sz);
                  if (world.method_22340(_below) && world.method_8320(_below).method_26204() == class_2246.field_10124) {
                     class_2338 _cell = class_2338.method_49637(x + sx, y + sy, z + sz);
                     class_2680 _state = world.method_8320(_cell);
                     if (_state.method_26164(BurntTags.BLOCK_MC_PLANKS)) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.EMBER_PLANKS.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10445) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_COBBLESTONE_SLAB.method_9564());
                        }
                     } else if (_state.method_26164(BurntTags.BLOCK_MC_LOGS)) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.EMBER_LOG.method_9564());
                        }
                     } else if (_state.method_26164(BurntTags.BLOCK_MC_WOODEN_STAIRS)) {
                        if (Math.random() <= 0.3) {
                           world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                           if (world instanceof class_3218) {
                              class_3218 _level = (class_3218)world;
                              BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.FALLING_BURNT_SLAB.method_9564());
                           }
                        }
                     } else if (_state.method_26164(BurntTags.BLOCK_MC_WOODEN_SLABS)) {
                        if (Math.random() <= 0.2) {
                           world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                           if (world instanceof class_3218) {
                              class_3218 _level = (class_3218)world;
                              BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.FALLING_BURNT_SLAB.method_9564());
                           }
                        }
                     } else if (_state.method_26204() == class_2246.field_10056) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_STONE_BRICKS.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10104) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_BRICKS.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10340) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_STONE.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10596) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_COBBLESTONE_SLAB.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10089) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_BRICK_SLAB.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10351) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_COBBLESTONE_SLAB.method_9564());
                        }
                     } else if (_state.method_26204() == class_2246.field_10191) {
                        world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                        if (world instanceof class_3218) {
                           class_3218 _level = (class_3218)world;
                           BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_BRICK_SLAB.method_9564());
                        }
                     }

                     ++sz;
                  }
               }

               ++sy;
            }

            ++sx;
         }
      }

   }
}
