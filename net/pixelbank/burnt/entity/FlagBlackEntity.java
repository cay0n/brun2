package net.pixelbank.burnt.entity;

import net.minecraft.class_1282;
import net.minecraft.class_1295;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1331;
import net.minecraft.class_1407;
import net.minecraft.class_1408;
import net.minecraft.class_1588;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1686;
import net.minecraft.class_1927;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2680;
import net.minecraft.class_2940;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_7094;
import net.minecraft.class_7923;
import net.minecraft.class_8111;
import net.pixelbank.burnt.procedures.FlagOnEntityTickUpdateProcedure;
import net.pixelbank.burnt.procedures.FullPlaybackConditionProcedure;
import net.pixelbank.burnt.procedures.HighPlaybackConditionProcedure;
import net.pixelbank.burnt.procedures.LowPlaybackConditionProcedure;
import net.pixelbank.burnt.procedures.MediumPlaybackConditionProcedure;
import net.pixelbank.burnt.procedures.NoWindPlaybackConditionProcedure;
import net.pixelbank.burnt.procedures.StrongPlaybackConditionProcedure;

public class FlagBlackEntity extends class_1588 {
   public static final class_2940<String> TEXTURE;
   public static final class_2940<Integer> ANIM;
   public static final class_2940<Integer> DATA_windSpeed;
   public final class_7094 animationState0 = new class_7094();
   public final class_7094 animationState1 = new class_7094();
   public final class_7094 animationState2 = new class_7094();
   public final class_7094 animationState3 = new class_7094();
   public final class_7094 animationState4 = new class_7094();
   public final class_7094 animationState5 = new class_7094();

   public FlagBlackEntity(class_1299<FlagBlackEntity> type, class_1937 world) {
      super(type, world);
      this.field_6194 = 0;
      this.method_5977(true);
      this.method_5971();
      this.field_6207 = new class_1331(this, 10, true);
   }

   public void method_5674(class_2940<?> data) {
      if (ANIM.equals(data)) {
         switch ((Integer)this.field_6011.method_12789(ANIM)) {
            case -6 -> this.animationState5.method_41325();
            case -5 -> this.animationState4.method_41325();
            case -4 -> this.animationState3.method_41325();
            case -3 -> this.animationState2.method_41325();
            case -2 -> this.animationState1.method_41325();
            case -1 -> this.animationState0.method_41325();
            case 0 -> this.animationState0.method_41322(this.field_6012);
            case 1 -> this.animationState1.method_41322(this.field_6012);
            case 2 -> this.animationState2.method_41322(this.field_6012);
            case 3 -> this.animationState3.method_41322(this.field_6012);
            case 4 -> this.animationState4.method_41322(this.field_6012);
            case 5 -> this.animationState5.method_41322(this.field_6012);
         }
      }

      super.method_5674(data);
   }

   protected void method_5693(class_2945.class_9222 builder) {
      super.method_5693(builder);
      builder.method_56912(TEXTURE, "flag_black");
      builder.method_56912(ANIM, 0);
      builder.method_56912(DATA_windSpeed, 0);
   }

   public void setTexture(String texture) {
      this.field_6011.method_12778(TEXTURE, texture);
   }

   public String getTexture() {
      return (String)this.field_6011.method_12789(TEXTURE);
   }

   protected class_1408 method_5965(class_1937 world) {
      return new class_1407(this, world);
   }

   public boolean method_5640(double sqrDistance) {
      return sqrDistance < (double)65536.0F;
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

   public boolean method_5747(float l, float d, class_1282 source) {
      return false;
   }

   public boolean method_5643(class_1282 damagesource, float amount) {
      if (damagesource.method_49708(class_8111.field_42335)) {
         return false;
      } else if (damagesource.method_5526() instanceof class_1665) {
         return false;
      } else if (damagesource.method_5526() instanceof class_1657) {
         return false;
      } else if (!(damagesource.method_5526() instanceof class_1686) && !(damagesource.method_5526() instanceof class_1295)) {
         if (damagesource.method_49708(class_8111.field_42345)) {
            return false;
         } else if (damagesource.method_49708(class_8111.field_42344)) {
            return false;
         } else if (damagesource.method_49708(class_8111.field_42342)) {
            return false;
         } else if (damagesource.method_49708(class_8111.field_42336)) {
            return false;
         } else if (!damagesource.method_49708(class_8111.field_42331) && !damagesource.method_49708(class_8111.field_42332)) {
            if (damagesource.method_49708(class_8111.field_42322)) {
               return false;
            } else if (damagesource.method_49708(class_8111.field_42357)) {
               return false;
            } else if (damagesource.method_49708(class_8111.field_42351)) {
               return false;
            } else {
               return !damagesource.method_49708(class_8111.field_42350) && !damagesource.method_49708(class_8111.field_42327) ? super.method_5643(damagesource, amount) : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_5659(class_1927 explosion) {
      return true;
   }

   public boolean method_5753() {
      return true;
   }

   public void method_5652(class_2487 compound) {
      super.method_5652(compound);
      compound.method_10582("Texture", this.getTexture());
      compound.method_10569("DatawindSpeed", (Integer)this.field_6011.method_12789(DATA_windSpeed));
   }

   public void method_5749(class_2487 compound) {
      super.method_5749(compound);
      if (compound.method_10545("Texture")) {
         this.setTexture(compound.method_10558("Texture"));
      }

      if (compound.method_10545("DatawindSpeed")) {
         this.field_6011.method_12778(DATA_windSpeed, compound.method_10550("DatawindSpeed"));
      }

   }

   public void method_5773() {
      super.method_5773();
      if (this.method_37908().method_8608()) {
         this.animationState0.method_45317(NoWindPlaybackConditionProcedure.execute(this), this.field_6012);
         this.animationState1.method_45317(LowPlaybackConditionProcedure.execute(this), this.field_6012);
         this.animationState2.method_45317(MediumPlaybackConditionProcedure.execute(this), this.field_6012);
         this.animationState3.method_45317(HighPlaybackConditionProcedure.execute(this), this.field_6012);
         this.animationState4.method_45317(StrongPlaybackConditionProcedure.execute(this), this.field_6012);
         this.animationState5.method_45317(FullPlaybackConditionProcedure.execute(this), this.field_6012);
      }

   }

   public void method_5670() {
      super.method_5670();
      FlagOnEntityTickUpdateProcedure.execute(this.method_37908(), this.method_23317(), this.method_23318(), this.method_23321(), this);
   }

   public boolean method_5810() {
      return false;
   }

   protected void method_6087(class_1297 entityIn) {
   }

   protected void method_6070() {
   }

   protected void method_5623(double y, boolean onGroundIn, class_2680 state, class_2338 pos) {
   }

   public void method_5875(boolean ignored) {
      super.method_5875(true);
   }

   public void method_6007() {
      super.method_6007();
      this.method_5875(true);
   }

   public static class_5132.class_5133 createAttributes() {
      class_5132.class_5133 builder = class_1308.method_26828();
      builder = builder.method_26868(class_5134.field_23719, 0.3);
      builder = builder.method_26868(class_5134.field_23716, (double)10.0F);
      builder = builder.method_26868(class_5134.field_23724, (double)0.0F);
      builder = builder.method_26868(class_5134.field_23721, (double)3.0F);
      builder = builder.method_26868(class_5134.field_23717, (double)16.0F);
      builder = builder.method_26868(class_5134.field_47761, 0.6);
      builder = builder.method_26868(class_5134.field_23720, 0.3);
      return builder;
   }

   static {
      TEXTURE = class_2945.method_12791(FlagBlackEntity.class, class_2943.field_13326);
      ANIM = class_2945.method_12791(FlagBlackEntity.class, class_2943.field_13327);
      DATA_windSpeed = class_2945.method_12791(FlagBlackEntity.class, class_2943.field_13327);
   }
}
