package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
