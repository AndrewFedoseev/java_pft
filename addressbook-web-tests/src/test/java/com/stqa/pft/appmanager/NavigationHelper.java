package com.stqa.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Andrew on 4/9/2017.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
