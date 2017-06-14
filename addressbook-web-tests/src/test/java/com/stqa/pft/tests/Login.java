package com.stqa.pft.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrii.Fiedosieiev on 6/14/2017.
 */
public class Login {

    WebDriver driver = new FirefoxDriver();
    @Test

    public void openHomePage(){
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("loginSubmitButton")).click();
    }
}
