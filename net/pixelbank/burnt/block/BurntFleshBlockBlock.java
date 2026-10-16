package net.pixelbank.burnt.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2498;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_5819;
import net.minecraft.class_4970.class_2251;
import net.pixelbank.burnt.procedures.AnyFlamesPlacementProcedure;
import net.pixelbank.burnt.procedures.BurntFleshBlockOnTickUpdateProcedure;
import net.pixelbank.burnt.procedures.FleshBubblesParticlesProcedure;

public class BurntFleshBlockBlock extends class_2248 {
   public BurntFleshBlockBlock() {
      super(class_2251.method_9637().method_9626(class_2498.field_11545).method_9632(1.0F).method_9640());
   }

   public int method_9505(class_2680 state, class_1922 worldIn, class_2338 pos) {
      return 15;
   }

   public void method_9615(class_2680 blockstate, class_1937 world, class_2338 pos, class_2680 oldState, boolean moving) {
      super.method_9615(blockstate, world, pos, oldState, moving);
      AnyFlamesPlacementProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   public void method_9514(class_2680 blockstate, class_3218 world, class_2338 pos, class_5819 random) {
      super.method_9514(blockstate, world, pos, random);
      BurntFleshBlockOnTickUpdateProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }

   @Environment(EnvType.CLIENT)
   public void method_9496(class_2680 blockstate, class_1937 world, class_2338 pos, class_5819 random) {
      super.method_9496(blockstate, world, pos, random);
      FleshBubblesParticlesProcedure.execute(world, (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
   }
}
