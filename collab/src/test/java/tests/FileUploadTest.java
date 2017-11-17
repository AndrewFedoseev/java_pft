package tests;

import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * Created by Andrii.Fiedosieiev on 10/10/2017.
 */
public class FileUploadTest extends TestBase {

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Test(enabled = false)
    public void fileUploadTest() throws AWTException, InterruptedException {
        //  app.goTo().homePage();
        app.goTo().reviewPage();
        app.review().uploadFile();
    }
}
