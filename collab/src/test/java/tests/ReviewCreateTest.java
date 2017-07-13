package tests;


import org.testng.annotations.Test;


/**
 * Created by Andrii.Fiedosieiev on 6/14/2017.
 */
public class ReviewCreateTest extends TestBase {

    @Test
    public void testReviewCreation() {
        app.review().initReviewCreation();
    //go back to Home page
        app.goTo().homePage();
    }
}
