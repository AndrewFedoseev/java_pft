package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by Andrew on 4/9/2017.
 */
public class ApplicationManager {


    //   private final Properties properties;
    WebDriver wd;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ReviewHelper review;
    private GroupHelper group;

    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
        //   properties = new Properties();
    }

    public void init() throws IOException {

        if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.get("http://localhost:8080");
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "");
        review = new ReviewHelper(wd);
        group = new GroupHelper(wd);
    }


    public void stop() {
        wd.quit();
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public ReviewHelper review() {
        return review;
    }

    public GroupHelper group(){
        return group;
    }
}

