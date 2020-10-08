import java.util.Scanner;
import java.util.logging.Logger;

public class Proffessor extends User{
    Scanner in = new Scanner(System.in);
    public Proffessor (RegistrApp instance) throws MaxUsersException{
        runApp(instance);
    }
    public Proffessor (String Name) {
        name = Name;
    }
    public void runApp(RegistrApp instance) throws MaxUsersException {
        logger.info ("Ingrese su nombre: ");
        name = in.nextLine();
        instance.logProffessor (this);
        logger.info("Ingrese Titulo de clase: ");
        String title = in.nextLine();
        logger.info("Ingrese URL de clases: ");
        String url = in.nextLine();
        instance.logClass (this, title, url);
    }
}
