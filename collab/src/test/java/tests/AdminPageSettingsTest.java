package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Andrii.Fiedosieiev on 10/16/2017.
 */
public class AdminPageSettingsTest extends AdminPageTest {

    @Test(enabled = false)

    public void reportsAccessSettingsTest() {
        app.goTo().adminPage();
        app.goTo().accessRestrictions();
        app.goTo().optAccessRestrictionsReportsAccess("DISABLED");


      //  testAdminPage();
       // app.goTo().adminPageNavi().accessRestrictions();
      //  app.goTo().optAccessRestrictionsReportsAccess("DISABLED");
    }
}
