package cx.rain.mc.xray.neoforge;

import cx.rain.mc.xray.XrayMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(XrayMod.MODID)
public class ExampleModNeoForge {
    public ExampleModNeoForge(ModContainer container, IEventBus bus) {
        bus.addListener(this::setupClient);

        XrayMod.init();
    }

    private void setupClient(FMLClientSetupEvent event) {
        XrayMod.initClient();
    }
}
