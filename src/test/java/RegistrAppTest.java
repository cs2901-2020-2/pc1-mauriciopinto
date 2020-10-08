import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrAppTest {

    @Test(expectedExceptions = MaxUsersException.class)
    public void TestMaxUsers () throws MaxUsersException {
        RegistrApp inst = RegistrApp.getInstance();
        for (int i = 0; i < 150; i++)
            inst.logProffessor(new Proffessor("name"));
    }

    @Test
    public void TestRunTime () {
        RegistrApp inst = RegistrApp.getInstance();
        Proffessor p = new Proffessor("name");
        String title = "2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio";
        String url = "https://utec.zoom.us/rec/share/1648639";
        inst.logClass(p, title, url);
    }
}
