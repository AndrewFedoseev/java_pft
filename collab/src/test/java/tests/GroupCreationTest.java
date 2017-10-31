package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 10/12/2017.
 */
public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        //  app.goTo().homePage();
        //app.goTo().adminPage();
        app.goTo().groupPage();
        app.group().initGroupCreation();
    }
}
