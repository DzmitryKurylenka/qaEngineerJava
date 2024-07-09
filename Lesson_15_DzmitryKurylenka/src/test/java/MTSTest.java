//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class MTSTests {
//    private WebDriver driver;
//    private WebDriverWait wait = new WebDriverWait(driver, 2);
//
//    @BeforeEach
//    public void setUp() {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Dima\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://mts.by");
//    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    @Test
//    public void testTitleName() {
//        WebElement blockTitle = driver.findElement(By.xpath("//h2[normalize-space() = 'Онлайн пополнение без комиссии']"));
//        assert blockTitle.isDisplayed();
//    }
//
//    @Test
//    public void testPaymentSystemLogos() {
//        WebElement visaLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
//        WebElement visaVerifiedLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
//        WebElement mastercardLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
//        WebElement mastercardscLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
//        WebElement belcartLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
//
//        assertTrue(visaLogo.isDisplayed());
//        assertTrue(visaVerifiedLogo.isDisplayed());
//        assertTrue(mastercardLogo.isDisplayed());
//        assertTrue(mastercardscLogo.isDisplayed());
//        assertTrue(belcartLogo.isDisplayed());
//    }
//
//    @Test
//    public void testMoreInfoLink() {
//        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
//        moreInfoLink.click();
//        wait.until(ExpectedConditions.urlContains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
////        moreInfoLink.click();
////        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey";
////        assertEquals(expectedUrl, driver.getCurrentUrl());
//    }
//
//    @Test
//    public void testContinueButton() {
//        WebElement serviceDropdown = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
//        serviceDropdown.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")));
//
//        WebElement serviceOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
//        serviceOption.click();
//
//        WebElement phoneNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
//        phoneNumberField.sendKeys("297777777");
//
//        WebElement summField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
//        summField.sendKeys("1");
//
//        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
//        continueButton.click();
//
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert();
//
////        wait.until(ExpectedConditions.urlContains("confirmation-page"));
////
////        WebElement confirmationMessage = driver.findElement(By.xpath("/html/body/app-root"));
////        assertTrue(confirmationMessage.isDisplayed());
//    }
//}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MTSTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        acceptCookies();
    }

    private static void acceptCookies() {
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();
    }

    private WebElement waitForElementVisible(By locator, long timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void assertText(By locator, String expectedText) {
        WebElement element = waitForElementVisible(locator, 5);
        String actualText = element.getText();
        assertEquals(expectedText, actualText);
    }

    private void assertElementDisplayed(By locator) {
        WebElement element = waitForElementVisible(locator, 5);
        assertTrue(element.isDisplayed());
    }

    private void clickElement(By locator) {
        WebElement element = waitForElementVisible(locator, 5);
        element.click();
    }

    @Test
    public void checkBlockNameTest() {
        assertText(By.xpath("//div[@class='pay__wrapper']/h2"), "Онлайн пополнение\nбез комиссии");
    }

    @Test
    public void findLogoPaySysTest() {
        assertElementDisplayed(By.xpath("//*[@alt='Visa']"));
        assertElementDisplayed(By.xpath("//*[@alt='Verified By Visa']"));
        assertElementDisplayed(By.cssSelector("img[alt='MasterCard']"));
        assertElementDisplayed(By.xpath("//*[@alt='MasterCard Secure Code']"));
        assertElementDisplayed(By.xpath("//div[@class='pay__partners']/ul/li/img[@alt='Белкарт']"));
    }

    @Test
    public void checkLink() {
        clickElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", currentUrl);
        driver.get("https://www.mts.by/");
    }

    @Test
    public void checkInputFormTest() {
        clickElement(By.xpath("//button[@class='select__header']"));
        clickElement(By.xpath("//p[text()='Услуги связи']"));

        WebElement phoneNumberField = waitForElementVisible(By.xpath("//input[@class='phone']"), 5);
        phoneNumberField.sendKeys("297777777");

        WebElement summField = waitForElementVisible(By.xpath("//input[@id='connection-sum']"), 5);
        summField.sendKeys("25");

        clickElement(By.xpath("//form[@id='pay-connection']/button[@type='submit']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.switchTo().frame(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']"))));

        assertText(By.xpath("//*[contains(text(), 'Оплата:')]"), "Оплата: Услуги связи Номер:375297777777");
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}