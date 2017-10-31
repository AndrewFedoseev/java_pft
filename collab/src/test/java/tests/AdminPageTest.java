package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 9/20/2017.
 */
public class AdminPageTest extends TestBase {

    //@BeforeTest (enabled = false)
    public void testAdminPage(){
        app.goTo().adminPage();
    }
}
