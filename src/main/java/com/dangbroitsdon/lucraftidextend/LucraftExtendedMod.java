package com.dangbroitsdon.lucraftidextend;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LucraftExtendedMod.MOD_ID)
public class LucraftExtendedMod {
    public static final String MOD_ID = "lucraftextendedid";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("Lucraft Extended Intialized");
    }
}
