package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckCountriesAndGeoZones {
    WebDriver wd;
    WebDriverWait wait;
    int countryQuantity, zoneQuantity, geoZoneQuantity;
    int[] zones;
    int a, az;
    WebElement countryRow, zoneRow, geoZoneRow;
    List<WebElement> countryRows, zoneRows, geoZoneRows;
    String[] countryName, zoneName;


    public static int testAlphabet(String[] testArr, int arrSize) {
        int isAlphab = 1;
        for (int i = 1; i < arrSize; i++) {
            int k;
            k = testArr[i - 1].compareToIgnoreCase(testArr[i]);
            if (k >= 0) isAlphab = -1;
        }
        return isAlphab;
    }

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkCountries() {
        wd.get("http://localhost/litecart/admin/");

        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).sendKeys("admin");

        wd.findElement(By.name("login")).click();

        wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");

        countryRows = wd.findElements(By.cssSelector("[name=countries_form] .row"));

        countryQuantity = countryRows.size();
        countryName = new String[countryQuantity];
        zones = new int[countryQuantity];

        for (int i = 0; i < countryQuantity; i++) {
            countryRow = countryRows.get(i);
            countryName[i] = countryRow.findElement(By.cssSelector("a")).getText();
            zones[i] = Integer.parseInt(countryRow.findElement(By.cssSelector("td:nth-child(6)")).getText());
        }

        a = testAlphabet(countryName, countryQuantity);

        Assert.assertTrue(a == 1);

        for (int i = 0; i < countryQuantity; i++) {
            if (zones[i] > 0) {
                countryRows = wd.findElements(By.cssSelector("[name=countries_form] .row"));
                countryRow = countryRows.get(i);
                countryRow.findElement(By.cssSelector("a")).click();
                wait = new WebDriverWait(wd, 10);

                zoneRows = wd.findElements(By.cssSelector("[id=table-zones] tr"));
                zoneQuantity = zoneRows.size() - 2;
                zoneName = new String[zoneQuantity];

                for (int j = 1; j <= zoneQuantity; j++) {
                    zoneRow = zoneRows.get(j);
                    zoneName[j - 1] = zoneRow.findElement(By.cssSelector("td:nth-child(3)")).getText();
                }
                az = testAlphabet(zoneName, zoneQuantity);
                Assert.assertTrue(az == 1);

                wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");
            }
        }

        wd.get("http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones");

        geoZoneRows = wd.findElements(By.cssSelector("[name=geo_zones_form] .row"));
        geoZoneQuantity = geoZoneRows.size();

        for (int i = 0; i < geoZoneQuantity; i++) {
            geoZoneRows = wd.findElements(By.cssSelector("[name=geo_zones_form] .row"));
            geoZoneRow = geoZoneRows.get(i);
            geoZoneRow.findElement(By.cssSelector("a")).click();
            wait = new WebDriverWait(wd, 10);

            zoneRows = wd.findElements(By.cssSelector("[id=table-zones] tr"));
            zoneQuantity = zoneRows.size() - 2;
            zoneName = new String[zoneQuantity];

            for (int j = 1; j <= zoneQuantity; j++) {
                zoneRow = zoneRows.get(j);
                zoneName[j - 1] = zoneRow.findElement(
                        By.cssSelector("[id=table-zones] tr td:nth-child(3) [selected=selected]")).
                        getAttribute("textContent");
            }
            az = testAlphabet(zoneName, zoneQuantity);
            Assert.assertTrue(az == 1);
            wd.get("http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones");
        }
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        wd.quit();
    }

}
