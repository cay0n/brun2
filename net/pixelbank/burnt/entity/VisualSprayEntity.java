package net.pixelbank.burnt.entity;

import net.minecraft.class_1299;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_3856;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.procedures.SprayWhileProjectileFlyingTickProcedure;

public class VisualSprayEntity extends class_1665 implements class_3856 {
   public VisualSprayEntity(class_1299<? extends VisualSprayEntity> type, class_1937 world) {
      super(type, world);
   }

   protected void method_24920(class_3965 blockHitResult) {
      this.method_31472();
   }

   protected void method_7454(class_3966 entityHitResult) {
      this.method_31472();
   }

   public void method_5694(class_1657 entity) {
   }

   public void method_5773() {
      super.method_5773();
      SprayWhileProjectileFlyingTickProcedure.execute(this.method_37908(), this.method_23317(), this.method_23318(), this.method_23321(), this);
      if (this.field_7588) {
         this.method_31472();
      }

   }

   public class_1799 method_7495() {
      return new class_1799(BurntModItems.EXTINGUISHER_SPRAY);
   }

   protected class_1799 method_57314() {
      return new class_1799(BurntModItems.EXTINGUISHER_SPRAY);
   }
}
