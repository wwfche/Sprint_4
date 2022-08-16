

/*
Просьба ознакомиться!
1. в курсе львиная доля селекторов показана на xpath
моя практика показывает, что они часто падают при адаптивной верстке
я делал по привычным мне css селекторам
это весьма холиварная тема, но прошу не придераться

2.В коде изначально было многонецензурного, тк на маке периодически падал хром от плохого интернет соединения
я постарался все почистить, но если где осталось - Прошу не принимать на личный счет, это лишь моя плохая черта характера

3.после несколько мров сделанных попутно с работой, могло залететь в код тестовые данные
test
 */
package ru.yandex.practicum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;



public class HomePage {
    private WebDriver driver;
    //локаторы страницы главная
    private By price = By.id("accordion__heading-0"); // локатор цены
    private By priceText = By.cssSelector(".accordion__item:nth-child(1) p"); //локатор цены чтобы проверить текст

// зачем делать комменты на все? есть же правило: если код требует комментария - значит код не самый лучший
    private By many = By.id("accordion__heading-1");
    private By manyText = By.cssSelector(".accordion__item:nth-child(2) p");
    private By time = By.id("accordion__heading-2");
    private By timeText = By.cssSelector(".accordion__item:nth-child(3) p");
    private By today = By.id("accordion__heading-3");
    private By todayText = By.cssSelector(".accordion__item:nth-child(4) p");
    private By extend = By.id("accordion__heading-4");
    private By extendText = By.cssSelector(".accordion__item:nth-child(5) p");
    private By charger = By.id("accordion__heading-5");
    private By chargerText = By.cssSelector(".accordion__item:nth-child(6) p");
    private By cancel = By.id("accordion__heading-6");
    private By cancelText = By.cssSelector(".accordion__item:nth-child(7) p");
    private By mkad = By.id("accordion__heading-7");
    private By mkadText = By.cssSelector(".accordion__item:nth-child(8) p");

    public By cookie = By.cssSelector("#rcc-confirm-button");
    public By buttonOrderHeader = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
//метод ожидания загрузки страницы
    public void waitForLoadHomePage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_SubHeader__zwi_E")));
    }

//метод по работе с куки, изначально прописал ее в Главную, после решил использовать в OrderPageTest в After
    public void clickHueta(){
        driver.findElement(cookie).click();
    }
    public void clickPrice() {

//        driver.findElement(price);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", price);
        driver.findElement(price).click();
    }
    public String getPriceText() {
        return driver.findElement(priceText).getText();

    }
    public void clickMany() {
        driver.findElement(many).click();
    }
    public String getManyText() {
        return driver.findElement(manyText).getText();
    }
    public void clickTime(){
        driver.findElement(time).click();
    }
    public String getTimeText() {
        return driver.findElement(timeText).getText();
    }
    public void clickToday(){
        driver.findElement(today).click();
    }
    public String getTodayText(){
        return driver.findElement(todayText).getText();
    }
    public void clickExtend(){
        driver.findElement(extend).click();
    }
    public String getExtendText(){
        return driver.findElement(extendText).getText();
    }
    public void clickCharger(){
        driver.findElement(charger).click();
    }
    public String getChargerText(){
        return driver.findElement(chargerText).getText();
    }
    public void clickCancel(){
        driver.findElement(cancel).click();
    }
    public String getCancelText(){
        return driver.findElement(cancelText).getText();
    }
    public void clickMkad(){
        driver.findElement(mkad).click();
    }
    public String getMkadText(){
        return driver.findElement(mkadText).getText();
    }

    public void clickButtonOrderHeader() {
        driver.findElement(buttonOrderHeader).click();
    }
}