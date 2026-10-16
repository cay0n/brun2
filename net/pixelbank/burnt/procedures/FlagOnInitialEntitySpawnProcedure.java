package net.pixelbank.burnt.procedures;

import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_2338;
import net.pixelbank.burnt.entity.FlagEntity;
import net.pixelbank.burnt.init.BurntModBlocks;

public class FlagOnInitialEntitySpawnProcedure {
   public static void execute(class_1936 world, double x, double y, double z, class_1297 entity) {
      if (entity != null) {
         if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.WHITE_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "white");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.BLACK_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "black");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.RED_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "red");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.YELLOW_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "yellow");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.PINK_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "pink");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.BLUE_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "blue");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.LIGHT_BLUE_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "light_blue");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.CYAN_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "cyan");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.GREEN_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "green");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.LIME_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "lime");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.PURPLE_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "purple");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.MAGENTA_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "magenta");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.ORANGE_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "orange");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.BROWN_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "brown");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.GREY_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "grey");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.LIGHT_GREY_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "light_grey");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.WIND_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "wind");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.RAINBOW_FLAG) {
            if (entity instanceof FlagEntity) {
               FlagEntity _datEntSetS = (FlagEntity)entity;
               _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "rainbow");
            }
         } else if (world.method_8320(class_2338.method_49637(x, y - (double)1.0F, z)).method_26204() == BurntModBlocks.PIRATE_FLAG && entity instanceof FlagEntity) {
            FlagEntity _datEntSetS = (FlagEntity)entity;
            _datEntSetS.method_5841().method_12778(FlagEntity.DATA_color, "pirate");
         }

      }
   }
}
