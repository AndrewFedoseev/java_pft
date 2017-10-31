package tests;

import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 10/24/2017.
 */
public class TemplateCreationTest extends TestBase {

    @Test
    public void templateCreation() {
        app.goTo().
                adminPage().
                    reviewTemplates();
    }
}
