package com.sahabt.automation;
import junit.framework.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class kullanıcıTest {
    WebDriver driver;

    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "driver/chromedriver.exe";
    public String url = "http://www.sahibinden.com";

    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
    }

    public WebElement find(By by) {
        return driver.findElement(by);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void sendKey(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }


    public void thread(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void username(){

        driver.navigate().to(url);

        click(By.cssSelector(".login-text [rel]"));
        click(By.cssSelector(".qr-login-promotion .close"));
        sendKey(By.id("username"), "");
        sendKey(By.id("password"), "");
        click(By.cssSelector("#loginForm button"));


        String title = driver.getTitle();
        Assert.assertTrue("Username isn't empty", title.contains("sahibinden.com üye girişi"));
    }


}
