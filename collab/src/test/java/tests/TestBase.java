package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import appmanager.*;
import org.testng.annotations.BeforeTest;

/**
 * Created by Andrew on 4/6/2017.
 */
public class TestBase {

    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));

    @BeforeSuite()
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite()
    public void tearDown() {
        app.stop();
    }
}
