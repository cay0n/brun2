package net.pixelbank.burnt.init;

import java.util.Map;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.class_1657;
import net.minecraft.class_1735;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3222;
import net.minecraft.class_3917;
import net.minecraft.class_7701;
import net.minecraft.class_7923;
import net.pixelbank.burnt.network.MenuStateUpdateMessage;
import net.pixelbank.burnt.world.inventory.BurntBarrelGUIMenu;

public class BurntModMenus {
   public static class_3917<BurntBarrelGUIMenu> BURNT_BARREL_GUI;

   public static void register() {
      BURNT_BARREL_GUI = (class_3917)class_2378.method_10230(class_7923.field_41187, class_2960.method_60655("burnt", "burnt_barrel_gui"), new class_3917((id, inv) -> new BurntBarrelGUIMenu(id, inv), class_7701.field_40183));
   }

   public interface MenuAccessor {
      Map<String, Object> getMenuState();

      Map<Integer, class_1735> getSlots();

      default void sendMenuStateUpdate(class_1657 player, int elementType, String name, Object elementState, boolean needClientUpdate) {
         this.getMenuState().put(elementType + ":" + name, elementState);
         if (needClientUpdate && player instanceof class_3222 sp) {
            ServerPlayNetworking.send(sp, new MenuStateUpdateMessage(elementType, name, elementState));
         }

      }

      default <T> T getMenuState(int elementType, String name, T defaultValue) {
         try {
            return (T)this.getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
         } catch (ClassCastException var5) {
            return defaultValue;
         }
      }
   }
}
