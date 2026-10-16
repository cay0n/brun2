package net.pixelbank.burnt.client.renderer;

import net.minecraft.class_2960;
import net.minecraft.class_5617;
import net.minecraft.class_927;
import net.pixelbank.burnt.client.model.ModelSmoke;
import net.pixelbank.burnt.entity.SparkEntity;

public class SparkRenderer extends class_927<SparkEntity, ModelSmoke<SparkEntity>> {
   public SparkRenderer(class_5617.class_5618 context) {
      super(context, new ModelSmoke(context.method_32167(ModelSmoke.LAYER_LOCATION)), 0.5F);
   }

   public class_2960 getTextureLocation(SparkEntity entity) {
      return class_2960.method_60654("burnt:textures/entities/" + entity.getTexture() + ".png");
   }
}
