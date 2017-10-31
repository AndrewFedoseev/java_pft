package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Andrii.Fiedosieiev on 10/14/2017.
 */
public class ReviewCreationTest extends TestBase {

    @Test
    public void testReviewCreation() {
        app.goTo().homePageLink();
        int before = app.review().getReviewCount();
        app.goTo().homePageLink();
        app.review().initReviewCreation();
        app.goTo().homePageLink();
        app.refresh();
        //app.waits();
        int after = app.review().getReviewCount();
        Assert.assertEquals(after, before + 1);
    }
}
