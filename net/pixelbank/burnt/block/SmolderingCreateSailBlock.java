package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1676;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.BurntLogsFireDamageProcedure;
import net.pixelbank.burnt.procedures.SmolderingCreateSailTickProcedure;
import net.pixelbank.burnt.procedures.SmolderingPlanksParticlesProcedure;
import net.pixelbank.burnt.procedures.SnowballExtinguishProcedure;

public class SmolderingCreateSailBlock extends class_2248 {
   public static final class_2746 HOT = class_2746.method_11825("hot");
   public static final class_2753 FACING;
   private final class_265 shapeUp;
   private final class_265 shapeDown;
   private final class_265 shapeNorth;
   private final class_265 shapeSouth;
   private final class_265 shapeEast;
   private final class_265 shapeWest;

   public SmolderingCreateSailBlock() {
      this(true);
   }

   public SmolderingCreateSailBlock(boolean hasCanvas) {
      super(class_2251.method_9637().method_31710(class_3620.field_16002).method_9626(class_2498.field_11543).method_9632(0.8F).method_9631((s) -> 12).method_50012(class_3619.field_15971).method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_50013());
      this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(HOT, false)).method_11657(FACING, class_2350.field_11036));
      int top = hasCanvas ? 10 : 9;
      this.shapeUp = class_2248.method_9541((double)0.0F, (double)5.0F, (double)0.0F, (double)16.0F, (double)top, (double)16.0F);
      this.shapeDown = class_2248.method_9541((double)0.0F, (double)(16 - top), (double)0.0F, (double)16.0F, (double)11.0F, (double)16.0F);
      this.shapeNorth = class_2248.method_9541((double)0.0F, (double)0.0F, (double)(16 - top), (double)16.0F, (double)16.0F, (double)11.0F);
      this.shapeSouth = class_2248.method_9541((double)0.0F, (double)0.0F, (double)5.0F, (double)16.0F, (double)16.0F, (double)top);
      this.shapeEast = class_2248.method_9541((double)(16 - top), (double)0.0F, (double)0.0F, (double)11.0F, (double)16.0F, (double)16.0F);
      this.shapeWest = class_2248.method_9541((double)5.0F, (double)0.0F, (double)0.0F, (double)top, (double)16.0F, (double)16.0F);
   }

   public class_265 method_9530(class_2680 state, class_1922 level, class_2338 pos, class_3726 context) {
      class_265 var10000;
      switch ((class_2350)state.method_11654(FACING)) {
         case field_11033 -> var10000 = this.shapeDown;
         case field_11043 -> var10000 = this.shapeNorth;
         case field_11035 -> var10000 = this.shapeSouth;
         case field_11034 -> var10000 = this.shapeEast;
         case field_11039 -> var10000 = this.shapeWest;
         default -> var10000 = this.shapeUp;
      }

      return var10000;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{HOT, FACING});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)super.method_9605(context).method_11657(HOT, false)).method_11657(FACING, context.method_8038().method_10153());
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_SAIL);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 1);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      SmolderingCreateSailTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 1);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      SmolderingPlanksParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      BurntLogsFireDamageProcedure.execute(world, blockstate, entity);
   }

   public void method_19286(class_1937 world, class_2680 blockstate, class_3965 hit, class_1676 entity) {
      SnowballExtinguishProcedure.execute(world, (double)hit.method_17777().method_10263(), (double)hit.method_17777().method_10264(), (double)hit.method_17777().method_10260(), entity);
   }

   static {
      FACING = class_2741.field_12525;
   }
}
