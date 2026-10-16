package net.pixelbank.burnt.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_465;
import net.pixelbank.burnt.init.BurntModScreens;
import net.pixelbank.burnt.world.inventory.BurntBarrelGUIMenu;

public class BurntBarrelGUIScreen extends class_465<BurntBarrelGUIMenu> implements BurntModScreens.ScreenAccessor {
   private final class_1937 world;
   private final int x;
   private final int y;
   private final int z;
   private final class_1657 entity;
   private boolean menuStateUpdateActive = false;

   public BurntBarrelGUIScreen(BurntBarrelGUIMenu container, class_1661 inventory, class_2561 text) {
      super(container, inventory, text);
      this.world = container.world;
      this.x = container.x;
      this.y = container.y;
      this.z = container.z;
      this.entity = container.entity;
      this.field_2792 = 176;
      this.field_2779 = 166;
   }

   public void updateMenuState(int elementType, String name, Object elementState) {
      this.menuStateUpdateActive = true;
      this.menuStateUpdateActive = false;
   }

   public void method_25394(class_332 guiGraphics, int mouseX, int mouseY, float partialTicks) {
      super.method_25394(guiGraphics, mouseX, mouseY, partialTicks);
      this.method_2380(guiGraphics, mouseX, mouseY);
   }

   protected void method_2389(class_332 guiGraphics, float partialTicks, int mouseX, int mouseY) {
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      guiGraphics.method_25290(class_2960.method_60654("burnt:textures/screens/burntbarrel_gui.png"), this.field_2776 + 0, this.field_2800 + -1, 0.0F, 0.0F, 176, 167, 176, 167);
      RenderSystem.disableBlend();
   }

   public boolean method_25404(int key, int b, int c) {
      if (key == 256) {
         this.field_22787.field_1724.method_7346();
         return true;
      } else {
         return super.method_25404(key, b, c);
      }
   }

   protected void method_2388(class_332 guiGraphics, int mouseX, int mouseY) {
   }

   public void method_25426() {
      super.method_25426();
   }
}
