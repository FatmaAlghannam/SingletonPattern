public class App {
    public static void main(String[] args) throws Exception {
        IPhoneSettings iphoneSettings = IPhoneSettings.getInstance();
        iphoneSettings.setBrightness(85);
        System.out.println("Brightness is:" + iphoneSettings.getBrightness());
        iphoneSettings.enableWifi();
        System.out.println("Not working" + iphoneSettings.WifiEnable());

    }
}
