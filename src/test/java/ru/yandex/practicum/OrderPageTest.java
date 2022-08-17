//коммент для pr zaebali
package ru.yandex.practicum;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;


import static org.hamcrest.core.StringStartsWith.startsWith;

public class OrderPageTest {
    private WebDriver driver;

    @Before
    public void startUp() {

//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#rcc-confirm-button")).click();


    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }



    @Test
    public void testOrderHeaderButton() throws InterruptedException {
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.clickButtonOrderHeader();
        objOrderPage.sendName();
        objOrderPage.sendSername();
        objOrderPage.sendAdress();
        objOrderPage.sendTel();
        objOrderPage.sendSubway();
        objOrderPage.clickDaleeButton();
        objOrderPage.clickCalendarButton();
        objOrderPage.clickCalendarDate();
        objOrderPage.clickTermDate();
        objOrderPage.clickTermDateValue();
        objOrderPage.clickFinalOrderButton();
        objOrderPage.clickSureOrderButton();
        String orderTextFinal = objOrderPage.getOrderText();
        System.out.println(orderTextFinal);
//        assertEquals("не верный текст заказа", orderTextFinal, "Заказ оформлен");
        Assert.assertThat(orderTextFinal, startsWith("Заказ оформлен"));

    }
    @Test
    public void testOrderFooterButton() throws InterruptedException {
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.clickButtonOrderFooter();
        objOrderPage.sendName();
        objOrderPage.sendSername();
        objOrderPage.sendAdress();
        objOrderPage.sendTel();
        objOrderPage.sendSubway();
        objOrderPage.clickDaleeButton();
        objOrderPage.clickCalendarButton();
        objOrderPage.clickCalendarDate();
        objOrderPage.clickTermDate();
        objOrderPage.clickTermDateValue();
        objOrderPage.clickFinalOrderButton();
        objOrderPage.clickSureOrderButton();
        String orderTextFinal = objOrderPage.getOrderText();
        System.out.println(orderTextFinal);
//        assertEquals("не верный текст заказа", orderTextFinal, "Заказ оформлен");
        Assert.assertThat(orderTextFinal, startsWith("Заказ оформлен"));

    }

}