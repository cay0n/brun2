package net.pixelbank.burnt.client;

import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5597;
import net.minecraft.class_591;
import net.minecraft.class_630;

public class ItemArms {
   public static void renderPartWithArms(class_5597<class_1297> model, class_4587 poseStack, class_4588 vertexConsumer, class_4597 bufferSource, int packedLight, int packedOverlay, class_591<?> playerModel, class_2960 skinTexture, boolean invisible) {
      class_630 leftArm = model.method_32008().method_32086("left_arm");
      class_630 rightArm = model.method_32008().method_32086("right_arm");
      if (leftArm != null) {
         leftArm.field_3665 = false;
      }

      if (rightArm != null) {
         rightArm.field_3665 = false;
      }

      model.method_60879(poseStack, vertexConsumer, packedLight, packedOverlay);
      if (leftArm != null && !invisible) {
         poseStack.method_22903();
         playerModel.field_27433.field_3657 = leftArm.field_3657 - 1.5F;
         playerModel.field_27433.field_3656 = leftArm.field_3656;
         playerModel.field_27433.field_3655 = leftArm.field_3655 - 1.5F;
         playerModel.field_27433.field_3654 = leftArm.field_3654 + (float)Math.toRadians((double)180.0F);
         playerModel.field_27433.field_3675 = leftArm.field_3675;
         playerModel.field_27433.field_3674 = leftArm.field_3674;
         playerModel.field_3484.field_3657 = leftArm.field_3657 - 1.5F;
         playerModel.field_3484.field_3656 = leftArm.field_3656;
         playerModel.field_3484.field_3655 = leftArm.field_3655 - 1.5F;
         playerModel.field_3484.field_3654 = leftArm.field_3654 + (float)Math.toRadians((double)180.0F);
         playerModel.field_3484.field_3675 = leftArm.field_3675;
         playerModel.field_3484.field_3674 = leftArm.field_3674;
         playerModel.field_27433.method_22698(poseStack, bufferSource.getBuffer(class_1921.method_23580(skinTexture)), packedLight, class_4608.field_21444);
         playerModel.field_3484.method_22698(poseStack, bufferSource.getBuffer(class_1921.method_23580(skinTexture)), packedLight, class_4608.field_21444);
         poseStack.method_22909();
      }

      if (rightArm != null && !invisible) {
         poseStack.method_22903();
         playerModel.field_3401.field_3657 = rightArm.field_3657 + 1.5F;
         playerModel.field_3401.field_3656 = rightArm.field_3656;
         playerModel.field_3401.field_3655 = rightArm.field_3655 - 1.5F;
         playerModel.field_3401.field_3654 = rightArm.field_3654 + (float)Math.toRadians((double)180.0F);
         playerModel.field_3401.field_3675 = rightArm.field_3675;
         playerModel.field_3401.field_3674 = rightArm.field_3674;
         playerModel.field_3486.field_3657 = rightArm.field_3657 + 1.5F;
         playerModel.field_3486.field_3656 = rightArm.field_3656;
         playerModel.field_3486.field_3655 = rightArm.field_3655 - 1.5F;
         playerModel.field_3486.field_3654 = rightArm.field_3654 + (float)Math.toRadians((double)180.0F);
         playerModel.field_3486.field_3675 = rightArm.field_3675;
         playerModel.field_3486.field_3674 = rightArm.field_3674;
         playerModel.field_3401.method_22698(poseStack, bufferSource.getBuffer(class_1921.method_23580(skinTexture)), packedLight, class_4608.field_21444);
         playerModel.field_3486.method_22698(poseStack, bufferSource.getBuffer(class_1921.method_23580(skinTexture)), packedLight, class_4608.field_21444);
         poseStack.method_22909();
      }

   }
}
