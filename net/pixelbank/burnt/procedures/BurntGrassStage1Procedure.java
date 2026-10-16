package net.pixelbank.burnt.procedures;

import com.google.gson.JsonObject;
import java.io.File;
import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class BurntGrassStage1Procedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      new JsonObject();
      new File("");
      double fireSpeed = (double)0.0F;
      boolean done = false;
      if (!world.method_8608()) {
         class_2338 _abovePos = class_2338.method_49637(x, y + (double)1.0F, z);
         if (world.method_8320(_abovePos).method_26204() == class_2246.field_10477) {
            world.method_22352(_abovePos, false);
         }

         if (BurntProtection.stopBurning(world, x, y, z)) {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
            return;
         }

         if ((Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
            if ((Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
               boolean rainHitsBlock = IsRainingProcedure.execute(world, x, y, z);
               if (rainHitsBlock) {
                  world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
               } else if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
                  if (Math.random() <= BurntModVariables.MapVariables.get(world).windSpeed / (double)100.0F) {
                     if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477) {
                        world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
                     }

                     if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28680) {
                        class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                        class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1);
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
                     }

                     if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28678 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28679) {
                        class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                        class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
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
                     }

                     if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS.method_9564(), "stage", 2);
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
                     }
                  }
               } else if (Math.random() <= Math.pow(Math.min((Double)BurntBasicConfigConfiguration.BURN_SPREAD.get() / (double)100.0F, (double)1.0F), (double)1.5F)) {
                  if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477) {
                     world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
                  }

                  if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28680) {
                     class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1);
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
                  }

                  if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28678 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28679) {
                     class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
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
                  }

                  if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS.method_9564(), "stage", 2);
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
                  }
               }
            } else if (!(Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get() && Math.random() <= 0.2) {
               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_10477) {
                  world.method_22352(class_2338.method_49637(x, y + (double)1.0F, z), false);
               }

               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28680) {
                  class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_MOSS_CARPET.method_9564(), "stage", 1);
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
               }

               if (world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28678 || world.method_8320(class_2338.method_49637(x, y + (double)1.0F, z)).method_26204() == class_2246.field_28679) {
                  class_2338 _bp = class_2338.method_49637(x, y + (double)1.0F, z);
                  class_2680 _bs = BurntModBlocks.SMOLDERING_AZALEA.method_9564();
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
               }

               if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get() / (double)2.0F), (e) -> true).isEmpty()) {
                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS.method_9564(), "stage", 2);
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
                        } catch (Exception var20) {
                        }
                     }
                  }
               }
            }
         } else {
            world.method_8652(class_2338.method_49637(x, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
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
