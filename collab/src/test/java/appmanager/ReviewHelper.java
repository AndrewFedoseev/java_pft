package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * Created by Andrii.Fiedosieiev on 7/7/2017.
 */
public class ReviewHelper extends HelperBase {
    public ReviewHelper(WebDriver wd) {
        super(wd);
    }

    public void initReviewCreation() {
        click(By.xpath("html/body/table/tbody/tr[2]/td/div/div[1]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[1]"));
    }

    public int getReviewCount() {
        //   return wd.findElements(By.cssSelector("a[href='#review:id=463']")).size();
        return wd.findElements(By.cssSelector("a[href^='#review:id']")).size();
    }

    public void robotFileUpload() throws AWTException, InterruptedException {
        StringSelection stringSelection = new StringSelection("C:\\temp\\ccollab-review-530.zip");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }


    public void uploadFile() throws AWTException, InterruptedException {
        click(By.xpath("html/body/table/tbody/tr[2]/td/div/div[1]/div[3]/div/div[1]/div[8]/table/tbody/tr[2]/td/div/div/div/div[2]/table/tbody/tr/td[2]/div/div/div[2]"));
        click(By.className("GHRNCJTDJT"));
        robotFileUpload();
        click(By.xpath("html/body/div[5]/div/div/table/tbody/tr[3]/td[2]/div/div/a[2]"));
        waitForSeconds(5);
        click(By.cssSelector("a.gwt-Anchor.GHRNCJTDGWB"));
    }
}
