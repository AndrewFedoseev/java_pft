package tests;

import appmanager.HttpSession;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by Andrii.Fiedosieiev on 7/11/2017.
 */
public class LoginTests extends TestBase{

    @Test
    public void testLogin() throws IOException {
        HttpSession session = app.newSession();
        assertTrue(session.login("admin", "root"));
        assertTrue(session.isLoggedInAs("administrator"));
    }
}
