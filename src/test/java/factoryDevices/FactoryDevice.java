package factoryDevices;

public class FactoryDevice {

    public enum DeviceType{
        ANDROID,
        IOS,
        WINDOWS_PHONE
    }
    public static IDevice make( DeviceType type){
        IDevice device;
        switch (type){
            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device=new IOS();
                break;
            case  WINDOWS_PHONE:
                device=new WindowsPhone();
                break;
            default:
                device=new Android();
                break;

        }
        return device;
    }
}
