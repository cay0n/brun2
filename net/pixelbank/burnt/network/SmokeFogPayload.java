package net.pixelbank.burnt.network;

import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9129;
import net.minecraft.class_9139;

public record SmokeFogPayload(float intensity) implements class_8710 {
   public static final class_8710.class_9154<SmokeFogPayload> TYPE = new class_8710.class_9154(class_2960.method_60655("burnt", "smoke_fog"));
   public static final class_9139<class_9129, SmokeFogPayload> STREAM_CODEC = class_9139.method_56437(SmokeFogPayload::write, SmokeFogPayload::read);

   public static void write(class_2540 buf, SmokeFogPayload msg) {
      buf.method_52941(msg.intensity());
   }

   public static SmokeFogPayload read(class_2540 buf) {
      return new SmokeFogPayload(buf.readFloat());
   }

   public class_8710.class_9154<SmokeFogPayload> method_56479() {
      return TYPE;
   }
}
