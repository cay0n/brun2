package net.pixelbank.burnt.client.renderer;

import net.minecraft.class_1921;
import net.minecraft.class_1937;
import net.minecraft.class_2960;
import net.minecraft.class_3883;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5597;
import net.minecraft.class_5617;
import net.minecraft.class_630;
import net.minecraft.class_922;
import net.minecraft.class_927;
import net.pixelbank.burnt.client.model.Modelflag;
import net.pixelbank.burnt.client.model.animations.flagAnimationFull;
import net.pixelbank.burnt.client.model.animations.flagAnimationHigh;
import net.pixelbank.burnt.client.model.animations.flagAnimationLow;
import net.pixelbank.burnt.client.model.animations.flagAnimationMedium;
import net.pixelbank.burnt.client.model.animations.flagAnimationStrong;
import net.pixelbank.burnt.entity.FlagEntity;
import net.pixelbank.burnt.procedures.BlackFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.BlueFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.BrownFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.CyanFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.GreenFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.GreyFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.LightBlueFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.LightGreyFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.LimeFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.MagentaFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.OrangeFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.PinkFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.PirateFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.PurpleFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.RainbowFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.RedFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.WhiteFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.WindFlagDisplayConditionProcedure;
import net.pixelbank.burnt.procedures.YellowFlagDisplayConditionProcedure;

public class FlagRenderer extends class_927<FlagEntity, Modelflag<FlagEntity>> {
   public FlagRenderer(class_5617.class_5618 context) {
      super(context, new AnimatedModel(context.method_32167(Modelflag.LAYER_LOCATION)), 0.0F);
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_white.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (WhiteFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_black.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (BlackFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_grey.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (GreyFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_light_grey.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (LightGreyFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_red.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (RedFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_cyan.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (CyanFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_yellow.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (YellowFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_magenta.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (MagentaFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_lime.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (LimeFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_orange.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (OrangeFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_brown.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (BrownFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_purple.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (PurpleFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_pink.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (PinkFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_blue.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (BlueFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_green.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (GreenFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_light_blue.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (LightBlueFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_wind.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (WindFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_rainbow.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (RainbowFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
      this.method_4046(new class_3887<FlagEntity, Modelflag<FlagEntity>>(this) {
         final class_2960 LAYER_TEXTURE = class_2960.method_60654("burnt:textures/entities/flag_pirate.png");

         public void render(class_4587 poseStack, class_4597 bufferSource, int light, FlagEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            class_1937 world = entity.method_37908();
            double x = entity.method_23317();
            double y = entity.method_23318();
            double z = entity.method_23321();
            if (PirateFlagDisplayConditionProcedure.execute(entity)) {
               class_4588 vertexConsumer = bufferSource.getBuffer(class_1921.method_23578(this.LAYER_TEXTURE));
               ((Modelflag)this.method_17165()).method_60879(poseStack, vertexConsumer, light, class_922.method_23622(entity, 0.0F));
            }

         }
      });
   }

   public class_2960 getTextureLocation(FlagEntity entity) {
      return class_2960.method_60654("burnt:textures/entities/" + entity.getTexture() + ".png");
   }

   private static final class AnimatedModel extends Modelflag<FlagEntity> {
      private final class_630 root;
      private final class_5597 animator = new class_5597<FlagEntity>() {
         // $FF: synthetic field
         final FlagRenderer.AnimatedModel this$0;

         {
            this.this$0 = this$0;
         }

         public class_630 method_32008() {
            return this.this$0.root;
         }

         public void setupAnim(FlagEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.method_32008().method_32088().forEach(class_630::method_41923);
            this.method_43782(entity.animationState0, flagAnimationLow.LOW, ageInTicks, 0.5F);
            this.method_43782(entity.animationState1, flagAnimationLow.LOW, ageInTicks, 1.0F);
            this.method_43782(entity.animationState2, flagAnimationMedium.MEDIUM, ageInTicks, 1.0F);
            this.method_43782(entity.animationState3, flagAnimationHigh.HIGH, ageInTicks, 1.0F);
            this.method_43782(entity.animationState4, flagAnimationStrong.STRONG, ageInTicks, 1.0F);
            this.method_43782(entity.animationState5, flagAnimationFull.FULL, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(class_630 root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(FlagEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.method_2819(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.method_2819(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
