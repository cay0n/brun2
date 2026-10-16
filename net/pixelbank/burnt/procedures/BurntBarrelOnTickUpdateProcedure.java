package net.pixelbank.burnt.procedures;

import net.minecraft.class_1263;
import net.minecraft.class_1799;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class BurntBarrelOnTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      double slot = (double)0.0F;
      if (!world.method_8608()) {
         boolean var10000;
         label163: {
            class_2769 var12 = blockstate.method_26204().method_9595().method_11663("open");
            if (var12 instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)var12;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label163;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            int _value = 1;
            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var70 = _bs.method_26204().method_9595().method_11663("blockstate");
            if (var70 instanceof class_2758) {
               class_2758 _integerProp = (class_2758)var70;
               if (_integerProp.method_11898().contains(_value)) {
                  world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
               }
            }
         } else {
            label156: {
               class_2769 _value = blockstate.method_26204().method_9595().method_11663("open");
               if (_value instanceof class_2746) {
                  class_2746 _getbp5 = (class_2746)_value;
                  if ((Boolean)blockstate.method_11654(_getbp5)) {
                     var10000 = true;
                     break label156;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               int _value = 0;
               class_2338 _pos = class_2338.method_49637(x, y, z);
               class_2680 _bs = world.method_8320(_pos);
               class_2769 var16 = _bs.method_26204().method_9595().method_11663("blockstate");
               if (var16 instanceof class_2758) {
                  class_2758 _integerProp = (class_2758)var16;
                  if (_integerProp.method_11898().contains(_value)) {
                     world.method_8652(_pos, (class_2680)_bs.method_11657(_integerProp, _value), 3);
                  }
               }
            }
         }

         label149: {
            class_2769 index0 = blockstate.method_26204().method_9595().method_11663("hot");
            if (index0 instanceof class_2746) {
               class_2746 _getbp8 = (class_2746)index0;
               if ((Boolean)blockstate.method_11654(_getbp8)) {
                  var10000 = true;
                  break label149;
               }
            }

            var10000 = false;
         }

         if (var10000 && (Boolean)BurntBasicConfigConfiguration.BURN_BARRELS.get()) {
            slot = (double)0.0F;

            for(int index0 = 0; index0 < 27; ++index0) {
               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_LOGS_THAT_BURN)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_LOG)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_BOOKSHELVES)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_BOOKSHELF)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_FENCE_GATES_WOODEN) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_FENCEGATE)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_FENCES) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_FENCE)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_LEAVES)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_LEAVES)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_PLANKS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_PLANKS)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_BUTTONS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 _setstack = world.method_8321(class_2338.method_49637(x, y, z));
                  if (_setstack instanceof class_1263) {
                     class_1263 _container = (class_1263)_setstack;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_LEAVES)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_DOORS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var54 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var54 instanceof class_1263) {
                     class_1263 _container = (class_1263)var54;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_DOOR)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_PRESSURE_PLATES) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var56 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var56 instanceof class_1263) {
                     class_1263 _container = (class_1263)var56;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_PRESSURE_PLATE)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_SLABS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var58 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var58 instanceof class_1263) {
                     class_1263 _container = (class_1263)var58;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_SLAB)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_STAIRS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var60 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var60 instanceof class_1263) {
                     class_1263 _container = (class_1263)var60;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_STAIRS)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOODEN_TRAPDOORS) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var62 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var62 instanceof class_1263) {
                     class_1263 _container = (class_1263)var62;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_TRAPDOOR)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               if (itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_WOOL) && !itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7972().method_31573(BurntTags.ITEM_MC_NON_FLAMMABLE_WOOD)) {
                  class_2586 var64 = world.method_8321(class_2338.method_49637(x, y, z));
                  if (var64 instanceof class_1263) {
                     class_1263 _container = (class_1263)var64;
                     class_1799 _setstack = (new class_1799(BurntModBlocks.BURNT_WOOL)).method_7972();
                     _setstack.method_7939(itemFromBlockInventory(world, class_2338.method_49637(x, y, z), (int)slot).method_7947());
                     _container.method_5447((int)slot, _setstack);
                  }
               }

               ++slot;
            }

            class_2338 _pos = class_2338.method_49637(x, y, z);
            class_2680 _bs = world.method_8320(_pos);
            class_2769 var68 = _bs.method_26204().method_9595().method_11663("hot");
            if (var68 instanceof class_2746) {
               class_2746 _booleanProp = (class_2746)var68;
               world.method_8652(_pos, (class_2680)_bs.method_11657(_booleanProp, false), 3);
            }
         }
      }

   }

   private static class_1799 itemFromBlockInventory(class_1936 world, class_2338 pos, int slot) {
      class_2586 var4 = world.method_8321(pos);
      if (var4 instanceof class_1263 container) {
         return container.method_5438(slot);
      } else {
         return class_1799.field_8037;
      }
   }
}
