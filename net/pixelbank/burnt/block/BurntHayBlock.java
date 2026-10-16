package net.pixelbank.burnt.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_2465;
import net.minecraft.class_2470;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2754;
import net.minecraft.class_2769;
import net.minecraft.class_3619;
import net.minecraft.class_3620;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4970.class_2251;

public class BurntHayBlock extends class_2346 {
   public static final class_2754<class_2350.class_2351> AXIS;
   public static final MapCodec<BurntHayBlock> CODEC;

   public MapCodec<BurntHayBlock> method_53969() {
      return CODEC;
   }

   public BurntHayBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16028).method_9626(class_2498.field_17580).method_9632(0.8F).method_50012(class_3619.field_15971).method_50013());
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

   static {
      AXIS = class_2741.field_12496;
      CODEC = method_54094((properties) -> new BurntHayBlock());
   }
}
