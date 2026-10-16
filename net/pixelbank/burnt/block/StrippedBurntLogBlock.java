package net.pixelbank.burnt.block;

import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2465;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2754;
import net.minecraft.class_2766;
import net.minecraft.class_2769;
import net.minecraft.class_3620;
import net.minecraft.class_8567;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntBlockDestroyedProcedure;
import net.pixelbank.burnt.util.BurntAshDrops;

public class StrippedBurntLogBlock extends class_2248 {
   public static final class_2754<class_2350.class_2351> AXIS;

   public StrippedBurntLogBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16015).method_9626(class_2498.field_11547).method_9629(1.0F, 3.0F).method_50013().method_51368(class_2766.field_12651));
      this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657(AXIS, class_2351.field_11052));
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
      super.method_9515(builder);
      builder.method_11667(new class_2769[]{AXIS});
   }

   public class_2680 method_9605(class_1750 context) {
      return (class_2680)super.method_9605(context).method_11657(AXIS, context.method_8038().method_10166());
   }

   public class_2680 method_9598(class_2680 state, class_2470 rot) {
      return class_2465.method_36377(state, rot);
   }

   public class_2680 method_9576(class_1937 world, class_2338 pos, class_2680 blockstate, class_1657 entity) {
      blockstate = super.method_9576(world, pos, blockstate, entity);
      BurntBlockDestroyedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
      return blockstate;
   }

   public List<class_1799> method_9560(class_2680 state, class_8567.class_8568 builder) {
      List<class_1799> drops = super.method_9560(state, builder);
      BurntAshDrops.appendAsh(drops, builder);
      return drops;
   }

   static {
      AXIS = class_2741.field_12496;
   }
}
