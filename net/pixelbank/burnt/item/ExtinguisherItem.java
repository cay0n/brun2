package net.pixelbank.burnt.item;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_1937;
import net.pixelbank.burnt.procedures.ExtinguisherOffLogicProcedure;
import net.pixelbank.burnt.procedures.ExtinguisherOnLogicProcedure;
import net.pixelbank.burnt.procedures.ExtinguisherSprayingProcedure;

public class ExtinguisherItem extends class_1792 {
   public ExtinguisherItem() {
      super((new class_1792.class_1793()).method_7895(1000).method_24359());
   }

   public class_1839 method_7853(class_1799 itemstack) {
      return class_1839.field_8952;
   }

   public int method_7881(class_1799 itemstack, class_1309 livingEntity) {
      return 1000;
   }

   public class_1271<class_1799> method_7836(class_1937 world, class_1657 entity, class_1268 hand) {
      class_1271<class_1799> ar = super.method_7836(world, entity, hand);
      entity.method_6019(hand);
      ExtinguisherOnLogicProcedure.execute(entity);
      return ar;
   }

   public class_1799 method_7861(class_1799 itemstack, class_1937 world, class_1309 entity) {
      class_1799 retval = super.method_7861(itemstack, world, entity);
      double x = entity.method_23317();
      double y = entity.method_23318();
      double z = entity.method_23321();
      ExtinguisherOffLogicProcedure.execute(entity);
      return retval;
   }

   public void method_7888(class_1799 itemstack, class_1937 world, class_1297 entity, int slot, boolean selected) {
      super.method_7888(itemstack, world, entity, slot, selected);
      if (selected) {
         ExtinguisherSprayingProcedure.execute(world, entity, itemstack);
      }

   }

   public void method_7840(class_1799 itemstack, class_1937 world, class_1309 entity, int time) {
      ExtinguisherOffLogicProcedure.execute(entity);
   }
}
