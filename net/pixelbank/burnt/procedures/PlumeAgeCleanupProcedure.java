package net.pixelbank.burnt.procedures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1936;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_6862;
import net.minecraft.class_7924;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.network.FireSkyPayload;
import net.pixelbank.burnt.network.SmokeFogPayload;
import net.pixelbank.burnt.util.PlumeManager;

public class PlumeAgeCleanupProcedure {
   private static final class_6862<class_2248> FIRE_TAG;
   private static final Map<UUID, Float> smoothedHaze;
   private static final Map<UUID, Float> smoothedFog;
   private static final float EMA_WEIGHT = 0.85F;
   private static final Map<String, Integer> disabledSweepDelay;
   private static final int IDLE_SWEEP_INTERVAL = 40;

   public static void execute(class_1936 world) {
      if (!world.method_8608()) {
         if (world instanceof class_3218) {
            class_3218 level = (class_3218)world;
            if (level.method_8401().method_188() % 25L == 0L) {
               boolean modOn = (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get();
               if ((Boolean)BurntBasicConfigConfiguration.DISTANT_PLUMES.get() && modOn) {
                  disabledSweepDelay.remove(level.method_27983().method_29177().toString());
                  List<class_1297> plumes = new ArrayList();
                  Set<UUID> living = new HashSet();

                  for(class_1297 e : level.method_27909()) {
                     if (e != null && e.method_5864() == class_1299.field_42456 && !e.method_31481() && e.method_5752().contains("burnt_any_plume")) {
                        plumes.add(e);
                        living.add(e.method_5667());
                     }
                  }

                  List<UUID> toKill = PlumeManager.tick(living, 160);
                  if (!toKill.isEmpty()) {
                     Set<UUID> killSet = new HashSet(toKill);

                     for(class_1297 e : plumes) {
                        if (killSet.contains(e.method_5667())) {
                           e.method_31472();
                           PlumeManager.remove(e.method_5667());
                        }
                     }
                  }

                  EnforcePlumeCapProcedureProcedure.execute(world);
                  updateFogAndHaze(level);
               } else {
                  String dim = level.method_27983().method_29177().toString();
                  int delay = (Integer)disabledSweepDelay.getOrDefault(dim, 0);
                  if (delay > 0) {
                     disabledSweepDelay.put(dim, delay - 1);
                  } else {
                     int found = 0;

                     for(class_1297 e : level.method_27909()) {
                        if (e != null && e.method_5864() == class_1299.field_42456 && e.method_5752().contains("burnt_any_plume")) {
                           e.method_31472();
                           PlumeManager.remove(e.method_5667());
                           ++found;
                        }
                     }

                     disabledSweepDelay.put(dim, found == 0 ? 40 : 0);
                  }

                  if (modOn) {
                     updateFogAndHaze(level);
                  }

               }
            }
         }
      }
   }

   private static void updateFogAndHaze(class_3218 level) {
      boolean doHaze = (Boolean)BurntBasicConfigConfiguration.HEAT_HAZE.get();
      boolean doFog = (Boolean)BurntBasicConfigConfiguration.SMOKE_FOG.get();
      if (doHaze || doFog) {
         int fireRadius = 16;
         float hazeThreshold = 18.0F;
         float fogThreshold = 9.0F;
         float scanLimit = Math.max(18.0F, 9.0F);

         for(class_3222 player : level.method_18456()) {
            class_2338 origin = player.method_24515();
            int fireyBlocks = 0;
            class_2338.class_2339 scan = new class_2338.class_2339();

            label54:
            for(int dx = -16; dx <= 16; ++dx) {
               for(int dz = -16; dz <= 16; ++dz) {
                  int wx = origin.method_10263() + dx;
                  int wz = origin.method_10260() + dz;
                  if (level.method_33598(wx, wz)) {
                     for(int dy = -16; dy <= 16; ++dy) {
                        if (level.method_8320(scan.method_10103(wx, origin.method_10264() + dy, wz)).method_26164(FIRE_TAG)) {
                           ++fireyBlocks;
                           if ((float)fireyBlocks >= scanLimit) {
                              break label54;
                           }
                        }
                     }
                  }
               }
            }

            UUID pid = player.method_5667();
            float rawHaze = Math.min((float)fireyBlocks / 18.0F, 1.0F);
            float rawFog = Math.min((float)fireyBlocks / 9.0F, 1.0F);
            float sHaze = (Float)smoothedHaze.getOrDefault(pid, rawHaze);
            float sFog = (Float)smoothedFog.getOrDefault(pid, rawFog);
            sHaze += 0.85F * (rawHaze - sHaze);
            sFog += 0.85F * (rawFog - sFog);
            smoothedHaze.put(pid, sHaze);
            smoothedFog.put(pid, sFog);
            if (doHaze) {
               ServerPlayNetworking.send(player, new FireSkyPayload(sHaze));
            }

            if (doFog) {
               ServerPlayNetworking.send(player, new SmokeFogPayload(sFog));
            }
         }
      }

   }

   static {
      FIRE_TAG = class_6862.method_40092(class_7924.field_41254, class_2960.method_60655("burnt", "fire"));
      smoothedHaze = new HashMap();
      smoothedFog = new HashMap();
      disabledSweepDelay = new HashMap();
   }
}
