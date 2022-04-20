package com.dangbroitsdon.lucraftcoreidextender.config;

import com.dangbroitsdon.lucraftcoreidextender.LucraftCoreIDExtenderMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = LucraftCoreIDExtenderMod.MOD_ID)
public class LucraftCoreIDExtenderConfig {
    @Config.RequiresMcRestart
    @Config.RangeInt(min = 512, max = Integer.MAX_VALUE - 1)
    @Config.Comment({"This tells Forge the max amount of Superpowers allowed to be registered.", "If for some reason you need more than 8192 Superpowers, this exists.", "(default: 8192)", "range: 512 - 2147483646"})
    public static int NUMBER_OF_SUPERPOWER_IDS = 8192;

    @Mod.EventBusSubscriber(modid = LucraftCoreIDExtenderMod.MOD_ID)
    private static class EventHandler {

        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(LucraftCoreIDExtenderMod.MOD_ID)) {
                ConfigManager.sync(LucraftCoreIDExtenderMod.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}

