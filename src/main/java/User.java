import java.util.logging.Logger;

public abstract class User {
    static final Logger logger = Logger.getLogger(User.class.getName());
    public String name;
    public void displayNotification (String message) {
        logger.info(name);
        logger.info(message);
    }
}
