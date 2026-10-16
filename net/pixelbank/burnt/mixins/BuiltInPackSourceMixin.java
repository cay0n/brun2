package net.pixelbank.burnt.mixins;

import java.nio.file.Path;
import java.util.function.Consumer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_3286;
import net.minecraft.class_3288;
import net.minecraft.class_7678;
import net.pixelbank.burnt.util.GlobalMappingsPacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_7678.class})
public class BuiltInPackSourceMixin {
   @Inject(
      method = {"loadPacks"},
      at = {@At("TAIL")}
   )
   private void burnt$addGlobalMappings(Consumer<class_3288> onLoad, CallbackInfo ci) {
      if (this instanceof class_3286) {
         Path folder = GlobalMappingsPacks.folder(FabricLoader.getInstance().getConfigDir());
         GlobalMappingsPacks.ensureFolder(folder);
         GlobalMappingsPacks.source(folder).method_14453(onLoad);
      }
   }
}
