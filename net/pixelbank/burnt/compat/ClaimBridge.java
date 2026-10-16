package net.pixelbank.burnt.compat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.server.MinecraftServer;
import net.pixelbank.burnt.BurntMod;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.util.BurntNoBurnRegions;
import net.pixelbank.burnt.util.BurntProtection;

public final class ClaimBridge {
   private static Object ftbDisableProtection;
   private static Method ftbBooleanValueGet;
   private static Method ftbApi;
   private static Method ftbGetManager;
   private static Method ftbGetChunk;
   private static Constructor<?> ftbChunkDimPos;
   private static Method opacGet;
   private static Method opacClaimsManager;
   private static Method opacClaimAt;

   public static void init() {
      BurntProtection.register(BurntNoBurnRegions::blocks);
      if (FabricLoader.getInstance().isModLoaded("ftbchunks")) {
         try {
            Class<?> worldConfig = Class.forName("dev.ftb.mods.ftbchunks.FTBChunksWorldConfig");
            ftbDisableProtection = worldConfig.getField("DISABLE_PROTECTION").get((Object)null);
            ftbBooleanValueGet = ftbDisableProtection.getClass().getMethod("get");
            Class<?> chunkDimPos = Class.forName("dev.ftb.mods.ftblibrary.math.ChunkDimPos");
            ftbChunkDimPos = chunkDimPos.getConstructor(class_1937.class, class_2338.class);
            ftbApi = Class.forName("dev.ftb.mods.ftbchunks.api.FTBChunksAPI").getMethod("api");
            ftbGetManager = Class.forName("dev.ftb.mods.ftbchunks.api.FTBChunksAPI$API").getMethod("getManager");
            ftbGetChunk = Class.forName("dev.ftb.mods.ftbchunks.api.ClaimedChunkManager").getMethod("getChunk", chunkDimPos);
            BurntProtection.register(ClaimBridge::ftbBlocks);
            BurntMod.LOGGER.info("[Burnt] FTB Chunks detected - claimed chunks are closed to Burnt fire.");
         } catch (Throwable t) {
            ftbGetChunk = null;
            BurntMod.LOGGER.warn("[Burnt] FTB Chunks present but its claim API was not found; claimed chunks will NOT be protected from Burnt fire.", t);
         }
      }

      if (FabricLoader.getInstance().isModLoaded("openpartiesandclaims")) {
         try {
            Class<?> serverApi = Class.forName("xaero.pac.common.server.api.OpenPACServerAPI");
            opacGet = serverApi.getMethod("get", MinecraftServer.class);
            opacClaimsManager = serverApi.getMethod("getServerClaimsManager");
            opacClaimAt = Class.forName("xaero.pac.common.claims.api.IClaimsManagerAPI").getMethod("get", class_2960.class, class_2338.class);
            BurntProtection.register(ClaimBridge::opacBlocks);
            BurntMod.LOGGER.info("[Burnt] Open Parties and Claims detected - claimed chunks are closed to Burnt fire.");
         } catch (Throwable t) {
            opacClaimAt = null;
            BurntMod.LOGGER.warn("[Burnt] Open Parties and Claims present but its claim API was not found; claimed chunks will NOT be protected from Burnt fire.", t);
         }
      }

   }

   private static boolean allowedByConfig() {
      return (Boolean)BurntBasicConfigConfiguration.BURN_IN_CLAIMED_CHUNKS.get();
   }

   private static boolean ftbBlocks(class_1936 level, class_2338 from, class_2338 to) {
      if (ftbGetChunk != null && !allowedByConfig() && level instanceof class_1937) {
         try {
            if ((Boolean)ftbBooleanValueGet.invoke(ftbDisableProtection)) {
               return false;
            } else {
               Object api = ftbApi.invoke((Object)null);
               if (api == null) {
                  return false;
               } else {
                  Object manager = ftbGetManager.invoke(api);
                  if (manager == null) {
                     return false;
                  } else {
                     return ftbGetChunk.invoke(manager, ftbChunkDimPos.newInstance((class_1937)level, to)) != null;
                  }
               }
            }
         } catch (Throwable t) {
            ftbGetChunk = null;
            BurntMod.LOGGER.error("[Burnt] FTB Chunks claim lookup failed - bridge disabled.", t);
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean opacBlocks(class_1936 level, class_2338 from, class_2338 to) {
      if (opacClaimAt != null && !allowedByConfig() && level instanceof class_3218 server) {
         try {
            Object api = opacGet.invoke((Object)null, server.method_8503());
            if (api == null) {
               return false;
            } else {
               Object manager = opacClaimsManager.invoke(api);
               if (manager == null) {
                  return false;
               } else {
                  return opacClaimAt.invoke(manager, server.method_27983().method_29177(), to) != null;
               }
            }
         } catch (Throwable t) {
            opacClaimAt = null;
            BurntMod.LOGGER.error("[Burnt] Open Parties and Claims claim lookup failed - bridge disabled.", t);
            return false;
         }
      } else {
         return false;
      }
   }

   private ClaimBridge() {
   }
}
