package net.pixelbank.burnt.item;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1271;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import net.minecraft.class_1937;
import net.minecraft.class_4174;
import net.pixelbank.burnt.procedures.EmberBerriesPlaceProcedure;

public class EmberBerriesItem extends class_1792 {
   public EmberBerriesItem() {
      super((new class_1792.class_1793()).method_24359().method_19265((new class_4174.class_4175()).method_19238(4).method_19237(0.3F).method_19240().method_19242()));
   }

   public class_1271<class_1799> method_7836(class_1937 world, class_1657 entity, class_1268 hand) {
      class_1271<class_1799> ar = super.method_7836(world, entity, hand);
      EmberBerriesPlaceProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321());
      return ar;
   }

   public class_1269 method_7884(class_1838 context) {
      super.method_7884(context);
      EmberBerriesPlaceProcedure.execute(context.method_8045(), (double)context.method_8037().method_10263(), (double)context.method_8037().method_10264(), (double)context.method_8037().method_10260());
      return class_1269.field_5812;
   }
}
