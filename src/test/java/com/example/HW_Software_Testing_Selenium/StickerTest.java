package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StickerTest {
    WebDriver wd;
    int prodQuantity;
    int stickerQuantity;
    WebElement productUnit;
    List<WebElement> prodList;
    List<WebElement> stickerList;


    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findStickerTest() {
        wd.get("http://localhost/litecart/en/");

        prodList = wd.findElements(By.cssSelector("li.product"));
        prodQuantity = prodList.size();


        for (int i = 0; i < prodQuantity; i++) {
            prodList = wd.findElements(By.cssSelector("li.product"));
            productUnit = prodList.get(i);

            stickerList = productUnit.findElements(By.cssSelector("li.product .sticker"));
            stickerQuantity = stickerList.size();
            Assert.assertTrue(stickerQuantity == 1);

        }
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        wd.quit();
    }
}
