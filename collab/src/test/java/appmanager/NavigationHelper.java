package appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Andrii.Fiedosieiev on 7/7/2017.
 */
public class NavigationHelper extends HelperBase {

    private AdminPageNavigationHelper adminPageNavigationHelper;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public AdminPageNavigationHelper adminPageNavi() {
        return adminPageNavigationHelper;
    }


    public void homePage() {
        //  click(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[1]"));
        click(By.cssSelector("a[href^='go?page=Home']"));
    }

    public void homePageLink() {
        click(By.partialLinkText("Home"));
    }

    public void accessRestrictions() {
        click(By.xpath("html/body/div[5]/table/tbody/tr/td[2]/div[2]/div/div[1]/div[1]/ul/li[3]/a[2]/em/span/span"));
    }

    /*public void adminPage() {
        //   click(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[2]"));
        click(By.cssSelector("a[href^='go?page=Admin']"));
        //click(By.cssSelector("a[title='Site-Wide Administration']"));
        //   click(By.cssSelector("a.gwt-Anchor GNO11FOCO1"));
    }*/

    public NavigationHelper adminPage() {
        //   click(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[2]"));
        click(By.cssSelector("a[href^='go?page=Admin']"));
        //click(By.cssSelector("a[title='Site-Wide Administration']"));
        //   click(By.cssSelector("a.gwt-Anchor GNO11FOCO1"));
        return this;
    }



    public void groupPage() {
        click(By.xpath(".//*[@id='body']/div[5]/table/tbody/tr/td[1]/table/tbody/tr[9]/td"));
    }


   /* public void optAccessRestrictionsReportsAccess(String option){
        accessRestrictions();
        Select dropdown = new Select(wd.findElement(By.id("showReportsAccess")));
        dropdown.selectByValue(option);
        click(By.name("buttonSubmit"));
    }*/

    public void usersPage() {
        click(By.xpath("html/body/div[5]/table/tbody/tr/td[1]/table/tbody/tr[8]/td"));
    }

    public void acc() {
        Select drop = new Select(wd.findElement(By.id("id")));
        drop.selectByValue("VALUE");
    }

    public void optAccessRestrictionsReportsAccess(String option) {
        // accessRestrictions();
        WebElement element = wd.findElement(By.id("showReportsAccess"));
        List<WebElement> options = element.findElements(By.tagName("option"));
        for (WebElement opt : options) {
            if (option.equals(opt.getAttribute("value"))) {
                opt.click();
            } else System.out.println("NO option available!!!!!!!!!!!!!!");
        }
        click(By.xpath("html/body/div[5]/table/tbody/tr/td[2]/div[2]/div/div[2]/div/div[3]/div/div/div/div/form/table/tbody[2]/tr/td[2]/input[1]"));
    }

    public void reviewPage() {
        click(By.cssSelector("a[href^='#review:id']"));
    }

    public NavigationHelper reportMainPage() {
        click(By.cssSelector("a[href^='go?page=ReportMain']"));
        return this;
    }

    public NavigationHelper reportReviewsCurrentlyInProgress() {
        click(By.xpath("html/body/div[5]/div[2]/div[2]/table/tbody/tr[1]/td[1]/b/a"));
        return this;
    }

    public NavigationHelper clickOnRunButtonReview() {
        click(By.name("buttonSubmit"));
        return this;
    }

    public NavigationHelper reviewTemplates() {
        click(By.partialLinkText("Review Templates"));
        return this;
    }
}


