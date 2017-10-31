package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Andrii.Fiedosieiev on 9/12/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void initGroupCreation() {
        sendKey(By.name("newgroup_title"), "NEW GROUP");
        click(By.xpath("html/body/div[5]/table/tbody/tr/td[2]/div[2]/div[2]/form/table/tbody[2]/tr/td[2]/input"));
        //should add some validation like locator in 'Group List' or count items in the list or both.
    }

    public void getGroupCount(){

    }
}
