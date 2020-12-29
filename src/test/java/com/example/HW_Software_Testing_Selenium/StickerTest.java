package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StickerTest {
    WebDriver wd;


    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findStickerTest() {
        wd.get("http://localhost/litecart/en/");

        System.out.println("Most Popular:");
        System.out.println("=========================================================");

        WebElement PurpleDuck = wd.findElement(By.cssSelector("#box-most-popular a[href*='purple-duck-p-5']"));
        int numberStickerNewPurpleDuck = PurpleDuck.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSalePurpleDuck = PurpleDuck.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Purple Duck. Number of sticker New:" + numberStickerNewPurpleDuck);
        System.out.println("Purple Duck. Number of sticker Sale:" + numberStickerSalePurpleDuck);

        System.out.println("");

        WebElement YellowDuck = wd.findElement(By.cssSelector("#box-most-popular a[href*='yellow-duck-p-1']"));
        int numberStickerNewYellowDuck = YellowDuck.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleYellowDuck = YellowDuck.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Yellow Duck. Number of sticker New:" + numberStickerNewYellowDuck);
        System.out.println("Yellow Duck. Number of sticker Sale:" + numberStickerSaleYellowDuck);

        System.out.println("");

        WebElement RedDuck = wd.findElement(By.cssSelector("#box-most-popular a[href*='red-duck-p-3']"));
        int numberStickerNewRedDuck = RedDuck.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleRedDuck = RedDuck.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Red Duck. Number of sticker New:" + numberStickerNewRedDuck);
        System.out.println("Red Duck. Number of sticker Sale:" + numberStickerSaleRedDuck);

        System.out.println("");

        WebElement BlueDuck = wd.findElement(By.cssSelector("#box-most-popular a[href*='blue-duck-p-4']"));
        int numberStickerNewBlueDuck = BlueDuck.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleBlueDuck = BlueDuck.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Blue Duck. Number of sticker New:" + numberStickerNewBlueDuck);
        System.out.println("Blue Duck. Number of sticker Sale:" + numberStickerSaleBlueDuck);

        System.out.println("");

        WebElement GreenDuck = wd.findElement(By.cssSelector("#box-most-popular a[href*='green-duck-p-2']"));
        int numberStickerNewGreenDuck = GreenDuck.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleGreenDuck = GreenDuck.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Purple Duck. Number of sticker New:" + numberStickerNewGreenDuck);
        System.out.println("Purple Duck. Number of sticker Sale:" + numberStickerSaleGreenDuck);

        System.out.println("");

        System.out.println("Campaigns");
        System.out.println("=========================================================================");

        WebElement YellowDuckCampaigns = wd.findElement(By.cssSelector("#box-campaigns a[href*='yellow-duck-p-1']"));
        int numberStickerNewYellowDuckCamp = YellowDuckCampaigns.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleYellowDuckCamp = YellowDuckCampaigns.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Yellow Duck. Number of sticker New:" + numberStickerNewYellowDuckCamp);
        System.out.println("Yellow Duck. Number of sticker Sale:" + numberStickerSaleYellowDuckCamp);

        System.out.println("");

        System.out.println("Latest Products");
        System.out.println("=========================================================================");

        WebElement YellowDuckLatest = wd.findElement(By.cssSelector("#box-latest-products a[href*='yellow-duck-p-1']"));
        int numberStickerNewYellowDuckLatest = YellowDuckLatest.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleYellowDuckLatest = YellowDuckLatest.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Yellow Duck. Number of sticker New:" + numberStickerNewYellowDuckLatest);
        System.out.println("Yellow Duck. Number of sticker Sale:" + numberStickerSaleYellowDuckLatest);

        System.out.println("");

        WebElement RedDuckLatest = wd.findElement(By.cssSelector("#box-latest-products a[href*='red-duck-p-3']"));
        int numberStickerNewRedDuckLatest = RedDuckLatest.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleRedDuckLatest = RedDuckLatest.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Red Duck. Number of sticker New:" + numberStickerNewRedDuckLatest);
        System.out.println("Red Duck. Number of sticker Sale:" + numberStickerSaleRedDuckLatest);

        System.out.println("");

        WebElement BlueDuckLatest = wd.findElement(By.cssSelector("#box-latest-products a[href*='blue-duck-p-4']"));
        int numberStickerNewBlueDuckLatest = BlueDuckLatest.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleBlueDuckLatest = BlueDuckLatest.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Blue Duck. Number of sticker New:" + numberStickerNewBlueDuckLatest);
        System.out.println("Blue Duck. Number of sticker Sale:" + numberStickerSaleBlueDuckLatest);

        System.out.println("");

        WebElement GreenDuckLatest = wd.findElement(By.cssSelector("#box-latest-products a[href*='green-duck-p-2']"));
        int numberStickerNewGreenDuckLatest = GreenDuckLatest.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSaleGreenDuckLatest = GreenDuckLatest.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Green Duck. Number of sticker New:" + numberStickerNewGreenDuckLatest);
        System.out.println("Green Duck. Number of sticker Sale:" + numberStickerSaleGreenDuckLatest);

        System.out.println("");

        WebElement PurpleDuckLatest = wd.findElement(By.cssSelector("#box-latest-products a[href*='yellow-duck-p-1']"));
        int numberStickerNewPurpleDuckLatest = PurpleDuckLatest.findElements(By.cssSelector("div[class='sticker sale']")).size();
        int numberStickerSalePurpleDuckLatest = PurpleDuckLatest.findElements(By.cssSelector("div[class='sticker new']")).size();
        System.out.println("Purple Duck. Number of sticker New:" + numberStickerNewPurpleDuckLatest);
        System.out.println("Purple Duck. Number of sticker Sale:" + numberStickerSalePurpleDuckLatest);

    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        wd.quit();
    }
}
