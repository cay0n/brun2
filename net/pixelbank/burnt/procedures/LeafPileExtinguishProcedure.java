package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_7923;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class LeafPileExtinguishProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608() && class_7923.field_41175.method_10221(world.method_8320(class_2338.method_49637(x, y, z)).method_26204()).toString().equals("immersive_weathering:burnt/smoldering_leaf_pile")) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bs = BurntModBlocks.SMOLDERING_OAK_LEAVES.method_9564();
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
               } catch (Exception var13) {
               }
            }
         }
      }

   }
}
