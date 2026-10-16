package net.pixelbank.burnt.block;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1821;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3620;
import net.minecraft.class_3965;
import net.minecraft.class_5819;
import net.minecraft.class_9062;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.BurntDirtBlockAddedProcedure;
import net.pixelbank.burnt.procedures.BurntDirtNeighbourBlockChangesProcedure;
import net.pixelbank.burnt.procedures.BurntFarmlandHoeProcedure;
import net.pixelbank.burnt.procedures.GrassPathProcedure;
import net.pixelbank.burnt.procedures.GrassTickProcedure;
import net.pixelbank.burnt.util.BurntTags;

public class BurntDirtBlock extends class_2248 {
   public BurntDirtBlock() {
      super(class_2251.method_9637().method_31710(class_3620.field_16029).method_9626(class_2498.field_11529).method_9632(0.5F).method_9640());
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public class_9062 method_55765(class_1799 stack, class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_1268 hand, class_3965 hit) {
      if (stack.method_31573(BurntTags.ITEM_MC_HOES)) {
         BurntFarmlandHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_9062.field_47728;
      } else if (stack.method_7909() instanceof class_1821) {
         GrassPathProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_9062.field_47728;
      } else {
         return class_9062.field_47732;
      }
   }

   public class_1269 method_55766(class_2680 blockstate, class_1937 world, class_2338 pos, class_1657 entity, class_3965 hit) {
      class_1799 held = entity.method_6047();
      if (held.method_31573(BurntTags.ITEM_MC_HOES)) {
         BurntFarmlandHoeProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else if (held.method_7909() instanceof class_1821) {
         GrassPathProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), entity);
         return class_1269.field_5812;
      } else {
         return class_1269.field_5811;
      }
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      BurntDirtBlockAddedProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9612(class_2680 blockstate, class_1937 world, class_2338 pos, class_2248 neighborBlock, class_2338 fromPos, boolean moving) {
      super.method_9612(blockstate, world, pos, neighborBlock, fromPos, moving);
      BurntDirtNeighbourBlockChangesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      GrassTickProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }
}
