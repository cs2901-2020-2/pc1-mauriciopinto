import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrAppTest {

    @Test(invocationCount = 150, threadPoolSize = 150, expectedExceptions = MaxUsersException.class)
    public void TestMaxUsers () throws MaxUsersException {
        RegistrApp inst = RegistrApp.getInstance();
        Proffessor p = new Proffessor(inst);
    }
}
