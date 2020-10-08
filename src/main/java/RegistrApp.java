import java.util.List;
import java.util.ArrayList;

public class RegistrApp {
    private static RegistrApp instance = null;
    private static int semaphore = 0;
    private List<Proffessor> proffessors;
    private List<Observer> observers;
    public RegistrApp () {
        proffessors = new ArrayList<Proffessor>();
        observers = new ArrayList<Observer>();
    }

    public void addObserver (Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers (String message) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).displayNotification(message);
        }
    }

    public void logProffessor (Proffessor proffessor) throws MaxUsersException{
        proffessors.add(proffessor);
        if (proffessors.size() > 100)
            throw new MaxUsersException("Limite de Profesores alcanzado!");
    }

    public void logClass (String title, String url) {
        String message = title + url;
        notifyObservers(message);
    }

    private synchronized static int incrSema () {
        int prev = semaphore;
        semaphore++;
        return prev;
    }

    public static RegistrApp getInstance () {
        if (incrSema () == 0) {
            instance = new RegistrApp();
        }
        return instance;
    }
}
