package net.pixelbank.burnt.client.renderer;

import net.minecraft.class_2960;
import net.minecraft.class_5597;
import net.minecraft.class_5617;
import net.minecraft.class_630;
import net.minecraft.class_927;
import net.pixelbank.burnt.client.model.Modelflag;
import net.pixelbank.burnt.client.model.animations.flagAnimationFull;
import net.pixelbank.burnt.client.model.animations.flagAnimationHigh;
import net.pixelbank.burnt.client.model.animations.flagAnimationLow;
import net.pixelbank.burnt.client.model.animations.flagAnimationMedium;
import net.pixelbank.burnt.client.model.animations.flagAnimationStrong;
import net.pixelbank.burnt.entity.FlagBlackEntity;

public class FlagBlackRenderer extends class_927<FlagBlackEntity, Modelflag<FlagBlackEntity>> {
   public FlagBlackRenderer(class_5617.class_5618 context) {
      super(context, new AnimatedModel(context.method_32167(Modelflag.LAYER_LOCATION)), 0.0F);
   }

   public class_2960 getTextureLocation(FlagBlackEntity entity) {
      return class_2960.method_60654("burnt:textures/entities/" + entity.getTexture() + ".png");
   }

   private static final class AnimatedModel extends Modelflag<FlagBlackEntity> {
      private final class_630 root;
      private final class_5597 animator = new class_5597<FlagBlackEntity>() {
         // $FF: synthetic field
         final FlagBlackRenderer.AnimatedModel this$0;

         {
            this.this$0 = this$0;
         }

         public class_630 method_32008() {
            return this.this$0.root;
         }

         public void setupAnim(FlagBlackEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

      public void setupAnim(FlagBlackEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.method_2819(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.method_2819(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
