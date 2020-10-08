import java.util.logging.Logger;

public class Observer extends User{
    static final Logger logger = Logger.getLogger(Observer.class.getName());
    public Observer (RegistrApp instance, String Name) {
        instance.addObserver (this);
        name = Name;
    }

    public void displayNotification (String message) {
        logger.info(name);
        logger.info(message);
    }
}
