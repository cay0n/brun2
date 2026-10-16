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

public class Modelflag<T extends class_1297> extends class_583<T> {
   public static final class_5601 LAYER_LOCATION = new class_5601(class_2960.method_60655("burnt", "modelflag"), "main");
   public final class_630 FLAG;
   public final class_630 HEAD;
   public final class_630 flag1;
   public final class_630 flag2;
   public final class_630 flag3;
   public final class_630 flag4;
   public final class_630 flag5;
   public final class_630 MAST;

   public Modelflag(class_630 root) {
      this.FLAG = root.method_32086("FLAG");
      this.HEAD = this.FLAG.method_32086("HEAD");
      this.flag1 = this.HEAD.method_32086("flag1");
      this.flag2 = this.flag1.method_32086("flag2");
      this.flag3 = this.flag2.method_32086("flag3");
      this.flag4 = this.flag3.method_32086("flag4");
      this.flag5 = this.flag4.method_32086("flag5");
      this.MAST = this.FLAG.method_32086("MAST");
   }

   public static class_5607 createBodyLayer() {
      class_5609 meshdefinition = new class_5609();
      class_5610 partdefinition = meshdefinition.method_32111();
      class_5610 FLAG = partdefinition.method_32117("FLAG", class_5606.method_32108(), class_5603.method_32090(0.0F, 24.0F, 0.0F));
      class_5610 HEAD = FLAG.method_32117("HEAD", class_5606.method_32108().method_32101(2, -2).method_32098(0.0F, -8.0F, -6.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, -8.0F, 1.0F));
      class_5610 flag1 = HEAD.method_32117("flag1", class_5606.method_32108().method_32101(10, -2).method_32098(0.0F, -8.0F, -4.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -6.0F));
      class_5610 flag2 = flag1.method_32117("flag2", class_5606.method_32108().method_32101(18, -2).method_32098(0.0F, -8.0F, -4.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -4.0F));
      class_5610 flag3 = flag2.method_32117("flag3", class_5606.method_32108().method_32101(26, -2).method_32098(0.0F, -8.0F, -4.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -4.0F));
      class_5610 flag4 = flag3.method_32117("flag4", class_5606.method_32108().method_32101(34, -2).method_32098(0.0F, -8.0F, -4.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -4.0F));
      flag4.method_32117("flag5", class_5606.method_32108().method_32101(42, -2).method_32098(0.0F, -8.0F, -4.0F, 0.0F, 16.0F, 4.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, -4.0F));
      FLAG.method_32117("MAST", class_5606.method_32108().method_32101(54, 2).method_32098(-1.0F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 0.0F, 0.0F));
      return class_5607.method_32110(meshdefinition, 64, 64);
   }

   public void method_2819(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.FLAG.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }
}
