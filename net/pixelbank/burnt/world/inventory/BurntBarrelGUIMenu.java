package net.pixelbank.burnt.world.inventory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1263;
import net.minecraft.class_1277;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_3914;
import net.pixelbank.burnt.block.entity.BurntBarrelBlockEntity;
import net.pixelbank.burnt.init.BurntModBlocks;
import net.pixelbank.burnt.init.BurntModMenus;
import net.pixelbank.burnt.procedures.BurntBarrelGUIClosedProcedure;

public class BurntBarrelGUIMenu extends class_1703 implements BurntModMenus.MenuAccessor {
   public final Map<String, Object> menuState = new HashMap<String, Object>() {
      public Object put(String key, Object value) {
         return !this.containsKey(key) && this.size() >= 28 ? null : super.put(key, value);
      }
   };
   public final class_1937 world;
   public final class_1657 entity;
   public int x;
   public int y;
   public int z;
   private final class_3914 access;
   private final class_1263 internal;
   private final Map<Integer, class_1735> customSlots = new HashMap();
   private static final int[][] SLOT_GRID = new int[][]{{8, 17}, {26, 17}, {44, 17}, {62, 17}, {80, 17}, {98, 17}, {116, 17}, {134, 17}, {152, 17}, {8, 35}, {26, 35}, {44, 35}, {62, 35}, {80, 35}, {98, 35}, {116, 35}, {134, 35}, {152, 35}, {8, 53}, {26, 53}, {44, 53}, {62, 53}, {80, 53}, {98, 53}, {116, 53}, {134, 53}, {152, 53}};

   public BurntBarrelGUIMenu(int id, class_1661 inv) {
      super(BurntModMenus.BURNT_BARREL_GUI, id);
      this.entity = inv.field_7546;
      this.world = inv.field_7546.method_37908();
      this.internal = new class_1277(27);
      this.access = class_3914.field_17304;
      this.initSlots(inv);
   }

   public BurntBarrelGUIMenu(int id, class_1661 inv, BurntBarrelBlockEntity be) {
      super(BurntModMenus.BURNT_BARREL_GUI, id);
      this.entity = inv.field_7546;
      this.world = inv.field_7546.method_37908();
      this.internal = be;
      this.x = be.method_11016().method_10263();
      this.y = be.method_11016().method_10264();
      this.z = be.method_11016().method_10260();
      this.access = class_3914.method_17392(be.method_10997(), be.method_11016());
      this.initSlots(inv);
   }

   private void initSlots(class_1661 inv) {
      for(int i = 0; i < 27; ++i) {
         this.customSlots.put(i, this.method_7621(new class_1735(this.internal, i, SLOT_GRID[i][0], SLOT_GRID[i][1])));
      }

      for(int si = 0; si < 3; ++si) {
         for(int sj = 0; sj < 9; ++sj) {
            this.method_7621(new class_1735(inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18));
         }
      }

      for(int si = 0; si < 9; ++si) {
         this.method_7621(new class_1735(inv, si, 8 + si * 18, 142));
      }

   }

   public boolean method_7597(class_1657 player) {
      return class_1703.method_17695(this.access, player, BurntModBlocks.BURNT_BARREL);
   }

   public class_1799 method_7601(class_1657 playerIn, int index) {
      class_1799 itemstack = class_1799.field_8037;
      class_1735 slot = (class_1735)this.field_7761.get(index);
      if (slot != null && slot.method_7681()) {
         class_1799 itemstack1 = slot.method_7677();
         itemstack = itemstack1.method_7972();
         if (index < 27) {
            if (!this.method_7616(itemstack1, 27, this.field_7761.size(), true)) {
               return class_1799.field_8037;
            }

            slot.method_7670(itemstack1, itemstack);
         } else if (!this.method_7616(itemstack1, 0, 27, false)) {
            return class_1799.field_8037;
         }

         if (itemstack1.method_7960()) {
            slot.method_53512(class_1799.field_8037);
         } else {
            slot.method_7668();
         }

         if (itemstack1.method_7947() == itemstack.method_7947()) {
            return class_1799.field_8037;
         }

         slot.method_7667(playerIn, itemstack1);
      }

      return itemstack;
   }

   public void method_7595(class_1657 playerIn) {
      super.method_7595(playerIn);
      BurntBarrelGUIClosedProcedure.execute(this.world, (double)this.x, (double)this.y, (double)this.z);
   }

   public Map<Integer, class_1735> getSlots() {
      return Collections.unmodifiableMap(this.customSlots);
   }

   public Map<String, Object> getMenuState() {
      return this.menuState;
   }
}
