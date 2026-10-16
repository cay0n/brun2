package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.procedures.AzaleaFlameParticlesProcedure;
import net.pixelbank.burnt.procedures.FireDamageProcedure;
import net.pixelbank.burnt.procedures.SmolderingAzeleaBlockValidPlacementProcedure;
import net.pixelbank.burnt.procedures.SmolderingAzeleaTickProcedure;

public class SmolderingAzaleaBlock extends class_2248 {
   public static final class_2758 STAGE = class_2758.method_11867("stage", 0, 3);
   private static final class_265 SHAPE = class_259.method_1084(method_9541((double)6.0F, (double)0.0F, (double)6.0F, (double)10.0F, (double)8.0F, (double)10.0F), method_9541((double)0.0F, (double)8.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F));

   public SmolderingAzaleaBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16002).method_9626(class_2498.field_28694).method_9618().method_9631((s) -> 15).method_22488().method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true).method_26236((bs, br, bp) -> false).method_50013());
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(STAGE, 0));
   }

   public boolean method_9579(class_2680 state, class_1922 reader, class_2338 pos) {
      return true;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   public class_265 method_26159(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return class_259.method_1073();
   }

   public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
      return SHAPE;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{STAGE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(STAGE, 0);
   }

   public boolean method_9558(class_2680 blockstate, class_4538 worldIn, class_2338 pos) {
      if (worldIn instanceof class_1936 world) {
         int x = pos.method_10263();
         int y = pos.method_10264();
         int z = pos.method_10260();
         return SmolderingAzeleaBlockValidPlacementProcedure.execute(world, (double)x, (double)y, (double)z);
      } else {
         return super.method_9558(blockstate, worldIn, pos);
      }
   }

   public class_2680 method_9559(class_2680 state, class_2350 facing, class_2680 facingState, class_1936 world, class_2338 currentPos, class_2338 facingPos) {
      return !state.method_26184(world, currentPos) ? class_2246.field_10124.method_9564() : super.method_9559(state, facing, facingState, world, currentPos, facingPos);
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(BurntModBlocks.BURNT_AZALEA);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 60);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      SmolderingAzeleaTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
      world.method_39279(pos, this, 60);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      AzaleaFlameParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9548(class_2680 blockstate, class_1937 world, class_2338 pos, class_1297 entity) {
      super.method_9548(blockstate, world, pos, entity);
      FireDamageProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }

   public void method_9591(class_1937 world, class_2338 pos, class_2680 blockstate, class_1297 entity) {
      super.method_9591(world, pos, blockstate, entity);
      FireDamageProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
   }
}
