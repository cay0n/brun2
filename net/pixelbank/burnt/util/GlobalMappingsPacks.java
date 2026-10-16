package net.pixelbank.burnt.util;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Optional;
import net.minecraft.class_2561;
import net.minecraft.class_3258;
import net.minecraft.class_3259;
import net.minecraft.class_3264;
import net.minecraft.class_3285;
import net.minecraft.class_3288;
import net.minecraft.class_5352;
import net.minecraft.class_9224;
import net.minecraft.class_9225;
import net.minecraft.class_3288.class_3289;
import net.pixelbank.burnt.BurntMod;

public final class GlobalMappingsPacks {
   public static final String README = "Burnt - global block-mapping datapacks\n======================================\nA ready-to-edit starter pack (\"Burnt Block Mappings\") is placed in this folder\nautomatically on first run - open its files under data/burnt/tags/block/ and add\nyour blocks. You can also drop your own mapping datapacks here (a folder or a .zip,\nthe same kind you would put in <world>/datapacks/).\nEverything in this folder applies to EVERY world automatically - no per-save copying -\nand is always enabled. After adding or editing a pack, run /reload in-game (or rejoin\nthe world) to pick up the change.\n\nWhen Burnt ships an updated starter pack it replaces this one only if you have not\nedited it. If you have, yours is kept and a note appears in the log - delete the folder\nto take the new one. A pack from an older Burnt version is moved to ../mappings_backup\nfirst, so nothing is ever lost.\n";
   private static final String SEED_RESOURCE = "/burnt_seed/mappings.zip";
   private static final String SEED_PACK_NAME = "Burnt Block Mappings 1.21";
   private static final int SEED_PACK_VERSION = 2;

   public static Path folder(Path configDir) {
      return configDir.resolve("burnt").resolve("mappings");
   }

   public static void ensureFolder(Path folder) {
      try {
         Files.createDirectories(folder);
         Path readme = folder.resolve("README.txt");
         if (!Files.exists(readme, new LinkOption[0])) {
            Files.writeString(readme, "Burnt - global block-mapping datapacks\n======================================\nA ready-to-edit starter pack (\"Burnt Block Mappings\") is placed in this folder\nautomatically on first run - open its files under data/burnt/tags/block/ and add\nyour blocks. You can also drop your own mapping datapacks here (a folder or a .zip,\nthe same kind you would put in <world>/datapacks/).\nEverything in this folder applies to EVERY world automatically - no per-save copying -\nand is always enabled. After adding or editing a pack, run /reload in-game (or rejoin\nthe world) to pick up the change.\n\nWhen Burnt ships an updated starter pack it replaces this one only if you have not\nedited it. If you have, yours is kept and a note appears in the log - delete the folder\nto take the new one. A pack from an older Burnt version is moved to ../mappings_backup\nfirst, so nothing is ever lost.\n");
         }

         seedDefault(folder);
      } catch (IOException e) {
         BurntMod.LOGGER.warn("[Burnt] could not prepare global mappings folder {}: {}", folder, e.toString());
      }

   }

   private static void seedDefault(Path folder) {
      Path backupRoot = folder.getParent().resolve("mappings_backup");
      SeedPackMigration.Result result = SeedPackMigration.run(folder, "Burnt Block Mappings 1.21", 2, () -> GlobalMappingsPacks.class.getResourceAsStream("/burnt_seed/mappings.zip"), backupRoot);
      Path dest = folder.resolve("Burnt Block Mappings 1.21");
      switch (result) {
         case SEEDED -> BurntMod.LOGGER.info("[Burnt] seeded default mapping pack into {}", dest);
         case REPLACED -> BurntMod.LOGGER.info("[Burnt] updated the default mapping pack in {} (it was unedited)", dest);
         case BACKED_UP_AND_REPLACED -> BurntMod.LOGGER.info("[Burnt] replaced an older mapping pack with the current one; your previous copy is at {}. Any entries you added there need copying into {} to take effect.", SeedPackMigration.lastBackup, dest);
         case KEPT_USER_EDITS -> BurntMod.LOGGER.warn("[Burnt] the mapping pack in {} has been edited, so it was left as it is - but Burnt ships a newer one. Delete that folder to get the current pack (your copy is not touched otherwise).", dest);
         case FAILED -> BurntMod.LOGGER.warn("[Burnt] could not seed or update the default mapping pack in {}", folder);
      }

   }

   public static class_3285 source(Path folder) {
      return (onLoad) -> {
         if (Files.isDirectory(folder, new LinkOption[0])) {
            try {
               DirectoryStream<Path> stream = Files.newDirectoryStream(folder);

               try {
                  for(Path entry : stream) {
                     class_3288 pack = readPack(entry);
                     if (pack != null) {
                        onLoad.accept(pack);
                     }
                  }
               } catch (Throwable var7) {
                  if (stream != null) {
                     try {
                        stream.close();
                     } catch (Throwable x2) {
                        var7.addSuppressed(x2);
                     }
                  }

                  throw var7;
               }

               if (stream != null) {
                  stream.close();
               }
            } catch (IOException e) {
               BurntMod.LOGGER.warn("[Burnt] failed scanning global mappings folder: {}", e.toString());
            }

         }
      };
   }

   private static class_3288 readPack(Path entry) {
      boolean dir = Files.isDirectory(entry, new LinkOption[0]);
      String name = entry.getFileName().toString();
      boolean zip = !dir && name.toLowerCase(Locale.ROOT).endsWith(".zip");
      if (!dir && !zip) {
         return null;
      } else if (dir && !Files.isRegularFile(entry.resolve("pack.mcmeta"), new LinkOption[0])) {
         return null;
      } else {
         class_3288.class_7680 supplier = (class_3288.class_7680)(dir ? new class_3259.class_8619(entry) : new class_3258.class_8615(entry));
         class_9224 location = new class_9224("burnt_global/" + name, class_2561.method_43470(name), class_5352.field_25349, Optional.empty());
         class_9225 selection = new class_9225(true, class_3289.field_14280, false);
         return class_3288.method_45275(location, supplier, class_3264.field_14190, selection);
      }
   }

   private GlobalMappingsPacks() {
   }
}
