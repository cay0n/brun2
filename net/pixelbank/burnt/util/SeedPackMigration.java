package net.pixelbank.burnt.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class SeedPackMigration {
   public static final String STAMP_FILE = ".burnt_seed";
   public static Path lastBackup;

   public static Result run(Path folder, String packName, int version, Supplier<InputStream> zipSupplier, Path backupRoot) {
      lastBackup = null;

      try {
         Path dest = folder.resolve(packName);
         if (Files.exists(folder.resolve(packName + ".zip"), new LinkOption[0])) {
            return SeedPackMigration.Result.USER_ZIP;
         } else if (!Files.exists(dest, new LinkOption[0])) {
            extract(zipSupplier, dest);
            writeStamp(dest, version);
            return SeedPackMigration.Result.SEEDED;
         } else {
            int stamped = readStampVersion(dest);
            if (stamped >= version) {
               return SeedPackMigration.Result.UP_TO_DATE;
            } else if (stamped > 0) {
               if (!matchesStamp(dest)) {
                  return SeedPackMigration.Result.KEPT_USER_EDITS;
               } else {
                  deleteRecursively(dest);
                  extract(zipSupplier, dest);
                  writeStamp(dest, version);
                  return SeedPackMigration.Result.REPLACED;
               }
            } else {
               Path backup = backupRoot.resolve(packName + "-" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")));
               Files.createDirectories(backup.getParent());

               try {
                  Files.move(dest, backup, StandardCopyOption.ATOMIC_MOVE);
               } catch (IOException var9) {
                  copyRecursively(dest, backup);
                  deleteRecursively(dest);
               }

               lastBackup = backup;
               extract(zipSupplier, dest);
               writeStamp(dest, version);
               return SeedPackMigration.Result.BACKED_UP_AND_REPLACED;
            }
         }
      } catch (Exception var10) {
         return SeedPackMigration.Result.FAILED;
      }
   }

   private static void extract(Supplier<InputStream> zipSupplier, Path dest) throws IOException {
      InputStream in = (InputStream)zipSupplier.get();

      try {
         if (in == null) {
            throw new IOException("bundled template pack missing");
         }

         Path destAbs = dest.toAbsolutePath().normalize();
         ZipInputStream zip = new ZipInputStream(in);

         ZipEntry entry;
         try {
            while((entry = zip.getNextEntry()) != null) {
               Path target = destAbs.resolve(entry.getName()).normalize();
               if (target.startsWith(destAbs)) {
                  if (entry.isDirectory()) {
                     Files.createDirectories(target);
                  } else {
                     Files.createDirectories(target.getParent());
                     Files.copy(zip, target, new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                  }

                  zip.closeEntry();
               }
            }
         } catch (Throwable var9) {
            try {
               zip.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }

            throw var9;
         }

         zip.close();
      } catch (Throwable var10) {
         if (in != null) {
            try {
               in.close();
            } catch (Throwable var7) {
               var10.addSuppressed(var7);
            }
         }

         throw var10;
      }

      if (in != null) {
         in.close();
      }

   }

   private static void writeStamp(Path dest, int version) throws IOException {
      StringBuilder sb = (new StringBuilder("version=")).append(version).append('\n');

      for(Map.Entry<String, String> e : hashTree(dest).entrySet()) {
         sb.append((String)e.getValue()).append("  ").append((String)e.getKey()).append('\n');
      }

      Files.writeString(dest.resolve(".burnt_seed"), sb.toString(), StandardCharsets.UTF_8);
   }

   private static int readStampVersion(Path dest) {
      Path stamp = dest.resolve(".burnt_seed");
      if (!Files.isRegularFile(stamp, new LinkOption[0])) {
         return 0;
      } else {
         try {
            for(String line : Files.readAllLines(stamp, StandardCharsets.UTF_8)) {
               if (line.startsWith("version=")) {
                  return Integer.parseInt(line.substring(8).trim());
               }
            }
         } catch (Exception var4) {
         }

         return 0;
      }
   }

   private static boolean matchesStamp(Path dest) {
      try {
         Map<String, String> recorded = new HashMap();

         for(String line : Files.readAllLines(dest.resolve(".burnt_seed"), StandardCharsets.UTF_8)) {
            int split = line.indexOf("  ");
            if (split > 0) {
               recorded.put(line.substring(split + 2), line.substring(0, split));
            }
         }

         return recorded.equals(hashTree(dest));
      } catch (Exception var5) {
         return false;
      }
   }

   private static Map<String, String> hashTree(Path root) throws IOException {
      Map<String, String> out = new TreeMap();
      final List<Path> files = new ArrayList();
      Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
         public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            files.add(file);
            return FileVisitResult.CONTINUE;
         }
      });

      for(Path file : files) {
         String rel = root.relativize(file).toString().replace('\\', '/');
         if (!rel.equals(".burnt_seed")) {
            out.put(rel, sha256(file));
         }
      }

      return out;
   }

   private static String sha256(Path file) throws IOException {
      try {
         MessageDigest md = MessageDigest.getInstance("SHA-256");
         byte[] digest = md.digest(Files.readAllBytes(file));
         StringBuilder sb = new StringBuilder(digest.length * 2);

         for(byte b : digest) {
            sb.append(Character.forDigit(b >> 4 & 15, 16)).append(Character.forDigit(b & 15, 16));
         }

         return sb.toString();
      } catch (NoSuchAlgorithmException e) {
         throw new IOException(e);
      }
   }

   private static void copyRecursively(final Path from, final Path to) throws IOException {
      Files.walkFileTree(from, new SimpleFileVisitor<Path>() {
         public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Files.createDirectories(to.resolve(from.relativize(dir).toString()));
            return FileVisitResult.CONTINUE;
         }

         public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, to.resolve(from.relativize(file).toString()), StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;
         }
      });
   }

   private static void deleteRecursively(Path root) throws IOException {
      Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
         public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.delete(file);
            return FileVisitResult.CONTINUE;
         }

         public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
            if (e != null) {
               throw e;
            } else {
               Files.delete(dir);
               return FileVisitResult.CONTINUE;
            }
         }
      });
   }

   private SeedPackMigration() {
   }

   public static enum Result {
      SEEDED,
      UP_TO_DATE,
      REPLACED,
      BACKED_UP_AND_REPLACED,
      KEPT_USER_EDITS,
      USER_ZIP,
      FAILED;

      // $FF: synthetic method
      private static Result[] $values() {
         return new Result[]{SEEDED, UP_TO_DATE, REPLACED, BACKED_UP_AND_REPLACED, KEPT_USER_EDITS, USER_ZIP, FAILED};
      }
   }
}
