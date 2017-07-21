package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
