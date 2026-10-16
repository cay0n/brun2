package net.pixelbank.burnt.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_437;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

@Environment(EnvType.CLIENT)
public class ModMenuApiImpl implements ModMenuApi {
   public ConfigScreenFactory<?> getModConfigScreenFactory() {
      return (parent) -> (class_437)AutoConfig.getConfigScreen(BurntBasicConfigConfiguration.class, parent).get();
   }
}
