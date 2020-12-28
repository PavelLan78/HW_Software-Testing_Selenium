package com.example.HW_Software_Testing_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuLeftClickTest {
    WebDriver wd;
    WebDriverWait wait;

    public boolean isElementPresent(WebDriver wd, By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean areElementsPresent(WebDriver wd, By locator) {
        return wd.findElements(locator).size() > 0;
    }

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        wait = new WebDriverWait(wd, 10);
        wd.manage().window().maximize();
    }

    @Test
    public void menuLeftTest() throws InterruptedException {
        wd.get("http://localhost/litecart/admin/login.php");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).sendKeys("admin");

        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("admin");

        wd.findElement(By.name("login")).click();

        WebElement appearence = wd.findElement(By.cssSelector("[href='http://localhost/litecart/admin/?app=appearance&doc=template']"));
        Thread.sleep(2000);
        appearence.click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));



        wd.findElement(By.cssSelector("li#doc-template")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("#doc-logotype")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href*='?app=catalog&doc=catalog']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-catalog.selected")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("#doc-product_groups")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("#doc-option_groups")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='manufacturers']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='suppliers']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-delivery_statuses a[href$='delivery_statuses']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-sold_out_statuses> a[href$='sold_out_statuses']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("#doc-quantity_units")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("#doc-csv")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=countries&doc=countries']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='doc=currencies']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='doc=customers']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));
        Thread.sleep(2000);

        wd.findElement(By.cssSelector("li#doc-customers")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=customers&doc=csv']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=customers&doc=newsletter']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=geo_zones&doc=geo_zones']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=languages&doc=languages']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-languages")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-storage_encoding")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=modules&doc=jobs']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-jobs")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-customer")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-shipping")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-payment")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-order_total")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-order_success")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-order_action")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=orders&doc=orders']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));
        Thread.sleep(2000);

        wd.findElement(By.cssSelector("li#doc-orders")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-order_statuses")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=pages&doc=pages']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=reports&doc=monthly_sales']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-monthly_sales")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-most_sold_products")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-most_shopping_customers")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=settings&doc=store_info']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-store_info")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-defaults")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-general")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-listings")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-images")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

//        wd.findElement(By.cssSelector("li#doc-checkout")).click();
//        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-advanced")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-security")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=slides&doc=slides']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=tax&doc=tax_classes']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-tax_classes")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-tax_rates")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=translations&doc=search']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-search")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-scan")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-csv")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("a[href$='?app=users&doc=users']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#app->a[href$='?app=vqmods&doc=vqmods']")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));

        wd.findElement(By.cssSelector("li#doc-vqmods")).click();
        System.out.println(areElementsPresent(wd, By.cssSelector("h1")));


    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }
}
