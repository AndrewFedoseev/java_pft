package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Fiedosieiev on 7/7/2017.
 */
public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }



    protected void click(By locator){
        wd.findElement(locator).click();
    }

    protected void sendKey(By locator, String key){
        wd.findElement(locator).sendKeys(key);
    }

    protected void checkForErrors(){
     //   wd.findElements()
    }
    public void waitForSeconds(int sec){
        wd.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
}
