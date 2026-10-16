package net.pixelbank.burnt.entity;

import net.minecraft.class_1282;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1314;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2940;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_7923;
import net.pixelbank.burnt.procedures.FallingSlabOnEntityTickUpdateProcedure;

public class FallingSlabEntity extends class_1314 {
   public static final class_2940<String> TEXTURE;
   public static final class_2940<Integer> ANIM;
   private static final int MAX_LIFETIME_TICKS = 200;

   public FallingSlabEntity(class_1299<FallingSlabEntity> type, class_1937 world) {
      super(type, world);
      this.field_6194 = 0;
      this.method_5977(false);
      this.method_18382();
   }

   protected void method_5693(class_2945.class_9222 builder) {
      super.method_5693(builder);
      builder.method_56912(TEXTURE, "falling_planks_entity");
      builder.method_56912(ANIM, 0);
   }

   public void setTexture(String texture) {
      this.field_6011.method_12778(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.field_6011.method_12789(TEXTURE);
   }

   protected void method_5959() {
      super.method_5959();
   }

   public class_3414 method_6011(class_1282 ds) {
      return (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("intentionally_empty"));
   }

   public class_3414 method_6002() {
      return (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("intentionally_empty"));
   }

   public void method_5652(class_2487 compound) {
      super.method_5652(compound);
      compound.method_10582("Texture", this.getTexture());
   }

   public void method_5749(class_2487 compound) {
      super.method_5749(compound);
      if (compound.method_10545("Texture")) {
         this.setTexture(compound.method_10558("Texture"));
      }

   }

   public void method_5670() {
      super.method_5670();
      if (!this.method_37908().method_8608() && this.field_6012 > 200) {
         this.method_31472();
      } else {
         FallingSlabOnEntityTickUpdateProcedure.execute(this.method_37908(), this.method_23317(), this.method_23318(), this.method_23321(), this);
      }
   }

   public class_4048 method_55694(class_4050 pose) {
      return super.method_55694(pose).method_18383(0.8F);
   }

   public static class_5132.class_5133 createAttributes() {
      class_5132.class_5133 builder = class_1308.method_26828();
      builder = builder.method_26868(class_5134.field_23719, 0.3);
      builder = builder.method_26868(class_5134.field_23716, (double)10.0F);
      builder = builder.method_26868(class_5134.field_23724, (double)0.0F);
      builder = builder.method_26868(class_5134.field_23721, (double)3.0F);
      builder = builder.method_26868(class_5134.field_23717, (double)16.0F);
      builder = builder.method_26868(class_5134.field_47761, 0.6);
      return builder;
   }

   static {
      TEXTURE = class_2945.method_12791(FallingSlabEntity.class, class_2943.field_13326);
      ANIM = class_2945.method_12791(FallingSlabEntity.class, class_2943.field_13327);
   }
}
