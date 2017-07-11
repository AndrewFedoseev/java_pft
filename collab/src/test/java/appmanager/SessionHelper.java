package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Andrii.Fiedosieiev on 7/7/2017.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password){
        wd.findElement(By.name("userName")).sendKeys(username);
        wd.findElement(By.name("password")).sendKeys(password);
        wd.findElement(By.name("loginSubmitButton")).click();
    }

    public void openAdminSection(){
      // homePage();
        wd.findElement(By.cssSelector("a[href='go?page=Admin']")).click();
    }


    public void getCompletedReviewList(){
     //   homePage();
        if (wd.findElement(By.id("gwt-uid-26")).isSelected()){
            wd.findElement(By.id("gwt-uid-26")).click();
        }
        if (wd.findElement(By.id("gwt-uid-25")).isSelected()){
            wd.findElement(By.id("gwt-uid-25")).click();
        }
        if (!wd.findElement(By.id("gwt-uid-27")).isSelected()){
            wd.findElement(By.id("gwt-uid-27")).click();
        }
    }
}
