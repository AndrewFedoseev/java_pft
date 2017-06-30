package com.stqa.pft.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Fiedosieiev on 6/14/2017.
 */
public class Login {

    WebDriver driver = new FirefoxDriver();
    @Test

    public void openHomePage(){
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("loginSubmitButton")).click();
    }

    @Test
    public void openAdminSection(){
        openHomePage();
        driver.findElement(By.cssSelector("a[href='go?page=Admin']")).click();
    }

    @Test
    public void createReview(){
        openHomePage();
        driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/div/div[1]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/a[1]")).click();

    }
}
