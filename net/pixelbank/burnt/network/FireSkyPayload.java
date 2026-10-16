package net.pixelbank.burnt.network;

import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9129;
import net.minecraft.class_9139;

public record FireSkyPayload(float intensity) implements class_8710 {
   public static final class_8710.class_9154<FireSkyPayload> TYPE = new class_8710.class_9154(class_2960.method_60655("burnt", "fire_sky"));
   public static final class_9139<class_9129, FireSkyPayload> STREAM_CODEC = class_9139.method_56437(FireSkyPayload::write, FireSkyPayload::read);

   public static void write(class_2540 buf, FireSkyPayload msg) {
      buf.method_52941(msg.intensity());
   }

   public static FireSkyPayload read(class_2540 buf) {
      return new FireSkyPayload(buf.readFloat());
   }

   public class_8710.class_9154<FireSkyPayload> method_56479() {
      return TYPE;
   }
}
