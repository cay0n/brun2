package net.pixelbank.burnt.item;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.pixelbank.burnt.procedures.FireballThrownProcedure;

public class FireballItemItem extends class_1792 {
   public FireballItemItem() {
      super(new class_1792.class_1793());
   }

   public class_1271<class_1799> method_7836(class_1937 world, class_1657 entity, class_1268 hand) {
      class_1271<class_1799> ar = super.method_7836(world, entity, hand);
      FireballThrownProcedure.execute(world, entity);
      return ar;
   }
}
