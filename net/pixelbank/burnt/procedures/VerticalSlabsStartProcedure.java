package net.pixelbank.burnt.procedures;

import java.util.Locale;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3542;
import net.pixelbank.burnt.block.VerticalSlabBlock;
import net.pixelbank.burnt.block.VerticalSlabType;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntBlockUtil;

public class VerticalSlabsStartProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      if (!world.method_8608()) {
         class_2338 _bp = class_2338.method_49637(x, y, z);
         class_2680 _bso = world.method_8320(_bp);
         class_2680 _bs = BurntModBlocks.SMOLDERING_VERTICAL_SLAB.method_9564();
         _bs = BurntBlockUtil.copyProperties(_bso, _bs);
         _bs = mapType(_bso, _bs);
         class_2769 var11 = _bs.method_26204().method_9595().method_11663("stage");
         if (var11 instanceof class_2758) {
            class_2758 _stage = (class_2758)var11;
            if (_stage.method_11898().contains(1)) {
               _bs = (class_2680)_bs.method_11657(_stage, 1);
            }
         }

         world.method_8652(_bp, _bs, 3);
      }
   }

   private static class_2680 mapType(class_2680 src, class_2680 dst) {
      class_2769<?> srcType = src.method_26204().method_9595().method_11663("type");
      if (srcType == null) {
         return dst;
      } else {
         Comparable<?> value = src.method_11654(srcType);
         String var10000;
         if (value instanceof class_3542) {
            class_3542 sr = (class_3542)value;
            var10000 = sr.method_15434();
         } else {
            var10000 = String.valueOf(value).toLowerCase(Locale.ROOT);
         }

         String name = var10000;

         for(VerticalSlabType type : VerticalSlabType.values()) {
            if (type.method_15434().equals(name)) {
               return (class_2680)dst.method_11657(VerticalSlabBlock.TYPE, type);
            }
         }

         return dst;
      }
   }
}
