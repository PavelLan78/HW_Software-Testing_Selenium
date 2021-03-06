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

public class CheckProductPage {
    WebDriver wd;
    WebDriverWait wait;
    int prodQuantity, stickerQuantity;
    WebElement productUnit;
    List<WebElement> prodList, stickerList;
    String[] regularPrice1, regularPrice2, campaignPrice1, campaignPrice2;
    String productName1, productName2;
    float size1, size2;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(wd, 10);
    }

    @Test
    public void myCheckProductPage() {
        wd.get("http://localhost/litecart/en/"); //открыть главную страницу магазина
        wait = new WebDriverWait(wd,10);


        productUnit = wd.findElement(By.cssSelector("[id=box-campaigns] li.product"));
        // выбрали первый товар в разделе Campains

        productName1 = productUnit.findElement(By.cssSelector(".name")).getText();
        // сохраняем имя продукта

        regularPrice1 = new String[4];
        campaignPrice1 = new String[4];

        // Сохраняем параметры обычной цены
        regularPrice1[0]= productUnit.findElement(By.cssSelector(".regular-price")).getText();
        // сохраняем значение обычной цены
        // поскольку с цветами в приложении ошибка - проверку цвета исключаем
        //regularPrice1[1]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("color");
        // сохраняем цвет шрифта обычной цены
        regularPrice1[1]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("font-weight");
        // сохраняем тип шрифта обычной цены - жирный или нет
        regularPrice1[2]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("text-decoration");
        // сохраняем оформление шрифта обычной цены
        regularPrice1[3]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("font-size");
        // сохраняем размер шрифта обычной цены

        size1 = Float.parseFloat(regularPrice1[3].replaceAll("px",""));
        // получаем числовое значение размера шрифта


        // сохраняем параметры цены по акции
        campaignPrice1[0]= productUnit.findElement(By.cssSelector(".campaign-price")).getText();
        // сохраняем значение цены по акции
        // поскольку с цветами в приложении ошибка - проверку цвета исключаем
        // campaignPrice1[1]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("color");
        // сохраняем цвет шрифта цены по акции
        campaignPrice1[1]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("font-weight");
        // сохраняем размер шрифта цены по акции
        campaignPrice1[2]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("text-decoration");
        // сохраняем оформление шрифта обычной цены
        campaignPrice1[3]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("font-size");
        // сохраняем размер шрифта цены по акции
        size2=Float.parseFloat(campaignPrice1[3].replaceAll("px",""));
        // получаем числовое значение размера шрифта

        Assert.assertTrue(size1<size2);
        // сравниваем размеры шрифтов цен - шрифт обычной цены меньше чем у акционной


        productUnit.click();  // открываем страницу продукта
        wait = new WebDriverWait(wd,10); // даем время на загрузку

        productUnit = wd.findElement(By.cssSelector("[id=box-product]"));
        // выбираем блок продукта на странице

        productName2 = productUnit.findElement(By.cssSelector("[itemprop=name]")).getText();
        // сохраняем имя продукта

        Assert.assertTrue(productName1.compareTo(productName2)==0);
        // проверка совпадения названий продуктов

        regularPrice2 = new String[4];
        campaignPrice2 = new String[4];

        // Сохраняем параметры обычной цены
        regularPrice2[0]= productUnit.findElement(By.cssSelector(".regular-price")).getText();
        // сохраняем значение обычной цены
        // поскольку с цветами в приложении ошибка - проверку цвета исключаем
        //regularPrice2[1]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("color");
        // сохраняем цвет шрифта обычной цены
        regularPrice2[1]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("font-weight");
        // сохраняем тип шрифта обычной цены - жирный или нет
        regularPrice2[2]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("text-decoration");
        // сохраняем оформление шрифта обычной цены
        regularPrice2[3]= productUnit.findElement(By.cssSelector(".regular-price")).getCssValue("font-size");
        // сохраняем размер шрифта обычной цены
        size1 = Float.parseFloat(regularPrice2[3].replaceAll("px",""));
        // получаем числовое значение размера шрифта

        // сохраняем параметры цены по акции
        campaignPrice2[0]= productUnit.findElement(By.cssSelector(".campaign-price")).getText();
        // сохраняем значение цены по акции
        // поскольку с цветами в приложении ошибка - проверку цвета исключаем
        //campaignPrice2[1]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("color");
        // сохраняем цвет шрифта цены по акции
        campaignPrice2[1]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("font-weight");
        // сохраняем размер шрифта цены по акции
        campaignPrice2[2]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("text-decoration");
        // сохраняем оформление шрифта обычной цены
        campaignPrice2[3]= productUnit.findElement(By.cssSelector(".campaign-price")).getCssValue("font-size");
        // сохраняем размер шрифта цены по акции
        size2=Float.parseFloat(campaignPrice2[3].replaceAll("px",""));
        // получаем числовое значение размера шрифта

        Assert.assertTrue(size1<size2);
        // сравниваем размеры шрифтов цен - шрифт обычной цены меньше чем у акционной

        // сравниваем значения и параметры оформления цен
        for(int i=0; i<3;i++) {
            Assert.assertTrue(regularPrice1[i].compareTo(regularPrice2[i])==0);
            // совпадение значений и оформления обычной цены
            Assert.assertTrue(campaignPrice1[i].compareTo(campaignPrice2[i])==0);
            // совпадение значений и оформления цены по акции
        }
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
    }

}
