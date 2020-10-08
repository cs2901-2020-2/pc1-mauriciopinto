import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Observer.class.getName());
    public static void main (String[] args) throws MaxUsersException{
        RegistrApp app = RegistrApp.getInstance();
        int role;
        User user;
        Observer a = new Observer(app, "CE2A");
        Observer b = new Observer(app, "DGA");
        Observer c = new Observer(app, "Counter Docentes");
        Observer d = new Observer(app, "Counter Alumnos");
        app.addObserver(a);
        app.addObserver(b);
        app.addObserver(c);
        app.addObserver(d);
        while (true) {
            logger.info("Es Profesor (0) u Observador (1)?");
            role = in.nextInt();
            if (role == 0)
                user = new Proffessor(app);
            else if (role == 1) {
                logger.info("Ingrese su nombre");
                String name = in.nextLine();
                user = new Observer(app, name);
            }
        }
    }
}
