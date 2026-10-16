package net.pixelbank.burnt.procedures;

import net.minecraft.class_1657;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.util.BurntTags;

public class GrassCatchProcedure {
   public static void execute(class_1936 world, double x, double y, double z) {
      class_2680 targetBlock = class_2246.field_10124.method_9564();
      boolean burn = false;
      boolean done = false;
      double GrassSpeed = (double)0.0F;
      double fireSpeed = (double)0.0F;
      double targetx = (double)0.0F;
      double targety = (double)0.0F;
      double targetz = (double)0.0F;
      double dist = (double)0.0F;
      double ground = (double)0.0F;
      double windChance = (double)0.0F;
      double windChancePercent = (double)0.0F;
      double finalChance01 = (double)0.0F;
      double ground01 = (double)0.0F;
      if (!world.method_8608()) {
         if ((Boolean)BurntBasicConfigConfiguration.WIND.get()) {
            dist = (Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get();
            if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               ground = BiomeSpecificGroundProcedure.execute(world, x, y, z);
            } else {
               ground = (Double)BurntBasicConfigConfiguration.GROUND_SPREAD.get();
            }

            ground01 = ground / (double)100.0F;
            if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, y, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)-1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, y, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetz = z + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, y, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)-1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetz = z - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, y, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x + (double)1.0F;
                  targety = y + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)-1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x - (double)1.0F;
                  targety = y + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targety = y + (double)1.0F;
                  targetz = z + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)-1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targety = y + (double)1.0F;
                  targetz = z - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x + (double)1.0F;
                  targety = y - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)-1.0F, (double)0.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targetx = x - (double)1.0F;
                  targety = y - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(targetx, targety, z), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targety = y - (double)1.0F;
                  targetz = z + (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }

               windChance = WindAdjustedChanceProcedure.execute(world, x, y, z, (double)1.0F, (double)0.0F, (double)-1.0F);
               finalChance01 = windChance * ground01;
               windChancePercent = finalChance01 * (double)100.0F;
               if ((double)class_3532.method_15395(world.method_8409(), 1, 100) <= windChancePercent) {
                  targety = y - (double)1.0F;
                  targetz = z - (double)1.0F;
                  targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
                  if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                     if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                     } else {
                        world.method_8652(class_2338.method_49637(x, targety, targetz), class_2246.field_10219.method_9564(), 3);
                     }
                  }
               }
            }
         } else {
            dist = (Double)BurntBasicConfigConfiguration.PLAYER_DISTANCE.get();
            if ((Boolean)BurntBasicConfigConfiguration.BIOME.get()) {
               ground = BiomeSpecificGroundProcedure.execute(world, x, y, z);
            } else {
               ground = (Double)BurntBasicConfigConfiguration.GROUND_SPREAD.get();
            }

            if (!world.method_8390(class_1657.class, (new class_238(class_243.field_1353, class_243.field_1353)).method_997(new class_243(x, y, z)).method_1014(dist / (double)2.0F), (e) -> true).isEmpty()) {
               targetx = x + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetx = x - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, y, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, y, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, y, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetz = z + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, y, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetz = z - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, y, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, y, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, y, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetx = x + (double)1.0F;
               targety = y + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetx = x - (double)1.0F;
               targety = y + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targety = y + (double)1.0F;
               targetz = z + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targety = y + (double)1.0F;
               targetz = z - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetx = x + (double)1.0F;
               targety = y - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targetx = x - (double)1.0F;
               targety = y - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(targetx, targety, z));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(targetx, targety, z), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targety = y - (double)1.0F;
               targetz = z + (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }

               targety = y - (double)1.0F;
               targetz = z - (double)1.0F;
               targetBlock = world.method_8320(class_2338.method_49637(x, targety, targetz));
               if (targetBlock.method_26164(BurntTags.BLOCK_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_IW_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_RU_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BOP_GRASS_BLOCKS) || targetBlock.method_26164(BurntTags.BLOCK_BWG_GRASS_BLOCKS)) {
                  if ((double)class_3532.method_15395(world.method_8409(), 0, 100) <= ground) {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), blockStateWithInt(BurntModBlocks.SMOLDERING_GRASS_START.method_9564(), "stage", 1), 3);
                  } else {
                     world.method_8652(class_2338.method_49637(x, targety, targetz), BurntModBlocks.BURNT_GRASS.method_9564(), 3);
                  }
               }
            }
         }
      }

   }

   private static class_2680 blockStateWithInt(class_2680 blockState, String property, int newValue) {
      class_2769<?> prop = blockState.method_26204().method_9595().method_11663(property);
      class_2680 var10000;
      if (prop instanceof class_2758 ip) {
         if (prop.method_11898().contains(newValue)) {
            var10000 = (class_2680)blockState.method_11657(ip, newValue);
            return var10000;
         }
      }

      var10000 = blockState;
      return var10000;
   }
}
