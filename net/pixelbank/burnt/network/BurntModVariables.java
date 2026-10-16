package net.pixelbank.burnt.network;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.class_1297;
import net.minecraft.class_18;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_4284;
import net.minecraft.class_5425;
import net.minecraft.class_7225;

public class BurntModVariables {
   public static final AttachmentType<PlayerVariables> PLAYER_VARIABLES;

   static {
      PLAYER_VARIABLES = AttachmentRegistry.builder().initializer(PlayerVariables::new).persistent(BurntModVariables.PlayerVariables.CODEC).buildAndRegister(class_2960.method_60655("burnt", "player_variables"));
   }

   public static class MapVariables extends class_18 {
      public static final String DATA_NAME = "burnt_mapvars";
      public boolean _syncDirty = false;
      public boolean burntOn = true;
      public boolean rainExtinguish = true;
      public boolean collapseOn = true;
      public boolean flameParticles = true;
      public boolean ashParticles = true;
      public boolean burnDamage = true;
      public boolean smokeParticles = true;
      public boolean sootOn = true;
      public boolean vanillaCatch = true;
      public boolean craftedBlocksBurn = true;
      public boolean woolBurns = true;
      public boolean flameBowOn = true;
      public boolean fireAspectOn = false;
      public boolean lightningCatch = false;
      public boolean smokeFogParticles = true;
      public boolean burnChestContents = true;
      public double playerDistance = (double)0.0F;
      public double grassRecovery = (double)3.0F;
      public double burnSpeed = (double)50.0F;
      public double burnSpread = (double)50.0F;
      public double groundSpread = (double)50.0F;
      public double burning = (double)0.0F;
      public double chanceCollapse = (double)100.0F;
      public boolean forestRecovery = false;
      public boolean distantSmoke = true;
      public boolean sc_found = false;
      public double sc_tx = (double)0.0F;
      public double sc_tz = (double)0.0F;
      public double sc_nextLocate = (double)0.0F;
      public boolean prevDistantSmoke = false;
      public boolean biomeSpecific = false;
      public double windSpeed = (double)0.0F;
      public double windAngle = (double)0.0F;
      public double windTargetSpeed = (double)0.0F;
      public double windTargetAngle = (double)0.0F;
      public double tmp_baseChance = (double)0.0F;
      public double tmp_dx = (double)0.0F;
      public double tmp_dz = (double)0.0F;
      public double tmp_windResult = (double)0.0F;
      public boolean windSpeedLock = false;
      public boolean windAngleLock = false;
      public double windBaseSpeed = (double)0.0F;
      public double gustStrength = (double)0.0F;
      public double gustTarget = (double)0.0F;
      public double gustTimer = (double)0.0F;
      public double gustMaxAdd = (double)0.0F;
      public static MapVariables clientSide = new MapVariables();

      public static MapVariables load(class_2487 tag, class_7225.class_7874 lookupProvider) {
         MapVariables data = new MapVariables();
         data.read(tag, lookupProvider);
         return data;
      }

      public void read(class_2487 nbt, class_7225.class_7874 lookupProvider) {
         this.burntOn = nbt.method_10577("burntOn");
         this.rainExtinguish = nbt.method_10577("rainExtinguish");
         this.collapseOn = nbt.method_10577("collapseOn");
         this.flameParticles = nbt.method_10577("flameParticles");
         this.ashParticles = nbt.method_10577("ashParticles");
         this.burnDamage = nbt.method_10577("burnDamage");
         this.smokeParticles = nbt.method_10577("smokeParticles");
         this.sootOn = nbt.method_10577("sootOn");
         this.vanillaCatch = nbt.method_10577("vanillaCatch");
         this.craftedBlocksBurn = nbt.method_10577("craftedBlocksBurn");
         this.woolBurns = nbt.method_10577("woolBurns");
         this.flameBowOn = nbt.method_10577("flameBowOn");
         this.fireAspectOn = nbt.method_10577("fireAspectOn");
         this.lightningCatch = nbt.method_10577("lightningCatch");
         this.smokeFogParticles = nbt.method_10577("smokeFogParticles");
         this.burnChestContents = nbt.method_10577("burnChestContents");
         this.playerDistance = nbt.method_10574("playerDistance");
         this.grassRecovery = nbt.method_10574("grassRecovery");
         this.burnSpeed = nbt.method_10574("burnSpeed");
         this.burnSpread = nbt.method_10574("burnSpread");
         this.groundSpread = nbt.method_10574("groundSpread");
         this.burning = nbt.method_10574("burning");
         this.chanceCollapse = nbt.method_10574("chanceCollapse");
         this.forestRecovery = nbt.method_10577("forestRecovery");
         this.distantSmoke = nbt.method_10577("distantSmoke");
         this.sc_found = nbt.method_10577("sc_found");
         this.sc_tx = nbt.method_10574("sc_tx");
         this.sc_tz = nbt.method_10574("sc_tz");
         this.sc_nextLocate = nbt.method_10574("sc_nextLocate");
         this.prevDistantSmoke = nbt.method_10577("prevDistantSmoke");
         this.biomeSpecific = nbt.method_10577("biomeSpecific");
         this.windSpeed = nbt.method_10574("windSpeed");
         this.windAngle = nbt.method_10574("windAngle");
         this.windTargetSpeed = nbt.method_10574("windTargetSpeed");
         this.windTargetAngle = nbt.method_10574("windTargetAngle");
         this.tmp_baseChance = nbt.method_10574("tmp_baseChance");
         this.tmp_dx = nbt.method_10574("tmp_dx");
         this.tmp_dz = nbt.method_10574("tmp_dz");
         this.tmp_windResult = nbt.method_10574("tmp_windResult");
         this.windSpeedLock = nbt.method_10577("windSpeedLock");
         this.windAngleLock = nbt.method_10577("windAngleLock");
         this.windBaseSpeed = nbt.method_10574("windBaseSpeed");
         this.gustStrength = nbt.method_10574("gustStrength");
         this.gustTarget = nbt.method_10574("gustTarget");
         this.gustTimer = nbt.method_10574("gustTimer");
         this.gustMaxAdd = nbt.method_10574("gustMaxAdd");
      }

      public class_2487 method_75(class_2487 nbt, class_7225.class_7874 lookupProvider) {
         nbt.method_10556("burntOn", this.burntOn);
         nbt.method_10556("rainExtinguish", this.rainExtinguish);
         nbt.method_10556("collapseOn", this.collapseOn);
         nbt.method_10556("flameParticles", this.flameParticles);
         nbt.method_10556("ashParticles", this.ashParticles);
         nbt.method_10556("burnDamage", this.burnDamage);
         nbt.method_10556("smokeParticles", this.smokeParticles);
         nbt.method_10556("sootOn", this.sootOn);
         nbt.method_10556("vanillaCatch", this.vanillaCatch);
         nbt.method_10556("craftedBlocksBurn", this.craftedBlocksBurn);
         nbt.method_10556("woolBurns", this.woolBurns);
         nbt.method_10556("flameBowOn", this.flameBowOn);
         nbt.method_10556("fireAspectOn", this.fireAspectOn);
         nbt.method_10556("lightningCatch", this.lightningCatch);
         nbt.method_10556("smokeFogParticles", this.smokeFogParticles);
         nbt.method_10556("burnChestContents", this.burnChestContents);
         nbt.method_10549("playerDistance", this.playerDistance);
         nbt.method_10549("grassRecovery", this.grassRecovery);
         nbt.method_10549("burnSpeed", this.burnSpeed);
         nbt.method_10549("burnSpread", this.burnSpread);
         nbt.method_10549("groundSpread", this.groundSpread);
         nbt.method_10549("burning", this.burning);
         nbt.method_10549("chanceCollapse", this.chanceCollapse);
         nbt.method_10556("forestRecovery", this.forestRecovery);
         nbt.method_10556("distantSmoke", this.distantSmoke);
         nbt.method_10556("sc_found", this.sc_found);
         nbt.method_10549("sc_tx", this.sc_tx);
         nbt.method_10549("sc_tz", this.sc_tz);
         nbt.method_10549("sc_nextLocate", this.sc_nextLocate);
         nbt.method_10556("prevDistantSmoke", this.prevDistantSmoke);
         nbt.method_10556("biomeSpecific", this.biomeSpecific);
         nbt.method_10549("windSpeed", this.windSpeed);
         nbt.method_10549("windAngle", this.windAngle);
         nbt.method_10549("windTargetSpeed", this.windTargetSpeed);
         nbt.method_10549("windTargetAngle", this.windTargetAngle);
         nbt.method_10549("tmp_baseChance", this.tmp_baseChance);
         nbt.method_10549("tmp_dx", this.tmp_dx);
         nbt.method_10549("tmp_dz", this.tmp_dz);
         nbt.method_10549("tmp_windResult", this.tmp_windResult);
         nbt.method_10556("windSpeedLock", this.windSpeedLock);
         nbt.method_10556("windAngleLock", this.windAngleLock);
         nbt.method_10549("windBaseSpeed", this.windBaseSpeed);
         nbt.method_10549("gustStrength", this.gustStrength);
         nbt.method_10549("gustTarget", this.gustTarget);
         nbt.method_10549("gustTimer", this.gustTimer);
         nbt.method_10549("gustMaxAdd", this.gustMaxAdd);
         return nbt;
      }

      public void markSyncDirty() {
         this.method_80();
         this._syncDirty = true;
      }

      public static MapVariables get(class_1936 world) {
         if (world instanceof class_5425 serverLevelAcc) {
            return (MapVariables)serverLevelAcc.method_8410().method_8503().method_3847(class_1937.field_25179).method_17983().method_17924(new class_18.class_8645(MapVariables::new, MapVariables::load, (class_4284)null), "burnt_mapvars");
         } else {
            return clientSide;
         }
      }
   }

   public static class WorldVariables extends class_18 {
      public static final String DATA_NAME = "burnt_worldvars";
      public boolean _syncDirty = false;
      public boolean plumeObjMade = false;
      public boolean flameObjMade = false;
      public double flameCount = (double)0.0F;
      public double plumeCap = (double)1000.0F;
      public static WorldVariables clientSide = new WorldVariables();

      public static WorldVariables load(class_2487 tag, class_7225.class_7874 lookupProvider) {
         WorldVariables data = new WorldVariables();
         data.read(tag, lookupProvider);
         return data;
      }

      public void read(class_2487 nbt, class_7225.class_7874 lookupProvider) {
         this.plumeObjMade = nbt.method_10577("plumeObjMade");
         this.flameObjMade = nbt.method_10577("flameObjMade");
         this.flameCount = nbt.method_10574("flameCount");
         this.plumeCap = nbt.method_10574("plumeCap");
      }

      public class_2487 method_75(class_2487 nbt, class_7225.class_7874 lookupProvider) {
         nbt.method_10556("plumeObjMade", this.plumeObjMade);
         nbt.method_10556("flameObjMade", this.flameObjMade);
         nbt.method_10549("flameCount", this.flameCount);
         nbt.method_10549("plumeCap", this.plumeCap);
         return nbt;
      }

      public void markSyncDirty() {
         this.method_80();
         this._syncDirty = true;
      }

      public static WorldVariables get(class_1936 world) {
         if (world instanceof class_3218 level) {
            return (WorldVariables)level.method_17983().method_17924(new class_18.class_8645(WorldVariables::new, WorldVariables::load, (class_4284)null), "burnt_worldvars");
         } else {
            return clientSide;
         }
      }
   }

   public static class PlayerVariables {
      public static final Codec<PlayerVariables> CODEC = RecordCodecBuilder.create((instance) -> instance.group(Codec.BOOL.fieldOf("arrowFired").orElse(false).forGetter((v) -> v.arrowFired), Codec.BOOL.fieldOf("extinguisherOn").orElse(false).forGetter((v) -> v.extinguisherOn), Codec.DOUBLE.fieldOf("PlayerTickDelay").orElse((double)0.0F).forGetter((v) -> v.PlayerTickDelay), Codec.DOUBLE.fieldOf("smokeAir").orElse((double)100.0F).forGetter((v) -> v.smokeAir), Codec.DOUBLE.fieldOf("dl_cool").orElse((double)0.0F).forGetter((v) -> v.dl_cool), Codec.BOOL.fieldOf("dl_pending_clear").orElse(false).forGetter((v) -> v.dl_pending_clear), Codec.BOOL.fieldOf("dl_active").orElse(false).forGetter((v) -> v.dl_active), Codec.DOUBLE.fieldOf("ml_cool").orElse((double)0.0F).forGetter((v) -> v.ml_cool), Codec.BOOL.fieldOf("ml_pending_clear").orElse(false).forGetter((v) -> v.ml_pending_clear), Codec.BOOL.fieldOf("ml_active").orElse(false).forGetter((v) -> v.ml_active), Codec.DOUBLE.fieldOf("mol_cool").orElse((double)0.0F).forGetter((v) -> v.mol_cool), Codec.BOOL.fieldOf("mol_pending_clear").orElse(false).forGetter((v) -> v.mol_pending_clear), Codec.BOOL.fieldOf("mol_active").orElse(false).forGetter((v) -> v.mol_active)).apply(instance, (arrowFired, extinguisherOn, playerTickDelay, smokeAir, dl_cool, dl_pending_clear, dl_active, ml_cool, ml_pending_clear, ml_active, mol_cool, mol_pending_clear, mol_active) -> {
            PlayerVariables v = new PlayerVariables();
            v.arrowFired = arrowFired;
            v.extinguisherOn = extinguisherOn;
            v.PlayerTickDelay = playerTickDelay;
            v.smokeAir = smokeAir;
            v.dl_cool = dl_cool;
            v.dl_pending_clear = dl_pending_clear;
            v.dl_active = dl_active;
            v.ml_cool = ml_cool;
            v.ml_pending_clear = ml_pending_clear;
            v.ml_active = ml_active;
            v.mol_cool = mol_cool;
            v.mol_pending_clear = mol_pending_clear;
            v.mol_active = mol_active;
            return v;
         }));
      public boolean _syncDirty = false;
      public boolean arrowFired = false;
      public boolean extinguisherOn = false;
      public double PlayerTickDelay = (double)0.0F;
      public double smokeAir = (double)100.0F;
      public double dl_cool = (double)0.0F;
      public boolean dl_pending_clear = false;
      public boolean dl_active = false;
      public double ml_cool = (double)0.0F;
      public boolean ml_pending_clear = false;
      public boolean ml_active = false;
      public double mol_cool = (double)0.0F;
      public boolean mol_pending_clear = false;
      public boolean mol_active = false;

      public static PlayerVariables get(class_1297 entity) {
         return (PlayerVariables)entity.getAttachedOrCreate(BurntModVariables.PLAYER_VARIABLES);
      }

      public class_2487 serializeNBT(class_7225.class_7874 lookupProvider) {
         class_2487 nbt = new class_2487();
         nbt.method_10556("arrowFired", this.arrowFired);
         nbt.method_10556("extinguisherOn", this.extinguisherOn);
         nbt.method_10549("PlayerTickDelay", this.PlayerTickDelay);
         nbt.method_10549("smokeAir", this.smokeAir);
         nbt.method_10549("dl_cool", this.dl_cool);
         nbt.method_10556("dl_pending_clear", this.dl_pending_clear);
         nbt.method_10556("dl_active", this.dl_active);
         nbt.method_10549("ml_cool", this.ml_cool);
         nbt.method_10556("ml_pending_clear", this.ml_pending_clear);
         nbt.method_10556("ml_active", this.ml_active);
         nbt.method_10549("mol_cool", this.mol_cool);
         nbt.method_10556("mol_pending_clear", this.mol_pending_clear);
         nbt.method_10556("mol_active", this.mol_active);
         return nbt;
      }

      public void deserializeNBT(class_7225.class_7874 lookupProvider, class_2487 nbt) {
         this.arrowFired = nbt.method_10577("arrowFired");
         this.extinguisherOn = nbt.method_10577("extinguisherOn");
         this.PlayerTickDelay = nbt.method_10574("PlayerTickDelay");
         this.smokeAir = nbt.method_10574("smokeAir");
         this.dl_cool = nbt.method_10574("dl_cool");
         this.dl_pending_clear = nbt.method_10577("dl_pending_clear");
         this.dl_active = nbt.method_10577("dl_active");
         this.ml_cool = nbt.method_10574("ml_cool");
         this.ml_pending_clear = nbt.method_10577("ml_pending_clear");
         this.ml_active = nbt.method_10577("ml_active");
         this.mol_cool = nbt.method_10574("mol_cool");
         this.mol_pending_clear = nbt.method_10577("mol_pending_clear");
         this.mol_active = nbt.method_10577("mol_active");
      }

      public void markSyncDirty() {
         this._syncDirty = true;
      }
   }
}
