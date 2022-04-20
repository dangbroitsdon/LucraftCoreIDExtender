package com.dangbroitsdon.lucraftcoreidextender.mixins;

import lucraft.mods.lucraftcore.LucraftCore;
import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import com.dangbroitsdon.lucraftcoreidextender.config.LucraftCoreIDExtenderConfig;

@Mixin(SuperpowerHandler.class)
public class LucraftCoreIDExtenderMixin {
    @Shadow(remap = false)
    public static IForgeRegistry<Superpower> SUPERPOWER_REGISTRY;

    @Overwrite(remap = false)
    @SubscribeEvent
    public static void onRegisterNewRegistries(RegistryEvent.NewRegistry e) {
        SUPERPOWER_REGISTRY = new RegistryBuilder<Superpower>().setName(new ResourceLocation(LucraftCore.MODID, "superpower")).setType(Superpower.class).setIDRange(0, LucraftCoreIDExtenderConfig.NUMBER_OF_SUPERPOWER_IDS).create();
    }
}
