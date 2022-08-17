//коммент для pr
package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import java.util.concurrent.TimeUnit;



import static org.junit.Assert.*;


public class HomePageTest {
    private WebDriver driver;
    @Before
    public void startUp() {

        //использую менеджер вебдрайвера, пока приходится комментить не используемый драйвер

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();


    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

//    @Test
//    public void waitForLoadHomePage() {
//    }

//    @Test
//    public void clickPrice() {
//    }

    @Test
    public void testPriceText() throws InterruptedException {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        Thread.sleep(5000);
        objHomePage.clickHueta();
        objHomePage.clickPrice();
        String priceText = objHomePage.getPriceText();
//        System.out.println(priceText);
        assertEquals("Текст1 не корректный", priceText, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");


    }
    @Test
    public void testManyText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickMany();
        String manyText = objHomePage.getManyText();
        assertEquals("Текст2 не корректный", manyText, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }
    @Test
    public void testTimeText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickTime();
        String timeText = objHomePage.getTimeText();
        assertEquals("Текст3 не корректный", timeText, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }
    @Test
    public void testTodayText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickToday();
        String todayText = objHomePage.getTodayText();
        assertEquals("Текст4 не корректный", todayText, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }
    @Test
    public void testExtendText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickExtend();
        String extendText = objHomePage.getExtendText();
        assertEquals("Текст5 не корректный", extendText, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }
    @Test
    public void testChargerText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickCharger();
        String chargerText = objHomePage.getChargerText();
        assertEquals("Текст6 не корректный", chargerText, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }
    @Test
    public void testCancelText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickCancel();
        String cancelText = objHomePage.getCancelText();
        assertEquals("Текст7 не корректный", cancelText, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }
    @Test
    public void testMkadText() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadHomePage();
        objHomePage.clickHueta();
        objHomePage.clickMkad();
        String mkadText = objHomePage.getMkadText();
        assertEquals("Текст8 не корректный", mkadText, "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}