
public class IPhoneSettings {
    private static IPhoneSettings instance;
    private boolean WifiEnable;
    private int Brightness;
    // private boolean Wifi;

    private IPhoneSettings() {
        Brightness = 70;
        WifiEnable = false;

    }

    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;

    }

    public void setBrightness(int Brightness) {
        this.Brightness = Brightness;

    }

    public int getBrightness() {
        return Brightness;
    }

    public void enableWifi() {
        WifiEnable = true;

    }

    public void disableWifi() {
        WifiEnable = false;
    }

    public boolean WifiEnable() {
        return WifiEnable;
    }
}