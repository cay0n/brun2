package net.pixelbank.burnt.mixins;

import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1863;
import net.minecraft.class_2960;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_1863.class})
public class RecipeManagerDisableMixin {
   @ModifyVariable(
      method = {"apply"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Map<class_2960, JsonElement> burnt$filterDisabledRecipes(Map<class_2960, JsonElement> in) {
      try {
         boolean noFlags = !(Boolean)BurntBasicConfigConfiguration.ENABLE_FLAGS.get();
         boolean noExtinguisher = !(Boolean)BurntBasicConfigConfiguration.ENABLE_FIRE_EXTINGUISHER.get();
         if (!noFlags && !noExtinguisher) {
            return in;
         } else {
            Map<class_2960, JsonElement> out = new HashMap(in);
            out.keySet().removeIf((id) -> id.method_12836().equals("burnt") && (noFlags && id.method_12832().endsWith("_flag_recipe") || noExtinguisher && id.method_12832().equals("extinguisher_recipe")));
            return out;
         }
      } catch (Throwable var5) {
         return in;
      }
   }
}
