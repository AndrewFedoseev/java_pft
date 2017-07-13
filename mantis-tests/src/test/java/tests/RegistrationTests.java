package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 7/13/2017.
 */
public class RegistrationTests extends TestBase{

    @Test
    public void testRegistration(){
        app.registration().start("user", "user@localhost.localdomain");

    }
}
