package cx.rain.mc.xray;

public class XrayMod {
    public static final String MODID = "xray";

    public static void init() {
        System.out.println("Hello! I'm running on " + ModPlatform.getPlatform());
    }

    public static void initClient() {
        System.out.println("Hello from client init.");
    }
}
