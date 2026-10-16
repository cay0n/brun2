package net.pixelbank.burnt.item;

import net.minecraft.class_1269;
import net.minecraft.class_1792;
import net.minecraft.class_1838;
import net.pixelbank.burnt.procedures.SootPlaceProcedure;

public class SootItem extends class_1792 {
   public SootItem() {
      super((new class_1792.class_1793()).method_24359());
   }

   public class_1269 method_7884(class_1838 context) {
      SootPlaceProcedure.execute(context.method_8045(), (double)context.method_8037().method_10263(), (double)context.method_8037().method_10264(), (double)context.method_8037().method_10260(), context.method_8036());
      return class_1269.field_5812;
   }
}
