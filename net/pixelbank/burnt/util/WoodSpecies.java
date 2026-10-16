package net.pixelbank.burnt.util;

import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3542;
import net.minecraft.class_7923;

public enum WoodSpecies implements class_3542 {
   UNKNOWN("unknown", (class_2248)null),
   OAK("oak", class_2246.field_10394),
   BIRCH("birch", class_2246.field_10575),
   SPRUCE("spruce", class_2246.field_10217),
   JUNGLE("jungle", class_2246.field_10276),
   DARK_OAK("dark_oak", class_2246.field_10160),
   ACACIA("acacia", class_2246.field_10385),
   CHERRY("cherry", class_2246.field_42727),
   MANGROVE("mangrove", class_2246.field_37544),
   PALE_OAK("pale_oak", "pale_oak_sapling");

   private final String name;
   private final class_2248 sapling;
   private final String saplingId;

   private WoodSpecies(String name, class_2248 sapling) {
      this.name = name;
      this.sapling = sapling;
      this.saplingId = null;
   }

   private WoodSpecies(String name, String saplingId) {
      this.name = name;
      this.sapling = null;
      this.saplingId = saplingId;
   }

   public String method_15434() {
      return this.name;
   }

   public String getName() {
      return this.name;
   }

   public class_2248 getSapling() {
      return this.sapling != null ? this.sapling : (this.saplingId != null ? BurntVanilla.block(this.saplingId) : null);
   }

   public class_2680 getSaplingState() {
      class_2248 s = this.getSapling();
      return s != null ? s.method_9564() : class_2246.field_10124.method_9564();
   }

   public static WoodSpecies fromBlockId(class_2960 id) {
      if (id == null) {
         return UNKNOWN;
      } else {
         String path = id.method_12832();
         if (path.startsWith("sooty_")) {
            path = path.substring(6);
         }

         if (path.startsWith("stripped_")) {
            path = path.substring(9);
         }

         if (path.endsWith("_log")) {
            path = path.substring(0, path.length() - 4);
         }

         if (path.endsWith("_wood")) {
            path = path.substring(0, path.length() - 5);
         }

         for(WoodSpecies s : values()) {
            if (s != UNKNOWN && s.name.equals(path)) {
               return s;
            }
         }

         return UNKNOWN;
      }
   }

   public static WoodSpecies fromBlock(class_2248 block) {
      return fromBlockId(class_7923.field_41175.method_10221(block));
   }

   public static class_2680 applyTo(class_2680 state, WoodSpecies species) {
      if (state != null && species != null) {
         class_2769<?> prop = state.method_26204().method_9595().method_11663("species");
         if (prop instanceof class_2754) {
            try {
               return (class_2680)state.method_11657(prop, species);
            } catch (Exception var4) {
               return state;
            }
         } else {
            return state;
         }
      } else {
         return state;
      }
   }

   public static WoodSpecies readFrom(class_2680 state) {
      if (state == null) {
         return UNKNOWN;
      } else {
         class_2769<?> prop = state.method_26204().method_9595().method_11663("species");
         if (prop instanceof class_2754) {
            try {
               Object value = state.method_11654(prop);
               WoodSpecies var10000;
               if (value instanceof WoodSpecies) {
                  WoodSpecies ws = (WoodSpecies)value;
                  var10000 = ws;
               } else {
                  var10000 = UNKNOWN;
               }

               return var10000;
            } catch (Exception var4) {
               return UNKNOWN;
            }
         } else {
            return UNKNOWN;
         }
      }
   }

   // $FF: synthetic method
   private static WoodSpecies[] $values() {
      return new WoodSpecies[]{UNKNOWN, OAK, BIRCH, SPRUCE, JUNGLE, DARK_OAK, ACACIA, CHERRY, MANGROVE, PALE_OAK};
   }
}
