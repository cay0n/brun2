package net.pixelbank.burnt.procedures;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2165;
import net.minecraft.class_2168;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingCreateSailTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if (BurntProtection.stopBurning(world, x, y, z)) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bsCurrent = world.method_8320(_bp);
            class_2680 _bs = BurntModBlocks.BURNT_SAIL.method_9564();
            class_2769 var29 = _bsCurrent.method_26204().method_9595().method_11663("facing");
            if (var29 instanceof class_2753) {
               class_2753 _fp = (class_2753)var29;
               var29 = _bs.method_26204().method_9595().method_11663("facing");
               if (var29 instanceof class_2753) {
                  class_2753 _nfp = (class_2753)var29;
                  _bs = (class_2680)_bs.method_11657(_nfp, (class_2350)_bsCurrent.method_11654(_fp));
               }
            }

            world.method_8652(_bp, _bs, 3);
            return;
         }

         if (IsRainingProcedure.isGloballyRaining(world) && (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) {
            class_2338 _bp = class_2338.method_49637(x, y, z);
            class_2680 _bsCurrent = world.method_8320(_bp);
            class_2680 _bs = BurntModBlocks.BURNT_SAIL.method_9564();
            class_2769 var27 = _bsCurrent.method_26204().method_9595().method_11663("facing");
            if (var27 instanceof class_2753) {
               class_2753 _fp = (class_2753)var27;
               var27 = _bs.method_26204().method_9595().method_11663("facing");
               if (var27 instanceof class_2753) {
                  class_2753 _nfp = (class_2753)var27;
                  _bs = (class_2680)_bs.method_11657(_nfp, (class_2350)_bsCurrent.method_11654(_fp));
               }
            }

            world.method_8652(_bp, _bs, 3);
            return;
         }

         boolean var10000;
         label58: {
            class_2769 _bsCurrent = blockstate.method_26204().method_9595().method_11663("hot");
            if (_bsCurrent instanceof class_2746) {
               class_2746 _getbp2 = (class_2746)_bsCurrent;
               if ((Boolean)blockstate.method_11654(_getbp2)) {
                  var10000 = true;
                  break label58;
               }
            }

            var10000 = false;
         }

         if (var10000 && Math.random() <= 0.02) {
            WillitburnProcedure.execute(world, x, y, z);
            if (Math.random() <= (double)0.75F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bsCurrent = world.method_8320(_bp);
               class_2680 _bs = BurntModBlocks.BURNT_SAIL.method_9564();
               class_2769 var14 = _bsCurrent.method_26204().method_9595().method_11663("facing");
               if (var14 instanceof class_2753) {
                  class_2753 _fp = (class_2753)var14;
                  var14 = _bs.method_26204().method_9595().method_11663("facing");
                  if (var14 instanceof class_2753) {
                     class_2753 _nfp = (class_2753)var14;
                     _bs = (class_2680)_bs.method_11657(_nfp, (class_2350)_bsCurrent.method_11654(_fp));
                  }
               }

               world.method_8652(_bp, _bs, 3);
            } else {
               world.method_22352(class_2338.method_49637(x, y, z), false);
            }
         }

         if (FabricLoader.getInstance().isModLoaded("cold_sweat") && Math.random() <= (double)0.25F && !world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014((double)2.0F), (e) -> true).isEmpty()) {
            if (world instanceof class_3218) {
               class_3218 _level = (class_3218)world;
               _level.method_8503().method_3734().method_44252((new class_2168(class_2165.field_17395, new class_243(x, y, z), class_241.field_1340, _level, 4, "", class_2561.method_43470(""), _level.method_8503(), (class_1297)null)).method_9217(), "/temp modify @p addition world 0.1 false");
            }

            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)200.0F, (double)500.0F), () -> {
               if (world instanceof class_3218 _level) {
                  _level.method_8503().method_3734().method_44252((new class_2168(class_2165.field_17395, new class_243(x, y, z), class_241.field_1340, _level, 4, "", class_2561.method_43470(""), _level.method_8503(), (class_1297)null)).method_9217(), "/temp modify @p addition world -0.1 false");
               }

            });
         }
      }

   }
}
