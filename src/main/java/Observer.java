import java.util.logging.Logger;

public class Observer extends User{
    public Observer (RegistrApp instance, String Name) {
        instance.addObserver (this);
        name = Name;
    }
}
