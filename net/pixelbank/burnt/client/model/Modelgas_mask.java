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

public class Modelgas_mask<T extends class_1297> extends class_583<T> {
   public static final class_5601 LAYER_LOCATION = new class_5601(class_2960.method_60655("burnt", "modelgas_mask"), "main");
   public final class_630 Head;
   public final class_630 mask;
   public final class_630 nose;
   public final class_630 Eye;
   public final class_630 Eye2;
   public final class_630 straps;

   public Modelgas_mask(class_630 root) {
      this.Head = root.method_32086("Head");
      this.mask = this.Head.method_32086("mask");
      this.nose = this.Head.method_32086("nose");
      this.Eye = this.Head.method_32086("Eye");
      this.Eye2 = this.Head.method_32086("Eye2");
      this.straps = this.Head.method_32086("straps");
   }

   public static class_5607 createBodyLayer() {
      class_5609 meshdefinition = new class_5609();
      class_5610 partdefinition = meshdefinition.method_32111();
      class_5610 Head = partdefinition.method_32117("Head", class_5606.method_32108(), class_5603.method_32090(0.0F, 0.0F, 0.0F));
      Head.method_32117("mask", class_5606.method_32108().method_32101(9, 2).method_32098(-6.25F, -4.0F, -1.0F, 9.0F, 9.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32090(1.75F, -4.5F, -4.0F));
      class_5610 nose = Head.method_32117("nose", class_5606.method_32108(), class_5603.method_32091(0.0F, 0.0F, -6.875F, 0.5236F, 0.0F, 0.0F));
      nose.method_32117("cube_r1", class_5606.method_32108().method_32101(20, 24).method_32098(-1.5F, -1.5F, -2.0F, 4.0F, 4.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -2.25F, -1.625F, 0.0F, 0.0F, 0.7854F));
      nose.method_32117("cube_r2", class_5606.method_32108().method_32101(9, 24).method_32098(-0.5F, -0.5F, -2.0F, 3.0F, 3.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -3.0F, -2.125F, 0.0F, 0.0F, 0.7854F));
      nose.method_32117("cube_r3", class_5606.method_32108().method_32101(28, 19).method_32098(0.5F, 0.5F, -2.0F, 2.0F, 2.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -3.5F, -0.125F, 0.0F, 0.0F, 0.7854F));
      nose.method_32117("cube_r4", class_5606.method_32108().method_32101(9, 14).method_32098(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32091(0.0F, -1.25F, 1.125F, 0.0F, 0.0F, 0.7854F));
      Head.method_32117("Eye", class_5606.method_32108().method_32101(1, 7).method_32098(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(1, 1).method_32098(-2.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new class_5605(0.0F)).method_32101(1, 1).method_32098(1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new class_5605(0.0F)).method_32101(0, 10).method_32096().method_32098(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32106(false).method_32101(0, 10).method_32098(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32091(2.5F, -5.5F, -5.5F, 0.0F, -0.2618F, 0.1745F));
      Head.method_32117("Eye2", class_5606.method_32108().method_32101(1, 7).method_32098(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(1, 1).method_32098(-2.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new class_5605(0.0F)).method_32101(1, 1).method_32098(1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new class_5605(0.0F)).method_32101(0, 10).method_32096().method_32098(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32106(false).method_32101(0, 10).method_32098(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32091(-2.5F, -5.5F, -5.5F, 0.0F, 0.2618F, -0.1745F));
      class_5610 straps = Head.method_32117("straps", class_5606.method_32108().method_32101(9, 30).method_32098(-6.25F, -1.5F, -12.5F, 1.0F, 3.0F, 3.0F, new class_5605(0.0F)).method_32101(25, 25).method_32098(-5.5F, -1.5F, -11.5F, 1.0F, 3.0F, 8.0F, new class_5605(0.0F)).method_32101(36, 21).method_32098(2.5F, -1.5F, -11.5F, 1.0F, 3.0F, 8.0F, new class_5605(0.0F)).method_32101(44, 33).method_32098(-4.5F, -1.5F, -4.5F, 7.0F, 3.0F, 1.0F, new class_5605(0.0F)).method_32101(32, 37).method_32098(-2.5F, -4.5F, -4.5F, 3.0F, 3.0F, 1.0F, new class_5605(0.0F)), class_5603.method_32090(1.0F, -3.5F, 8.5F));
      straps.method_32117("topstrap_r1", class_5606.method_32108().method_32101(13, 31).method_32098(1.0F, -1.5F, -4.5F, 1.0F, 3.0F, 8.0F, new class_5605(0.0F)), class_5603.method_32091(-1.0F, -3.5F, -7.0F, 0.0F, 0.0F, -1.5708F));
      straps.method_32117("buckle_r1", class_5606.method_32108().method_32101(9, 30).method_32098(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new class_5605(0.0F)), class_5603.method_32091(-1.0F, -5.5F, -11.0F, 0.0F, 0.0F, 1.5708F));
      straps.method_32117("buckle_r2", class_5606.method_32108().method_32101(9, 30).method_32098(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new class_5605(0.0F)), class_5603.method_32091(3.75F, 0.0F, -11.0F, 0.0F, 3.1416F, 0.0F));
      return class_5607.method_32110(meshdefinition, 64, 64);
   }

   public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.Head.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void method_2819(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.field_3675 = netHeadYaw / (180F / (float)Math.PI);
      this.Head.field_3654 = headPitch / (180F / (float)Math.PI);
   }
}
