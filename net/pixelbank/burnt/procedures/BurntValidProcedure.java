package net.pixelbank.burnt.procedures;

import net.pixelbank.burnt.configuration.BurntBasicConfigConfiguration;

public class BurntValidProcedure {
   public static boolean execute() {
      return (Boolean)BurntBasicConfigConfiguration.BURNT_ON.get();
   }
}
