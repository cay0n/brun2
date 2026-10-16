package net.pixelbank.burnt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.class_124;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1548;
import net.minecraft.class_1646;
import net.minecraft.class_1665;
import net.minecraft.class_1667;
import net.minecraft.class_1679;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2315;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2397;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3264;
import net.minecraft.class_4770;
import net.pixelbank.burnt.ai.FleeFireGoal;
import net.pixelbank.burnt.command.BurntCommandCommand;
import net.pixelbank.burnt.compat.BurnMappingLoader;
import net.pixelbank.burnt.compat.ClaimBridge;
import net.pixelbank.burnt.compat.LevelZBridge;
import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;
import net.pixelbank.burnt.init.BurntModBlockEntities;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModEntities;
import net.pixelbank.burnt.init.BurntModItems;
import net.pixelbank.burnt.init.BurntModMenus;
import net.pixelbank.burnt.init.BurntModParticleTypes;
import net.pixelbank.burnt.init.BurntModSounds;
import net.pixelbank.burnt.init.BurntModTabs;
import net.pixelbank.burnt.item.ExtinguisherDispenserBehavior;
import net.pixelbank.burnt.network.BurntModVariables;
import net.pixelbank.burnt.network.FireSkyPayload;
import net.pixelbank.burnt.network.MapVarsSyncPayload;
import net.pixelbank.burnt.network.MenuStateUpdateMessage;
import net.pixelbank.burnt.network.SmokeFogPayload;
import net.pixelbank.burnt.procedures.ApplyBowEffectsToArrowProcedure;
import net.pixelbank.burnt.procedures.CoalRightClickProcedure;
import net.pixelbank.burnt.procedures.EmberRightClickProcedure;
import net.pixelbank.burnt.procedures.FlameCountResetProcedure;
import net.pixelbank.burnt.procedures.PlumRiseTickProcedure;
import net.pixelbank.burnt.procedures.PlumeAgeCleanupProcedure;
import net.pixelbank.burnt.procedures.PlumeConfigWatcherServerProcedure;
import net.pixelbank.burnt.procedures.SootBrushProcedure;
import net.pixelbank.burnt.procedures.StartFlintBurnProcedure;
import net.pixelbank.burnt.procedures.WindWakerProcedure;
import net.pixelbank.burnt.util.BurntStripping;
import net.pixelbank.burnt.util.BurntTags;
import net.pixelbank.burnt.util.BurntTerracottaCracking;
import net.pixelbank.burnt.util.PlumeManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BurntMod implements ModInitializer {
   public static final String MODID = "burnt";
   public static final Logger LOGGER = LoggerFactory.getLogger("burnt");
   public static volatile boolean killFire = false;
   public static volatile boolean forceRain = false;
   private static final ConcurrentLinkedQueue<DelayedWork> WORK_QUEUE = new ConcurrentLinkedQueue();

   public void onInitialize() {
      ClaimBridge.init();
      BurntBasicConfigConfiguration.register();
      FlammableBlockRegistry reg = FlammableBlockRegistry.getDefaultInstance();
      reg.add(class_2246.field_10010, 2, 5);
      reg.add(class_2246.field_10178, 2, 5);
      reg.add(class_2246.field_10244, 2, 5);
      reg.add(class_2246.field_10374, 2, 5);
      reg.add(class_2246.field_10035, 8, 15);
      reg.add(class_2246.field_10533, 300, 5);
      reg.add(class_2246.field_9999, 300, 5);
      reg.add(class_2246.field_10622, 300, 5);
      reg.add(class_2246.field_10103, 300, 5);
      reg.add(class_2246.field_10098, 300, 30);
      BurntModSounds.register();
      BurntModParticleTypes.register();
      BurntModBlocks.register();
      BurntStripping.registerFabric();
      BurntModItems.register();
      class_2315.method_10009(BurntModItems.EXTINGUISHER, new ExtinguisherDispenserBehavior());
      BurntModBlockEntities.register();
      BurntModMenus.register();
      BurntModTabs.register();
      BurntModEntities.register();
      ResourceManagerHelper.get(class_3264.field_14190).registerReloadListener(new BurnMappingLoader());
      ResourceManagerHelper.registerBuiltinResourcePack(class_2960.method_60654("burnt:compat"), (ModContainer)FabricLoader.getInstance().getModContainer("burnt").get(), ResourcePackActivationType.ALWAYS_ENABLED);
      ServerTickEvents.END_SERVER_TICK.register((ServerTickEvents.EndTick)(server) -> {
         tickWorkQueue();
         if (server.method_30002() != null) {
            BurntLightningRodGuard.cleanupStale(server.method_30002().method_8510());
         }

         if (server.method_30002() != null) {
            if (server.method_3780() % 4 == 0) {
               WindWakerProcedure.execute(server.method_30002());
            }

            BurntModVariables.MapVariables mv = BurntModVariables.MapVariables.get(server.method_30002());
            if (mv._syncDirty) {
               mv._syncDirty = false;
               MapVarsSyncPayload payload = new MapVarsSyncPayload(mv);

               for(class_3222 p : server.method_3760().method_14571()) {
                  ServerPlayNetworking.send(p, payload);
               }
            }
         }

         for(class_3218 level : server.method_3738()) {
            FlameCountResetProcedure.execute(level);
            PlumRiseTickProcedure.execute(level);
            PlumeAgeCleanupProcedure.execute(level);
            PlumeConfigWatcherServerProcedure.execute(level);

            for(class_3222 player : level.method_18456()) {
               SootBrushProcedure.execute(level, player);
            }
         }

      });
      UseBlockCallback.EVENT.register((UseBlockCallback)(player, world, hand, hitResult) -> world instanceof class_1937 && !LevelZBridge.blocksBlock(player, world.method_8320(hitResult.method_17777()).method_26204()) && BurntTerracottaCracking.tryCrack(world, hitResult.method_17777(), player, hand, player.method_5998(hand)) ? class_1269.field_5812 : class_1269.field_5811);
      UseBlockCallback.EVENT.register((UseBlockCallback)(player, world, hand, hitResult) -> {
         class_1799 stack = player.method_5998(hand);
         if (world instanceof class_1937 && !world.method_8608() && (stack.method_31574(class_1802.field_8884) || stack.method_31574(class_1802.field_8814))) {
            if (!(Boolean)BurntBasicConfigConfiguration.BURNT_ON.get()) {
               return class_1269.field_5811;
            }

            if (LevelZBridge.blocksItem(player, stack.method_7909()) || LevelZBridge.blocksBlock(player, world.method_8320(hitResult.method_17777()).method_26204())) {
               player.method_7353(class_2561.method_43471("restriction.levelz.locked.tooltip").method_27692(class_124.field_1061), true);
               return class_1269.field_5814;
            }

            class_2338 clickedPos = hitResult.method_17777();
            if (stack.method_31574(class_1802.field_8884) && world.method_8320(clickedPos).method_27852(class_2246.field_10381)) {
               CoalRightClickProcedure.execute(world, (double)clickedPos.method_10263(), (double)clickedPos.method_10264(), (double)clickedPos.method_10260(), player);
               return class_1269.field_5812;
            }

            if (stack.method_31574(class_1802.field_8884)) {
               class_2248 clickedBlock = world.method_8320(clickedPos).method_26204();
               if (clickedBlock == BurntModBlocks.BURNT_LOG || clickedBlock == BurntModBlocks.BURNT_WOOD || clickedBlock == BurntModBlocks.BURNT_PLANKS || clickedBlock == BurntModBlocks.BURNT_STAIRS || clickedBlock == BurntModBlocks.BURNT_SLAB || clickedBlock == BurntModBlocks.BURNT_FENCE || clickedBlock == BurntModBlocks.BURNT_FENCEGATE) {
                  EmberRightClickProcedure.execute(world, (double)clickedPos.method_10263(), (double)clickedPos.method_10264(), (double)clickedPos.method_10260(), player);
                  return class_1269.field_5812;
               }
            }

            if (!player.method_18276()) {
               class_2248 clickedBlock = world.method_8320(clickedPos).method_26204();
               if (clickedBlock == class_2246.field_16328 || clickedBlock == BurntModBlocks.BURNT_BARREL) {
                  return class_1269.field_5811;
               }
            }

            class_2680 clickedState = world.method_8320(clickedPos);
            if (clickedState.method_26164(BurntTags.BLOCK_MC_WOODEN_DOORS) || clickedState.method_26164(BurntTags.BLOCK_MC_WOODEN_TRAPDOORS)) {
               return class_1269.field_5811;
            }

            StartFlintBurnProcedure.execute(world, (double)clickedPos.method_10263(), (double)clickedPos.method_10264(), (double)clickedPos.method_10260());
            class_2338 firePos = clickedPos.method_10093(hitResult.method_17780());
            BurntLavaFireBlocker.markEntityPlaced(world, firePos);
            class_2680 belowFire = world.method_8320(firePos.method_10074());
            boolean placeOnLeafTop = hitResult.method_17780() == class_2350.field_11036 && belowFire.method_26204() instanceof class_2397;
            if ((!belowFire.method_51367() && !belowFire.method_26215() && belowFire.method_26227().method_15769() || placeOnLeafTop) && !(belowFire.method_26204() instanceof class_4770) && !belowFire.method_26164(BurntTags.BLOCK_FIRE) && world.method_8320(firePos).method_45474() && world.method_8316(firePos).method_15769()) {
               world.method_8652(firePos, BurntModBlocks.FIRESTARTER.method_9564(), 11);
            }
         }

         return class_1269.field_5811;
      });
      UseBlockCallback.EVENT.register((UseBlockCallback)(player, world, hand, hitResult) -> {
         if (world instanceof class_1937 && !world.method_8608()) {
            class_1799 stack = player.method_5998(hand);
            if (stack.method_7909() instanceof class_1743) {
               class_2338 pos = hitResult.method_17777();
               if (BurntStripping.dropsSoot(world.method_8320(pos))) {
                  class_2248.method_9577(world, pos, new class_1799(BurntModItems.SOOT));
               }
            }
         }

         return class_1269.field_5811;
      });
      BurntCommandCommand.register();
      PayloadTypeRegistry.playS2C().register(MapVarsSyncPayload.TYPE, MapVarsSyncPayload.STREAM_CODEC);
      PayloadTypeRegistry.playS2C().register(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage.STREAM_CODEC);
      PayloadTypeRegistry.playS2C().register(FireSkyPayload.TYPE, FireSkyPayload.STREAM_CODEC);
      PayloadTypeRegistry.playS2C().register(SmokeFogPayload.TYPE, SmokeFogPayload.STREAM_CODEC);
      ServerPlayConnectionEvents.JOIN.register((ServerPlayConnectionEvents.Join)(handler, sender, server) -> {
         class_3222 player = handler.field_14140;
         if (FabricLoader.getInstance().isModLoaded("dynamictrees") && !FabricLoader.getInstance().isModLoaded("burnt_dt")) {
            player.method_43496(class_2561.method_43470("You have Dynamic Trees installed, to burn them down you will need to install Burnt Dynamic Trees for the best experience"));
         }

         if (server.method_30002() != null) {
            ServerPlayNetworking.send(player, new MapVarsSyncPayload(BurntModVariables.MapVariables.get(server.method_30002())));
         }

      });
      ServerLifecycleEvents.SERVER_STOPPING.register((ServerLifecycleEvents.ServerStopping)(server) -> PlumeManager.clear());
      ServerEntityEvents.ENTITY_LOAD.register((ServerEntityEvents.Load)(entity, world) -> {
         if (entity instanceof class_1667 || entity instanceof class_1679) {
            ApplyBowEffectsToArrowProcedure.execute(world, entity.method_23317(), entity.method_23318(), entity.method_23321(), entity);
         }

         if (entity instanceof class_1646 villager) {
            villager.field_6201.method_6277(1, new FleeFireGoal(villager, 1.4));
         }

      });
      ServerLivingEntityEvents.AFTER_DAMAGE.register((ServerLivingEntityEvents.AfterDamage)(entity, source, baseDamage, damage, blocked) -> {
         if ((Boolean)BurntBasicConfigConfiguration.FLAME_ARROWS_IGNITE_CREEPERS.get()) {
            if (entity instanceof class_1548) {
               class_1548 creeper = (class_1548)entity;
               class_1297 patt0$temp = source.method_5526();
               if (patt0$temp instanceof class_1665) {
                  class_1665 arrow = (class_1665)patt0$temp;
                  if (arrow.method_5809()) {
                     creeper.method_7004();
                  }
               }
            }
         }
      });
      LOGGER.info("Burnt Basic initialized.");
   }

   public static void queueServerWork(int ticks, Runnable action) {
      WORK_QUEUE.add(new DelayedWork(action, ticks));
   }

   public static void tickWorkQueue() {
      List<DelayedWork> ready = new ArrayList();

      for(DelayedWork w : WORK_QUEUE) {
         --w.ticksLeft;
         if (w.ticksLeft <= 0) {
            ready.add(w);
         }
      }

      ready.forEach((wx) -> wx.action.run());
      WORK_QUEUE.removeAll(ready);
   }

   private static final class DelayedWork {
      final Runnable action;
      int ticksLeft;

      DelayedWork(Runnable action, int ticks) {
         this.action = action;
         this.ticksLeft = ticks;
      }
   }
}
