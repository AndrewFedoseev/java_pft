package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 7/20/2017.
 */
public class AdminPageTest extends TestBase {

    @Test
    public void testAdminPage(){
        app.goTo().adminPage();
    }
}
