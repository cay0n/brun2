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

public class Modelblaze_arrow<T extends class_1297> extends class_583<T> {
   public static final class_5601 LAYER_LOCATION = new class_5601(class_2960.method_60655("burnt", "modelblaze_arrow"), "main");
   public final class_630 bone;
   public final class_630 cross_1;
   public final class_630 cross_2;
   public final class_630 back;

   public Modelblaze_arrow(class_630 root) {
      this.bone = root.method_32086("bone");
      this.cross_1 = this.bone.method_32086("cross_1");
      this.cross_2 = this.bone.method_32086("cross_2");
      this.back = this.bone.method_32086("back");
   }

   public static class_5607 createBodyLayer() {
      class_5609 meshdefinition = new class_5609();
      class_5610 partdefinition = meshdefinition.method_32111();
      class_5610 bone = partdefinition.method_32117("bone", class_5606.method_32108(), class_5603.method_32091(0.0F, 8.0F, -3.0F, -1.5708F, 0.0F, 0.0F));
      bone.method_32117("cross_1", class_5606.method_32108().method_32101(0, 0).method_32098(-12.0F, -2.5F, 0.0F, 16.0F, 5.0F, 0.0F, new class_5605(0.0F)).method_32101(20, 12).method_32098(1.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -3.5F, -4.0F, -2.3562F, 1.5708F, 0.0F));
      bone.method_32117("cross_2", class_5606.method_32108().method_32101(0, 0).method_32098(-12.0F, -2.5F, 0.0F, 16.0F, 5.0F, 0.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -3.5F, -4.0F, -0.7854F, 1.5708F, 0.0F));
      bone.method_32117("back", class_5606.method_32108().method_32101(0, 0).method_32098(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -3.5F, 7.0F, -2.3562F, 1.5708F, 0.0F));
      return class_5607.method_32110(meshdefinition, 32, 32);
   }

   public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.bone.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void method_2819(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
