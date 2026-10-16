package net.pixelbank.burnt.block;

import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2465;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2754;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_4538;
import net.minecraft.class_5819;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.FlamesPlacementProcedure;
import net.pixelbank.burnt.procedures.WoodStarterTickProcedure;

public class SootyMangroveWoodBlock extends class_2248 {
   public static final class_2754<class_2350.class_2351> AXIS;
   public static final class_2746 HOT;

   public SootyMangroveWoodBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11547).method_9632(2.0F).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(AXIS, class_2351.field_11052)).method_11657(HOT, false));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{AXIS, HOT});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)((class_2680)super.method_9605(context).method_11657(AXIS, context.method_8038().method_10166())).method_11657(HOT, false);
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return class_2465.method_36377(state, rot);
   }

   public class_1799 method_9574(class_4538 level, class_2338 pos, class_2680 state) {
      return new class_1799(class_2246.field_37549);
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      world.method_39279(pos, this, 12);
      FlamesPlacementProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9588(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9588(blockstate, world, pos, random);
      WoodStarterTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), blockstate);
      world.method_39279(pos, this, 12);
   }

   static {
      AXIS = class_2741.field_12496;
      HOT = class_2746.method_11825("hot");
   }
}
