package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;
import net.pixelbank.burnt.util.BurntProtection;

public class SmolderingMangroveRootsTickProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if ((BurntProtection.stopBurning(world, x, y, z) || (Boolean)BurntBasicConfigConfiguration.RAIN_EXTINGUISH.get()) && (world.method_8401().method_156() || BurntProtection.stopBurning(world, x, y, z))) {
            BurntMod.queueServerWork((int)class_3532.method_15366(world.method_8409(), (double)20.0F, (double)100.0F), () -> {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_MANGROVE_ROOTS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            });
         }

         class_2769 var9 = blockstate.method_26204().method_9595().method_11663("stage");
         int var10000;
         if (var9 instanceof class_2758) {
            class_2758 _getip7 = (class_2758)var9;
            var10000 = (Integer)blockstate.method_11654(_getip7);
         } else {
            var10000 = -1;
         }

         if (var10000 >= 1) {
            if (Math.random() <= BiomeChanceProcedure.execute(world, x, y, z) / (double)100.0F) {
               WillitburnProcedure.execute(world, x, y, z);
            }

            if (Math.random() <= (double)0.25F) {
               class_2338 _bp = class_2338.method_49637(x, y, z);
               class_2680 _bs = BurntModBlocks.BURNT_MANGROVE_ROOTS.method_9564();
               class_2680 _bso = world.method_8320(_bp);
               _bs = BurntBlockUtil.copyProperties(_bso, _bs);
               world.method_8652(_bp, _bs, 3);
            }
         }
      }

   }
}
