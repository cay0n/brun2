package net.pixelbank.burnt.entity;

import javax.annotation.Nullable;
import net.minecraft.class_1266;
import net.minecraft.class_1282;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1315;
import net.minecraft.class_1588;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2940;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3730;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_5425;
import net.minecraft.class_7923;
import net.pixelbank.burnt.procedures.SparkOnInitialEntitySpawnProcedure;

public class SparkEntity extends class_1588 {
   public static final class_2940<String> TEXTURE;
   public static final class_2940<Integer> ANIM;

   public SparkEntity(class_1299<SparkEntity> type, class_1937 world) {
      super(type, world);
      this.field_6194 = 0;
      this.method_5977(true);
      this.method_5971();
   }

   protected void method_5693(class_2945.class_9222 builder) {
      super.method_5693(builder);
      builder.method_56912(TEXTURE, "blank");
      builder.method_56912(ANIM, 0);
   }

   public void setTexture(String texture) {
      this.field_6011.method_12778(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.field_6011.method_12789(TEXTURE);
   }

   public boolean method_5974(double distanceToClosestPlayer) {
      return false;
   }

   public class_3414 method_6011(class_1282 ds) {
      return (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.generic.hurt"));
   }

   public class_3414 method_6002() {
      return (class_3414)class_7923.field_41172.method_10223(class_2960.method_60654("entity.generic.death"));
   }

   public class_1315 method_5943(class_5425 world, class_1266 difficulty, class_3730 reason, @Nullable class_1315 livingdata) {
      class_1315 retval = super.method_5943(world, difficulty, reason, livingdata);
      SparkOnInitialEntitySpawnProcedure.execute(world, this.method_23317(), this.method_23318(), this.method_23321(), this);
      return retval;
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
      TEXTURE = class_2945.method_12791(SparkEntity.class, class_2943.field_13326);
      ANIM = class_2945.method_12791(SparkEntity.class, class_2943.field_13327);
   }
}
