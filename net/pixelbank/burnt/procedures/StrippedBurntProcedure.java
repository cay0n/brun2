package net.pixelbank.burnt.procedures;

import javax.annotation.Nullable;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntTags;

public class StrippedBurntProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate, class_1297 entity) {
      execute((Object)null, world, x, y, z, blockstate, entity);
   }

   private static void execute(@Nullable Object event, class_1936 world, double x, double y, double z, class_2680 blockstate, class_1297 entity) {
      if (entity != null) {
         if (!world.method_8608()) {
            label336: {
               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BURNT_LOG || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.EMBER_LOG) {
                  class_1799 var10000;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var10000 = _livEnt.method_6047();
                  } else {
                     var10000 = class_1799.field_8037;
                  }

                  if (var10000.method_7909() instanceof class_1743) {
                     if (entity instanceof class_1309) {
                        class_1309 _entity = (class_1309)entity;
                        _entity.method_23667(class_1268.field_5808, true);
                     }

                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_LOG.method_9564();
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     if (world instanceof class_1937) {
                        class_1937 _level = (class_1937)world;
                        if (!_level.method_8608()) {
                           _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                        } else {
                           _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                        }
                     }

                     if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                        class_3218 _level = (class_3218)world;
                        if (entity instanceof class_1309) {
                           class_1309 _livEnt = (class_1309)entity;
                           var10000 = _livEnt.method_6047();
                        } else {
                           var10000 = class_1799.field_8037;
                        }

                        var10000.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                        });
                     }
                     break label336;
                  }
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26164(BurntTags.BLOCK_SMOLDERING_LOGS) || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BLAZING_LOG) {
                  class_1799 var101;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var101 = _livEnt.method_6047();
                  } else {
                     var101 = class_1799.field_8037;
                  }

                  if (var101.method_7909() instanceof class_1743) {
                     if (entity instanceof class_1309) {
                        class_1309 _entity = (class_1309)entity;
                        _entity.method_23667(class_1268.field_5808, true);
                     }

                     class_2769 _livEnt = blockstate.method_26204().method_9595().method_11663("stage");
                     int var106;
                     if (_livEnt instanceof class_2758) {
                        class_2758 _getip21 = (class_2758)_livEnt;
                        var106 = (Integer)blockstate.method_11654(_getip21);
                     } else {
                        var106 = -1;
                     }

                     if (var106 >= 1) {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_STRIPPED_LOG.method_9564(), "stage", 1);
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
                     } else {
                        class_2338 _bp = class_2338.method_49637(x, y, z);
                        class_2680 _bs = BurntModBlocks.SMOLDERING_STRIPPED_LOG.method_9564();
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

                     if (world instanceof class_1937) {
                        class_1937 _level = (class_1937)world;
                        if (!_level.method_8608()) {
                           _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                        } else {
                           _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                        }
                     }

                     if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                        class_3218 _level = (class_3218)world;
                        class_1799 var107;
                        if (entity instanceof class_1309) {
                           class_1309 _livEnt = (class_1309)entity;
                           var107 = _livEnt.method_6047();
                        } else {
                           var107 = class_1799.field_8037;
                        }

                        var107.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                        });
                     }
                     break label336;
                  }
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == ((<undefinedtype>)(new Object() {
                  public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                     class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                     class_2680 var10000;
                     if (_prop instanceof class_2758 _ip) {
                        if (_prop.method_11898().contains(_newValue)) {
                           var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                           return var10000;
                        }
                     }

                     var10000 = _bs;
                     return var10000;
                  }
               })).with(BurntModBlocks.BROKEN_BURNT_LOG.method_9564(), "blockstate", 0).method_26204()) {
                  class_1799 var102;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var102 = _livEnt.method_6047();
                  } else {
                     var102 = class_1799.field_8037;
                  }

                  if (var102.method_7909() instanceof class_1743) {
                     if (entity instanceof class_1309) {
                        class_1309 _entity = (class_1309)entity;
                        _entity.method_23667(class_1268.field_5808, true);
                     }

                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = ((<undefinedtype>)(new Object() {
                        public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                           class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                           class_2680 var10000;
                           if (_prop instanceof class_2758 _ip) {
                              if (_prop.method_11898().contains(_newValue)) {
                                 var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                                 return var10000;
                              }
                           }

                           var10000 = _bs;
                           return var10000;
                        }
                     })).with(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG.method_9564(), "blockstate", 0);
                     class_2680 _bso = world.method_8320(_bp);
                     _bs = BurntBlockUtil.copyProperties(_bso, _bs);
                     world.method_8652(_bp, _bs, 3);
                     if (world instanceof class_1937) {
                        class_1937 _level = (class_1937)world;
                        if (!_level.method_8608()) {
                           _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                        } else {
                           _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                        }
                     }

                     if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                        class_3218 _level = (class_3218)world;
                        if (entity instanceof class_1309) {
                           class_1309 _livEnt = (class_1309)entity;
                           var102 = _livEnt.method_6047();
                        } else {
                           var102 = class_1799.field_8037;
                        }

                        var102.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                        });
                     }
                     break label336;
                  }
               }

               if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == ((<undefinedtype>)(new Object() {
                  public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                     class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                     class_2680 var10000;
                     if (_prop instanceof class_2758 _ip) {
                        if (_prop.method_11898().contains(_newValue)) {
                           var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                           return var10000;
                        }
                     }

                     var10000 = _bs;
                     return var10000;
                  }
               })).with(BurntModBlocks.BROKEN_BURNT_LOG.method_9564(), "blockstate", 1).method_26204()) {
                  class_1799 var103;
                  if (entity instanceof class_1309) {
                     class_1309 _livEnt = (class_1309)entity;
                     var103 = _livEnt.method_6047();
                  } else {
                     var103 = class_1799.field_8037;
                  }

                  if (var103.method_7909() instanceof class_1743) {
                     if (entity instanceof class_1309) {
                        class_1309 _entity = (class_1309)entity;
                        _entity.method_23667(class_1268.field_5808, true);
                     }

                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = ((<undefinedtype>)(new Object() {
                        public class_2680 with(class_2680 _bs, String _property, int _newValue) {
                           class_2769<?> _prop = _bs.method_26204().method_9595().method_11663(_property);
                           class_2680 var10000;
                           if (_prop instanceof class_2758 _ip) {
                              if (_prop.method_11898().contains(_newValue)) {
                                 var10000 = (class_2680)_bs.method_11657(_ip, _newValue);
                                 return var10000;
                              }
                           }

                           var10000 = _bs;
                           return var10000;
                        }
                     })).with(BurntModBlocks.STRIPPED_BROKEN_BURNT_LOG.method_9564(), "blockstate", 1);
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

                     if (world instanceof class_1937) {
                        class_1937 _level = (class_1937)world;
                        if (!_level.method_8608()) {
                           _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                        } else {
                           _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                        }
                     }

                     if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                        class_3218 _level = (class_3218)world;
                        if (entity instanceof class_1309) {
                           class_1309 _livEnt = (class_1309)entity;
                           var103 = _livEnt.method_6047();
                        } else {
                           var103 = class_1799.field_8037;
                        }

                        var103.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                        });
                     }
                  }
               }
            }

            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BURNT_WOOD || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.EMBER_WOOD) {
               class_1799 var109;
               if (entity instanceof class_1309) {
                  class_1309 _livEnt = (class_1309)entity;
                  var109 = _livEnt.method_6047();
               } else {
                  var109 = class_1799.field_8037;
               }

               if (var109.method_7909() instanceof class_1743) {
                  if (entity instanceof class_1309) {
                     class_1309 _entity = (class_1309)entity;
                     _entity.method_23667(class_1268.field_5808, true);
                  }

                  class_2338 _bp = class_2338.method_49637(x, y, z);
                  class_2680 _bs = BurntModBlocks.STRIPPED_BURNT_WOOD.method_9564();
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

                  if (world instanceof class_1937) {
                     class_1937 _level = (class_1937)world;
                     if (!_level.method_8608()) {
                        _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                     } else {
                        _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                     }
                  }

                  if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                     class_3218 _level = (class_3218)world;
                     if (entity instanceof class_1309) {
                        class_1309 _livEnt = (class_1309)entity;
                        var109 = _livEnt.method_6047();
                     } else {
                        var109 = class_1799.field_8037;
                     }

                     var109.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                     });
                  }

                  return;
               }
            }

            if (world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.SMOLDERING_WOOD || world.method_8320(class_2338.method_49637(x, y, z)).method_26204() == BurntModBlocks.BLAZING_WOOD) {
               class_1799 var110;
               if (entity instanceof class_1309) {
                  class_1309 _livEnt = (class_1309)entity;
                  var110 = _livEnt.method_6047();
               } else {
                  var110 = class_1799.field_8037;
               }

               if (var110.method_7909() instanceof class_1743) {
                  if (entity instanceof class_1309) {
                     class_1309 _entity = (class_1309)entity;
                     _entity.method_23667(class_1268.field_5808, true);
                  }

                  class_2769 _bs = blockstate.method_26204().method_9595().method_11663("stage");
                  int var111;
                  if (_bs instanceof class_2758) {
                     class_2758 _getip74 = (class_2758)_bs;
                     var111 = (Integer)blockstate.method_11654(_getip74);
                  } else {
                     var111 = -1;
                  }

                  if (var111 >= 1) {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = blockStateWithInt(BurntModBlocks.SMOLDERING_STRIPPED_WOOD.method_9564(), "stage", 1);
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
                  } else {
                     class_2338 _bp = class_2338.method_49637(x, y, z);
                     class_2680 _bs = BurntModBlocks.SMOLDERING_STRIPPED_WOOD.method_9564();
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

                  if (world instanceof class_1937) {
                     class_1937 _level = (class_1937)world;
                     if (!_level.method_8608()) {
                        _level.method_8396((class_1657)null, class_2338.method_49637(x, y, z), (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F);
                     } else {
                        _level.method_8486(x, y, z, (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("item.axe.strip")), class_3419.field_15254, 1.0F, 1.0F, false);
                     }
                  }

                  if (getEntityGameType(entity) == class_1934.field_9215 && world instanceof class_3218) {
                     class_3218 _level = (class_3218)world;
                     class_1799 var112;
                     if (entity instanceof class_1309) {
                        class_1309 _livEnt = (class_1309)entity;
                        var112 = _livEnt.method_6047();
                     } else {
                        var112 = class_1799.field_8037;
                     }

                     var112.method_7956(1, _level, (class_3222)null, (_stkprov) -> {
                     });
                  }
               }
            }
         }

      }
   }

   private static class_1934 getEntityGameType(class_1297 entity) {
      if (entity instanceof class_3222 serverPlayer) {
         return serverPlayer.field_13974.method_14257();
      } else {
         if (entity instanceof class_1657 player) {
            if (player.method_37908().method_8608()) {
               class_640 playerInfo = class_310.method_1551().method_1562().method_2871(player.method_7334().getId());
               if (playerInfo != null) {
                  return playerInfo.method_2958();
               }
            }
         }

         return null;
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
