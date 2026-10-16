package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class LeafPileCatchProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      boolean found = false;
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      if (!world.method_8608()) {
         sx = (double)-1.0F;

         for(int index0 = 0; index0 < 3; ++index0) {
            sy = (double)-1.0F;

            for(int index1 = 0; index1 < 3; ++index1) {
               sz = (double)-1.0F;

               for(int index2 = 0; index2 < 3; ++index2) {
                  boolean var10000;
                  label106: {
                     class_2769 var18 = world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204().method_9595().method_11663("waterlogged");
                     if (var18 instanceof class_2746) {
                        class_2746 _getbp2 = (class_2746)var18;
                        if ((Boolean)world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_11654(_getbp2)) {
                           var10000 = true;
                           break label106;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_10503) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_9988) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_10539) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_BIRCH_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_10335) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_JUNGLE_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_10098) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_ACACIA_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_10035) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_DARK_OAK_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_37551) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_MANGROVE_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_42731) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_28673) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26204() == class_2246.field_28674) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564(), 3);
                        }
                     } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)), "pale_oak_leaves")) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_PALE_OAK_LEAVES.method_9564(), 3);
                        }
                     } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)), "azalea_leaves")) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_PALE_OAK_LEAVES.method_9564(), 3);
                        }
                     } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)), "flowering_azalea_leaves")) {
                        if (Math.random() <= 0.6) {
                           world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_PALE_OAK_LEAVES.method_9564(), 3);
                        }
                     } else if (world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_MC_LEAVES) && !world.method_8320(class_2338.method_49637(x + sx, y + sy, z + sz)).method_26164(BurntTags.BLOCK_NO_BURN) && Math.random() <= 0.6) {
                        world.method_8652(class_2338.method_49637(x + sx, y + sy, z + sz), BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564(), 3);
                     }
                  }

                  ++sz;
               }

               ++sy;
            }

            ++sx;
         }
      }

   }
}
