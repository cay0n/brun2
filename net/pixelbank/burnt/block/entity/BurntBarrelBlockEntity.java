package net.pixelbank.burnt.block.entity;

import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.minecraft.class_1262;
import net.minecraft.class_1278;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2371;
import net.minecraft.class_2487;
import net.minecraft.class_2561;
import net.minecraft.class_2621;
import net.minecraft.class_2622;
import net.minecraft.class_2680;
import net.minecraft.class_7225;
import net.pixelbank.burnt.init.BurntModBlockEntities;
import net.pixelbank.burnt.procedures.BurntBarrelGUIOpenProcedure;
import net.pixelbank.burnt.world.inventory.BurntBarrelGUIMenu;

public class BurntBarrelBlockEntity extends class_2621 implements class_1278 {
   private class_2371<class_1799> stacks;

   public BurntBarrelBlockEntity(class_2338 position, class_2680 state) {
      super(BurntModBlockEntities.BURNT_BARREL, position, state);
      this.stacks = class_2371.method_10213(27, class_1799.field_8037);
   }

   public void method_11014(class_2487 compound, class_7225.class_7874 lookupProvider) {
      super.method_11014(compound, lookupProvider);
      if (!this.method_54871(compound)) {
         this.stacks = class_2371.method_10213(this.method_5439(), class_1799.field_8037);
      }

      class_1262.method_5429(compound, this.stacks, lookupProvider);
   }

   public void method_11007(class_2487 compound, class_7225.class_7874 lookupProvider) {
      super.method_11007(compound, lookupProvider);
      if (!this.method_54872(compound)) {
         class_1262.method_5426(compound, this.stacks, lookupProvider);
      }

   }

   public class_2622 getUpdatePacket() {
      return class_2622.method_38585(this);
   }

   public class_2487 method_16887(class_7225.class_7874 lookupProvider) {
      return this.method_38242(lookupProvider);
   }

   public int method_5439() {
      return this.stacks.size();
   }

   public boolean method_5442() {
      for(class_1799 itemstack : this.stacks) {
         if (!itemstack.method_7960()) {
            return false;
         }
      }

      return true;
   }

   public class_2561 method_17823() {
      return class_2561.method_43470("burnt_barrel");
   }

   public int method_5444() {
      return 64;
   }

   public class_1703 method_5465(int id, class_1661 inventory) {
      BurntBarrelGUIOpenProcedure.execute(this.method_10997(), (double)this.field_11867.method_10263(), (double)this.field_11867.method_10264(), (double)this.field_11867.method_10260());
      return new BurntBarrelGUIMenu(id, inventory, this);
   }

   public class_2561 method_5476() {
      return class_2561.method_43470("Burnt Barrel");
   }

   protected class_2371<class_1799> method_11282() {
      return this.stacks;
   }

   protected void method_11281(class_2371<class_1799> stacks) {
      this.stacks = stacks;
   }

   public boolean method_5437(int index, class_1799 stack) {
      return true;
   }

   public int[] method_5494(class_2350 side) {
      return IntStream.range(0, this.method_5439()).toArray();
   }

   public boolean method_5492(int index, class_1799 itemstack, @Nullable class_2350 direction) {
      return this.method_5437(index, itemstack);
   }

   public boolean method_5493(int index, class_1799 itemstack, class_2350 direction) {
      return true;
   }
}
