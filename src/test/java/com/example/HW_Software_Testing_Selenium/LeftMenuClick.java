package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LeftMenuClick {
    WebDriver wd;
    WebDriverWait wait;
    int menuQuantity;
    int submenuQuantity;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(wd, 10);
    }

    @Test
    public void myLeftMenuClick() throws InterruptedException {
        wd.get("http://localhost/litecart/admin/");

        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).sendKeys("admin");

        wd.findElement(By.name("login")).click();

        List<WebElement> menuPoints = wd.findElements(By.id("app-"));

        List<WebElement> submenuPoints;
        WebElement menuPoint;
        WebElement submenuPoint;

        menuQuantity = menuPoints.size();

        for (int i = 0; i < menuQuantity; i++) {
            menuPoints = wd.findElements(By.id("app-"));
            menuPoint = menuPoints.get(i);
            wait = new WebDriverWait(wd, 10);
            Thread.sleep(2000);
            menuPoint.click();
            wd.findElement(By.cssSelector("h1"));

            menuPoints = wd.findElements(By.id("app-"));
            menuPoint = menuPoints.get(i);
            submenuPoints = menuPoint.findElements(By.cssSelector("[id^=doc-]"));
            submenuQuantity = submenuPoints.size();

            if (submenuQuantity > 0) {
                for (int j = 0; j < submenuQuantity; j++) {
                    menuPoints = wd.findElements(By.id("app-"));
                    menuPoint = menuPoints.get(i);
                    submenuPoints = menuPoint.findElements(By.cssSelector("[id^=doc-]"));
                    submenuPoint = submenuPoints.get(j);
                    Thread.sleep(2000);
                    submenuPoint.click();
                    wd.findElement(By.cssSelector("h1"));
                }
            } else {
                wd.findElement(By.cssSelector("h1"));
            }
        }

    }


    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
