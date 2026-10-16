package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3730;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModEntities;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntCollapseBudget;
import net.pixelbank.burnt.util.BurntTags;

public class RandomCollapseProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608() && (Boolean)BurntBasicConfigConfiguration.COLLAPSE.get()) {
         if (!BurntCollapseBudget.hasHeadroom(world)) {
            return;
         }

         if (Math.random() <= (Double)BurntBasicConfigConfiguration.COLLAPSE_CHANCE.get() / (double)500.0F) {
            sx = (double)-3.0F;

            for(int index0 = 0; index0 < 6; ++index0) {
               sy = (double)-3.0F;

               for(int index1 = 0; index1 < 6; ++index1) {
                  sz = (double)-3.0F;

                  for(int index2 = 0; index2 < 6; ++index2) {
                     class_2338 _below = class_2338.method_49637(x + sx, y + sy - (double)1.0F, z + sz);
                     if (world.method_22340(_below) && world.method_8320(_below).method_26204() == class_2246.field_10124) {
                        class_2338 _cell = class_2338.method_49637(x + sx, y + sy, z + sz);
                        class_2680 _state = world.method_8320(_cell);
                        if (_state.method_26204() == BurntModBlocks.BURNT_PLANKS) {
                           world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                           if (world instanceof class_3218) {
                              class_3218 _level = (class_3218)world;
                              BurntCollapseBudget.noteSpawn(world);
                              class_1297 entityToSpawn = BurntModEntities.FALLING_SLAB.method_47821(_level, class_2338.method_49637(x + sx, y + sy - (double)0.5F, z + sz), class_3730.field_16471);
                              if (entityToSpawn != null) {
                              }
                           }
                        } else if (_state.method_26164(BurntTags.BLOCK_BURNING_PLANKS)) {
                           if (Math.random() <= 0.3) {
                              world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                              if (world instanceof class_3218) {
                                 class_3218 _level = (class_3218)world;
                                 BurntCollapseBudget.noteSpawn(world);
                                 class_1297 entityToSpawn = BurntModEntities.FALLING_SLAB.method_47821(_level, class_2338.method_49637(x + sx, y + sy - (double)0.5F, z + sz), class_3730.field_16471);
                                 if (entityToSpawn != null) {
                                 }
                              }
                           }
                        } else if (_state.method_26204() == class_2246.field_10445) {
                           world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                           if (world instanceof class_3218) {
                              class_3218 _level = (class_3218)world;
                              BurntBlockUtil.fallNoDrop(_level, _cell, BurntModBlocks.SOOTY_COBBLESTONE.method_9564());
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
                        } else if (_state.method_26204() == BurntModBlocks.BURNT_STAIRS) {
                           if (Math.random() <= 0.3) {
                              world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                              if (world instanceof class_3218) {
                                 class_3218 _level = (class_3218)world;
                                 BurntCollapseBudget.noteSpawn(world);
                                 class_1297 entityToSpawn = BurntModEntities.FALLING_SLAB.method_47821(_level, class_2338.method_49637(x + sx, y + sy - (double)1.0F, z + sz), class_3730.field_16471);
                                 if (entityToSpawn != null) {
                                 }
                              }
                           }
                        } else if (_state.method_26204() == BurntModBlocks.FALLING_BURNT_SLAB && Math.random() <= 0.2) {
                           world.method_8652(_cell, class_2246.field_10124.method_9564(), 3);
                           if (world instanceof class_3218) {
                              class_3218 _level = (class_3218)world;
                              BurntCollapseBudget.noteSpawn(world);
                              class_1297 entityToSpawn = BurntModEntities.FALLING_SLAB.method_47821(_level, class_2338.method_49637(x + sx, y + sy - (double)1.0F, z + sz), class_3730.field_16471);
                              if (entityToSpawn != null) {
                              }
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
}
