package net.pixelbank.burnt.procedures;

import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class SmolderingCaveVinesPlantUpdateTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         if (!world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26164(BurntTags.BLOCK_MC_CAVE_VINES) || world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_10124) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28675) {
            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = class_2246.field_28676.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.2 && world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28676) {
            class_2248 var10000 = world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204();
            class_2769 _bs = class_2246.field_28676.method_9595().method_11663("berries");
            class_2680 var10001;
            if (_bs instanceof class_2746) {
               class_2746 _withbp12 = (class_2746)_bs;
               var10001 = (class_2680)class_2246.field_28676.method_9564().method_11657(_withbp12, true);
            } else {
               var10001 = class_2246.field_28676.method_9564();
            }

            if (var10000 == var10001.method_26204() && world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               class_1542 entityToSpawn = new class_1542(_level, x, y + (double)1.0F, z, new class_1799(BurntModItems.EMBER_BERRIES));
               entityToSpawn.method_6982(10);
               _level.method_8649(entityToSpawn);
            }

            class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
            class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }

         if (Math.random() <= 0.06) {
            if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_28675) {
               class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == class_2246.field_28676) {
               class_2248 var39 = world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204();
               class_2769 var26 = class_2246.field_28676.method_9595().method_11663("berries");
               class_2680 var40;
               if (var26 instanceof class_2746) {
                  class_2746 _withbp22 = (class_2746)var26;
                  var40 = (class_2680)class_2246.field_28676.method_9564().method_11657(_withbp22, true);
               } else {
                  var40 = class_2246.field_28676.method_9564();
               }

               if (var39 == var40.method_26204() && world instanceof class_3218) {
                  class_3218 _level = (class_3218)world;
                  class_1542 entityToSpawn = new class_1542(_level, x, y - (double)1.0F, z, new class_1799(BurntModItems.EMBER_BERRIES));
                  entityToSpawn.method_6982(10);
                  _level.method_8649(entityToSpawn);
               }

               class_2338 _bp = class_2338.method_49637(x, y - (double)1.0F, z);
               class_2680 _bs = BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }

         if (Math.random() <= 0.03) {
            if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_28676) {
               world.method_8652(class_2338.method_49637(x + (double)1.0F, y, z), copyProps(world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)), BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564()), 3);
            } else if (world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)).method_26204() == class_2246.field_28675) {
               world.method_8652(class_2338.method_49637(x + (double)1.0F, y, z), copyProps(world.method_8320(class_2338.method_49637(x + (double)1.0F, y, z)), BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564()), 3);
            }
         }

         if (Math.random() <= 0.03) {
            if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_28676) {
               world.method_8652(class_2338.method_49637(x - (double)1.0F, y, z), copyProps(world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)), BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564()), 3);
            } else if (world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)).method_26204() == class_2246.field_28675) {
               world.method_8652(class_2338.method_49637(x - (double)1.0F, y, z), copyProps(world.method_8320(class_2338.method_49637(x - (double)1.0F, y, z)), BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564()), 3);
            }
         }

         if (Math.random() <= 0.03) {
            if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_28676) {
               world.method_8652(class_2338.method_49637(x, y, z + (double)1.0F), copyProps(world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)), BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564()), 3);
            } else if (world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)).method_26204() == class_2246.field_28675) {
               world.method_8652(class_2338.method_49637(x, y, z + (double)1.0F), copyProps(world.method_8320(class_2338.method_49637(x, y, z + (double)1.0F)), BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564()), 3);
            }
         }

         if (Math.random() <= 0.03) {
            if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_28676) {
               world.method_8652(class_2338.method_49637(x, y, z - (double)1.0F), copyProps(world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)), BurntModBlocks.SMOLDERING_CAVE_VINES_PLANT.method_9564()), 3);
            } else if (world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)).method_26204() == class_2246.field_28675) {
               world.method_8652(class_2338.method_49637(x, y, z - (double)1.0F), copyProps(world.method_8320(class_2338.method_49637(x, y, z - (double)1.0F)), BurntModBlocks.SMOLDERING_CAVE_VINES.method_9564()), 3);
            }
         }

         if (Math.random() <= 0.006) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bs = BurntModBlocks.BURNING_CAVE_VINES_PLANT.method_9564();
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            world.method_8652(_bp, _bs, 3);
         }
      }

   }

   private static class_2680 copyProps(class_2680 src, class_2680 dest) {
      for(class_2769<?> prop : src.method_28501()) {
         class_2769 destProp = dest.method_26204().method_9595().method_11663(prop.method_11899());
         if (destProp != null && dest.method_11654(destProp) != null) {
            try {
               dest = (class_2680)dest.method_11657(destProp, src.method_11654(prop));
            } catch (Exception var6) {
            }
         }
      }

      return dest;
   }
}
