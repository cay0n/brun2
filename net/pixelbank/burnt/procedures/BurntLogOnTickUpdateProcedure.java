package net.pixelbank.burnt.procedures;

import net.minecraft.class_1936;
import net.minecraft.class_1959;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_6880;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.WoodSpecies;

public class BurntLogOnTickUpdateProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_2680 blockstate) {
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.FOREST_RECOVERY.get()) {
            double speed = (Double)BurntBasicConfigConfiguration.FOREST_RECOVER_SPEED.get();
            if (!(speed <= (double)0.0F)) {
               class_2769 var11 = blockstate.method_26204().method_9595().method_11663("fragile");
               if (var11 instanceof class_2746) {
                  class_2746 fragileProp = (class_2746)var11;
                  if ((Boolean)blockstate.method_11654(fragileProp)) {
                     class_2338 pos = class_2338.method_49637(x, y, z);
                     class_2338 above = pos.method_10084();
                     class_2338 below = pos.method_10074();
                     if (world.method_8320(above).method_26204() == BurntModBlocks.BURNT_LEAVES) {
                        world.method_22352(above, false);
                     }

                     class_2680 aboveState = world.method_8320(above);
                     class_2680 belowState = world.method_8320(below);
                     boolean airAbove = aboveState.method_26164(BurntTags.BLOCK_AIR);
                     boolean airBelow = belowState.method_26164(BurntTags.BLOCK_AIR);
                     if (!airAbove && !airBelow) {
                        return;
                     }

                     boolean dirtBelow = belowState.method_26204() == BurntModBlocks.BURNT_DIRT || belowState.method_26204() == class_2246.field_10566;
                     boolean nextToBuildBlock = world.method_8320(pos.method_10095()).method_26164(BurntTags.BLOCK_CRAFTABLES) || world.method_8320(pos.method_10078()).method_26164(BurntTags.BLOCK_CRAFTABLES) || world.method_8320(pos.method_10072()).method_26164(BurntTags.BLOCK_CRAFTABLES) || world.method_8320(pos.method_10067()).method_26164(BurntTags.BLOCK_CRAFTABLES) || belowState.method_26164(BurntTags.BLOCK_CRAFTABLES);
                     double replantChance = (Double)BurntBasicConfigConfiguration.FOREST_REPLANT_CHANCE.get() / (double)100.0F;
                     boolean shouldReplant = airAbove && dirtBelow && !nextToBuildBlock && Math.random() < replantChance;
                     if (shouldReplant) {
                        WoodSpecies species = WoodSpecies.readFrom(blockstate);
                        class_2680 sapling = species != WoodSpecies.UNKNOWN ? species.getSaplingState() : saplingForBiome(world, pos);
                        world.method_22352(pos, false);
                        world.method_8652(below, copyMatchingProps(belowState, class_2246.field_10566.method_9564()), 3);
                        if (!sapling.method_26215()) {
                           world.method_8652(pos, sapling, 3);
                        }
                     } else {
                        world.method_22352(pos, false);
                     }

                     return;
                  }
               }

            }
         }
      }
   }

   private static class_2680 saplingForBiome(class_1936 world, class_2338 pos) {
      class_6880<class_1959> biome = world.method_23753(pos);
      if (!biome.method_40226(class_2960.method_60654("jungle")) && !biome.method_40226(class_2960.method_60654("bamboo_jungle")) && !biome.method_40226(class_2960.method_60654("sparse_jungle"))) {
         if (biome.method_40226(class_2960.method_60654("dark_forest"))) {
            return Math.random() < (double)0.5F ? class_2246.field_10276.method_9564() : class_2246.field_10124.method_9564();
         } else if (!biome.method_40226(class_2960.method_60654("savanna")) && !biome.method_40226(class_2960.method_60654("savanna_plateau")) && !biome.method_40226(class_2960.method_60654("windswept_savanna"))) {
            if (!biome.method_40226(class_2960.method_60654("taiga")) && !biome.method_40226(class_2960.method_60654("old_growth_spruce_taiga")) && !biome.method_40226(class_2960.method_60654("old_growth_pine_taiga"))) {
               return Math.random() < (double)0.5F ? class_2246.field_10394.method_9564() : class_2246.field_10575.method_9564();
            } else {
               return class_2246.field_10217.method_9564();
            }
         } else {
            return class_2246.field_10385.method_9564();
         }
      } else {
         return class_2246.field_10276.method_9564();
      }
   }

   private static class_2680 copyMatchingProps(class_2680 source, class_2680 target) {
      for(class_2769<?> propOld : source.method_28501()) {
         class_2769 propNew = target.method_26204().method_9595().method_11663(propOld.method_11899());
         if (propNew != null && target.method_11654(propNew) != null) {
            try {
               target = (class_2680)target.method_11657(propNew, source.method_11654(propOld));
            } catch (Exception var6) {
            }
         }
      }

      return target;
   }
}
