package com.dangbroitsdon.lucraftcoreidextender;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LucraftCoreIDExtenderMod.MOD_ID, name = LucraftCoreIDExtenderMod.NAME)
public class LucraftCoreIDExtenderMod {
    public static final String NAME = "Lucraft: Core ID Extender";
    public static final String MOD_ID = "lucraftcoreidextender";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("Lucraft: Core ID Extender Intialized");
    }
}
