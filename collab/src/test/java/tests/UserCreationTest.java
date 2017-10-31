package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 9/29/2017.
 */
public class UserCreationTest extends TestBase {
    @Test()
    public void testUserCreation() {
        app.goTo().adminPage();
        app.goTo().usersPage();
        int before = app.user().getUserCount();
        app.user().initUserCreation();
        int after = app.user().getUserCount();
        Assert.assertEquals(after, before+1);
    }
}
