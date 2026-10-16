package net.pixelbank.burnt.client;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.GlStateManager.class_4534;
import com.mojang.blaze3d.platform.GlStateManager.class_4535;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.class_1049;
import net.minecraft.class_1060;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_293.class_5596;
import org.joml.Matrix4f;

public class RenderUtils {
   public static final class_2960 SUN_LOCATION = class_2960.method_60656("textures/environment/sun.png");
   public static final class_2960 MOON_LOCATION = class_2960.method_60656("textures/environment/moon_phases.png");
   private static final class_310 mc = class_310.method_1551();

   public static void swapVanillaTexture(class_2960 original, class_2960 replacement) {
      class_1060 textureManager = mc.method_1531();
      class_1049 newTexture = new class_1049(replacement);
      newTexture.method_23207();
      textureManager.method_4616(original, newTexture);
   }

   public static void renderCustomSun(WorldRenderContext context, class_2960 texture) {
      class_4587 posestack = context.matrixStack() != null ? context.matrixStack() : new class_4587();
      posestack.method_22903();
      posestack.method_22907(context.camera().method_23767());
      GlStateManager._enableBlend();
      RenderSystem.blendFuncSeparate(class_4535.SRC_ALPHA, class_4534.ONE, class_4535.ONE, class_4534.ZERO);
      GlStateManager._depthMask(false);
      float partialTick = context.tickCounter().method_60637(false);
      float f11 = 1.0F - mc.field_1724.method_37908().method_8430(partialTick);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f11);
      posestack.method_22907(class_7833.field_40716.rotationDegrees(-90.0F));
      posestack.method_22907(class_7833.field_40714.rotationDegrees(mc.field_1724.method_37908().method_30274(partialTick) * 360.0F));
      Matrix4f matrix4f1 = posestack.method_23760().method_23761();
      float f12 = 30.0F;
      RenderSystem.setShader(class_757::method_34542);
      RenderSystem.setShaderTexture(0, texture);
      class_287 bufferbuilder = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1585);
      bufferbuilder.method_22918(matrix4f1, -f12, 100.0F, -f12).method_22913(0.0F, 0.0F);
      bufferbuilder.method_22918(matrix4f1, f12, 100.0F, -f12).method_22913(1.0F, 0.0F);
      bufferbuilder.method_22918(matrix4f1, f12, 100.0F, f12).method_22913(1.0F, 1.0F);
      bufferbuilder.method_22918(matrix4f1, -f12, 100.0F, f12).method_22913(0.0F, 1.0F);
      class_286.method_43433(bufferbuilder.method_60800());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager._disableBlend();
      RenderSystem.defaultBlendFunc();
      GlStateManager._depthMask(true);
      posestack.method_22909();
   }

   public static void renderCustomMoon(WorldRenderContext context, class_2960 texture) {
      class_4587 posestack = context.matrixStack() != null ? context.matrixStack() : new class_4587();
      posestack.method_22903();
      posestack.method_22907(context.camera().method_23767());
      GlStateManager._enableBlend();
      RenderSystem.blendFuncSeparate(class_4535.SRC_ALPHA, class_4534.ONE, class_4535.ONE, class_4534.ZERO);
      GlStateManager._depthMask(false);
      float partialTick = context.tickCounter().method_60637(false);
      float f11 = 1.0F - mc.field_1724.method_37908().method_8430(partialTick);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f11);
      posestack.method_22907(class_7833.field_40716.rotationDegrees(-90.0F));
      posestack.method_22907(class_7833.field_40714.rotationDegrees(mc.field_1724.method_37908().method_30274(partialTick) * 360.0F));
      Matrix4f matrix4f1 = posestack.method_23760().method_23761();
      float f12 = 20.0F;
      RenderSystem.setShader(class_757::method_34542);
      RenderSystem.setShaderTexture(0, texture);
      int k = mc.field_1724.method_37908().method_30273();
      int l = k % 4;
      int i1 = k / 4 % 2;
      float f13 = (float)(l + 0) / 4.0F;
      float f14 = (float)(i1 + 0) / 2.0F;
      float f15 = (float)(l + 1) / 4.0F;
      float f16 = (float)(i1 + 1) / 2.0F;
      class_287 bufferbuilder = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1585);
      bufferbuilder.method_22918(matrix4f1, -f12, -100.0F, f12).method_22913(f15, f16);
      bufferbuilder.method_22918(matrix4f1, f12, -100.0F, f12).method_22913(f13, f16);
      bufferbuilder.method_22918(matrix4f1, f12, -100.0F, -f12).method_22913(f13, f14);
      bufferbuilder.method_22918(matrix4f1, -f12, -100.0F, -f12).method_22913(f15, f14);
      class_286.method_43433(bufferbuilder.method_60800());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager._disableBlend();
      RenderSystem.defaultBlendFunc();
      GlStateManager._depthMask(true);
      posestack.method_22909();
   }

   public static void renderCustomSkybox(WorldRenderContext context, class_2960 texture, int color, float alpha) {
      class_4587 poseStack = context.matrixStack() != null ? context.matrixStack() : new class_4587();
      poseStack.method_22903();
      poseStack.method_22907(context.camera().method_23767());
      GlStateManager._enableBlend();
      RenderSystem.defaultBlendFunc();
      GlStateManager._depthMask(false);
      RenderSystem.setShader(class_757::method_34542);
      RenderSystem.setShaderTexture(0, texture);
      int[] rgb = getRGB(color);
      RenderSystem.setShaderColor((float)rgb[0] / 255.0F, (float)rgb[1] / 255.0F, (float)rgb[2] / 255.0F, alpha);
      class_289 tesselator = class_289.method_1348();
      float distance = 100.0F;
      float size = 100.0F;
      renderSkyboxQuad(poseStack, tesselator, -size, distance, -size, 0.25F, 0.33333334F, size, distance, -size, 0.5F, 0.33333334F, size, distance, size, 0.5F, 0.0F, -size, distance, size, 0.25F, 0.0F);
      renderSkyboxQuad(poseStack, tesselator, -size, -distance, -size, 0.25F, 0.6666667F, -size, -distance, size, 0.25F, 1.0F, size, -distance, size, 0.5F, 1.0F, size, -distance, -size, 0.5F, 0.6666667F);
      renderSkyboxQuad(poseStack, tesselator, -distance, -size, size, 0.0F, 0.6666667F, -distance, -size, -size, 0.25F, 0.6666667F, -distance, size, -size, 0.25F, 0.33333334F, -distance, size, size, 0.0F, 0.33333334F);
      renderSkyboxQuad(poseStack, tesselator, -size, -size, -distance, 0.25F, 0.6666667F, size, -size, -distance, 0.5F, 0.6666667F, size, size, -distance, 0.5F, 0.33333334F, -size, size, -distance, 0.25F, 0.33333334F);
      renderSkyboxQuad(poseStack, tesselator, distance, -size, -size, 0.5F, 0.6666667F, distance, -size, size, 0.75F, 0.6666667F, distance, size, size, 0.75F, 0.33333334F, distance, size, -size, 0.5F, 0.33333334F);
      renderSkyboxQuad(poseStack, tesselator, size, -size, distance, 0.75F, 0.6666667F, -size, -size, distance, 1.0F, 0.6666667F, -size, size, distance, 1.0F, 0.33333334F, size, size, distance, 0.75F, 0.33333334F);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager._depthMask(true);
      GlStateManager._disableBlend();
      poseStack.method_22909();
   }

   private static void renderSkyboxQuad(class_4587 poseStack, class_289 tesselator, float x1, float y1, float z1, float u1, float v1, float x2, float y2, float z2, float u2, float v2, float x3, float y3, float z3, float u3, float v3, float x4, float y4, float z4, float u4, float v4) {
      Matrix4f matrix = poseStack.method_23760().method_23761();
      class_287 buffer = tesselator.method_60827(class_5596.field_27382, class_290.field_1585);
      buffer.method_22918(matrix, x1, y1, z1).method_22913(u1, v1);
      buffer.method_22918(matrix, x2, y2, z2).method_22913(u2, v2);
      buffer.method_22918(matrix, x3, y3, z3).method_22913(u3, v3);
      buffer.method_22918(matrix, x4, y4, z4).method_22913(u4, v4);
      class_286.method_43433(buffer.method_60800());
   }

   public static int[] getRGB(int hexColor) {
      int[] rgb = new int[3];
      rgb[0] = hexColor >> 16 & 255;
      rgb[1] = hexColor >> 8 & 255;
      rgb[2] = hexColor & 255;
      return rgb;
   }
}
