package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Fiedosieiev on 7/7/2017.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void homePage() {
        click(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[1]"));
    }

    public void adminPage(){
        click(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[2]"));
    }

    public void groupPage(){
        click(By.xpath("html/body/div[4]/table/tbody/tr/td[1]/table/tbody/tr[9]/td"));
    }
}
