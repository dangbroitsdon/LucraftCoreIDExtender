package hex.vncvltvred.lcide.config;

import com.cleanroommc.configanytime.ConfigAnytime;
import hex.vncvltvred.lcide.Tags;
import net.minecraftforge.common.config.Config;

@Config(modid = Tags.MOD_ID)
public class LCIDEConfig
{
    @Config.RequiresMcRestart
    @Config.RangeInt(min = 1, max = Integer.MAX_VALUE - 1)
    @Config.Comment({"This tells Forge the max amount of Superpowers allowed to be registered.", "If for some reason you need more than 8192 Superpowers, this exists.", "Set this lower than 512 to disable the mod", "(default: 8192)"})
    public static int SUPERPOWER_IDS_LIMIT = 8192;

    static
    {
        ConfigAnytime.register(LCIDEConfig.class);
    }
}
