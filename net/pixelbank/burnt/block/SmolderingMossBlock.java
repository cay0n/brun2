package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1676;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3965;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurningMossTickProcedure;
import net.pixelbank.burnt.procedures.BurntLogsFireDamageProcedure;
import net.pixelbank.burnt.procedures.BurntMossSnowballProcedure;
import net.pixelbank.burnt.procedures.BurntPumpkinFlamesProcedure;
import net.pixelbank.burnt.procedures.MossParticlesProcedure;

public class SmolderingMossBlock extends class_2248 {
   public static final class_2758 STAGE = class_2758.method_11867("stage", 0, 3);

   public SmolderingMossBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_15981).method_9626(class_2498.field_28696).method_9618().method_9631((s) -> 10));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(STAGE, 0));
   }

   public boolean method_9579(class_2680 state, class_1922 reader, class_2338 pos) {
      return true;
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 0;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{STAGE});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(STAGE, 0);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 36);
      BurntPumpkinFlamesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      BurningMossTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 36);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      MossParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
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
      BurntMossSnowballProcedure.execute(world, (double)hit.method_17777().method_10263(), (double)hit.method_17777().method_10264(), (double)hit.method_17777().method_10260(), entity);
   }
}
