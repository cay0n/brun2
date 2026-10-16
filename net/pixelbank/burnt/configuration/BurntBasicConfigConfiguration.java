package net.pixelbank.burnt.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.BoundedDiscrete;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Category;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Excluded;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Tooltip;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(
   name = "burnt_fabric"
)
public class BurntBasicConfigConfiguration implements ConfigData {
   @Tooltip
   public boolean burnt_on = true;
   @Tooltip
   public List<String> disabled_dimensions = new ArrayList();
   @Tooltip
   public boolean burn_in_modded_dimensions = true;
   @Tooltip
   public boolean rain_extinguish = true;
   @Tooltip
   public boolean vanilla_burn = true;
   @Tooltip
   public boolean lava_burn = false;
   @Tooltip
   public boolean lightning_ignites = false;
   @Tooltip
   public boolean biome_specific = true;
   @Tooltip
   public boolean wind = true;
   @Tooltip
   public double wind_influence = (double)6.0F;
   @Tooltip
   public boolean iron_golem_fight_fires = true;
   public boolean flame_arrows_ignite_creepers = true;
   @Tooltip
   public boolean enable_flags = true;
   @Tooltip
   public boolean enable_fire_extinguisher = true;
   @Category("burnsettings")
   @Tooltip
   public double burn_spread = (double)50.0F;
   @Category("burnsettings")
   @Tooltip
   public double wood_spread = (double)30.0F;
   @Category("burnsettings")
   @Tooltip
   public double dark_oak_spread = (double)50.0F;
   @Category("burnsettings")
   @Tooltip
   public double wood_downward_spread = (double)15.0F;
   @Category("burnsettings")
   @Tooltip
   public boolean burn_in_claimed_chunks = false;
   @Category("burnsettings")
   @Tooltip
   public double ground_spread = (double)50.0F;
   @Category("burnsettings")
   @Tooltip
   public double burn_speed = (double)25.0F;
   @Category("burnsettings")
   @Tooltip
   public double fire_burnout_chance = (double)2.0F;
   @Category("visual_effects")
   @Tooltip
   public double smoke_particle_range = (double)96.0F;
   @Category("burnsettings")
   @Tooltip
   public double player_distance = (double)256.0F;
   @Category("burnsettings")
   @Tooltip
   public boolean ember_spread = false;
   @Category("burnsettings")
   @Tooltip
   public boolean flame_bow = true;
   @Category("burnsettings")
   @Tooltip
   public boolean fire_aspect = false;
   @Category("burnsettings")
   @Tooltip
   public boolean burn_damage = true;
   @Category("burnsettings")
   @Tooltip
   public boolean random_collapses = true;
   @Category("burnsettings")
   @Tooltip
   public double collapse_chance = (double)20.0F;
   @Category("blocksettings")
   @Tooltip
   public boolean crafted_blocks_burn = true;
   @Category("blocksettings")
   @Tooltip
   public boolean burn_barrels = true;
   @Category("blocksettings")
   @Tooltip
   public boolean wool_burn = true;
   @Category("blocksettings")
   @Tooltip
   public boolean soot = true;
   @Category("blocksettings")
   @Tooltip
   public boolean crack_terracotta = true;
   @Category("blocksettings")
   @Tooltip
   public boolean burn_create_blocks = true;
   @Category("visual_effects")
   @Tooltip
   public boolean smoke_particles = true;
   @Category("visual_effects")
   @Tooltip
   public boolean flame_particles = true;
   @Category("visual_effects")
   @Tooltip
   public boolean ash_particles = true;
   @Category("visual_effects")
   @Tooltip
   public boolean ground_smoke = true;
   @Category("visual_effects")
   @Tooltip
   public double smoke_density = (double)40.0F;
   @Category("visual_effects")
   @Tooltip
   public boolean distant_plumes = false;
   @Category("visual_effects")
   @Tooltip
   public int plume_cap = 250;
   @Category("visual_effects")
   @Tooltip
   public boolean heat_haze = true;
   @Category("visual_effects")
   @Tooltip
   @BoundedDiscrete(
      min = 0L,
      max = 10L
   )
   public int heat_haze_intensity = 3;
   @Category("visual_effects")
   @Tooltip
   public boolean smoke_fog = false;
   @Category("visual_effects")
   @Tooltip
   @BoundedDiscrete(
      min = 0L,
      max = 10L
   )
   public int smoke_fog_intensity = 3;
   @Category("recoverysettings")
   @Tooltip
   public boolean grass_recovery = true;
   @Category("recoverysettings")
   @Tooltip
   public double grass_recover_speed = (double)25.0F;
   @Category("recoverysettings")
   @Tooltip
   public boolean forest_recovery = true;
   @Category("recoverysettings")
   @Tooltip
   public double forest_recover_speed = (double)50.0F;
   @Category("recoverysettings")
   @Tooltip
   public double forest_replant_chance = (double)50.0F;
   @Excluded
   private static BurntBasicConfigConfiguration instance;
   @Excluded
   public static final ConfigValue<Boolean> BURNT_ON = new ConfigValue<Boolean>(() -> instance.burnt_on);
   @Excluded
   public static final ConfigValue<List<String>> DISABLED_DIMENSIONS = new ConfigValue<List<String>>(() -> instance.disabled_dimensions);
   @Excluded
   public static final ConfigValue<Boolean> BURN_MODDED_DIMENSIONS = new ConfigValue<Boolean>(() -> instance.burn_in_modded_dimensions);
   @Excluded
   public static final ConfigValue<Boolean> RAIN_EXTINGUISH = new ConfigValue<Boolean>(() -> instance.rain_extinguish);
   @Excluded
   public static final ConfigValue<Boolean> VANILLA_BURN = new ConfigValue<Boolean>(() -> instance.vanilla_burn);
   @Excluded
   public static final ConfigValue<Boolean> LAVA_BURN = new ConfigValue<Boolean>(() -> instance.lava_burn);
   @Excluded
   public static final ConfigValue<Boolean> LIGHTNING_IGNITES = new ConfigValue<Boolean>(() -> instance.lightning_ignites);
   @Excluded
   public static final ConfigValue<Boolean> BIOME = new ConfigValue<Boolean>(() -> instance.biome_specific);
   @Excluded
   public static final ConfigValue<Boolean> WIND = new ConfigValue<Boolean>(() -> instance.wind);
   @Excluded
   public static final ConfigValue<Double> WIND_INFLUENCE = new ConfigValue<Double>(() -> instance.wind_influence);
   @Excluded
   public static final ConfigValue<Boolean> IRON_GOLEM_FIGHT_FIRES = new ConfigValue<Boolean>(() -> instance.iron_golem_fight_fires);
   @Excluded
   public static final ConfigValue<Boolean> FLAME_ARROWS_IGNITE_CREEPERS = new ConfigValue<Boolean>(() -> instance.flame_arrows_ignite_creepers);
   @Excluded
   public static final ConfigValue<Boolean> ENABLE_FLAGS = new ConfigValue<Boolean>(() -> instance.enable_flags);
   @Excluded
   public static final ConfigValue<Boolean> ENABLE_FIRE_EXTINGUISHER = new ConfigValue<Boolean>(() -> instance.enable_fire_extinguisher);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> BURN_SPREAD = new ConfigValue<Double>(() -> instance.burn_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> WOOD_SPREAD = new ConfigValue<Double>(() -> instance.wood_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> DARK_OAK_SPREAD = new ConfigValue<Double>(() -> instance.dark_oak_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> WOOD_DOWNWARD_SPREAD = new ConfigValue<Double>(() -> instance.wood_downward_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> BURN_IN_CLAIMED_CHUNKS = new ConfigValue<Boolean>(() -> instance.burn_in_claimed_chunks);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> GROUND_SPREAD = new ConfigValue<Double>(() -> instance.ground_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> BURN_SPEED = new ConfigValue<Double>(() -> instance.burn_speed);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> FIRE_BURNOUT_CHANCE = new ConfigValue<Double>(() -> instance.fire_burnout_chance);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Double> SMOKE_PARTICLE_RANGE = new ConfigValue<Double>(() -> instance.smoke_particle_range);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> PLAYER_DISTANCE = new ConfigValue<Double>(() -> instance.player_distance);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> EMBER_SPREAD = new ConfigValue<Boolean>(() -> instance.ember_spread);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> FLAME_BOW = new ConfigValue<Boolean>(() -> instance.flame_bow);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> FIRE_ASPECT = new ConfigValue<Boolean>(() -> instance.fire_aspect);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> BURN_DAMAGE = new ConfigValue<Boolean>(() -> instance.burn_damage);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Boolean> COLLAPSE = new ConfigValue<Boolean>(() -> instance.random_collapses);
   @Excluded
   @Category("burnsettings")
   public static final ConfigValue<Double> COLLAPSE_CHANCE = new ConfigValue<Double>(() -> instance.collapse_chance);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> CRAFTED_BURN = new ConfigValue<Boolean>(() -> instance.crafted_blocks_burn);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> BURN_BARRELS = new ConfigValue<Boolean>(() -> instance.burn_barrels);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> WOOL_BURN = new ConfigValue<Boolean>(() -> instance.wool_burn);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> SOOT = new ConfigValue<Boolean>(() -> instance.soot);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> CRACKS = new ConfigValue<Boolean>(() -> instance.crack_terracotta);
   @Excluded
   @Category("blocksettings")
   public static final ConfigValue<Boolean> BURN_CREATE_BLOCKS = new ConfigValue<Boolean>(() -> instance.burn_create_blocks);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> SMOKE = new ConfigValue<Boolean>(() -> instance.smoke_particles);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> FLAMES = new ConfigValue<Boolean>(() -> instance.flame_particles);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> ASH = new ConfigValue<Boolean>(() -> instance.ash_particles);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> GROUND_SMOKE = new ConfigValue<Boolean>(() -> instance.ground_smoke);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Double> SMOKE_DENSITY = new ConfigValue<Double>(() -> instance.smoke_density);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> DISTANT_PLUMES = new ConfigValue<Boolean>(() -> instance.distant_plumes);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Integer> PLUME_CAP = new ConfigValue<Integer>(() -> instance.plume_cap);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> HEAT_HAZE = new ConfigValue<Boolean>(() -> instance.heat_haze);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Integer> HEAT_HAZE_INTENSITY = new ConfigValue<Integer>(() -> instance.heat_haze_intensity);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Boolean> SMOKE_FOG = new ConfigValue<Boolean>(() -> instance.smoke_fog);
   @Excluded
   @Category("visual_effects")
   public static final ConfigValue<Integer> SMOKE_FOG_INTENSITY = new ConfigValue<Integer>(() -> instance.smoke_fog_intensity);
   @Excluded
   @Category("recoverysettings")
   public static final ConfigValue<Boolean> GRASS_RECOVERY = new ConfigValue<Boolean>(() -> instance.grass_recovery);
   @Excluded
   @Category("recoverysettings")
   public static final ConfigValue<Double> GRASS_RECOVER_SPEED = new ConfigValue<Double>(() -> instance.grass_recover_speed);
   @Excluded
   @Category("recoverysettings")
   public static final ConfigValue<Boolean> FOREST_RECOVERY = new ConfigValue<Boolean>(() -> instance.forest_recovery);
   @Excluded
   @Category("recoverysettings")
   public static final ConfigValue<Double> FOREST_RECOVER_SPEED = new ConfigValue<Double>(() -> instance.forest_recover_speed);
   @Excluded
   @Category("recoverysettings")
   public static final ConfigValue<Double> FOREST_REPLANT_CHANCE = new ConfigValue<Double>(() -> instance.forest_replant_chance);

   public static void register() {
      AutoConfig.register(BurntBasicConfigConfiguration.class, GsonConfigSerializer::new);
      instance = (BurntBasicConfigConfiguration)AutoConfig.getConfigHolder(BurntBasicConfigConfiguration.class).getConfig();
   }

   public static BurntBasicConfigConfiguration get() {
      return instance;
   }

   public static final class ConfigValue<T> {
      private final Supplier<T> getter;

      public ConfigValue(Supplier<T> getter) {
         this.getter = getter;
      }

      public T get() {
         return (T)this.getter.get();
      }
   }
}
