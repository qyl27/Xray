package cx.rain.mc.xray.fabric;

import cx.rain.mc.xray.XrayMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        XrayMod.init();
    }
}
