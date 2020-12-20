package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AdminTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public  void logINTest(){
        wd.get("http://localhost/litecart/admin/login.php");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).sendKeys("admin");

        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("admin");

        wd.findElement(By.name("login")).click();

    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
    }


}
