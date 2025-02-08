package cx.rain.mc.xray.fabric.client;

import cx.rain.mc.xray.XrayMod;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        XrayMod.initClient();
    }
}
