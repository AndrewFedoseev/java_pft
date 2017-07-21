package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Andrii.Fiedosieiev on 6/14/2017.
 */
public class ReviewCreateTest extends TestBase {

    @Test
    public void testReviewCreation() {
        int before = app.review().getReviewCount();
        app.review().initReviewCreation();
        //go back to Home page
        app.goTo().homePage();
        int after = app.review().getReviewCount();
        Assert.assertEquals(after, before+1);
    }

}
