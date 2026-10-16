package net.pixelbank.burnt.network;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.class_1703;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_8710;
import net.minecraft.class_9129;
import net.minecraft.class_9139;
import net.pixelbank.burnt.init.BurntModMenus;
import net.pixelbank.burnt.init.BurntModScreens;

public record MenuStateUpdateMessage(int elementType, String name, Object elementState) implements class_8710 {
   public static final class_8710.class_9154<MenuStateUpdateMessage> TYPE = new class_8710.class_9154(class_2960.method_60655("burnt", "guistate_update"));
   public static final class_9139<class_9129, MenuStateUpdateMessage> STREAM_CODEC = class_9139.method_56437(MenuStateUpdateMessage::write, MenuStateUpdateMessage::read);

   public static void write(class_2540 buffer, MenuStateUpdateMessage message) {
      buffer.method_53002(message.elementType);
      buffer.method_10814(message.name);
      if (message.elementType == 0) {
         buffer.method_10814((String)message.elementState);
      } else if (message.elementType == 1) {
         buffer.method_52964((Boolean)message.elementState);
      } else if (message.elementType == 2) {
         Object var3 = message.elementState;
         if (var3 instanceof Number) {
            Number n = (Number)var3;
            buffer.method_52940(n.doubleValue());
         }
      }

   }

   public static MenuStateUpdateMessage read(class_2540 buffer) {
      int elementType = buffer.readInt();
      String name = buffer.method_19772();
      Object elementState = null;
      if (elementType == 0) {
         elementState = buffer.method_19772();
      } else if (elementType == 1) {
         elementState = buffer.readBoolean();
      } else if (elementType == 2) {
         elementState = buffer.readDouble();
      }

      return new MenuStateUpdateMessage(elementType, name, elementState);
   }

   public class_8710.class_9154<MenuStateUpdateMessage> method_56479() {
      return TYPE;
   }

   public static void handleMenuState(MenuStateUpdateMessage message, ClientPlayNetworking.Context context) {
      if (message.name.length() <= 256) {
         Object var3 = message.elementState;
         if (var3 instanceof String) {
            String string = (String)var3;
            if (string.length() > 8192) {
               return;
            }
         }

         context.client().execute(() -> {
            class_310 mc = class_310.method_1551();
            if (mc.field_1724 != null) {
               class_1703 patt0$temp = mc.field_1724.field_7512;
               if (patt0$temp instanceof BurntModMenus.MenuAccessor) {
                  BurntModMenus.MenuAccessor menu = (BurntModMenus.MenuAccessor)patt0$temp;
                  menu.getMenuState().put(message.elementType + ":" + message.name, message.elementState);
                  class_437 patt1$temp = mc.field_1755;
                  if (patt1$temp instanceof BurntModScreens.ScreenAccessor) {
                     BurntModScreens.ScreenAccessor accessor = (BurntModScreens.ScreenAccessor)patt1$temp;
                     accessor.updateMenuState(message.elementType, message.name, message.elementState);
                  }
               }
            }

         });
      }
   }
}
