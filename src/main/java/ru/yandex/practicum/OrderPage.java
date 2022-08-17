//коммент для pr zaebali
package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class OrderPage {
    private WebDriver driver;

//локатора страницы заказа
    private By name = By.cssSelector(".Order_Form__17u6u .Input_InputContainer__3NykH:nth-child(1) input");
    private By surename = By.cssSelector(".Order_Form__17u6u .Input_InputContainer__3NykH:nth-child(2) input");
    private By adress = By.cssSelector(".Order_Form__17u6u .Input_InputContainer__3NykH:nth-child(3) input");
    private By subway = By.cssSelector(".select-search__input");
    private By tel = By.cssSelector(".Order_Form__17u6u .Input_InputContainer__3NykH:nth-child(5) input");
    private By buttonOrder = By.cssSelector(".Order_NextButton__1_rCA button");
    public By buttonOrderHeader = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    public By buttonOrderFooter = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    private By metroDropdown = By.className("select-search__value");
    private By selectedStation = By.cssSelector("[data-value='1']");
    private By daleeButton = By.cssSelector(".Button_Middle__1CSJM");
    private By calendarButton = By.cssSelector(".react-datepicker__input-container .Input_Responsible__1jDKN");
    private By calendarDate = By.cssSelector(".react-datepicker__week div");
    private By termDateButton = By.cssSelector(".Dropdown-placeholder");
    private By termDateValue = By.cssSelector(".Dropdown-option:nth-child(3)");
    private By finalOrderButton = By.cssSelector(".Button_Middle__1CSJM:nth-child(2)");
    private By sureOrderButton = By.cssSelector(".Order_Modal__YZ-d3 .Order_Buttons__1xGrp button:nth-child(2)");
    private By orderText = By.cssSelector(".Order_ModalHeader__3FDaJ");




    public OrderPage(WebDriver driver){
        this.driver = driver;
    }
    public void sendName() {
        driver.findElement(name).sendKeys("Иван");

    }
    public void sendSername() {
        driver.findElement(surename).sendKeys("Иванов");
    }
    public void sendAdress() {
        driver.findElement(adress).sendKeys("Москва красная улица");
    }
    public void sendSubway() throws InterruptedException {
        driver.findElement(subway).click();
//        Thread.sleep(5000);
//        driver.findElement(metroDropdown).click();
        driver.findElement(selectedStation).click();
    }
    public void sendTel() {
        driver.findElement(tel).sendKeys("89000000000");
    }
    public void clickButtonOrderHeader() {
        driver.findElement(buttonOrderHeader).click();
    }
    public void clickButtonOrderFooter() {
        driver.findElement(buttonOrderFooter).click();
    }
    public void clickDaleeButton() {
        driver.findElement(daleeButton).click();
    }
    public void clickCalendarButton() {
        driver.findElement(calendarButton).click();
    }
    public void clickCalendarDate() {
        driver.findElement(calendarDate).click();
    }
    public void clickTermDate() {
        driver.findElement(termDateButton).click();
    }
    public void clickTermDateValue() {
        driver.findElement(termDateValue).click();
    }
    public void clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
    }
    public void clickSureOrderButton(){
        driver.findElement(sureOrderButton).click();
    }
    public String getOrderText() {
        return driver.findElement(orderText).getText();

    }
}
