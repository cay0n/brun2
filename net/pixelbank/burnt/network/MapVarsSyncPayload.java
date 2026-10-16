package net.pixelbank.burnt.network;

import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9129;
import net.minecraft.class_9139;

public record MapVarsSyncPayload(BurntModVariables.MapVariables data) implements class_8710 {
   public static final class_8710.class_9154<MapVarsSyncPayload> TYPE = new class_8710.class_9154(class_2960.method_60655("burnt", "mapvars_sync"));
   public static final class_9139<class_9129, MapVarsSyncPayload> STREAM_CODEC = class_9139.method_56437(MapVarsSyncPayload::write, MapVarsSyncPayload::read);

   public static void write(class_2540 buf, MapVarsSyncPayload msg) {
      BurntModVariables.MapVariables v = msg.data();
      buf.method_52964(v.burntOn);
      buf.method_52964(v.rainExtinguish);
      buf.method_52964(v.collapseOn);
      buf.method_52964(v.flameParticles);
      buf.method_52964(v.ashParticles);
      buf.method_52964(v.burnDamage);
      buf.method_52964(v.smokeParticles);
      buf.method_52964(v.sootOn);
      buf.method_52964(v.vanillaCatch);
      buf.method_52964(v.craftedBlocksBurn);
      buf.method_52964(v.woolBurns);
      buf.method_52964(v.flameBowOn);
      buf.method_52964(v.fireAspectOn);
      buf.method_52964(v.lightningCatch);
      buf.method_52964(v.smokeFogParticles);
      buf.method_52964(v.burnChestContents);
      buf.method_52940(v.playerDistance);
      buf.method_52940(v.grassRecovery);
      buf.method_52940(v.burnSpeed);
      buf.method_52940(v.burnSpread);
      buf.method_52940(v.groundSpread);
      buf.method_52940(v.burning);
      buf.method_52940(v.chanceCollapse);
      buf.method_52964(v.forestRecovery);
      buf.method_52964(v.distantSmoke);
      buf.method_52964(v.sc_found);
      buf.method_52940(v.sc_tx);
      buf.method_52940(v.sc_tz);
      buf.method_52940(v.sc_nextLocate);
      buf.method_52964(v.prevDistantSmoke);
      buf.method_52964(v.biomeSpecific);
      buf.method_52940(v.windSpeed);
      buf.method_52940(v.windAngle);
      buf.method_52940(v.windTargetSpeed);
      buf.method_52940(v.windTargetAngle);
      buf.method_52940(v.tmp_baseChance);
      buf.method_52940(v.tmp_dx);
      buf.method_52940(v.tmp_dz);
      buf.method_52940(v.tmp_windResult);
      buf.method_52964(v.windSpeedLock);
      buf.method_52964(v.windAngleLock);
      buf.method_52940(v.windBaseSpeed);
      buf.method_52940(v.gustStrength);
      buf.method_52940(v.gustTarget);
      buf.method_52940(v.gustTimer);
      buf.method_52940(v.gustMaxAdd);
   }

   public static MapVarsSyncPayload read(class_2540 buf) {
      BurntModVariables.MapVariables v = new BurntModVariables.MapVariables();
      v.burntOn = buf.readBoolean();
      v.rainExtinguish = buf.readBoolean();
      v.collapseOn = buf.readBoolean();
      v.flameParticles = buf.readBoolean();
      v.ashParticles = buf.readBoolean();
      v.burnDamage = buf.readBoolean();
      v.smokeParticles = buf.readBoolean();
      v.sootOn = buf.readBoolean();
      v.vanillaCatch = buf.readBoolean();
      v.craftedBlocksBurn = buf.readBoolean();
      v.woolBurns = buf.readBoolean();
      v.flameBowOn = buf.readBoolean();
      v.fireAspectOn = buf.readBoolean();
      v.lightningCatch = buf.readBoolean();
      v.smokeFogParticles = buf.readBoolean();
      v.burnChestContents = buf.readBoolean();
      v.playerDistance = buf.readDouble();
      v.grassRecovery = buf.readDouble();
      v.burnSpeed = buf.readDouble();
      v.burnSpread = buf.readDouble();
      v.groundSpread = buf.readDouble();
      v.burning = buf.readDouble();
      v.chanceCollapse = buf.readDouble();
      v.forestRecovery = buf.readBoolean();
      v.distantSmoke = buf.readBoolean();
      v.sc_found = buf.readBoolean();
      v.sc_tx = buf.readDouble();
      v.sc_tz = buf.readDouble();
      v.sc_nextLocate = buf.readDouble();
      v.prevDistantSmoke = buf.readBoolean();
      v.biomeSpecific = buf.readBoolean();
      v.windSpeed = buf.readDouble();
      v.windAngle = buf.readDouble();
      v.windTargetSpeed = buf.readDouble();
      v.windTargetAngle = buf.readDouble();
      v.tmp_baseChance = buf.readDouble();
      v.tmp_dx = buf.readDouble();
      v.tmp_dz = buf.readDouble();
      v.tmp_windResult = buf.readDouble();
      v.windSpeedLock = buf.readBoolean();
      v.windAngleLock = buf.readBoolean();
      v.windBaseSpeed = buf.readDouble();
      v.gustStrength = buf.readDouble();
      v.gustTarget = buf.readDouble();
      v.gustTimer = buf.readDouble();
      v.gustMaxAdd = buf.readDouble();
      return new MapVarsSyncPayload(v);
   }

   public class_8710.class_9154<MapVarsSyncPayload> method_56479() {
      return TYPE;
   }
}
