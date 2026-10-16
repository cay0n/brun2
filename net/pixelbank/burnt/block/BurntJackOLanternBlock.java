package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2746;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3620;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntPumpkinFlamesProcedure;
import net.pixelbank.burnt.procedures.WoodParticlesProcedure;

public class BurntJackOLanternBlock extends class_2248 {
   public static final class_2753 FACING;
   public static final class_2746 HOT;

   public BurntJackOLanternBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16028).method_9626(class_2498.field_11547).method_9632(1.0F).method_9631((s) -> 10).method_26247((bs, br, bp) -> true).method_26249((bs, br, bp) -> true));
      this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(FACING, class_2350.field_11043)).method_11657(HOT, false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{FACING, HOT});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)super.method_9605(context).method_11657(FACING, context.method_8042().method_10153())).method_11657(HOT, false);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return (class_2680)state.method_11657(FACING, rot.method_10503((class_2350)state.method_11654(FACING)));
   }

   public class_2680 method_9569(class_2680 state, class_2415 mirrorIn) {
      return state.method_26186(mirrorIn.method_10345((class_2350)state.method_11654(FACING)));
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      BurntPumpkinFlamesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      WoodParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   static {
      FACING = class_2383.field_11177;
      HOT = class_2746.method_11825("hot");
   }
}
