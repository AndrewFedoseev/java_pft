package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 10/20/2017.
 */
public class ReportTest extends TestBase {

    @Test
    public void reportTest() {
        //app.goTo().adminPage();
        app.goTo().homePageLink();
        app.goTo().reportMainPage()
                    .reportReviewsCurrentlyInProgress()
                        .clickOnRunButtonReview();
    }
}
