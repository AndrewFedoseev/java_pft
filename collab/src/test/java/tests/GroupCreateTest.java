package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 7/12/2017.
 */
public class GroupCreateTest extends TestBase {

    @Test
    public void testGroupCreation(){
        app.goTo().adminPage();
        app.goTo().groupPage();
        app.group().initGroupCreation();
    }
}
