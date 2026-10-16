package net.pixelbank.burnt.client.model;

import net.minecraft.class_1297;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5601;
import net.minecraft.class_5603;
import net.minecraft.class_5605;
import net.minecraft.class_5606;
import net.minecraft.class_5607;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_583;
import net.minecraft.class_630;

public class Modeltar_residue_Converted<T extends class_1297> extends class_583<T> {
   public static final class_5601 LAYER_LOCATION = new class_5601(class_2960.method_60655("burnt", "modeltar_residue_converted"), "main");
   public final class_630 bone;

   public Modeltar_residue_Converted(class_630 root) {
      this.bone = root.method_32086("bone");
   }

   public static class_5607 createBodyLayer() {
      class_5609 meshdefinition = new class_5609();
      class_5610 partdefinition = meshdefinition.method_32111();
      class_5610 bone = partdefinition.method_32117("bone", class_5606.method_32108(), class_5603.method_32090(8.0F, 24.0F, -8.0F));
      bone.method_32117("cube_r1", class_5606.method_32108().method_32101(0, 0).method_32098(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new class_5605(0.0F)), class_5603.method_32091(-8.0F, 0.0F, 8.0F, 0.0F, -0.7854F, 0.0F));
      return class_5607.method_32110(meshdefinition, 64, 64);
   }

   public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.bone.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void method_2819(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
