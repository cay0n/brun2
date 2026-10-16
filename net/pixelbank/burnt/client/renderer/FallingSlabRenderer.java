package net.pixelbank.burnt.client.renderer;

import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_5617;
import net.minecraft.class_927;
import net.pixelbank.burnt.client.model.ModelCustomModel;
import net.pixelbank.burnt.entity.FallingSlabEntity;

public class FallingSlabRenderer extends class_927<FallingSlabEntity, ModelCustomModel<FallingSlabEntity>> {
   public FallingSlabRenderer(class_5617.class_5618 context) {
      super(context, new ModelCustomModel(context.method_32167(ModelCustomModel.LAYER_LOCATION)), 0.0F);
   }

   protected void scale(FallingSlabEntity entity, class_4587 poseStack, float f) {
      poseStack.method_22905(0.8F, 0.8F, 0.8F);
   }

   public class_2960 getTextureLocation(FallingSlabEntity entity) {
      return class_2960.method_60654("burnt:textures/entities/" + entity.getTexture() + ".png");
   }
}
