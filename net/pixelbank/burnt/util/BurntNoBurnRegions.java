package net.pixelbank.burnt.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.minecraft.class_3218;
import net.minecraft.class_5218;
import net.minecraft.server.MinecraftServer;
import net.pixelbank.burnt.BurntMod;

public final class BurntNoBurnRegions {
   private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
   private static final List<Region> REGIONS = new ArrayList();
   private static volatile boolean loaded = false;

   public static boolean blocks(class_1936 level, class_2338 from, class_2338 to) {
      if (level instanceof class_3218 server) {
         ensureLoaded(server.method_8503());
         if (REGIONS.isEmpty()) {
            return false;
         } else {
            String dim = server.method_27983().method_29177().toString();

            for(Region r : REGIONS) {
               if (r.contains(dim, to.method_10263(), to.method_10264(), to.method_10260())) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public static int add(class_3218 level, class_2338 a, class_2338 b) {
      ensureLoaded(level.method_8503());
      REGIONS.add(new Region(level.method_27983().method_29177().toString(), Math.min(a.method_10263(), b.method_10263()), Math.min(a.method_10264(), b.method_10264()), Math.min(a.method_10260(), b.method_10260()), Math.max(a.method_10263(), b.method_10263()), Math.max(a.method_10264(), b.method_10264()), Math.max(a.method_10260(), b.method_10260())));
      save(level.method_8503());
      return REGIONS.size();
   }

   public static List<String> list(MinecraftServer server) {
      ensureLoaded(server);
      List<String> out = new ArrayList();

      for(int i = 0; i < REGIONS.size(); ++i) {
         Region r = (Region)REGIONS.get(i);
         out.add(String.format("%d: %s  (%d, %d, %d) -> (%d, %d, %d)", i + 1, r.dimension(), r.minX(), r.minY(), r.minZ(), r.maxX(), r.maxY(), r.maxZ()));
      }

      return out;
   }

   public static boolean remove(MinecraftServer server, int oneBasedIndex) {
      ensureLoaded(server);
      if (oneBasedIndex >= 1 && oneBasedIndex <= REGIONS.size()) {
         REGIONS.remove(oneBasedIndex - 1);
         save(server);
         return true;
      } else {
         return false;
      }
   }

   public static int clear(MinecraftServer server) {
      ensureLoaded(server);
      int n = REGIONS.size();
      REGIONS.clear();
      save(server);
      return n;
   }

   public static int count(MinecraftServer server) {
      ensureLoaded(server);
      return REGIONS.size();
   }

   private static Path file(MinecraftServer server) {
      return server.method_27050(class_5218.field_24188).resolve("data").resolve("burnt_no_burn_regions.json");
   }

   private static void ensureLoaded(MinecraftServer server) {
      if (!loaded && server != null) {
         loadOnce(server);
      }
   }

   private static synchronized void loadOnce(MinecraftServer server) {
      if (!loaded) {
         loaded = true;
         Path path = file(server);
         if (Files.exists(path, new LinkOption[0])) {
            try {
               JsonArray arr = JsonParser.parseString(Files.readString(path)).getAsJsonArray();

               for(int i = 0; i < arr.size(); ++i) {
                  JsonObject o = arr.get(i).getAsJsonObject();
                  REGIONS.add(new Region(o.get("dimension").getAsString(), o.get("minX").getAsInt(), o.get("minY").getAsInt(), o.get("minZ").getAsInt(), o.get("maxX").getAsInt(), o.get("maxY").getAsInt(), o.get("maxZ").getAsInt()));
               }

               BurntMod.LOGGER.info("[Burnt] Loaded {} no-burn region(s).", REGIONS.size());
            } catch (Exception e) {
               BurntMod.LOGGER.error("[Burnt] Could not read {} - no-burn regions are NOT active.", path, e);
            }

         }
      }
   }

   private static synchronized void save(MinecraftServer server) {
      if (server != null) {
         Path path = file(server);

         try {
            Files.createDirectories(path.getParent());
            JsonArray arr = new JsonArray();

            for(Region r : REGIONS) {
               JsonObject o = new JsonObject();
               o.addProperty("dimension", r.dimension());
               o.addProperty("minX", r.minX());
               o.addProperty("minY", r.minY());
               o.addProperty("minZ", r.minZ());
               o.addProperty("maxX", r.maxX());
               o.addProperty("maxY", r.maxY());
               o.addProperty("maxZ", r.maxZ());
               arr.add(o);
            }

            Files.writeString(path, GSON.toJson(arr));
         } catch (Exception e) {
            BurntMod.LOGGER.error("[Burnt] Could not save no-burn regions to {}.", path, e);
         }

      }
   }

   public static synchronized void reset() {
      REGIONS.clear();
      loaded = false;
   }

   private BurntNoBurnRegions() {
   }

   private static record Region(String dimension, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
      boolean contains(String dim, int x, int y, int z) {
         return this.dimension.equals(dim) && x >= this.minX && x <= this.maxX && y >= this.minY && y <= this.maxY && z >= this.minZ && z <= this.maxZ;
      }
   }
}
