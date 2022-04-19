package com.dangbroitsdon.lucraftidextend.mixins;

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


@Mixin(SuperpowerHandler.class)
public class MixinLucraftExtendedID {
    @Shadow
    public static IForgeRegistry<Superpower> SUPERPOWER_REGISTRY;

    @Overwrite
    @SubscribeEvent
    public static void onRegisterNewRegistries(RegistryEvent.NewRegistry e) {
        SUPERPOWER_REGISTRY = new RegistryBuilder<Superpower>().setName(new ResourceLocation(LucraftCore.MODID, "superpower")).setType(Superpower.class).setIDRange(0, 8192).create();
    }
}
