package hex.vncvltvred.lcide.mixin;

import lucraft.mods.lucraftcore.util.updatechecker.UpdateChecker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(UpdateChecker.class)
public class MixinUpdateChecker
{
    @Shadow(remap = false) protected boolean show;

    @Inject(method = "<init>", at = @At("TAIL"), remap = false) public void lcide$turnOffUpdateCheck(String currentVersion, String prefix, String website, String updateFile, CallbackInfo ci) { this.show = false; }
}
