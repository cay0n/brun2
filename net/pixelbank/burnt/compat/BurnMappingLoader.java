package net.pixelbank.burnt.compat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_3300;
import net.minecraft.class_3695;
import net.minecraft.class_4309;
import net.minecraft.class_7923;
import net.pixelbank.burnt.BurntMod;

public class BurnMappingLoader extends class_4309 implements IdentifiableResourceReloadListener {
   private static final Gson GSON = (new GsonBuilder()).disableHtmlEscaping().create();

   public BurnMappingLoader() {
      super(GSON, "burn_mappings");
   }

   public class_2960 getFabricId() {
      return class_2960.method_60654("burnt:burn_mapping_loader");
   }

   protected void apply(Map<class_2960, JsonElement> data, class_3300 manager, class_3695 profiler) {
      BurnMappingRegistry.clear();
      int count = 0;

      for(Map.Entry<class_2960, JsonElement> entry : data.entrySet()) {
         try {
            JsonObject json = ((JsonElement)entry.getValue()).getAsJsonObject();
            if (json.has("mappings")) {
               for(JsonElement el : json.getAsJsonArray("mappings")) {
                  JsonObject mapping = el.getAsJsonObject();
                  class_2960 fromId = class_2960.method_60654(mapping.get("from").getAsString());
                  class_2960 toId = class_2960.method_60654(mapping.get("to").getAsString());
                  class_2248 from = (class_2248)class_7923.field_41175.method_10223(fromId);
                  class_2248 to = (class_2248)class_7923.field_41175.method_10223(toId);
                  if (from == class_2246.field_10124) {
                     BurntMod.LOGGER.warn("[Burnt] burn_mapping '{}': unknown source '{}' - skipping", entry.getKey(), fromId);
                  } else if (to == class_2246.field_10124) {
                     BurntMod.LOGGER.warn("[Burnt] burn_mapping '{}': unknown destination '{}' - skipping", entry.getKey(), toId);
                  } else {
                     BurnMappingRegistry.put(from, to);
                     ++count;
                  }
               }
            }
         } catch (Exception e) {
            BurntMod.LOGGER.error("[Burnt] Failed to parse burn_mapping '{}': {}", entry.getKey(), e.getMessage());
         }
      }

      BurntMod.LOGGER.info("[Burnt] Loaded {} burn mapping(s).", count);
   }
}
