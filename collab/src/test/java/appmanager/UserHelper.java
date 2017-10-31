package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Andrii.Fiedosieiev on 9/29/2017.
 */
public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initUserCreation() {

        sendKey(By.id("newuser_login"), "newUser" + Math.random());
        sendKey(By.id("newuser_fullname"), "newuser_fullname");
        sendKey(By.id("newuser_email"), "newuseremail@newuseremail.com");
        click(By.name("buttonSubmit"));
    }

    public int getUserCount() {
        return (wd.findElements(By.className("EvenRow")).size()
                + wd.findElements(By.className("OddRow")).size());
    }
}
