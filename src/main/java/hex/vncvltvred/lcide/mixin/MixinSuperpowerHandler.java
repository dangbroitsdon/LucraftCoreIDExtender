package hex.vncvltvred.lcide.mixin;

import hex.vncvltvred.lcide.LCIDE;
import hex.vncvltvred.lcide.Tags;
import hex.vncvltvred.lcide.config.LCIDEConfig;
import lucraft.mods.lucraftcore.superpowers.SuperpowerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SuperpowerHandler.class)
public class MixinSuperpowerHandler
{
    @ModifyArg(method = "onRegisterNewRegistries", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/registries/RegistryBuilder;setIDRange(II)Lnet/minecraftforge/registries/RegistryBuilder;"), index = 1, remap = false)
    private static int lcide$modifyID(int id)
    {
        if(LCIDEConfig.SUPERPOWER_IDS_LIMIT >= 512)
        {
            LCIDE.LOGGER.info("Eureka! {} has done it!", Tags.MOD_NAME);
            LCIDE.LOGGER.info("{} is the new limit for the amount of Registrable Superpower IDs!", LCIDEConfig.SUPERPOWER_IDS_LIMIT);
            return LCIDEConfig.SUPERPOWER_IDS_LIMIT;
        }

        LCIDE.LOGGER.info("{} is disabled...", Tags.MOD_NAME);
        LCIDE.LOGGER.info("{} is the amount of Registrable Superpower IDs.", id);
        return id;
    }
}
