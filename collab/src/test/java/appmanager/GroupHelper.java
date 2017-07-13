package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Andrii.Fiedosieiev on 7/12/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void initGroupCreation() {
        sendKey(By.name("newgroup_title"), "NEW GROUP");
        click(By.xpath("html/body/div[4]/table/tbody/tr/td[2]/div[2]/div[2]/form/table/tbody[2]/tr/td[2]/input"));
    }
}
