import sun.rmi.runtime.Log;
import java.util.Scanner;
import java.util.logging.Logger;

public class Proffessor extends User{
    static final Logger logger = Logger.getLogger(User.class.getName());
    Scanner in = new Scanner(System.in);
    public Proffessor (RegistrApp instance) {
        runApp(instance);
    }

    public void runApp(RegistrApp instance) throws MaxUsersException {
        logger.info ("Ingrese su nombre: ");
        name = in.nextLine();
        instance.logProffessor (this);
        logger.info("Ingrese Titulo de clase: ");
        String title = in.nextLine();
        logger.info("Ingrese URL de clases: ");
        String url = in.nextLine();
        instance.logClass (title, url);
    }
}
