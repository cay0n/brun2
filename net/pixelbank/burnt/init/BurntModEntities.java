package net.pixelbank.burnt.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.class_1299;
import net.minecraft.class_1311;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_4048;
import net.minecraft.class_7923;
import net.pixelbank.burnt.entity.EmberProjectileEntity;
import net.pixelbank.burnt.entity.FallingSlabEntity;
import net.pixelbank.burnt.entity.FireballEntity;
import net.pixelbank.burnt.entity.FlagBlackEntity;
import net.pixelbank.burnt.entity.FlagEntity;
import net.pixelbank.burnt.entity.SparkEntity;
import net.pixelbank.burnt.entity.SprayEntity;
import net.pixelbank.burnt.entity.VisualSprayEntity;

public class BurntModEntities {
   public static class_1299<SprayEntity> SPRAY;
   public static class_1299<VisualSprayEntity> VISUAL_SPRAY;
   public static class_1299<FireballEntity> FIREBALL;
   public static class_1299<FallingSlabEntity> FALLING_SLAB;
   public static class_1299<SparkEntity> SPARK;
   public static class_1299<FlagEntity> FLAG;
   public static class_1299<FlagBlackEntity> FLAG_BLACK;
   public static class_1299<EmberProjectileEntity> EMBER_PROJECTILE;

   public static void register() {
      SPRAY = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "spray"), FabricEntityTypeBuilder.create(class_1311.field_17715, SprayEntity::new).dimensions(class_4048.method_18384(0.5F, 0.5F)).trackRangeBlocks(64).trackedUpdateRate(1).forceTrackedVelocityUpdates(true).build());
      VISUAL_SPRAY = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "visual_spray"), FabricEntityTypeBuilder.create(class_1311.field_17715, VisualSprayEntity::new).dimensions(class_4048.method_18384(0.5F, 0.5F)).trackRangeBlocks(64).trackedUpdateRate(1).forceTrackedVelocityUpdates(true).build());
      FIREBALL = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "fireball"), FabricEntityTypeBuilder.create(class_1311.field_17715, FireballEntity::new).dimensions(class_4048.method_18384(0.5F, 0.5F)).trackRangeBlocks(64).trackedUpdateRate(1).forceTrackedVelocityUpdates(true).build());
      FALLING_SLAB = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "falling_slab"), FabricEntityTypeBuilder.create(class_1311.field_6294, FallingSlabEntity::new).dimensions(class_4048.method_18384(0.6F, 1.8F)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).build());
      SPARK = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "spark"), FabricEntityTypeBuilder.create(class_1311.field_6302, SparkEntity::new).dimensions(class_4048.method_18384(0.6F, 1.8F)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).build());
      FLAG = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "flag"), FabricEntityTypeBuilder.create(class_1311.field_6302, FlagEntity::new).dimensions(class_4048.method_18384(0.4F, 0.6F)).trackRangeBlocks(256).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).build());
      FLAG_BLACK = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "flag_black"), FabricEntityTypeBuilder.create(class_1311.field_6302, FlagBlackEntity::new).dimensions(class_4048.method_18384(0.1F, 0.6F)).trackRangeBlocks(256).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).build());
      EMBER_PROJECTILE = (class_1299)class_2378.method_10230(class_7923.field_41177, class_2960.method_60655("burnt", "ember_projectile"), FabricEntityTypeBuilder.create(class_1311.field_17715, EmberProjectileEntity::new).dimensions(class_4048.method_18384(0.1F, 0.1F)).trackRangeBlocks(64).trackedUpdateRate(1).forceTrackedVelocityUpdates(true).build());
      FabricDefaultAttributeRegistry.register(FALLING_SLAB, FallingSlabEntity.createAttributes());
      FabricDefaultAttributeRegistry.register(SPARK, SparkEntity.createAttributes());
      FabricDefaultAttributeRegistry.register(FLAG, FlagEntity.createAttributes());
      FabricDefaultAttributeRegistry.register(FLAG_BLACK, FlagBlackEntity.createAttributes());
   }
}
