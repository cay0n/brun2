package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class LeavesStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double rnd = (double)0.0F;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8401().method_156()) {
            if (!IsRainingProcedure.execute(world, x, y, z)) {
               boolean var10000;
               label236: {
                  done = false;
                  class_2769 var11 = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
                  if (var11 instanceof class_2746) {
                     class_2746 _getbp3 = (class_2746)var11;
                     if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp3)) {
                        var10000 = true;
                        break label236;
                     }
                  }

                  var10000 = false;
               }

               if (!var10000) {
                  if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10035) {
                     if (Math.random() <= 0.2) {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = BurntModBlocks.SMOLDERING_DARK_OAK_LEAVES.method_9564();
                        class_2680 _bso = world.method_8320(_bp);
                        _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                        world.method_8652(_bp, _bs, 3);
                     }

                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10503) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9988) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10539) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_BIRCH_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10335) {
                     if (Math.random() <= (double)0.5F) {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = BurntModBlocks.SMOLDERING_JUNGLE_LEAVES.method_9564();
                        class_2680 _bso = world.method_8320(_bp);
                        _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                        world.method_8652(_bp, _bs, 3);
                     }

                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10098) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_ACACIA_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37551) {
                     if (Math.random() <= 0.2) {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = BurntModBlocks.SMOLDERING_MANGROVE_LEAVES.method_9564();
                        class_2680 _bso = world.method_8320(_bp);
                        _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                        world.method_8652(_bp, _bs, 3);
                     }

                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42731) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_leaves")) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_PALE_OAK_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28673) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28674) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LEAVES) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_foliage")) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  } else if (!done) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     done = true;
                  }
               }
            }
         } else {
            boolean var156;
            label181: {
               done = false;
               class_2769 _bp = world.method_8320(class_2338.method_49637(x, y, z)).method_26204().method_9595().method_11663("waterlogged");
               if (_bp instanceof class_2746) {
                  class_2746 _getbp44 = (class_2746)_bp;
                  if ((Boolean)world.method_8320(class_2338.method_49637(x, y, z)).method_11654(_getbp44)) {
                     var156 = true;
                     break label181;
                  }
               }

               var156 = false;
            }

            if (!var156) {
               if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10503) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_9988) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10539) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_BIRCH_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10335) {
                  if (Math.random() <= 0.3) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_JUNGLE_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10098) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_ACACIA_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10035) {
                  if (Math.random() <= 0.2) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_DARK_OAK_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37551) {
                  if (Math.random() <= 0.2) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_MANGROVE_LEAVES.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                  }

                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42731) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_leaves")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_PALE_OAK_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28673) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_28674) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done && world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_LEAVES) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_SPRUCE_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("the_flesh_that_hates:flesh_foliage")) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_CHERRY_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               } else if (!done) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.BURNT_LEAVES.method_9564();
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  world.method_8652(_bp, _bs, 3);
                  done = true;
               }
            }
         }
      }

   }
}
