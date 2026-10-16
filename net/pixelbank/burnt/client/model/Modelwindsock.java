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

public class Modelwindsock<T extends class_1297> extends class_583<T> {
   public static final class_5601 LAYER_LOCATION = new class_5601(class_2960.method_60655("burnt", "modelwindsock"), "main");
   public final class_630 head;
   public final class_630 Sock;
   public final class_630 Sock2;
   public final class_630 Sock3;
   public final class_630 Sock4;
   public final class_630 Sock5;
   public final class_630 body;

   public Modelwindsock(class_630 root) {
      this.head = root.method_32086("head");
      this.Sock = this.head.method_32086("Sock");
      this.Sock2 = this.Sock.method_32086("Sock2");
      this.Sock3 = this.Sock2.method_32086("Sock3");
      this.Sock4 = this.Sock3.method_32086("Sock4");
      this.Sock5 = this.Sock4.method_32086("Sock5");
      this.body = root.method_32086("body");
   }

   public static class_5607 createBodyLayer() {
      class_5609 meshdefinition = new class_5609();
      class_5610 partdefinition = meshdefinition.method_32111();
      class_5610 head = partdefinition.method_32117("head", class_5606.method_32108(), class_5603.method_32090(0.0F, 8.25F, 0.25F));
      class_5610 Sock = head.method_32117("Sock", class_5606.method_32108().method_32101(2, 2).method_32098(-6.0F, -6.0F, -8.0F, 12.0F, 12.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, 0.0F));
      class_5610 Sock2 = Sock.method_32117("Sock2", class_5606.method_32108().method_32101(0, 18).method_32098(-5.0F, -5.0F, -4.0F, 10.0F, 10.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -7.0F));
      class_5610 Sock3 = Sock2.method_32117("Sock3", class_5606.method_32108().method_32101(0, 32).method_32098(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -3.0F));
      class_5610 Sock4 = Sock3.method_32117("Sock4", class_5606.method_32108().method_32101(36, 0).method_32098(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -3.0F));
      Sock4.method_32117("Sock5", class_5606.method_32108().method_32101(40, 10).method_32098(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -3.0F));
      partdefinition.method_32117("body", class_5606.method_32108().method_32101(28, 18).method_32098(-2.0F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
      return class_5607.method_32110(meshdefinition, 64, 64);
   }

   public void method_2819(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.head.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.body.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }
}
