package net.pixelbank.burnt.block;

import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_3542;
import net.minecraft.class_2350.class_2352;

public enum VerticalSlabType implements class_3542 {
   NORTH(class_2350.field_11043),
   SOUTH(class_2350.field_11035),
   WEST(class_2350.field_11039),
   EAST(class_2350.field_11034),
   DOUBLE((class_2350)null);

   private final String name;
   public final class_2350 direction;
   public final class_265 shape;

   private VerticalSlabType(class_2350 direction) {
      this.direction = direction;
      if (direction == null) {
         this.name = "double";
         this.shape = class_259.method_1077();
      } else {
         this.name = direction.method_15434();
         boolean high = direction.method_10171() == class_2352.field_11060;
         double min = high ? (double)8.0F : (double)0.0F;
         double max = high ? (double)16.0F : (double)8.0F;
         class_265 var10001;
         switch (direction.method_10166()) {
            case field_11048 -> var10001 = class_2248.method_9541(min, (double)0.0F, (double)0.0F, max, (double)16.0F, (double)16.0F);
            case field_11051 -> var10001 = class_2248.method_9541((double)0.0F, (double)0.0F, min, (double)16.0F, (double)16.0F, max);
            default -> var10001 = class_259.method_1077();
         }

         this.shape = var10001;
      }

   }

   public String method_15434() {
      return this.name;
   }

   public String toString() {
      return this.name;
   }

   public boolean isDouble() {
      return this == DOUBLE;
   }

   public static VerticalSlabType fromDirection(class_2350 direction) {
      for(VerticalSlabType type : values()) {
         if (type.direction == direction) {
            return type;
         }
      }

      return NORTH;
   }

   // $FF: synthetic method
   private static VerticalSlabType[] $values() {
      return new VerticalSlabType[]{NORTH, SOUTH, WEST, EAST, DOUBLE};
   }
}
