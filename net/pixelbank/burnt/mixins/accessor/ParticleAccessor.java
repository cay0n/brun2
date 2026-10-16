package net.pixelbank.burnt.mixins.accessor;

import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_703.class})
public interface ParticleAccessor {
   @Accessor("xd")
   double burnt$getXd();

   @Accessor("yd")
   double burnt$getYd();

   @Accessor("zd")
   double burnt$getZd();

   @Accessor("xd")
   void burnt$setXd(double var1);

   @Accessor("yd")
   void burnt$setYd(double var1);

   @Accessor("zd")
   void burnt$setZd(double var1);
}
