package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntVanilla;

public class StairsStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      double sx = (double)0.0F;
      double sy = (double)0.0F;
      double sz = (double)0.0F;
      boolean found = false;
      boolean done = false;
      if (!world.method_8608()) {
         if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10563) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var18 = BurntModBlocks.SOOTY_OAK_STAIRS.method_9595().method_11663("hot");
            class_2680 var10000;
            if (var18 instanceof class_2746) {
               class_2746 _withbp3 = (class_2746)var18;
               var10000 = (class_2680)BurntModBlocks.SOOTY_OAK_STAIRS.method_9564().method_11657(_withbp3, true);
            } else {
               var10000 = BurntModBlocks.SOOTY_OAK_STAIRS.method_9564();
            }

            class_2680 _bs = var10000;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var29) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 _be = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (_be instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)_be;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10569) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 _be = BurntModBlocks.SOOTY_SPRUCE_STAIRS.method_9595().method_11663("hot");
            class_2680 var143;
            if (_be instanceof class_2746) {
               class_2746 _withbp8 = (class_2746)_be;
               var143 = (class_2680)BurntModBlocks.SOOTY_SPRUCE_STAIRS.method_9564().method_11657(_withbp8, true);
            } else {
               var143 = BurntModBlocks.SOOTY_SPRUCE_STAIRS.method_9564();
            }

            class_2680 _bs = var143;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var28) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 _be = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (_be instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)_be;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10408) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 _be = BurntModBlocks.SOOTY_BIRCH_STAIRS.method_9595().method_11663("hot");
            class_2680 var144;
            if (_be instanceof class_2746) {
               class_2746 _withbp13 = (class_2746)_be;
               var144 = (class_2680)BurntModBlocks.SOOTY_BIRCH_STAIRS.method_9564().method_11657(_withbp13, true);
            } else {
               var144 = BurntModBlocks.SOOTY_BIRCH_STAIRS.method_9564();
            }

            class_2680 _bs = var144;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var27) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var110 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var110 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var110;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10122) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var111 = BurntModBlocks.SOOTY_JUNGLE_STAIRS.method_9595().method_11663("hot");
            class_2680 var145;
            if (var111 instanceof class_2746) {
               class_2746 _withbp18 = (class_2746)var111;
               var145 = (class_2680)BurntModBlocks.SOOTY_JUNGLE_STAIRS.method_9564().method_11657(_withbp18, true);
            } else {
               var145 = BurntModBlocks.SOOTY_JUNGLE_STAIRS.method_9564();
            }

            class_2680 _bs = var145;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var26) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var114 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var114 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var114;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10256) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var115 = BurntModBlocks.SOOTY_ACACIA_STAIRS.method_9595().method_11663("hot");
            class_2680 var146;
            if (var115 instanceof class_2746) {
               class_2746 _withbp23 = (class_2746)var115;
               var146 = (class_2680)BurntModBlocks.SOOTY_ACACIA_STAIRS.method_9564().method_11657(_withbp23, true);
            } else {
               var146 = BurntModBlocks.SOOTY_ACACIA_STAIRS.method_9564();
            }

            class_2680 _bs = var146;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var25) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var118 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var118 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var118;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_10616) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var119 = BurntModBlocks.SOOTY_DARK_OAK_STAIRS.method_9595().method_11663("hot");
            class_2680 var147;
            if (var119 instanceof class_2746) {
               class_2746 _withbp28 = (class_2746)var119;
               var147 = (class_2680)BurntModBlocks.SOOTY_DARK_OAK_STAIRS.method_9564().method_11657(_withbp28, true);
            } else {
               var147 = BurntModBlocks.SOOTY_DARK_OAK_STAIRS.method_9564();
            }

            class_2680 _bs = var147;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var24) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var122 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var122 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var122;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_37561) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var123 = BurntModBlocks.SOOTY_MANGROVE_STAIRS.method_9595().method_11663("hot");
            class_2680 var148;
            if (var123 instanceof class_2746) {
               class_2746 _withbp33 = (class_2746)var123;
               var148 = (class_2680)BurntModBlocks.SOOTY_MANGROVE_STAIRS.method_9564().method_11657(_withbp33, true);
            } else {
               var148 = BurntModBlocks.SOOTY_MANGROVE_STAIRS.method_9564();
            }

            class_2680 _bs = var148;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var23) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var126 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var126 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var126;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == class_2246.field_42744) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var127 = BurntModBlocks.SOOTY_CHERRY_STAIRS.method_9595().method_11663("hot");
            class_2680 var149;
            if (var127 instanceof class_2746) {
               class_2746 _withbp38 = (class_2746)var127;
               var149 = (class_2680)BurntModBlocks.SOOTY_CHERRY_STAIRS.method_9564().method_11657(_withbp38, true);
            } else {
               var149 = BurntModBlocks.SOOTY_CHERRY_STAIRS.method_9564();
            }

            class_2680 _bs = var149;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var22) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var130 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var130 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var130;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if (BurntVanilla.is(world.method_8320(class_2338.method_49637(x, y, z)), "pale_oak_stairs")) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2769 var131 = BurntModBlocks.SOOTY_PALE_OAK_STAIRS.method_9595().method_11663("hot");
            class_2680 var150;
            if (var131 instanceof class_2746) {
               class_2746 _withbppo38 = (class_2746)var131;
               var150 = (class_2680)BurntModBlocks.SOOTY_PALE_OAK_STAIRS.method_9564().method_11657(_withbppo38, true);
            } else {
               var150 = BurntModBlocks.SOOTY_PALE_OAK_STAIRS.method_9564();
            }

            class_2680 _bs = var150;
            class_2680 _bso = world.method_8320(_bp);
            _bs = BurntBlockUtil.copyProperties(_bso, _bs);
            class_2586 _be = world.method_8321(_bp);
            class_2487 _bnbt = null;
            if (_be != null) {
               _bnbt = _be.method_38242(world.method_30349());
               _be.method_11012();
            }

            world.method_8652(_bp, _bs, 3);
            if (_bnbt != null) {
               _be = world.method_8321(_bp);
               if (_be != null) {
                  try {
                     _be.method_58690(_bnbt, world.method_30349());
                  } catch (Exception var21) {
                  }
               }
            }

            _bp = class_2338.method_49637(x, y, z);
            _bs = world.method_8320(_bp);
            class_2769 var134 = _bs.method_26204().method_9595().method_11663("waterlogged");
            if (var134 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var134;
               world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         } else if ((world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_MC_WOODEN_STAIRS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_BURNS_TO_SMOLDERING_STAIRS)) && !world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_FIRE_RESISTANT)) {
            class_2248 _origBlock = world.method_8320(class_2338.method_49637(x, y, z)).method_26204();
            BurntMod.queueServerWork(class_3532.method_15395(world.method_8409(), 1, 200), () -> {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == _origBlock) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_STAIRS.method_9564(), "stage", 1);
                  class_2680 _bso = world.method_8320(_bp);
                  _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                  class_2586 _be = world.method_8321(_bp);
                  class_2487 _bnbt = null;
                  if (_be != null) {
                     _bnbt = _be.method_38242(world.method_30349());
                     _be.method_11012();
                  }

                  world.method_8652(_bp, _bs, 3);
                  if (_bnbt != null) {
                     _be = world.method_8321(_bp);
                     if (_be != null) {
                        try {
                           _be.method_58690(_bnbt, world.method_30349());
                        } catch (Exception var14) {
                        }
                     }
                  }

                  _bp = class_2338.method_49637(x, y, z);
                  _bs = world.method_8320(_bp);
                  class_2769 patt0$temp = _bs.method_26204().method_9595().method_11663("waterlogged");
                  if (patt0$temp instanceof class_2746) {
                     class_2746 _booleanProp = (class_2746)patt0$temp;
                     world.method_8652(_bp, (class_2680)_bs.method_11657(_booleanProp, false), 3);
                  }

               }
            });
         }
      }

   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
